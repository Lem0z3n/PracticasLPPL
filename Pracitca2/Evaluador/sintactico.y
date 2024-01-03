%{

   #include <stdio.h>
   #include <stdlib.h>
   #include <string.h>

   #include "tablasimbolos.h"	
   
   extern int  yylex(void);
   extern char *yytext;

   char *id;
   char *id1;
   char *id2;

   int yyerror(char *s);

%}
             

%union
{
  float valor;
  char* nombre;
  int condicion;
}


%start S;

%token <valor> INT;
%token <valor> REAL;
%token <valor> EXP;
%token ASIG;
%token COMA;
%token PTOCOMA;
%token MAS;
%token MENOS;
%token MULT;
%token DIV;
%token PA;
%token PC;
%token LT;
%token GT;
%token LTE;
%token GTE;
%token EQ;
%token DIF;
%token PCA;
%token PCC;
%token IF;
%token THEN;
%token ELSE;
%token <nombre> ID;
%token EVALUA;
%token SIENDO;

%type <valor> E0;
%type <valor> E1;
%type <valor> E2;
%type <valor> IF_ST;
%type <condicion> COND;

         

%%
 
S : EVALUA E0  PTOCOMA       { printf("El resultado de analizar el programa es %.2f\n", $2); }
  | SIENDO LDs EVALUA E0     { printf("El resultado de analizar el programa es %.2f\n", $4); }
  | EVALUA IF_ST PTOCOMA	 { printf("El resultado de analizar el programa es %.2f\n", $2); }
  | SIENDO LDs EVALUA IF_ST	        { printf("El resultado de evaluar el programa es 							%.2f\n", $4); }
  ;  
  
IF_ST: IF PA COND PA THEN PCA E0 PCC ELSE PCA E0 PCC { if($3) $$ = $7; 
								else $$ = $11;}
     | IF PA COND PA THEN PCA E0 PCC {if($3) $$ = $7;}
     ;

LDs : LDs COMA D
    | D
    ;

D   : ID       { printf("El valor del identificador %s es ", $1); 
                        id = NULL;
                        id = (char *)malloc(15);
                        sprintf(id, "%s", $1);
                     }
      ASIG E0  {
                        insertarTS(id, $4);
                        printf("%5.2f\n", $4);
                     }
    |  LT ID                             { id1 = NULL;
                                            id1 = (char *)malloc(15); 
                                            sprintf(id1, "%s", $2); }
        COMA ID                            { id2 = NULL;
                                            id2 = (char *)malloc(15);
                                            sprintf(id2, "%s", $5); }
        GT ASIG LT E0                      { insertarTS(id1, $10);
                                            printf("El valor del identificador %s es %.2f\n", 							id1, $10); }
        COMA E0                            { insertarTS(id2, $13);
                                            printf("El valor del identificador %s es %.2f\n", 							id2, $13); }
        GT 
    ;
COND :  E0 LTE E0 { if($1 <= $3) $$ = 1; else $$ = 0;}
| E0 GTE E0 { if($1 >= $3) $$ = 1; else $$ = 0;}
| E0 EQ E0 { if($1 == $3) $$ = 1; else $$ = 0;}
| E0 DIF E0 { if($1 != $3) $$ = 1; else $$ = 0;}
| E0 GT E0 { if($1 > $3) $$ = 1; else $$ = 0;}
| E0 LT E0 { if($1 < $3) $$ = 1; else $$ = 0;}
| E0 {if($1) $$ = 1; else $$ = 0;}
;


E0  : E0 MAS   E1 { $$ = $1 + $3; }
    | E0 MENOS E1 { $$ = $1 - $3; }
    | E1                { $$ = $1;}
    ; 

E1  : E1 MULT E2  { $$ = $1 * $3; }
    | E1 DIV  E2  { $$ = $1 / $3; }
    | E2	         { $$ = $1;}
    ;

E2 : INT              { $$ = $1; }
   | REAL             { $$ = $1; }
   | EXP              { $$ = $1; }
   | ID	           { $$ = buscarTS($1); }		
   | PA E0 PC { $$ = $2;}
   ; 
             

%%



int main() {

  yyparse();

}
   

int yyerror(char *s)
{
  
  printf("Error %s \n", s);
  return 0;

}

             
int yywrap()  
{  

  return 1;  

}  
