grammar Plantilla;


options{
    output = AST;
}


/* Variable global que sirve de contador para numerar las variables auxiliares. */


@members{
     int cnt = -1;
}


/* Esta regla será el punto de entrada de nuestra analizador. */


entrada returns [String codigo] 
    :	ec1=ecuacion        
        (                   
        ec2=ecuacion 
        )*                  {
                              $codigo = "(" + "HALT" + "," + "NULL" + "," + "NULL" + "," + "NULL" + ")";
                              System.out.println($codigo); 
                            }
    ;


ecuacion returns [String codigo]
    :    Id '=' exp=expresion ';'  
    {  
    	if ($exp.resultado.length() == 1) 
    	    $codigo = "(" + "ASSIGN" + "," + $Id.text + "," + $exp.resultado + "," + "NULL" + ")";
            else $codigo = "(" + "ASSIGN" + "," + $Id.text + "," + "t" + cnt + "," + "NULL" + ")";
            System.out.println($codigo);
    };



/* La suma y la resta tienen la prioridad más baja. */


expresion returns [String codigo, String resultado]
    :    m1=termino
                  {
                     $resultado = $m1.resultado;
                  }
         ( '+' m2=termino 
                { 
                    cnt++;
                    $codigo = "(" + "ADD" + "," +  "t" + cnt + "," + $m1.resultado + "," + $m2.resultado + ")"; 
                    System.out.println($codigo);
                    $resultado = "t" + cnt;
                }
         | '-' m2=termino        { 
                                   cnt++;
                                   $codigo = "(" + "SUB" + "," +  "t" + cnt + "," + $m1.resultado + "," + $m2.resultado + ")"; 
                                   System.out.println($codigo);
                                   $resultado = "t" + cnt;
                                 }
         )*                  
    ;


/* La multiplicación y la división tienen una prioridad más alta. */


termino returns [String codigo, String resultado]
    :    a1=factor                  {  
                                      $resultado = $a1.resultado;
                                    }
         ( '*' a2=factor            { 
                                      cnt++;
                                      $codigo = "(" + "MULT" + "," +  "t" + cnt + "," + $a1.resultado + "," + $a2.resultado + ")";
                                      System.out.println($codigo);
                                      $resultado = "t" + cnt;
                                    }
         | '/' a2=factor            { 
                                      cnt++;
                                      $codigo = "(" + "DIV"  + "," +  "t" + cnt + "," + $a1.resultado + "," + $a2.resultado + ")"; 
                                      System.out.println($codigo);
                                      $resultado = "t" + cnt;
                                    }
         )* 
    ;

      
factor returns [String codigo, String resultado]
    :	'(' exp=expresion ')'      { 
                                     $codigo = $exp.codigo; 
                                     $resultado = $exp.resultado;
                                   }
    |   n=dato                     { 
                                     $codigo = $n.codigo;  
                                     $resultado = $n.resultado;
                                   }
    ;                              


dato returns [String codigo, String resultado]
   :	  Number                   { 
                                     $codigo = $Number.text;  
                                     $resultado = $Number.text;
                                   }
   |      Id                       { 
                                     $codigo = $Id.text;  
                                     $resultado = $Id.text;
                                   }
   |  '-' Number                   { 
                                     cnt++;
                                     $codigo = "(" + "NEG" + "," +  "t" + cnt + "," + $Number.text + "," + "NULL" + ")"; 
                                     System.out.println($codigo);
                                     $resultado = "t" + cnt;
                                   }
   |  '-' Id                       { 
                                     cnt++;
                                     $codigo = "(" + "NEG" + "," +  "t" + cnt + "," + $Id.text + "," + "NULL" + ")"; 
                                     System.out.println($codigo);
                                     $resultado = "t" + cnt;
                                   }
   ;
     
   condicional_if returns [String codigo, String resultado]
   	:	
   	'if (' comp=Comparacion ')' {
   		$codigo = $comp.text; 
   		$resultado = $comp.text;
   	}
   	'then {'
   	(ec=ecuacion)*
   	'}' {
   		 cnt++;
                          $codigo = "(" + "IF_TRUE" + "," +  $comp.text + "," + "GOTO" + "," + "L0" + ")"; 
                          System.out.println($codigo);
   	}
   	;
   
/* Un número: puede ser un valor entero o un valor decimal. */


Number
    :   ('0'..'9')+ ('.' ('0'..'9')+)? 
    ;

Id 	
    :	('a'..'z' | 'A'..'Z')+
    ;
Comparacion
    :	Id+('>'|'<'|'='|'!=')+('=')?
    ;

/* Ignoramos todos los caracteres de espacios en blanco. */


WS
    :   (' ' | '\t' | '\r'| '\n')    { $channel=HIDDEN; }
    ;
