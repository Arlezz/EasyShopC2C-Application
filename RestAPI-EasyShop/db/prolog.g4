grammar prolog;

// Texto y datos en Prolog formado a partir de terminos
p_text: (directive | clause) * EOF ;

directive: ':-' term '.' ; 

clause: term '.' ;


// Sintaxis Abstracta, terminos formados a partir de tokens
termlist : term ( ',' term )* ;

term 
    : VARIABLE          # variable
    | '(' term ')'      # braced_term
    | '-'? integer      # integer_term //El caso negativo debe estar 
                                       //cubierto por el operador unitario
    | '-'? FLOAT        # float
    // structure / compound term
    | atom '(' termlist ')'     # compound_term
    |<assoc=right> term operator_ term        # binary_operator
    | operator_ term             # unary_operator
    | atom              # atom_term
    ;

operator_
    : ':-' | '?-' | ';' | '->' | ',' | '=' | '=='
    | 'is' | '=:=' | '<' | '=<' | '>' | '>='
    | ':' | '+' | '-' | '*' | '/' 
    ;

atom
    : LETTER_DIGIT      # name
    | QUOTED            # quoted_string
    | DOUBLE_QUOTED_LIST# dq_string
    | ';'               # semicolon
    | '!'               # cut
    ;

integer: DECIMAL | BINARY | OCTAL | HEX ;

// Lexer: Tokens formados a partir de caracteres
LETTER_DIGIT 
    : SMALL_LETTER ALPHANUMERIC*
    ;

VARIABLE : CAPITAL_LETTER ALPHANUMERIC* | '_' ALPHANUMERIC+ | '_' ;

DECIMAL: DIGIT+ ;
BINARY: '0b' [01]+ ;
OCTAL: '0o' [0-7]+ ;
HEX: '0x' HEX_DIGIT+ ;

FLOAT: DECIMAL '.' [0-9]+ ( [eE] [+-] DECIMAL )? ;

fragment NON_QUOTE_CHAR : ALPHANUMERIC | ' ' ;

QUOTED:          '\'' (NON_QUOTE_CHAR)*? '\'' ;
DOUBLE_QUOTED_LIST: '"' (NON_QUOTE_CHAR )*? '"'; 

fragment ALPHANUMERIC: ALPHA | DIGIT ;
fragment ALPHA: '_' | SMALL_LETTER | CAPITAL_LETTER ;
fragment SMALL_LETTER: [a-z_];

fragment CAPITAL_LETTER: [A-Z];

fragment DIGIT: [0-9] ;
fragment HEX_DIGIT: [0-9a-fA-F] ;

WS: [ \t\r\n]+ -> skip;

COMMENT: '%' ~[\n\r]* ( [\n\r] | EOF) -> channel(HIDDEN) ;
MULTILINE_COMMENT: '/*' ( MULTILINE_COMMENT | . )*? ('*/' | EOF) -> channel(HIDDEN);