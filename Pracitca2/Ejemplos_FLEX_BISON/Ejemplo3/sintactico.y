%{

   #include <stdio.h>
   #include <stdlib.h>
   #include <math.h>

   extern int yylex();

   int yyerror(char *s);

%}



%union
{

  float real;

}
             


%token <real> TOKEN_NUM
%token SENO 
%token PI 
%token PD

%type <real> exp
             

%left '-' '+'
%left '*' '/'
             

%start input


%%
     
     
   
input :                  /* cadena vacia */
      | input line             
      ;


line : '\n'
     | exp '\n'          { printf("Resultado: %f\n", $1); }
     ;

       
exp : TOKEN_NUM                            { $$ = $1;         }
    | exp '+' exp                          { $$ = $1 + $3;    }
    | exp '-' exp                          { $$ = $1 - $3;    }
    | exp '*' exp                          { $$ = $1 * $3;    }
    | exp '/' exp                          { $$ = $1 / $3;    }
    | SENO PI exp PD 		   	   { $$ = sin($3); }
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
