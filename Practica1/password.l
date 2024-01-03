%option noyywrap


%{

    #include<stdio.h>
    #include<stdlib.h>
    #include<string.h>
    #include<ctype.h>

%}


MINUS  [a-z]
MAYUS  [A-Z]
digito [0-9]
otro   [#@&$%]
Umi    (.*[a-z].*)
Uma    (.*[A-Z].*)
Udi    (.*[0-9].*)
Uo     (.*[#@&%$].*)


%%


{Umi}{4} { printf("%s   Incorrecto", yytext); }

{Uma}{3} { printf("%s   Incorrecto", yytext); }

{Udi}{3} { printf("%s   Incorrecto", yytext); }

{Uo}{2}  { printf("%s   Incorrecto", yytext); }

(.){8} { printf("%s   Correcto",   yytext); }


       


%%


int main( int argc, char **argv ) 
{
    ++argv, --argc; 
    if ( argc > 0 )
            yyin = fopen( argv[0], "r" );
    else
            yyin = stdin;
    
    int analizador_lexico = yylex();
    
  while (analizador_lexico != 0)
  {
        
    printf(" %d\n", analizador_lexico);
    analizador_lexico = yylex();
        
  }
    
  return analizador_lexico;
} 
