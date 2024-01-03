%{

    #include "sintactico.tab.h"

%}


DIGITO [0-9]


LETRA  [a-zA-Z]


%%


{DIGITO}+       {
                  return ENTERO;
                }


{DIGITO}+"."{DIGITO}+       {
                              return REAL;
                            }


"no"            {
                  return NEG;
                }


"si"            {
                  return PRSI;
                }


"entonces"      {
                  return PRENTONCES;
                }


"mientras"      {
                  return PRMIENTRAS;
                }


"hacer"         {
                  return PRHACER;
                }


"ent"           {
                  return PRENTERO;
                }


"real"          {
                  return PRREAL;
                }


"bool"          {
                  return PRBOOLEANO;
                }


"const"         {
                  return PRCONSTANTE;
                }


"estr"          {
                  return PRESTRUCTURA;
                }


"func"          {
                  return PRFUNCION;
                }


"dev"           {
                  return PRRETORNA;
                }


{LETRA}+        {
                  return IDENT;
                }


"+"|"-"|"*"|"/" {
                  return (yytext[0]);
                }


"<"|">"|"<="|">="|"=="|"!=" {
                              return (yytext[0]);
                            }


"&&"|"||"       {
                  return (yytext[0]);
                }


"="             {
                  return ASIG;
                }


";"             {
                  return PCOMA;
                }


"("             {
                  return PARIZ;
                }


")"             {
                  return PARDER;
                }


"{"             {
                  return LLIZ;
                }


"}"             {
                  return LLDE;
                }


"\n"            {
                  return (yytext[0]);
                }


"."             {
                  return (yytext[0]);
                }


.               ;


%%


int main( int argc, char **argv )
{
    ++argv, --argc;  /* se salta el nombre del programa */
    if ( argc > 0 )
            yyin = fopen( argv[0], "r" );
    else
            yyin = stdin;
    
    yyparse();
}
