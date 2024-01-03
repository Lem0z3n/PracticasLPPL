%{

   #include <stdio.h>
   #include <stdlib.h>

%}



DIGITO [0-9]
ID     [a-zA-Z_]



%%



{DIGITO}+(.{DIGITO}+)   {
				printf("<float; %s>\n", yytext);

  
                           }
{DIGITO}+		   {
				printf("<int; %s>\n", yytext);
			   }

{DIGITO}+(.{DIGITO}+)?+([eE]+{DIGITO}+)   {
						printf("<scientific; %s>\n", yytext);
				  	    }	

evalua		   { printf("<palabra_reservada; %s>\n", yytext);
				}
donde 		   {printf("<palabra_reservada; %s>\n", yytext);
				}	

"="                        {printf("<operador_asignacion; %s>\n", yytext);
				}
","                        {printf("<separador; %s>\n", yytext);
				}
"+"                        {printf("<operador_aritmético; %s>\n", yytext);
				}
"-"                        {printf("<operador_aritmético; %s>\n", yytext);
				}
"*"                        {printf("<operador_aritmético; %s>\n", yytext);
				}
"/"                        {printf("<operador_aritmético; %s>\n", yytext);
				}
"("                        {printf("<paréntesis_abierto; %s>\n", yytext);
				}
")"                        {printf("<paréntesis_cerrado; %s>\n", yytext);
				}


{ID}({ID}|{DIGITO})*                       {  
				printf("<identificador; %s>", yytext);
				}				


%%


