grammar SimpleASM;

options {
    output=AST;
    ASTLabelType=CommonTree;
}

tokens {
	MOVW = 'MOVW' ;
	LOAD = 'LOAD' ;
	STORE = 'STORE' ;
	ADD = 'ADD' ;
	NOT = 'NOT' ;
	AND = 'AND' ;
	OR  = 'OR' ;
	XOR = 'XOR' ;
	INC = 'INC' ;
	SUB = 'SUB' ;
	BRANCH = 'BRANCH' ;
	END_STMT = ';' ;
	//SPACE = ' ';
}


/* Definicoes de regras de lexer*/
// Comentario
COMMENT :   
	'//' ~('\n'|'\r')*  {$channel=HIDDEN;}
    	|   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// Nova linha
NEWLINE 
	: '\r'? '\n' ;

// Espaco
WS  :   ( ' '
        | '\t'       
        ) {$channel=HIDDEN;}
    ;

// Registradores
REGISTER 
	:	('BX' | 'CX' | 'DX' | 'EX' | 'FX' | 'GX' | 'DIRA' | 'DIRB' | 'DIRC' | 'PORTA' | 'PORTB' | 'PORTC') ;
	
// Numero decimal 123
NUMERO_DEC 
	:	(DIGIT)+ ;

// Numero hexadecimal 0xA1
NUMERO_HEX 
	:	'0x'(HEX_DIGIT)+ ;

fragment DIGIT 
	:	'0'..'9';
fragment HEX_DIGIT 
	:	('0'..'9') | ('a'..'f' | 'A'..'F');
	
/* Definicoes de regras de parser*/
program :	(statement1 | statement2)+ ;
statement1 
		:	(MOVW | ADD | NOT | AND | OR | XOR | SUB) (REGISTER | NUMERO_DEC | NUMERO_HEX)  END_STMT COMMENT? NEWLINE  ;

statement2 
	:	INC END_STMT COMMENT? NEWLINE ;
