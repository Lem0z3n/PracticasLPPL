%{

    #include "sintactico.tab.h"

    extern int yyparse();

%}



DIGITO [0-9]



%%



{DIGITO}+("."{DIGITO}+)?   {
                             yylval.real = atof(yytext);
                             return TOKEN_NUM;
                           }



"+"|"-"|"*"|"/" {
                  return (yytext[0]);
                }

"sen" 		{
		  return SENO;
		}

"("		{
		  return PI;
		}

"("		{
		  return PD;
		}

"\n"            {
                  return (yytext[0]);
                }


.               ;



%%


