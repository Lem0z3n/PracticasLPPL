%{

   #include <stdio.h>
   #include <stdlib.h>

  #include "sintactico.tab.h"
%}


ID     [A-Za-z_]
DIGITO [0-9]




%%



[+-]?{DIGITO}+(.{DIGITO}+)   {
                             yylval.valor = atof(yytext);
                             return REAL;
                           }
[+-]?{DIGITO}+		   {
				yylval.valor = atof(yytext);
		    	        return INT;
			   }

[+-]?{DIGITO}+(.{DIGITO}+)?+([eE]+{DIGITO}+)   {
  				   		yylval.valor = atof(yytext);
				   		return EXP;
						}
				
							
evalua			   { return EVALUA;}
	
siendo			   { return SIENDO;}
				
if			{ return IF;}

then 			 {return THEN;}

else			{return ELSE;}

{ID}({ID}|{DIGITO})*       {  yylval.nombre = yytext;
                              return ID; }	

"<="				{return LTE;}

">="				{ return GTE;}

"=="				{return EQ;}

"!="				{return DIF;}

"="                        { return ASIG; }

","                        { return COMA; }

";"			    { return PTOCOMA;}

"+"                        { return MAS; }

"-"                        { return MENOS; }

"*"                        { return MULT; }

"/"                        { return DIV; }

"("                        { return PA; }

")"                        {	return PC; }


"<"			    { return LT;}

">"			    { return GT;}

"{"			{return PCA;}

"}"			{return PCC;}



"\n"
                        
.  

%%


