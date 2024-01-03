// $ANTLR 3.5.1 /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g 2023-01-09 00:50:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class BucleWhileyForParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Comp", "Id", "Number", "WS", 
		"'('", "')'", "'*'", "'+'", "'++'", "'-'", "'--'", "'/'", "';'", "'='", 
		"'do'", "'else'", "'for'", "'if'", "'then'", "'while'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int Comp=4;
	public static final int Id=5;
	public static final int Number=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "incrementar", "ecuacion", "expresion", "termino", "factor", 
		"programa", "entrada", "dato", "parPrograma", "parExpresion"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public BucleWhileyForParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public BucleWhileyForParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public BucleWhileyForParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return BucleWhileyForParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g"; }


	    int cnt   = -1;
	    int linea =  1;


	public static class entrada_return extends ParserRuleReturnScope {
		public String codigo;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "entrada"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:16:1: entrada returns [String codigo] : ec1= ecuacion (ec2= ecuacion )* ;
	public final BucleWhileyForParser.entrada_return entrada() throws RecognitionException {
		BucleWhileyForParser.entrada_return retval = new BucleWhileyForParser.entrada_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ec1 =null;
		ParserRuleReturnScope ec2 =null;


		try { dbg.enterRule(getGrammarFileName(), "entrada");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:17:2: (ec1= ecuacion (ec2= ecuacion )* )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:17:4: ec1= ecuacion (ec2= ecuacion )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(17,8);
			pushFollow(FOLLOW_ecuacion_in_entrada58);
			ec1=ecuacion();
			state._fsp--;

			adaptor.addChild(root_0, ec1.getTree());
			dbg.location(18,3);

					retval.codigo = (ec1!=null?((BucleWhileyForParser.ecuacion_return)ec1).codigo:null);
					dbg.location(21,2);
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:21:2: (ec2= ecuacion )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==Id||LA1_0==18||(LA1_0 >= 20 && LA1_0 <= 21)||LA1_0==23) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:21:4: ec2= ecuacion
					{
					dbg.location(21,8);
					pushFollow(FOLLOW_ecuacion_in_entrada72);
					ec2=ecuacion();
					state._fsp--;

					adaptor.addChild(root_0, ec2.getTree());
					dbg.location(22,3);

							retval.codigo += (ec2!=null?((BucleWhileyForParser.ecuacion_return)ec2).codigo:null);
							
					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(26,3);

			      	retval.codigo += "L" + linea + " : (HALT, NULL, NULL, NULL)\n";
			       	System.out.print(retval.codigo);
			       	
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(30, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "entrada");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "entrada"


	public static class ecuacion_return extends ParserRuleReturnScope {
		public String codigo;
		public int lineas;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ecuacion"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:32:1: ecuacion returns [String codigo, int lineas] : ( Id '=' exp= expresion ';' | 'if' '(' ex1= expresion c= Comp ex2= expresion ')' 'then' '{' en1= programa '}' 'else' '{' en2= programa '}' | 'while' '(' ex3= Id co= Comp ex4= expresion ')' 'do' '{' en3= programa '}' | 'for' '(' forec= ecuacion b= Id cond= Comp forexp= expresion ';' inc= incrementar ')' '{' forprog= programa '}' | 'do' progDoWhile= parPrograma 'while' expDoWhile= parExpresion ';' );
	public final BucleWhileyForParser.ecuacion_return ecuacion() throws RecognitionException {
		BucleWhileyForParser.ecuacion_return retval = new BucleWhileyForParser.ecuacion_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token c=null;
		Token ex3=null;
		Token co=null;
		Token b=null;
		Token cond=null;
		Token Id1=null;
		Token char_literal2=null;
		Token char_literal3=null;
		Token string_literal4=null;
		Token char_literal5=null;
		Token char_literal6=null;
		Token string_literal7=null;
		Token char_literal8=null;
		Token char_literal9=null;
		Token string_literal10=null;
		Token char_literal11=null;
		Token char_literal12=null;
		Token string_literal13=null;
		Token char_literal14=null;
		Token char_literal15=null;
		Token string_literal16=null;
		Token char_literal17=null;
		Token char_literal18=null;
		Token string_literal19=null;
		Token char_literal20=null;
		Token char_literal21=null;
		Token char_literal22=null;
		Token char_literal23=null;
		Token char_literal24=null;
		Token string_literal25=null;
		Token string_literal26=null;
		Token char_literal27=null;
		ParserRuleReturnScope exp =null;
		ParserRuleReturnScope ex1 =null;
		ParserRuleReturnScope ex2 =null;
		ParserRuleReturnScope en1 =null;
		ParserRuleReturnScope en2 =null;
		ParserRuleReturnScope ex4 =null;
		ParserRuleReturnScope en3 =null;
		ParserRuleReturnScope forec =null;
		ParserRuleReturnScope forexp =null;
		ParserRuleReturnScope inc =null;
		ParserRuleReturnScope forprog =null;
		ParserRuleReturnScope progDoWhile =null;
		ParserRuleReturnScope expDoWhile =null;

		Object c_tree=null;
		Object ex3_tree=null;
		Object co_tree=null;
		Object b_tree=null;
		Object cond_tree=null;
		Object Id1_tree=null;
		Object char_literal2_tree=null;
		Object char_literal3_tree=null;
		Object string_literal4_tree=null;
		Object char_literal5_tree=null;
		Object char_literal6_tree=null;
		Object string_literal7_tree=null;
		Object char_literal8_tree=null;
		Object char_literal9_tree=null;
		Object string_literal10_tree=null;
		Object char_literal11_tree=null;
		Object char_literal12_tree=null;
		Object string_literal13_tree=null;
		Object char_literal14_tree=null;
		Object char_literal15_tree=null;
		Object string_literal16_tree=null;
		Object char_literal17_tree=null;
		Object char_literal18_tree=null;
		Object string_literal19_tree=null;
		Object char_literal20_tree=null;
		Object char_literal21_tree=null;
		Object char_literal22_tree=null;
		Object char_literal23_tree=null;
		Object char_literal24_tree=null;
		Object string_literal25_tree=null;
		Object string_literal26_tree=null;
		Object char_literal27_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "ecuacion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(32, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:33:5: ( Id '=' exp= expresion ';' | 'if' '(' ex1= expresion c= Comp ex2= expresion ')' 'then' '{' en1= programa '}' 'else' '{' en2= programa '}' | 'while' '(' ex3= Id co= Comp ex4= expresion ')' 'do' '{' en3= programa '}' | 'for' '(' forec= ecuacion b= Id cond= Comp forexp= expresion ';' inc= incrementar ')' '{' forprog= programa '}' | 'do' progDoWhile= parPrograma 'while' expDoWhile= parExpresion ';' )
			int alt2=5;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case Id:
				{
				alt2=1;
				}
				break;
			case 21:
				{
				alt2=2;
				}
				break;
			case 23:
				{
				alt2=3;
				}
				break;
			case 20:
				{
				alt2=4;
				}
				break;
			case 18:
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:33:7: Id '=' exp= expresion ';'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(33,7);
					Id1=(Token)match(input,Id,FOLLOW_Id_in_ecuacion111); 
					Id1_tree = (Object)adaptor.create(Id1);
					adaptor.addChild(root_0, Id1_tree);
					dbg.location(33,10);
					char_literal2=(Token)match(input,17,FOLLOW_17_in_ecuacion113); 
					char_literal2_tree = (Object)adaptor.create(char_literal2);
					adaptor.addChild(root_0, char_literal2_tree);
					dbg.location(33,18);
					pushFollow(FOLLOW_expresion_in_ecuacion119);
					exp=expresion();
					state._fsp--;

					adaptor.addChild(root_0, exp.getTree());
					dbg.location(33,30);
					char_literal3=(Token)match(input,16,FOLLOW_16_in_ecuacion121); 
					char_literal3_tree = (Object)adaptor.create(char_literal3);
					adaptor.addChild(root_0, char_literal3_tree);
					dbg.location(34,6);

					    	retval.codigo = (exp!=null?((BucleWhileyForParser.expresion_return)exp).codigo:null);
							if ((exp!=null?((BucleWhileyForParser.expresion_return)exp).lineas:0) == 0)
								retval.codigo += "L" + linea + " : (ASSIGN, " + (Id1!=null?Id1.getText():null) + ", " + (exp!=null?((BucleWhileyForParser.expresion_return)exp).resultado:null) +  ", NULL)\n";
							else    	
								retval.codigo += "L" + linea + " : (ASSIGN, " + (Id1!=null?Id1.getText():null) + ", t" + cnt + ", NULL)\n";
							retval.lineas = 1 + (exp!=null?((BucleWhileyForParser.expresion_return)exp).lineas:0);
							++linea;
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:43:4: 'if' '(' ex1= expresion c= Comp ex2= expresion ')' 'then' '{' en1= programa '}' 'else' '{' en2= programa '}'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(43,4);
					string_literal4=(Token)match(input,21,FOLLOW_21_in_ecuacion134); 
					string_literal4_tree = (Object)adaptor.create(string_literal4);
					adaptor.addChild(root_0, string_literal4_tree);
					dbg.location(44,3);

							int aux = linea;
							linea+=2;
							dbg.location(48,2);
					char_literal5=(Token)match(input,8,FOLLOW_8_in_ecuacion142); 
					char_literal5_tree = (Object)adaptor.create(char_literal5);
					adaptor.addChild(root_0, char_literal5_tree);
					dbg.location(48,10);
					pushFollow(FOLLOW_expresion_in_ecuacion148);
					ex1=expresion();
					state._fsp--;

					adaptor.addChild(root_0, ex1.getTree());
					dbg.location(48,24);
					c=(Token)match(input,Comp,FOLLOW_Comp_in_ecuacion154); 
					c_tree = (Object)adaptor.create(c);
					adaptor.addChild(root_0, c_tree);
					dbg.location(48,35);
					pushFollow(FOLLOW_expresion_in_ecuacion160);
					ex2=expresion();
					state._fsp--;

					adaptor.addChild(root_0, ex2.getTree());
					dbg.location(48,47);
					char_literal6=(Token)match(input,9,FOLLOW_9_in_ecuacion162); 
					char_literal6_tree = (Object)adaptor.create(char_literal6);
					adaptor.addChild(root_0, char_literal6_tree);
					dbg.location(49,3);

							linea -= (ex1!=null?((BucleWhileyForParser.expresion_return)ex1).lineas:0) + (ex2!=null?((BucleWhileyForParser.expresion_return)ex2).lineas:0);
							dbg.location(52,2);
					string_literal7=(Token)match(input,22,FOLLOW_22_in_ecuacion170); 
					string_literal7_tree = (Object)adaptor.create(string_literal7);
					adaptor.addChild(root_0, string_literal7_tree);
					dbg.location(52,9);
					char_literal8=(Token)match(input,24,FOLLOW_24_in_ecuacion172); 
					char_literal8_tree = (Object)adaptor.create(char_literal8);
					adaptor.addChild(root_0, char_literal8_tree);
					dbg.location(52,17);
					pushFollow(FOLLOW_programa_in_ecuacion178);
					en1=programa();
					state._fsp--;

					adaptor.addChild(root_0, en1.getTree());
					dbg.location(52,28);
					char_literal9=(Token)match(input,25,FOLLOW_25_in_ecuacion180); 
					char_literal9_tree = (Object)adaptor.create(char_literal9);
					adaptor.addChild(root_0, char_literal9_tree);
					dbg.location(52,32);
					string_literal10=(Token)match(input,19,FOLLOW_19_in_ecuacion182); 
					string_literal10_tree = (Object)adaptor.create(string_literal10);
					adaptor.addChild(root_0, string_literal10_tree);
					dbg.location(53,3);

							++linea;
							dbg.location(56,2);
					char_literal11=(Token)match(input,24,FOLLOW_24_in_ecuacion190); 
					char_literal11_tree = (Object)adaptor.create(char_literal11);
					adaptor.addChild(root_0, char_literal11_tree);
					dbg.location(56,10);
					pushFollow(FOLLOW_programa_in_ecuacion196);
					en2=programa();
					state._fsp--;

					adaptor.addChild(root_0, en2.getTree());
					dbg.location(56,21);
					char_literal12=(Token)match(input,25,FOLLOW_25_in_ecuacion198); 
					char_literal12_tree = (Object)adaptor.create(char_literal12);
					adaptor.addChild(root_0, char_literal12_tree);
					dbg.location(57,3);

							retval.codigo = "L" + aux + " : (IF_TRUE," + (ex1!=null?input.toString(ex1.start,ex1.stop):null) + (c!=null?c.getText():null) + (ex2!=null?input.toString(ex2.start,ex2.stop):null) +
							 ", GOTO, " + "L" + (aux + 2) + ")\n";
							retval.codigo += "L" + (aux+1) + " : (IF_FALSE," + (ex1!=null?input.toString(ex1.start,ex1.stop):null) + (c!=null?c.getText():null) + (ex2!=null?input.toString(ex2.start,ex2.stop):null) +
							 ", GOTO, " + "L" + (aux + 2 + (en1!=null?((BucleWhileyForParser.programa_return)en1).lineas:0)) + ")\n";
							retval.codigo += (en1!=null?((BucleWhileyForParser.programa_return)en1).codigo:null);
							retval.codigo += "L" + (aux+(en1!=null?((BucleWhileyForParser.programa_return)en1).lineas:0)+2) + " : (IF_TRUE, NULL, GOTO, L" 
							+ (aux+4+(en1!=null?((BucleWhileyForParser.programa_return)en1).lineas:0)+(en2!=null?((BucleWhileyForParser.programa_return)en2).lineas:0)) + ")\n";
							retval.codigo += (en2!=null?((BucleWhileyForParser.programa_return)en2).codigo:null);
							retval.codigo += "L" + (aux+(en1!=null?((BucleWhileyForParser.programa_return)en1).lineas:0)+(en2!=null?((BucleWhileyForParser.programa_return)en2).lineas:0)+3) + " : (IF_TRUE, NULL, GOTO, L" + (aux+4+(en1!=null?((BucleWhileyForParser.programa_return)en1).lineas:0)+(en2!=null?((BucleWhileyForParser.programa_return)en2).lineas:0)) + ")\n";
							linea++;
							retval.lineas = 4 + (en1!=null?((BucleWhileyForParser.programa_return)en1).lineas:0) + (en2!=null?((BucleWhileyForParser.programa_return)en2).lineas:0);
							
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:70:4: 'while' '(' ex3= Id co= Comp ex4= expresion ')' 'do' '{' en3= programa '}'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(70,4);
					string_literal13=(Token)match(input,23,FOLLOW_23_in_ecuacion207); 
					string_literal13_tree = (Object)adaptor.create(string_literal13);
					adaptor.addChild(root_0, string_literal13_tree);
					dbg.location(70,11);

						int aux = linea;
						linea += 3;
						dbg.location(73,4);
					char_literal14=(Token)match(input,8,FOLLOW_8_in_ecuacion210); 
					char_literal14_tree = (Object)adaptor.create(char_literal14);
					adaptor.addChild(root_0, char_literal14_tree);
					dbg.location(73,11);
					ex3=(Token)match(input,Id,FOLLOW_Id_in_ecuacion215); 
					ex3_tree = (Object)adaptor.create(ex3);
					adaptor.addChild(root_0, ex3_tree);
					dbg.location(73,18);
					co=(Token)match(input,Comp,FOLLOW_Comp_in_ecuacion220); 
					co_tree = (Object)adaptor.create(co);
					adaptor.addChild(root_0, co_tree);
					dbg.location(73,29);
					pushFollow(FOLLOW_expresion_in_ecuacion226);
					ex4=expresion();
					state._fsp--;

					adaptor.addChild(root_0, ex4.getTree());
					dbg.location(73,41);
					char_literal15=(Token)match(input,9,FOLLOW_9_in_ecuacion228); 
					char_literal15_tree = (Object)adaptor.create(char_literal15);
					adaptor.addChild(root_0, char_literal15_tree);
					dbg.location(73,45);
					string_literal16=(Token)match(input,18,FOLLOW_18_in_ecuacion230); 
					string_literal16_tree = (Object)adaptor.create(string_literal16);
					adaptor.addChild(root_0, string_literal16_tree);
					dbg.location(73,50);
					char_literal17=(Token)match(input,24,FOLLOW_24_in_ecuacion232); 
					char_literal17_tree = (Object)adaptor.create(char_literal17);
					adaptor.addChild(root_0, char_literal17_tree);
					dbg.location(73,58);
					pushFollow(FOLLOW_programa_in_ecuacion238);
					en3=programa();
					state._fsp--;

					adaptor.addChild(root_0, en3.getTree());
					dbg.location(73,69);
					char_literal18=(Token)match(input,25,FOLLOW_25_in_ecuacion240); 
					char_literal18_tree = (Object)adaptor.create(char_literal18);
					adaptor.addChild(root_0, char_literal18_tree);
					dbg.location(73,72);

						
						linea -= (ex4!=null?((BucleWhileyForParser.expresion_return)ex4).lineas:0);
						linea++;
						retval.codigo = "L" + aux + " : (IF_TRUE, NULL , GOTO, " + "L" + (aux + 1) + ")\n";
						retval.codigo += "L" + (aux+1) + " : (IF_TRUE," + (ex3!=null?ex3.getText():null) + (co!=null?co.getText():null) + (ex4!=null?input.toString(ex4.start,ex4.stop):null) +
							 ", GOTO, " + "L" + (aux + 3) + ")\n";
						retval.codigo += "L" + (aux+2) + " : (IF_FALSE," + (ex3!=null?ex3.getText():null) + (co!=null?co.getText():null) + (ex4!=null?input.toString(ex4.start,ex4.stop):null) +
							 ", GOTO, " + "L" + (aux + 3 + (en3!=null?((BucleWhileyForParser.programa_return)en3).lineas:0)+2) + ")\n";
						retval.codigo += (en3!=null?((BucleWhileyForParser.programa_return)en3).codigo:null);
						retval.codigo += "L" + (linea-1) + " : (IF_TRUE, NULL , GOTO, " + "L" + (aux + 1) + ")\n";
						
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:85:4: 'for' '(' forec= ecuacion b= Id cond= Comp forexp= expresion ';' inc= incrementar ')' '{' forprog= programa '}'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(85,4);
					string_literal19=(Token)match(input,20,FOLLOW_20_in_ecuacion246); 
					string_literal19_tree = (Object)adaptor.create(string_literal19);
					adaptor.addChild(root_0, string_literal19_tree);
					dbg.location(85,9);

						int aux = linea+1;
						dbg.location(87,4);
					char_literal20=(Token)match(input,8,FOLLOW_8_in_ecuacion249); 
					char_literal20_tree = (Object)adaptor.create(char_literal20);
					adaptor.addChild(root_0, char_literal20_tree);
					dbg.location(87,14);
					pushFollow(FOLLOW_ecuacion_in_ecuacion255);
					forec=ecuacion();
					state._fsp--;

					adaptor.addChild(root_0, forec.getTree());
					dbg.location(87,25);

						linea+=3;
						retval.codigo = (forec!=null?((BucleWhileyForParser.ecuacion_return)forec).codigo:null);
						dbg.location(90,6);
					b=(Token)match(input,Id,FOLLOW_Id_in_ecuacion262); 
					b_tree = (Object)adaptor.create(b);
					adaptor.addChild(root_0, b_tree);
					dbg.location(90,15);
					cond=(Token)match(input,Comp,FOLLOW_Comp_in_ecuacion268); 
					cond_tree = (Object)adaptor.create(cond);
					adaptor.addChild(root_0, cond_tree);
					dbg.location(90,29);
					pushFollow(FOLLOW_expresion_in_ecuacion274);
					forexp=expresion();
					state._fsp--;

					adaptor.addChild(root_0, forexp.getTree());
					dbg.location(90,41);
					char_literal21=(Token)match(input,16,FOLLOW_16_in_ecuacion276); 
					char_literal21_tree = (Object)adaptor.create(char_literal21);
					adaptor.addChild(root_0, char_literal21_tree);
					dbg.location(90,49);
					pushFollow(FOLLOW_incrementar_in_ecuacion282);
					inc=incrementar();
					state._fsp--;

					adaptor.addChild(root_0, inc.getTree());
					dbg.location(90,63);
					char_literal22=(Token)match(input,9,FOLLOW_9_in_ecuacion284); 
					char_literal22_tree = (Object)adaptor.create(char_literal22);
					adaptor.addChild(root_0, char_literal22_tree);
					dbg.location(90,66);
					char_literal23=(Token)match(input,24,FOLLOW_24_in_ecuacion285); 
					char_literal23_tree = (Object)adaptor.create(char_literal23);
					adaptor.addChild(root_0, char_literal23_tree);
					dbg.location(90,78);
					pushFollow(FOLLOW_programa_in_ecuacion291);
					forprog=programa();
					state._fsp--;

					adaptor.addChild(root_0, forprog.getTree());
					dbg.location(90,89);
					char_literal24=(Token)match(input,25,FOLLOW_25_in_ecuacion293); 
					char_literal24_tree = (Object)adaptor.create(char_literal24);
					adaptor.addChild(root_0, char_literal24_tree);
					dbg.location(90,92);

						retval.codigo += "L" + aux + " : (IF_TRUE, NULL , GOTO, " + "L" + (aux + 1) + ")\n";
						retval.codigo += "L" + (aux+1) + " : (IF_TRUE," + (b!=null?b.getText():null) + (cond!=null?cond.getText():null) + (forexp!=null?input.toString(forexp.start,forexp.stop):null) +
							 ", GOTO, " + "L" + (aux + 3) + ")\n";
						retval.codigo += "L" + (aux+2) + " : (IF_FALSE," + (b!=null?b.getText():null) + (cond!=null?cond.getText():null) + (forexp!=null?input.toString(forexp.start,forexp.stop):null) +
							 ", GOTO, " + "L" + (aux + 1 + (forprog!=null?((BucleWhileyForParser.programa_return)forprog).lineas:0)+4) + ")\n";
						retval.codigo += (forprog!=null?((BucleWhileyForParser.programa_return)forprog).codigo:null);
						
						if((inc!=null?((BucleWhileyForParser.incrementar_return)inc).codigo:null) == "++"){
							cnt++;
							retval.codigo += "L" + linea + " : (ADD,t"+cnt+"," + (inc!=null?((BucleWhileyForParser.incrementar_return)inc).id:null) + "," + 1 + ")\n";
						}
						else 
						{
							cnt++;
							retval.codigo += "L" + linea + " : (SUB,t" + cnt + "," + (inc!=null?((BucleWhileyForParser.incrementar_return)inc).id:null) + "," +1+ ")\n";
						}
						
						retval.codigo += "L" + (linea++) + " : (ASSIGN , x , t"+cnt+", NULL)\n";
						retval.codigo += "L" + (linea++) + " : (IF_TRUE," + (b!=null?b.getText():null) + (cond!=null?cond.getText():null) + (forexp!=null?input.toString(forexp.start,forexp.stop):null) +
							 ", GOTO, " + "L" + (aux + 3) + ")\n";
						
						
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:113:4: 'do' progDoWhile= parPrograma 'while' expDoWhile= parExpresion ';'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(113,4);
					string_literal25=(Token)match(input,18,FOLLOW_18_in_ecuacion299); 
					string_literal25_tree = (Object)adaptor.create(string_literal25);
					adaptor.addChild(root_0, string_literal25_tree);
					dbg.location(113,8);
					 int lineaDo = linea;dbg.location(113,44);
					pushFollow(FOLLOW_parPrograma_in_ecuacion306);
					progDoWhile=parPrograma();
					state._fsp--;

					adaptor.addChild(root_0, progDoWhile.getTree());
					dbg.location(113,58);
					string_literal26=(Token)match(input,23,FOLLOW_23_in_ecuacion308); 
					string_literal26_tree = (Object)adaptor.create(string_literal26);
					adaptor.addChild(root_0, string_literal26_tree);
					dbg.location(113,77);
					pushFollow(FOLLOW_parExpresion_in_ecuacion314);
					expDoWhile=parExpresion();
					state._fsp--;

					adaptor.addChild(root_0, expDoWhile.getTree());
					dbg.location(113,92);
					char_literal27=(Token)match(input,16,FOLLOW_16_in_ecuacion316); 
					char_literal27_tree = (Object)adaptor.create(char_literal27);
					adaptor.addChild(root_0, char_literal27_tree);
					dbg.location(114,2);

						retval.codigo = (progDoWhile!=null?((BucleWhileyForParser.parPrograma_return)progDoWhile).codigo:null);
						linea = (progDoWhile!=null?((BucleWhileyForParser.parPrograma_return)progDoWhile).lineas:0);
						retval.codigo += (expDoWhile!=null?((BucleWhileyForParser.parExpresion_return)expDoWhile).codigo:null);
						linea += (expDoWhile!=null?((BucleWhileyForParser.parExpresion_return)expDoWhile).lineas:0);
						linea++;
						 retval.codigo += "L" + (linea++) + " : (IF_TRUE, " + (expDoWhile!=null?((BucleWhileyForParser.parExpresion_return)expDoWhile).resultado:null) + ", GOTO, L" + lineaDo + " )\n";
						 retval.codigo += "L" + (linea++) + " : (IF_FALSE, " + (expDoWhile!=null?((BucleWhileyForParser.parExpresion_return)expDoWhile).resultado:null) + ", GOTO, L" + (linea) + " )\n ";
						
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(123, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ecuacion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ecuacion"


	public static class incrementar_return extends ParserRuleReturnScope {
		public String codigo;
		public String id;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "incrementar"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:124:1: incrementar returns [String codigo, String id] : d= dato ( '++' | '--' ) ;
	public final BucleWhileyForParser.incrementar_return incrementar() throws RecognitionException {
		BucleWhileyForParser.incrementar_return retval = new BucleWhileyForParser.incrementar_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal28=null;
		Token string_literal29=null;
		ParserRuleReturnScope d =null;

		Object string_literal28_tree=null;
		Object string_literal29_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "incrementar");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(124, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:125:2: (d= dato ( '++' | '--' ) )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:126:2: d= dato ( '++' | '--' )
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(126,4);
			pushFollow(FOLLOW_dato_in_incrementar338);
			d=dato();
			state._fsp--;

			adaptor.addChild(root_0, d.getTree());
			dbg.location(127,2);

					retval.id = (d!=null?((BucleWhileyForParser.dato_return)d).resultado:null);
				dbg.location(130,2);
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:130:2: ( '++' | '--' )
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==12) ) {
				alt3=1;
			}
			else if ( (LA3_0==14) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:130:3: '++'
					{
					dbg.location(130,3);
					string_literal28=(Token)match(input,12,FOLLOW_12_in_incrementar345); 
					string_literal28_tree = (Object)adaptor.create(string_literal28);
					adaptor.addChild(root_0, string_literal28_tree);
					dbg.location(130,8);

							retval.codigo = "++";
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:133:3: '--'
					{
					dbg.location(133,3);
					string_literal29=(Token)match(input,14,FOLLOW_14_in_incrementar351); 
					string_literal29_tree = (Object)adaptor.create(string_literal29);
					adaptor.addChild(root_0, string_literal29_tree);
					dbg.location(133,8);

							retval.codigo = "--";
							
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(137, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "incrementar");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "incrementar"


	public static class programa_return extends ParserRuleReturnScope {
		public String codigo;
		public int lineas;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "programa"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:139:1: programa returns [String codigo, int lineas] : (ec= ecuacion )+ ;
	public final BucleWhileyForParser.programa_return programa() throws RecognitionException {
		BucleWhileyForParser.programa_return retval = new BucleWhileyForParser.programa_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ec =null;


		try { dbg.enterRule(getGrammarFileName(), "programa");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(139, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:140:2: ( (ec= ecuacion )+ )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:141:3: (ec= ecuacion )+
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(141,3);

					retval.lineas = 0;
					retval.codigo = "";
					dbg.location(145,2);
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:145:2: (ec= ecuacion )+
			int cnt4=0;
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==Id||LA4_0==18||(LA4_0 >= 20 && LA4_0 <= 21)||LA4_0==23) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:145:4: ec= ecuacion
					{
					dbg.location(145,7);
					pushFollow(FOLLOW_ecuacion_in_programa383);
					ec=ecuacion();
					state._fsp--;

					adaptor.addChild(root_0, ec.getTree());
					dbg.location(146,3);

							retval.codigo += (ec!=null?((BucleWhileyForParser.ecuacion_return)ec).codigo:null);
							retval.lineas += (ec!=null?((BucleWhileyForParser.ecuacion_return)ec).lineas:0);
							
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt4++;
			}
			} finally {dbg.exitSubRule(4);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(151, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "programa");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "programa"


	public static class parPrograma_return extends ParserRuleReturnScope {
		public String codigo;
		public int lineas;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parPrograma"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:152:1: parPrograma returns [String codigo, int lineas] : '{' prog= programa '}' ;
	public final BucleWhileyForParser.parPrograma_return parPrograma() throws RecognitionException {
		BucleWhileyForParser.parPrograma_return retval = new BucleWhileyForParser.parPrograma_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal30=null;
		Token char_literal31=null;
		ParserRuleReturnScope prog =null;

		Object char_literal30_tree=null;
		Object char_literal31_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "parPrograma");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(152, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:153:3: ( '{' prog= programa '}' )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:153:3: '{' prog= programa '}'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(153,3);
			char_literal30=(Token)match(input,24,FOLLOW_24_in_parPrograma405); 
			char_literal30_tree = (Object)adaptor.create(char_literal30);
			adaptor.addChild(root_0, char_literal30_tree);
			dbg.location(153,12);
			pushFollow(FOLLOW_programa_in_parPrograma411);
			prog=programa();
			state._fsp--;

			adaptor.addChild(root_0, prog.getTree());
			dbg.location(153,23);
			char_literal31=(Token)match(input,25,FOLLOW_25_in_parPrograma413); 
			char_literal31_tree = (Object)adaptor.create(char_literal31);
			adaptor.addChild(root_0, char_literal31_tree);
			dbg.location(154,2);
			 
				retval.lineas = 0;
				retval.codigo = "";
				retval.lineas = (prog!=null?((BucleWhileyForParser.programa_return)prog).lineas:0);
				  retval.codigo += (prog!=null?((BucleWhileyForParser.programa_return)prog).codigo:null); 
				  
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(162, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parPrograma");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "parPrograma"


	public static class parExpresion_return extends ParserRuleReturnScope {
		public String codigo;
		public int lineas;
		public String resultado;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parExpresion"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:164:1: parExpresion returns [String codigo, int lineas, String resultado ] : '(' exp1= expresion c= Comp exp2= expresion ')' ;
	public final BucleWhileyForParser.parExpresion_return parExpresion() throws RecognitionException {
		BucleWhileyForParser.parExpresion_return retval = new BucleWhileyForParser.parExpresion_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token c=null;
		Token char_literal32=null;
		Token char_literal33=null;
		ParserRuleReturnScope exp1 =null;
		ParserRuleReturnScope exp2 =null;

		Object c_tree=null;
		Object char_literal32_tree=null;
		Object char_literal33_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "parExpresion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(164, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:165:3: ( '(' exp1= expresion c= Comp exp2= expresion ')' )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:165:3: '(' exp1= expresion c= Comp exp2= expresion ')'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(165,3);
			char_literal32=(Token)match(input,8,FOLLOW_8_in_parExpresion437); 
			char_literal32_tree = (Object)adaptor.create(char_literal32);
			adaptor.addChild(root_0, char_literal32_tree);
			dbg.location(165,12);
			pushFollow(FOLLOW_expresion_in_parExpresion443);
			exp1=expresion();
			state._fsp--;

			adaptor.addChild(root_0, exp1.getTree());
			dbg.location(165,26);
			c=(Token)match(input,Comp,FOLLOW_Comp_in_parExpresion449); 
			c_tree = (Object)adaptor.create(c);
			adaptor.addChild(root_0, c_tree);
			dbg.location(165,38);
			pushFollow(FOLLOW_expresion_in_parExpresion455);
			exp2=expresion();
			state._fsp--;

			adaptor.addChild(root_0, exp2.getTree());
			dbg.location(165,50);
			char_literal33=(Token)match(input,9,FOLLOW_9_in_parExpresion457); 
			char_literal33_tree = (Object)adaptor.create(char_literal33);
			adaptor.addChild(root_0, char_literal33_tree);
			dbg.location(166,1);

			  retval.codigo = (exp1!=null?((BucleWhileyForParser.expresion_return)exp1).codigo:null);
			  retval.lineas = (exp1!=null?((BucleWhileyForParser.expresion_return)exp1).lineas:0);
			  retval.codigo += (exp2!=null?((BucleWhileyForParser.expresion_return)exp2).codigo:null);
			  retval.lineas = (exp2!=null?((BucleWhileyForParser.expresion_return)exp2).lineas:0);
			  retval.resultado = (exp1!=null?((BucleWhileyForParser.expresion_return)exp1).resultado:null) + (c!=null?c.getText():null) + (exp2!=null?((BucleWhileyForParser.expresion_return)exp2).resultado:null);
			 
			  
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(174, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parExpresion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "parExpresion"


	public static class expresion_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
		public int lineas;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expresion"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:175:1: expresion returns [String codigo, String resultado, int lineas] : m1= termino ( '+' m2= termino | '-' m2= termino )* ;
	public final BucleWhileyForParser.expresion_return expresion() throws RecognitionException {
		BucleWhileyForParser.expresion_return retval = new BucleWhileyForParser.expresion_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal34=null;
		Token char_literal35=null;
		ParserRuleReturnScope m1 =null;
		ParserRuleReturnScope m2 =null;

		Object char_literal34_tree=null;
		Object char_literal35_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expresion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(175, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:176:2: (m1= termino ( '+' m2= termino | '-' m2= termino )* )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:176:4: m1= termino ( '+' m2= termino | '-' m2= termino )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(176,7);
			pushFollow(FOLLOW_termino_in_expresion476);
			m1=termino();
			state._fsp--;

			adaptor.addChild(root_0, m1.getTree());
			dbg.location(177,3);
			 
					String aux = (m1!=null?((BucleWhileyForParser.termino_return)m1).resultado:null);
					retval.codigo = (m1!=null?((BucleWhileyForParser.termino_return)m1).codigo:null);
					retval.resultado = (m1!=null?((BucleWhileyForParser.termino_return)m1).resultado:null);
					retval.lineas = (m1!=null?((BucleWhileyForParser.termino_return)m1).lineas:0);
					dbg.location(183,2);
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:183:2: ( '+' m2= termino | '-' m2= termino )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=3;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==11) ) {
					alt5=1;
				}
				else if ( (LA5_0==13) ) {
					alt5=2;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:183:4: '+' m2= termino
					{
					dbg.location(183,4);
					char_literal34=(Token)match(input,11,FOLLOW_11_in_expresion486); 
					char_literal34_tree = (Object)adaptor.create(char_literal34);
					adaptor.addChild(root_0, char_literal34_tree);
					dbg.location(183,10);
					pushFollow(FOLLOW_termino_in_expresion490);
					m2=termino();
					state._fsp--;

					adaptor.addChild(root_0, m2.getTree());
					dbg.location(184,3);

							cnt++;
							retval.codigo += (m2!=null?((BucleWhileyForParser.termino_return)m2).codigo:null);
							retval.codigo += "L" + linea + " : (ADD, t" + cnt + "," + aux + "," + (m2!=null?((BucleWhileyForParser.termino_return)m2).resultado:null) + ")\n";
							aux = "t" + cnt;
							++linea;
							retval.lineas = retval.lineas + 1 + (m2!=null?((BucleWhileyForParser.termino_return)m2).lineas:0);
							retval.resultado =  "t" + cnt;
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:193:4: '-' m2= termino
					{
					dbg.location(193,4);
					char_literal35=(Token)match(input,13,FOLLOW_13_in_expresion500); 
					char_literal35_tree = (Object)adaptor.create(char_literal35);
					adaptor.addChild(root_0, char_literal35_tree);
					dbg.location(193,10);
					pushFollow(FOLLOW_termino_in_expresion504);
					m2=termino();
					state._fsp--;

					adaptor.addChild(root_0, m2.getTree());
					dbg.location(194,3);

							cnt++;
							retval.codigo += (m2!=null?((BucleWhileyForParser.termino_return)m2).codigo:null);
							retval.codigo += "L" + linea + " : (SUB, t" + cnt + "," + aux + "," + (m2!=null?((BucleWhileyForParser.termino_return)m2).resultado:null) + ")\n";
							aux = "t" + cnt;
							++linea;
							retval.lineas = retval.lineas + 1 + (m2!=null?((BucleWhileyForParser.termino_return)m2).lineas:0);
							retval.resultado =  "t" + cnt;
							
					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(205, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expresion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expresion"


	public static class termino_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
		public int lineas;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "termino"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:207:1: termino returns [String codigo, String resultado, int lineas] : m1= factor ( '*' m2= factor | '/' m2= factor )* ;
	public final BucleWhileyForParser.termino_return termino() throws RecognitionException {
		BucleWhileyForParser.termino_return retval = new BucleWhileyForParser.termino_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal36=null;
		Token char_literal37=null;
		ParserRuleReturnScope m1 =null;
		ParserRuleReturnScope m2 =null;

		Object char_literal36_tree=null;
		Object char_literal37_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "termino");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(207, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:208:2: (m1= factor ( '*' m2= factor | '/' m2= factor )* )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:208:4: m1= factor ( '*' m2= factor | '/' m2= factor )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(208,7);
			pushFollow(FOLLOW_factor_in_termino533);
			m1=factor();
			state._fsp--;

			adaptor.addChild(root_0, m1.getTree());
			dbg.location(209,3);
			 
					String aux = (m1!=null?((BucleWhileyForParser.factor_return)m1).resultado:null);
					retval.codigo = (m1!=null?((BucleWhileyForParser.factor_return)m1).codigo:null);
					retval.lineas = (m1!=null?((BucleWhileyForParser.factor_return)m1).lineas:0);
					retval.resultado = (m1!=null?((BucleWhileyForParser.factor_return)m1).resultado:null);
					dbg.location(215,2);
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:215:2: ( '*' m2= factor | '/' m2= factor )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=3;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==10) ) {
					alt6=1;
				}
				else if ( (LA6_0==15) ) {
					alt6=2;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:215:4: '*' m2= factor
					{
					dbg.location(215,4);
					char_literal36=(Token)match(input,10,FOLLOW_10_in_termino543); 
					char_literal36_tree = (Object)adaptor.create(char_literal36);
					adaptor.addChild(root_0, char_literal36_tree);
					dbg.location(215,10);
					pushFollow(FOLLOW_factor_in_termino547);
					m2=factor();
					state._fsp--;

					adaptor.addChild(root_0, m2.getTree());
					dbg.location(216,3);

							cnt++;
							retval.codigo += (m2!=null?((BucleWhileyForParser.factor_return)m2).codigo:null);
							retval.codigo += "L" + linea + " : (MULT, t" + cnt + "," + aux + "," + (m2!=null?((BucleWhileyForParser.factor_return)m2).resultado:null) + ")\n";
							aux = "t" + cnt;
							++linea;
							retval.lineas = retval.lineas + 1 + (m2!=null?((BucleWhileyForParser.factor_return)m2).lineas:0);
							retval.resultado =  "t" + cnt;
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:225:4: '/' m2= factor
					{
					dbg.location(225,4);
					char_literal37=(Token)match(input,15,FOLLOW_15_in_termino557); 
					char_literal37_tree = (Object)adaptor.create(char_literal37);
					adaptor.addChild(root_0, char_literal37_tree);
					dbg.location(225,10);
					pushFollow(FOLLOW_factor_in_termino561);
					m2=factor();
					state._fsp--;

					adaptor.addChild(root_0, m2.getTree());
					dbg.location(226,3);

							cnt++;
							retval.codigo += (m2!=null?((BucleWhileyForParser.factor_return)m2).codigo:null);
							retval.codigo += "L" + linea + " : (DIV, t" + cnt + "," + aux + "," + (m2!=null?((BucleWhileyForParser.factor_return)m2).resultado:null) + ")\n";
							aux = "t" + cnt;
							++linea;
							retval.lineas = retval.lineas + 1 + (m2!=null?((BucleWhileyForParser.factor_return)m2).lineas:0);
							retval.resultado =  "t" + cnt;
							
					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(236, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "termino");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "termino"


	public static class factor_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
		public int lineas;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:239:1: factor returns [String codigo, String resultado, int lineas] : ( '(' exp= expresion ')' |n= dato );
	public final BucleWhileyForParser.factor_return factor() throws RecognitionException {
		BucleWhileyForParser.factor_return retval = new BucleWhileyForParser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal38=null;
		Token char_literal39=null;
		ParserRuleReturnScope exp =null;
		ParserRuleReturnScope n =null;

		Object char_literal38_tree=null;
		Object char_literal39_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "factor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(239, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:240:2: ( '(' exp= expresion ')' |n= dato )
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==8) ) {
				alt7=1;
			}
			else if ( ((LA7_0 >= Id && LA7_0 <= Number)||LA7_0==13) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:240:4: '(' exp= expresion ')'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(240,4);
					char_literal38=(Token)match(input,8,FOLLOW_8_in_factor586); 
					char_literal38_tree = (Object)adaptor.create(char_literal38);
					adaptor.addChild(root_0, char_literal38_tree);
					dbg.location(240,12);
					pushFollow(FOLLOW_expresion_in_factor592);
					exp=expresion();
					state._fsp--;

					adaptor.addChild(root_0, exp.getTree());
					dbg.location(240,24);
					char_literal39=(Token)match(input,9,FOLLOW_9_in_factor594); 
					char_literal39_tree = (Object)adaptor.create(char_literal39);
					adaptor.addChild(root_0, char_literal39_tree);
					dbg.location(241,3);

							retval.lineas = (exp!=null?((BucleWhileyForParser.expresion_return)exp).lineas:0);
							retval.codigo = (exp!=null?((BucleWhileyForParser.expresion_return)exp).codigo:null);
							retval.resultado = (exp!=null?((BucleWhileyForParser.expresion_return)exp).resultado:null);
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:246:4: n= dato
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(246,6);
					pushFollow(FOLLOW_dato_in_factor608);
					n=dato();
					state._fsp--;

					adaptor.addChild(root_0, n.getTree());
					dbg.location(247,3);

							retval.lineas = (n!=null?((BucleWhileyForParser.dato_return)n).lineas:0);
							retval.codigo = (n!=null?((BucleWhileyForParser.dato_return)n).codigo:null);
							retval.resultado = (n!=null?((BucleWhileyForParser.dato_return)n).resultado:null);
							
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(252, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "factor");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "factor"


	public static class dato_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
		public int lineas;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dato"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:254:1: dato returns [String codigo, String resultado, int lineas] : ( Number | Id | '-' Number | '-' Id );
	public final BucleWhileyForParser.dato_return dato() throws RecognitionException {
		BucleWhileyForParser.dato_return retval = new BucleWhileyForParser.dato_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number40=null;
		Token Id41=null;
		Token char_literal42=null;
		Token Number43=null;
		Token char_literal44=null;
		Token Id45=null;

		Object Number40_tree=null;
		Object Id41_tree=null;
		Object char_literal42_tree=null;
		Object Number43_tree=null;
		Object char_literal44_tree=null;
		Object Id45_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dato");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(254, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:255:2: ( Number | Id | '-' Number | '-' Id )
			int alt8=4;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case Number:
				{
				alt8=1;
				}
				break;
			case Id:
				{
				alt8=2;
				}
				break;
			case 13:
				{
				int LA8_3 = input.LA(2);
				if ( (LA8_3==Number) ) {
					alt8=3;
				}
				else if ( (LA8_3==Id) ) {
					alt8=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:255:4: Number
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(255,4);
					Number40=(Token)match(input,Number,FOLLOW_Number_in_dato628); 
					Number40_tree = (Object)adaptor.create(Number40);
					adaptor.addChild(root_0, Number40_tree);
					dbg.location(256,3);

							retval.lineas = 0;
							retval.codigo = "";
							retval.resultado = (Number40!=null?Number40.getText():null);
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:261:4: Id
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(261,4);
					Id41=(Token)match(input,Id,FOLLOW_Id_in_dato638); 
					Id41_tree = (Object)adaptor.create(Id41);
					adaptor.addChild(root_0, Id41_tree);
					dbg.location(262,3);
					 
							retval.lineas = 0;
							retval.codigo = "";
							retval.resultado = (Id41!=null?Id41.getText():null);
							
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:267:4: '-' Number
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(267,4);
					char_literal42=(Token)match(input,13,FOLLOW_13_in_dato648); 
					char_literal42_tree = (Object)adaptor.create(char_literal42);
					adaptor.addChild(root_0, char_literal42_tree);
					dbg.location(267,8);
					Number43=(Token)match(input,Number,FOLLOW_Number_in_dato650); 
					Number43_tree = (Object)adaptor.create(Number43);
					adaptor.addChild(root_0, Number43_tree);
					dbg.location(268,3);

							retval.lineas = 1;
							cnt++;
							retval.codigo = "L" + linea + " : (NEG, t" + cnt + "," + (Number43!=null?Number43.getText():null) + ", NULL)\n";
							++linea;
							retval.resultado = "t" + cnt;
							
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/BucleWhileyFor.g:275:4: '-' Id
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(275,4);
					char_literal44=(Token)match(input,13,FOLLOW_13_in_dato660); 
					char_literal44_tree = (Object)adaptor.create(char_literal44);
					adaptor.addChild(root_0, char_literal44_tree);
					dbg.location(275,8);
					Id45=(Token)match(input,Id,FOLLOW_Id_in_dato662); 
					Id45_tree = (Object)adaptor.create(Id45);
					adaptor.addChild(root_0, Id45_tree);
					dbg.location(276,3);

							retval.lineas = 1;
							cnt++;
							retval.codigo = "L" + linea + " : (NEG, t" + cnt + "," + (Id45!=null?Id45.getText():null) + ", NULL)\n";
							++linea;
							retval.resultado = "t" + cnt;
							
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(283, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dato");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "dato"

	// Delegated rules



	public static final BitSet FOLLOW_ecuacion_in_entrada58 = new BitSet(new long[]{0x0000000000B40022L});
	public static final BitSet FOLLOW_ecuacion_in_entrada72 = new BitSet(new long[]{0x0000000000B40022L});
	public static final BitSet FOLLOW_Id_in_ecuacion111 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_ecuacion113 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_expresion_in_ecuacion119 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_ecuacion121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_ecuacion134 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_ecuacion142 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_expresion_in_ecuacion148 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Comp_in_ecuacion154 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_expresion_in_ecuacion160 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_ecuacion162 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_ecuacion170 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ecuacion172 = new BitSet(new long[]{0x0000000000B40020L});
	public static final BitSet FOLLOW_programa_in_ecuacion178 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_ecuacion180 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ecuacion182 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ecuacion190 = new BitSet(new long[]{0x0000000000B40020L});
	public static final BitSet FOLLOW_programa_in_ecuacion196 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_ecuacion198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_ecuacion207 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_ecuacion210 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Id_in_ecuacion215 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Comp_in_ecuacion220 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_expresion_in_ecuacion226 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_ecuacion228 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ecuacion230 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ecuacion232 = new BitSet(new long[]{0x0000000000B40020L});
	public static final BitSet FOLLOW_programa_in_ecuacion238 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_ecuacion240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_ecuacion246 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_ecuacion249 = new BitSet(new long[]{0x0000000000B40020L});
	public static final BitSet FOLLOW_ecuacion_in_ecuacion255 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Id_in_ecuacion262 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Comp_in_ecuacion268 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_expresion_in_ecuacion274 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_ecuacion276 = new BitSet(new long[]{0x0000000000002060L});
	public static final BitSet FOLLOW_incrementar_in_ecuacion282 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_ecuacion284 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ecuacion285 = new BitSet(new long[]{0x0000000000B40020L});
	public static final BitSet FOLLOW_programa_in_ecuacion291 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_ecuacion293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_ecuacion299 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_parPrograma_in_ecuacion306 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_ecuacion308 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_parExpresion_in_ecuacion314 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_ecuacion316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dato_in_incrementar338 = new BitSet(new long[]{0x0000000000005000L});
	public static final BitSet FOLLOW_12_in_incrementar345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_incrementar351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ecuacion_in_programa383 = new BitSet(new long[]{0x0000000000B40022L});
	public static final BitSet FOLLOW_24_in_parPrograma405 = new BitSet(new long[]{0x0000000000B40020L});
	public static final BitSet FOLLOW_programa_in_parPrograma411 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_parPrograma413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_parExpresion437 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_expresion_in_parExpresion443 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Comp_in_parExpresion449 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_expresion_in_parExpresion455 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_parExpresion457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termino_in_expresion476 = new BitSet(new long[]{0x0000000000002802L});
	public static final BitSet FOLLOW_11_in_expresion486 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_termino_in_expresion490 = new BitSet(new long[]{0x0000000000002802L});
	public static final BitSet FOLLOW_13_in_expresion500 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_termino_in_expresion504 = new BitSet(new long[]{0x0000000000002802L});
	public static final BitSet FOLLOW_factor_in_termino533 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_10_in_termino543 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_factor_in_termino547 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_15_in_termino557 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_factor_in_termino561 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_8_in_factor586 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_expresion_in_factor592 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_factor594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dato_in_factor608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_dato628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Id_in_dato638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_dato648 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Number_in_dato650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_dato660 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Id_in_dato662 = new BitSet(new long[]{0x0000000000000002L});
}
