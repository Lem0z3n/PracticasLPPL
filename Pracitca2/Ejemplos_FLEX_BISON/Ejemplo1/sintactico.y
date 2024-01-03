%{

   #include <stdio.h>
   #include <stdlib.h>

   extern int yylex();

   int yyerror(char *s);

%}



%token ID ASIG NUM MAS MULT PI PD PC ME MA Coma


%start input 



%%
     

input :
      | input S
      ;

S : exp '\n'                      		{ printf( "\n>>>>> Expresion correcta\n" ); }
  | ID ASIG exp PC '\n'           		{ printf( "\n>>>>> Asignacion correcta\n" ); }
  | ME  ID Coma ID MA ASIG ME exp Coma exp MA PC '\n' {printf("\n>>>>> Asignacion multiple\n");}
  ;

     
exp : exp MAS term
    | term
    ;


term : term MULT factor
     | factor
     ;


factor : PI exp PD
       | ID    
       | NUM
       ;         



%%



int main() {

  yyparse();

}

          

int yyerror (char *s)
{

  printf ("%s\n", s);

  return 0;

}


             
int yywrap()  
{  

  return 1;  

}  

