%{

   #include <stdio.h>
   #include <stdlib.h>

%}


%token ENTERO REAL IDENT ASIG PCOMA PARIZ PARDER PRSI PRENTONCES LLIZ LLDE PRMIENTRAS PRHACER NEG PRENTERO PRREAL PRBOOLEANO PRESTRUCTURA PRFUNCION PRRETORNA PRCONSTANTE
             

%left '-' '+'
%left '*' '/'


%%
         
   
input :                  /* cadena vacia */
      | input line             
;


line : '\n'
     | sentencia '\n'   
     | func '\n'         { printf(">>>>>>>>>> Funcion correcta\n");  } 
;



func : PRFUNCION PRENTERO IDENT PARIZ declaracion PARDER LLIZ ins PRRETORNA IDENT LLDE
     | PRFUNCION PRREAL IDENT PARIZ declaracion PARDER LLIZ ins PRRETORNA IDENT LLDE
     | PRFUNCION PRBOOLEANO IDENT PARIZ declaracion PARDER LLIZ ins PRRETORNA IDENT LLDE
     ;

       
exp : ENTERO
    | IDENT            
    | exp '+' exp       
    | exp '-' exp      
    | exp '*' exp        
    | exp '/' exp        
;


ins :                        /* cadena vacia */
    | asignacion ins         { printf(">> Asignacion correcta\n");  } 
    | condicional ins        { printf(">>>> Condicional correcto\n"); } 
    | iteracion ins          { printf(">>>>>> Bucle correcto\n"); } 
    ;


asignacion : IDENT ASIG exp PCOMA
           ;


condicional : PRSI PARIZ condicion PARDER PRENTONCES LLIZ ins LLDE
            ;


condicion : condicion '&&' condicion
          | condicion '||' condicion
          | NEG PARIZ condicion PARDER
          | IDENT '<'  exp
          | IDENT '>'  exp
          | IDENT '==' exp
          | IDENT '!=' exp
          ;


iteracion : PRMIENTRAS PARIZ condicion PARDER PRHACER LLIZ ins LLDE
          ;


sentencia : declaracion ins
          ;


declaracion :                                      /* cadena vacia */
            | PRENTERO IDENT PCOMA declaracion     { printf("Declaracion correcta\n");  } 
            | PRREAL IDENT PCOMA declaracion       { printf("Declaracion correcta\n");  } 
            | PRBOOLEANO IDENT PCOMA declaracion   { printf("Declaracion correcta\n");  }
            | estructura IDENT PCOMA declaracion   { printf("Estructura correcta\n");  }
            | PRCONSTANTE PRENTERO IDENT ASIG ENTERO PCOMA declaracion { printf("Constante correcta\n");  }
            | PRCONSTANTE PRREAL IDENT ASIG REAL PCOMA declaracion { printf("Constante correcta\n");  }
            ;


estructura : PRESTRUCTURA IDENT LLIZ declaracion LLDE
           ;


%%
   
          
int yyerror (char *s)
{

  printf ("%s\n", s);

}

             
int yywrap()  
{  

  return 1;  

}  
