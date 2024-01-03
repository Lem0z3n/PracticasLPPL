grammar BucleWhileyFor;


options{
    language = Java;
    output   = AST;  
}


@members{
    int cnt   = -1;
    int linea =  1;
}


entrada returns [String codigo]
	: ec1 = ecuacion 
		{
		$codigo = $ec1.codigo;
		}
	( ec2 = ecuacion
		{
		$codigo += $ec2.codigo;
		}
	)*
		{
      	$codigo += "L" + linea + " : (HALT, NULL, NULL, NULL)\n";
       	System.out.print($codigo);
       	}
    ;
      
ecuacion returns [String codigo, int lineas]
    : Id '=' exp = expresion ';' 
    	{
    	$codigo = $exp.codigo;
		if ($exp.lineas == 0)
			$codigo += "L" + linea + " : (ASSIGN, " + $Id.text + ", " + $exp.resultado +  ", NULL)\n";
		else    	
			$codigo += "L" + linea + " : (ASSIGN, " + $Id.text + ", t" + cnt + ", NULL)\n";
		$lineas = 1 + $exp.lineas;
		++linea;
		}
	| 'if' 
		{
		int aux = linea;
		linea+=2;
		}
	'(' ex1 = expresion c = Comp ex2 = expresion ')' 
		{
		linea -= $ex1.lineas + $ex2.lineas;
		}
	'then' '{' en1 = programa '}' 'else' 
		{
		++linea;
		}
	'{' en2 = programa '}'
		{
		$codigo = "L" + aux + " : (IF_TRUE," + $ex1.text + $c.text + $ex2.text +
		 ", GOTO, " + "L" + (aux + 2) + ")\n";
		$codigo += "L" + (aux+1) + " : (IF_FALSE," + $ex1.text + $c.text + $ex2.text +
		 ", GOTO, " + "L" + (aux + 2 + $en1.lineas) + ")\n";
		$codigo += $en1.codigo;
		$codigo += "L" + (aux+$en1.lineas+2) + " : (IF_TRUE, NULL, GOTO, L" 
		+ (aux+4+$en1.lineas+$en2.lineas) + ")\n";
		$codigo += $en2.codigo;
		$codigo += "L" + (aux+$en1.lineas+$en2.lineas+3) + " : (IF_TRUE, NULL, GOTO, L" + (aux+4+$en1.lineas+$en2.lineas) + ")\n";
		linea++;
		$lineas = 4 + $en1.lineas + $en2.lineas;
		}
	| 'while'{
	int aux = linea;
	linea += 3;
	} '('ex3 = Id co= Comp ex4 = expresion ')' 'do' '{' en3 = programa '}'{
	
	linea -= $ex4.lineas;
	linea++;
	$codigo = "L" + aux + " : (IF_TRUE, NULL , GOTO, " + "L" + (aux + 1) + ")\n";
	$codigo += "L" + (aux+1) + " : (IF_TRUE," + $ex3.text + $co.text + $ex4.text +
		 ", GOTO, " + "L" + (aux + 3) + ")\n";
	$codigo += "L" + (aux+2) + " : (IF_FALSE," + $ex3.text + $co.text + $ex4.text +
		 ", GOTO, " + "L" + (aux + 3 + $en3.lineas+2) + ")\n";
	$codigo += $en3.codigo;
	$codigo += "L" + (linea-1) + " : (IF_TRUE, NULL , GOTO, " + "L" + (aux + 1) + ")\n";
	}
	| 'for'{
	int aux = linea+1;
	} '(' forec = ecuacion {
	linea+=3;
	$codigo = $forec.codigo;
	} b =Id cond = Comp forexp = expresion ';' inc = incrementar ')''{' forprog = programa '}'{
	$codigo += "L" + aux + " : (IF_TRUE, NULL , GOTO, " + "L" + (aux + 1) + ")\n";
	$codigo += "L" + (aux+1) + " : (IF_TRUE," + $b.text + $cond.text + $forexp.text +
		 ", GOTO, " + "L" + (aux + 3) + ")\n";
	$codigo += "L" + (aux+2) + " : (IF_FALSE," + $b.text + $cond.text + $forexp.text +
		 ", GOTO, " + "L" + (aux + 1 + $forprog.lineas+4) + ")\n";
	$codigo += $forprog.codigo;
	
	if($inc.codigo == "++"){
		cnt++;
		$codigo += "L" + linea + " : (ADD,t"+cnt+"," + $inc.id + "," + 1 + ")\n";
	}
	else 
	{
		cnt++;
		$codigo += "L" + linea + " : (SUB,t" + cnt + "," + $inc.id + "," +1+ ")\n";
	}
	
	$codigo += "L" + (linea++) + " : (ASSIGN , x , t"+cnt+", NULL)\n";
	$codigo += "L" + (linea++) + " : (IF_TRUE," + $b.text + $cond.text + $forexp.text +
		 ", GOTO, " + "L" + (aux + 3) + ")\n";
	
	}
	| 'do'{ int lineaDo = linea;} progDoWhile = parPrograma 'while' expDoWhile = parExpresion ';'
	{
	$codigo = $progDoWhile.codigo;
	linea = $progDoWhile.lineas;
	$codigo += $expDoWhile.codigo;
	linea += $expDoWhile.lineas;
	linea++;
	 $codigo += "L" + (linea++) + " : (IF_TRUE, " + $expDoWhile.resultado + ", GOTO, L" + lineaDo + " )\n";
	 $codigo += "L" + (linea++) + " : (IF_FALSE, " + $expDoWhile.resultado + ", GOTO, L" + (linea) + " )\n ";
	}
	;
incrementar returns [String codigo, String id]
: 
	d = dato
	{
		$id = $d.resultado;
	}
	('++' {
		$codigo = "++";
		}
	|'--' {
		$codigo = "--";
		}
	)
;

programa returns [String codigo, int lineas]
	: 	
		{
		$lineas = 0;
		$codigo = "";
		}
	( ec = ecuacion 
		{
		$codigo += $ec.codigo;
		$lineas += $ec.lineas;
		}
	)+
	;
parPrograma returns [String codigo, int lineas]
:	'{' prog = programa '}'
	{ 
	$lineas = 0;
	$codigo = "";
	$lineas = $prog.lineas;
	  $codigo += $prog.codigo; 
	  }
	  
	  
;

parExpresion returns [String codigo, int lineas, String resultado ]
: '(' exp1 = expresion c = Comp exp2 = expresion ')'
{
  $codigo = $exp1.codigo;
  $lineas = $exp1.lineas;
  $codigo += $exp2.codigo;
  $lineas = $exp2.lineas;
  $resultado = $exp1.resultado + $c.text + $exp2.resultado;
 
  }
;
expresion returns [String codigo, String resultado, int lineas]
	: m1 = termino 
		{ 
		String aux = $m1.resultado;
		$codigo = $m1.codigo;
		$resultado = $m1.resultado;
		$lineas = $m1.lineas;
		}
	( '+' m2=termino 
		{
		cnt++;
		$codigo += $m2.codigo;
		$codigo += "L" + linea + " : (ADD, t" + cnt + "," + aux + "," + $m2.resultado + ")\n";
		aux = "t" + cnt;
		++linea;
		$lineas = $lineas + 1 + $m2.lineas;
		$resultado =  "t" + cnt;
		}
	|	'-' m2=termino 
		{
		cnt++;
		$codigo += $m2.codigo;
		$codigo += "L" + linea + " : (SUB, t" + cnt + "," + aux + "," + $m2.resultado + ")\n";
		aux = "t" + cnt;
		++linea;
		$lineas = $lineas + 1 + $m2.lineas;
		$resultado =  "t" + cnt;
		}

	)*
	;

termino returns [String codigo, String resultado, int lineas]
	: m1 = factor 
		{ 
		String aux = $m1.resultado;
		$codigo = $m1.codigo;
		$lineas = $m1.lineas;
		$resultado = $m1.resultado;
		}
	( '*' m2=factor 
		{
		cnt++;
		$codigo += $m2.codigo;
		$codigo += "L" + linea + " : (MULT, t" + cnt + "," + aux + "," + $m2.resultado + ")\n";
		aux = "t" + cnt;
		++linea;
		$lineas = $lineas + 1 + $m2.lineas;
		$resultado =  "t" + cnt;
		}
	| '/' m2=factor 
		{
		cnt++;
		$codigo += $m2.codigo;
		$codigo += "L" + linea + " : (DIV, t" + cnt + "," + aux + "," + $m2.resultado + ")\n";
		aux = "t" + cnt;
		++linea;
		$lineas = $lineas + 1 + $m2.lineas;
		$resultado =  "t" + cnt;
		}
	)*
	;


factor returns [String codigo, String resultado, int lineas]
	: '(' exp = expresion ')' 
		{
		$lineas = $exp.lineas;
		$codigo = $exp.codigo;
		$resultado = $exp.resultado;
		}
	|	n = dato 
		{
		$lineas = $n.lineas;
		$codigo = $n.codigo;
		$resultado = $n.resultado;
		}
	;

dato returns [String codigo, String resultado, int lineas]
	: Number 
		{
		$lineas = 0;
		$codigo = "";
		$resultado = $Number.text;
		}
	| Id 
		{ 
		$lineas = 0;
		$codigo = "";
		$resultado = $Id.text;
		}
	| '-' Number 
		{
		$lineas = 1;
		cnt++;
		$codigo = "L" + linea + " : (NEG, t" + cnt + "," + $Number.text + ", NULL)\n";
		++linea;
		$resultado = "t" + cnt;
		}
	| '-' Id 
		{
		$lineas = 1;
		cnt++;
		$codigo = "L" + linea + " : (NEG, t" + cnt + "," + $Id.text + ", NULL)\n";
		++linea;
		$resultado = "t" + cnt;
		}
	;
	
	
Id 
	:	('a'..'z'|'A'..'Z')+ 
	; 
   
	
Number
	:	('0'..'9')+ ('.' ('0'..'9')+)? 
	;

Comp 
	: ('>' | '<' | '>=' | '<=' | '==' | '!=')
	;


/* Ignoramos todos los caracteres de espacios en blanco. */


WS
    :   (' ' | '\t' | '\r'| '\n')    { $channel=HIDDEN; }
    ;

