%{

  #include "sintactico.tab.h"

%}



LETRA  [A-Za-z_]

DIGITO [0-9]



%%



{DIGITO}+("."{DIGITO}+)?        { return NUM; }

{LETRA}({LETRA}|{DIGITO})*      { return ID; }

"="                             { return ASIG; }

";"                             { return PC; }

"+"                   		{ return MAS; }

"*"                   		{ return MULT; }
		
"("                  	        { return PI; }

")"                             { return PD; } 

"<"				{ return ME; }

","				{ return Coma; }

">"				{ return MA; }

"\n"                            { return (yytext[0]); }

.                               ;



%%


