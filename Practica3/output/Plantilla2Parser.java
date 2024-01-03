// $ANTLR 3.5.1 /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g 2022-12-28 20:29:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class Plantilla2Parser extends DebugParser {
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
		"invalidRule", "entrada", "expresion", "ecuacion", "factor", "dato", "termino", 
		"programa"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public Plantilla2Parser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public Plantilla2Parser(TokenStream input, int port, RecognizerSharedState state) {
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

	public Plantilla2Parser(TokenStream input, DebugEventListener dbg) {
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
	@Override public String[] getTokenNames() { return Plantilla2Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g"; }


	    int cnt   = -1;
	    int linea =  1;


	public static class entrada_return extends ParserRuleReturnScope {
		public String codigo;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "entrada"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:16:1: entrada returns [String codigo] : ec1= ecuacion (ec2= ecuacion )* ;
	public final Plantilla2Parser.entrada_return entrada() throws RecognitionException {
		Plantilla2Parser.entrada_return retval = new Plantilla2Parser.entrada_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ec1 =null;
		ParserRuleReturnScope ec2 =null;


		try { dbg.enterRule(getGrammarFileName(), "entrada");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:17:2: (ec1= ecuacion (ec2= ecuacion )* )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:17:4: ec1= ecuacion (ec2= ecuacion )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(17,8);
			pushFollow(FOLLOW_ecuacion_in_entrada58);
			ec1=ecuacion();
			state._fsp--;

			adaptor.addChild(root_0, ec1.getTree());
			dbg.location(18,3);

					retval.codigo = (ec1!=null?((Plantilla2Parser.ecuacion_return)ec1).codigo:null);
					dbg.location(21,2);
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:21:2: (ec2= ecuacion )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==Id||(LA1_0 >= 20 && LA1_0 <= 21)||LA1_0==23) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:21:4: ec2= ecuacion
					{
					dbg.location(21,8);
					pushFollow(FOLLOW_ecuacion_in_entrada72);
					ec2=ecuacion();
					state._fsp--;

					adaptor.addChild(root_0, ec2.getTree());
					dbg.location(22,3);

							retval.codigo += (ec2!=null?((Plantilla2Parser.ecuacion_return)ec2).codigo:null);
							
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
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:32:1: ecuacion returns [String codigo, int lineas] : ( Id '=' exp= expresion ';' | 'if' '(' ex1= expresion c= Comp ex2= expresion ')' 'then' '{' en1= programa '}' 'else' '{' en2= programa '}' | 'while' '(' ex3= Id co= Comp ex4= expresion ')' 'do' '{' en3= programa '}' | 'for' '(' forec= ecuacion ';' b= Id cond= Comp forexp= expresion ';' d= Id ( '++' | '--' ) ')' '{' forprog= programa '}' );
	public final Plantilla2Parser.ecuacion_return ecuacion() throws RecognitionException {
		Plantilla2Parser.ecuacion_return retval = new Plantilla2Parser.ecuacion_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token c=null;
		Token ex3=null;
		Token co=null;
		Token b=null;
		Token cond=null;
		Token d=null;
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
		Token string_literal23=null;
		Token string_literal24=null;
		Token char_literal25=null;
		Token char_literal26=null;
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
		ParserRuleReturnScope forprog =null;

		Object c_tree=null;
		Object ex3_tree=null;
		Object co_tree=null;
		Object b_tree=null;
		Object cond_tree=null;
		Object d_tree=null;
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
		Object string_literal23_tree=null;
		Object string_literal24_tree=null;
		Object char_literal25_tree=null;
		Object char_literal26_tree=null;
		Object char_literal27_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "ecuacion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(32, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:33:5: ( Id '=' exp= expresion ';' | 'if' '(' ex1= expresion c= Comp ex2= expresion ')' 'then' '{' en1= programa '}' 'else' '{' en2= programa '}' | 'while' '(' ex3= Id co= Comp ex4= expresion ')' 'do' '{' en3= programa '}' | 'for' '(' forec= ecuacion ';' b= Id cond= Comp forexp= expresion ';' d= Id ( '++' | '--' ) ')' '{' forprog= programa '}' )
			int alt3=4;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case Id:
				{
				alt3=1;
				}
				break;
			case 21:
				{
				alt3=2;
				}
				break;
			case 23:
				{
				alt3=3;
				}
				break;
			case 20:
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:33:7: Id '=' exp= expresion ';'
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

					    	retval.codigo = (exp!=null?((Plantilla2Parser.expresion_return)exp).codigo:null);
							if ((exp!=null?((Plantilla2Parser.expresion_return)exp).lineas:0) == 0)
								retval.codigo += "L" + linea + " : (ASSIGN, " + (Id1!=null?Id1.getText():null) + ", " + (exp!=null?((Plantilla2Parser.expresion_return)exp).resultado:null) +  ", NULL)\n";
							else    	
								retval.codigo += "L" + linea + " : (ASSIGN, " + (Id1!=null?Id1.getText():null) + ", t" + cnt + ", NULL)\n";
							retval.lineas = 1 + (exp!=null?((Plantilla2Parser.expresion_return)exp).lineas:0);
							++linea;
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:43:4: 'if' '(' ex1= expresion c= Comp ex2= expresion ')' 'then' '{' en1= programa '}' 'else' '{' en2= programa '}'
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

							linea -= (ex1!=null?((Plantilla2Parser.expresion_return)ex1).lineas:0) + (ex2!=null?((Plantilla2Parser.expresion_return)ex2).lineas:0);
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
							 ", GOTO, " + "L" + (aux + 3 + (en1!=null?((Plantilla2Parser.programa_return)en1).lineas:0)) + ")\n";
							retval.codigo += (en1!=null?((Plantilla2Parser.programa_return)en1).codigo:null);
							retval.codigo += "L" + (aux+(en1!=null?((Plantilla2Parser.programa_return)en1).lineas:0)+2) + " : (IF_TRUE, NULL, GOTO, L" 
							+ (aux+4+(en1!=null?((Plantilla2Parser.programa_return)en1).lineas:0)+(en2!=null?((Plantilla2Parser.programa_return)en2).lineas:0)) + ")\n";
							retval.codigo += (en2!=null?((Plantilla2Parser.programa_return)en2).codigo:null);
							retval.codigo += "L" + (aux+(en1!=null?((Plantilla2Parser.programa_return)en1).lineas:0)+(en2!=null?((Plantilla2Parser.programa_return)en2).lineas:0)+3) + " : (IF_TRUE, NULL, GOTO, L" + (aux+4+(en1!=null?((Plantilla2Parser.programa_return)en1).lineas:0)+(en2!=null?((Plantilla2Parser.programa_return)en2).lineas:0)) + ")\n";
							linea++;
							retval.lineas = 4 + (en1!=null?((Plantilla2Parser.programa_return)en1).lineas:0) + (en2!=null?((Plantilla2Parser.programa_return)en2).lineas:0);
							
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:70:4: 'while' '(' ex3= Id co= Comp ex4= expresion ')' 'do' '{' en3= programa '}'
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

						
						linea -= (ex4!=null?((Plantilla2Parser.expresion_return)ex4).lineas:0);
						linea++;
						retval.codigo = "L" + aux + " : (IF_TRUE, NULL , GOTO, " + "L" + (aux + 1) + ")\n";
						retval.codigo += "L" + (aux+1) + " : (IF_TRUE," + (ex3!=null?ex3.getText():null) + (co!=null?co.getText():null) + (ex4!=null?input.toString(ex4.start,ex4.stop):null) +
							 ", GOTO, " + "L" + (aux + 3) + ")\n";
						retval.codigo += "L" + (aux+2) + " : (IF_FALSE," + (ex3!=null?ex3.getText():null) + (co!=null?co.getText():null) + (ex4!=null?input.toString(ex4.start,ex4.stop):null) +
							 ", GOTO, " + "L" + (aux + 3 + (en3!=null?((Plantilla2Parser.programa_return)en3).lineas:0)+1) + ")\n";
						retval.codigo += (en3!=null?((Plantilla2Parser.programa_return)en3).codigo:null);
						retval.codigo += "L" + (linea-1) + " : (IF_TRUE, NULL , GOTO, " + "L" + (aux + 1) + ")\n";
						
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:85:4: 'for' '(' forec= ecuacion ';' b= Id cond= Comp forexp= expresion ';' d= Id ( '++' | '--' ) ')' '{' forprog= programa '}'
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
					char_literal21=(Token)match(input,16,FOLLOW_16_in_ecuacion257); 
					char_literal21_tree = (Object)adaptor.create(char_literal21);
					adaptor.addChild(root_0, char_literal21_tree);
					dbg.location(87,28);

						linea+=3;
						dbg.location(89,6);
					b=(Token)match(input,Id,FOLLOW_Id_in_ecuacion263); 
					b_tree = (Object)adaptor.create(b);
					adaptor.addChild(root_0, b_tree);
					dbg.location(89,15);
					cond=(Token)match(input,Comp,FOLLOW_Comp_in_ecuacion269); 
					cond_tree = (Object)adaptor.create(cond);
					adaptor.addChild(root_0, cond_tree);
					dbg.location(89,29);
					pushFollow(FOLLOW_expresion_in_ecuacion275);
					forexp=expresion();
					state._fsp--;

					adaptor.addChild(root_0, forexp.getTree());
					dbg.location(89,41);
					char_literal22=(Token)match(input,16,FOLLOW_16_in_ecuacion277); 
					char_literal22_tree = (Object)adaptor.create(char_literal22);
					adaptor.addChild(root_0, char_literal22_tree);
					dbg.location(89,47);
					d=(Token)match(input,Id,FOLLOW_Id_in_ecuacion283); 
					d_tree = (Object)adaptor.create(d);
					adaptor.addChild(root_0, d_tree);
					dbg.location(89,52);
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:89:52: ( '++' | '--' )
					int alt2=2;
					try { dbg.enterSubRule(2);
					try { dbg.enterDecision(2, decisionCanBacktrack[2]);

					int LA2_0 = input.LA(1);
					if ( (LA2_0==12) ) {
						alt2=1;
					}
					else if ( (LA2_0==14) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(2);}

					switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:89:53: '++'
							{
							dbg.location(89,53);
							string_literal23=(Token)match(input,12,FOLLOW_12_in_ecuacion286); 
							string_literal23_tree = (Object)adaptor.create(string_literal23);
							adaptor.addChild(root_0, string_literal23_tree);
							dbg.location(89,57);

								String incremento =" : (ADD, t" + cnt + "," + (d!=null?d.getText():null) + ", 1)\n";
								String assig=  " : (ASSIGN," + (d!=null?d.getText():null) + ",t" + cnt + ", NULL)\n";
									cnt++;
								
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:93:4: '--'
							{
							dbg.location(93,4);
							string_literal24=(Token)match(input,14,FOLLOW_14_in_ecuacion289); 
							string_literal24_tree = (Object)adaptor.create(string_literal24);
							adaptor.addChild(root_0, string_literal24_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(2);}
					dbg.location(93,10);
					char_literal25=(Token)match(input,9,FOLLOW_9_in_ecuacion292); 
					char_literal25_tree = (Object)adaptor.create(char_literal25);
					adaptor.addChild(root_0, char_literal25_tree);
					dbg.location(93,13);

						
						String incremento = " : (SUB, t" + cnt + "," + (d!=null?d.getText():null) + ", 1 )\n";
						String assig=  " : (ASSIGN," + (d!=null?d.getText():null) + ",t" + cnt + ", NULL)\n";
							cnt++;
							dbg.location(100,3);
					char_literal26=(Token)match(input,24,FOLLOW_24_in_ecuacion300); 
					char_literal26_tree = (Object)adaptor.create(char_literal26);
					adaptor.addChild(root_0, char_literal26_tree);
					dbg.location(100,15);
					pushFollow(FOLLOW_programa_in_ecuacion306);
					forprog=programa();
					state._fsp--;

					adaptor.addChild(root_0, forprog.getTree());
					dbg.location(100,26);
					char_literal27=(Token)match(input,25,FOLLOW_25_in_ecuacion308); 
					char_literal27_tree = (Object)adaptor.create(char_literal27);
					adaptor.addChild(root_0, char_literal27_tree);
					dbg.location(100,29);

						retval.codigo = (forec!=null?((Plantilla2Parser.ecuacion_return)forec).codigo:null);
						retval.codigo += "L" + aux + " : (IF_TRUE, NULL , GOTO, " + "L" + (aux + 1) + ")\n";
						retval.codigo += "L" + (aux+1) + " : (IF_TRUE," + (b!=null?b.getText():null) + (cond!=null?cond.getText():null) + (forexp!=null?input.toString(forexp.start,forexp.stop):null) +
							 ", GOTO, " + "L" + (aux + 3) + ")\n";
						retval.codigo += "L" + (aux+2) + " : (IF_FALSE," + (b!=null?b.getText():null) + (cond!=null?cond.getText():null) + (forexp!=null?input.toString(forexp.start,forexp.stop):null) +
							 ", GOTO, " + "L" + (aux + 3 + (forprog!=null?((Plantilla2Parser.programa_return)forprog).lineas:0)+4) + ")\n";
						retval.codigo += (forprog!=null?((Plantilla2Parser.programa_return)forprog).codigo:null);
						retval.codigo += "L "+(linea)+ incremento + "L "+(linea+1)+assig;
						retval.codigo += "L" + (linea+2) + " : (IF_TRUE," + (b!=null?b.getText():null) + (cond!=null?cond.getText():null) + (forexp!=null?input.toString(forexp.start,forexp.stop):null) +
							 ", GOTO, " + "L" + (aux + 3) + ")\n";
						linea += 2;
						
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
		dbg.location(113, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ecuacion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ecuacion"


	public static class programa_return extends ParserRuleReturnScope {
		public String codigo;
		public int lineas;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "programa"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:116:1: programa returns [String codigo, int lineas] : (ec= ecuacion )+ ;
	public final Plantilla2Parser.programa_return programa() throws RecognitionException {
		Plantilla2Parser.programa_return retval = new Plantilla2Parser.programa_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ec =null;


		try { dbg.enterRule(getGrammarFileName(), "programa");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(116, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:117:2: ( (ec= ecuacion )+ )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:118:3: (ec= ecuacion )+
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(118,3);

					retval.lineas = 0;
					retval.codigo = "";
					dbg.location(122,2);
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:122:2: (ec= ecuacion )+
			int cnt4=0;
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==Id||(LA4_0 >= 20 && LA4_0 <= 21)||LA4_0==23) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:122:4: ec= ecuacion
					{
					dbg.location(122,7);
					pushFollow(FOLLOW_ecuacion_in_programa338);
					ec=ecuacion();
					state._fsp--;

					adaptor.addChild(root_0, ec.getTree());
					dbg.location(123,3);

							retval.codigo += (ec!=null?((Plantilla2Parser.ecuacion_return)ec).codigo:null);
							retval.lineas += (ec!=null?((Plantilla2Parser.ecuacion_return)ec).lineas:0);
							
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
		dbg.location(128, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "programa");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "programa"


	public static class expresion_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
		public int lineas;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expresion"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:130:1: expresion returns [String codigo, String resultado, int lineas] : m1= termino ( '+' m2= termino | '-' m2= termino )* ;
	public final Plantilla2Parser.expresion_return expresion() throws RecognitionException {
		Plantilla2Parser.expresion_return retval = new Plantilla2Parser.expresion_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal28=null;
		Token char_literal29=null;
		ParserRuleReturnScope m1 =null;
		ParserRuleReturnScope m2 =null;

		Object char_literal28_tree=null;
		Object char_literal29_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expresion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(130, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:131:2: (m1= termino ( '+' m2= termino | '-' m2= termino )* )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:131:4: m1= termino ( '+' m2= termino | '-' m2= termino )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(131,7);
			pushFollow(FOLLOW_termino_in_expresion366);
			m1=termino();
			state._fsp--;

			adaptor.addChild(root_0, m1.getTree());
			dbg.location(132,3);
			 
					String aux = (m1!=null?((Plantilla2Parser.termino_return)m1).resultado:null);
					retval.codigo = (m1!=null?((Plantilla2Parser.termino_return)m1).codigo:null);
					retval.resultado = (m1!=null?((Plantilla2Parser.termino_return)m1).resultado:null);
					retval.lineas = (m1!=null?((Plantilla2Parser.termino_return)m1).lineas:0);
					dbg.location(138,2);
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:138:2: ( '+' m2= termino | '-' m2= termino )*
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

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:138:4: '+' m2= termino
					{
					dbg.location(138,4);
					char_literal28=(Token)match(input,11,FOLLOW_11_in_expresion376); 
					char_literal28_tree = (Object)adaptor.create(char_literal28);
					adaptor.addChild(root_0, char_literal28_tree);
					dbg.location(138,10);
					pushFollow(FOLLOW_termino_in_expresion380);
					m2=termino();
					state._fsp--;

					adaptor.addChild(root_0, m2.getTree());
					dbg.location(139,3);

							cnt++;
							retval.codigo += (m2!=null?((Plantilla2Parser.termino_return)m2).codigo:null);
							retval.codigo += "L" + linea + " : (ADD, t" + cnt + "," + aux + "," + (m2!=null?((Plantilla2Parser.termino_return)m2).resultado:null) + ")\n";
							aux = "t" + cnt;
							++linea;
							retval.lineas = retval.lineas + 1 + (m2!=null?((Plantilla2Parser.termino_return)m2).lineas:0);
							retval.resultado =  "t" + cnt;
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:148:4: '-' m2= termino
					{
					dbg.location(148,4);
					char_literal29=(Token)match(input,13,FOLLOW_13_in_expresion390); 
					char_literal29_tree = (Object)adaptor.create(char_literal29);
					adaptor.addChild(root_0, char_literal29_tree);
					dbg.location(148,10);
					pushFollow(FOLLOW_termino_in_expresion394);
					m2=termino();
					state._fsp--;

					adaptor.addChild(root_0, m2.getTree());
					dbg.location(149,3);

							cnt++;
							retval.codigo += (m2!=null?((Plantilla2Parser.termino_return)m2).codigo:null);
							retval.codigo += "L" + linea + " : (SUB, t" + cnt + "," + aux + "," + (m2!=null?((Plantilla2Parser.termino_return)m2).resultado:null) + ")\n";
							aux = "t" + cnt;
							++linea;
							retval.lineas = retval.lineas + 1 + (m2!=null?((Plantilla2Parser.termino_return)m2).lineas:0);
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
		dbg.location(160, 1);

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
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:162:1: termino returns [String codigo, String resultado, int lineas] : m1= factor ( '*' m2= factor | '/' m2= factor )* ;
	public final Plantilla2Parser.termino_return termino() throws RecognitionException {
		Plantilla2Parser.termino_return retval = new Plantilla2Parser.termino_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal30=null;
		Token char_literal31=null;
		ParserRuleReturnScope m1 =null;
		ParserRuleReturnScope m2 =null;

		Object char_literal30_tree=null;
		Object char_literal31_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "termino");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(162, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:163:2: (m1= factor ( '*' m2= factor | '/' m2= factor )* )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:163:4: m1= factor ( '*' m2= factor | '/' m2= factor )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(163,7);
			pushFollow(FOLLOW_factor_in_termino423);
			m1=factor();
			state._fsp--;

			adaptor.addChild(root_0, m1.getTree());
			dbg.location(164,3);
			 
					String aux = (m1!=null?((Plantilla2Parser.factor_return)m1).resultado:null);
					retval.codigo = (m1!=null?((Plantilla2Parser.factor_return)m1).codigo:null);
					retval.lineas = (m1!=null?((Plantilla2Parser.factor_return)m1).lineas:0);
					retval.resultado = (m1!=null?((Plantilla2Parser.factor_return)m1).resultado:null);
					dbg.location(170,2);
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:170:2: ( '*' m2= factor | '/' m2= factor )*
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

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:170:4: '*' m2= factor
					{
					dbg.location(170,4);
					char_literal30=(Token)match(input,10,FOLLOW_10_in_termino433); 
					char_literal30_tree = (Object)adaptor.create(char_literal30);
					adaptor.addChild(root_0, char_literal30_tree);
					dbg.location(170,10);
					pushFollow(FOLLOW_factor_in_termino437);
					m2=factor();
					state._fsp--;

					adaptor.addChild(root_0, m2.getTree());
					dbg.location(171,3);

							cnt++;
							retval.codigo += (m2!=null?((Plantilla2Parser.factor_return)m2).codigo:null);
							retval.codigo += "L" + linea + " : (MULT, t" + cnt + "," + aux + "," + (m2!=null?((Plantilla2Parser.factor_return)m2).resultado:null) + ")\n";
							aux = "t" + cnt;
							++linea;
							retval.lineas = retval.lineas + 1 + (m2!=null?((Plantilla2Parser.factor_return)m2).lineas:0);
							retval.resultado =  "t" + cnt;
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:180:4: '/' m2= factor
					{
					dbg.location(180,4);
					char_literal31=(Token)match(input,15,FOLLOW_15_in_termino447); 
					char_literal31_tree = (Object)adaptor.create(char_literal31);
					adaptor.addChild(root_0, char_literal31_tree);
					dbg.location(180,10);
					pushFollow(FOLLOW_factor_in_termino451);
					m2=factor();
					state._fsp--;

					adaptor.addChild(root_0, m2.getTree());
					dbg.location(181,3);

							cnt++;
							retval.codigo += (m2!=null?((Plantilla2Parser.factor_return)m2).codigo:null);
							retval.codigo += "L" + linea + " : (DIV, t" + cnt + "," + aux + "," + (m2!=null?((Plantilla2Parser.factor_return)m2).resultado:null) + ")\n";
							aux = "t" + cnt;
							++linea;
							retval.lineas = retval.lineas + 1 + (m2!=null?((Plantilla2Parser.factor_return)m2).lineas:0);
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
		dbg.location(191, 1);

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
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:194:1: factor returns [String codigo, String resultado, int lineas] : ( '(' exp= expresion ')' |n= dato );
	public final Plantilla2Parser.factor_return factor() throws RecognitionException {
		Plantilla2Parser.factor_return retval = new Plantilla2Parser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal32=null;
		Token char_literal33=null;
		ParserRuleReturnScope exp =null;
		ParserRuleReturnScope n =null;

		Object char_literal32_tree=null;
		Object char_literal33_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "factor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(194, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:195:2: ( '(' exp= expresion ')' |n= dato )
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

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:195:4: '(' exp= expresion ')'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(195,4);
					char_literal32=(Token)match(input,8,FOLLOW_8_in_factor476); 
					char_literal32_tree = (Object)adaptor.create(char_literal32);
					adaptor.addChild(root_0, char_literal32_tree);
					dbg.location(195,12);
					pushFollow(FOLLOW_expresion_in_factor482);
					exp=expresion();
					state._fsp--;

					adaptor.addChild(root_0, exp.getTree());
					dbg.location(195,24);
					char_literal33=(Token)match(input,9,FOLLOW_9_in_factor484); 
					char_literal33_tree = (Object)adaptor.create(char_literal33);
					adaptor.addChild(root_0, char_literal33_tree);
					dbg.location(196,3);

							retval.lineas = (exp!=null?((Plantilla2Parser.expresion_return)exp).lineas:0);
							retval.codigo = (exp!=null?((Plantilla2Parser.expresion_return)exp).codigo:null);
							retval.resultado = (exp!=null?((Plantilla2Parser.expresion_return)exp).resultado:null);
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:201:4: n= dato
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(201,6);
					pushFollow(FOLLOW_dato_in_factor498);
					n=dato();
					state._fsp--;

					adaptor.addChild(root_0, n.getTree());
					dbg.location(202,3);

							retval.lineas = (n!=null?((Plantilla2Parser.dato_return)n).lineas:0);
							retval.codigo = (n!=null?((Plantilla2Parser.dato_return)n).codigo:null);
							retval.resultado = (n!=null?((Plantilla2Parser.dato_return)n).resultado:null);
							
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
		dbg.location(207, 1);

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
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:209:1: dato returns [String codigo, String resultado, int lineas] : ( Number | Id | '-' Number | '-' Id );
	public final Plantilla2Parser.dato_return dato() throws RecognitionException {
		Plantilla2Parser.dato_return retval = new Plantilla2Parser.dato_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number34=null;
		Token Id35=null;
		Token char_literal36=null;
		Token Number37=null;
		Token char_literal38=null;
		Token Id39=null;

		Object Number34_tree=null;
		Object Id35_tree=null;
		Object char_literal36_tree=null;
		Object Number37_tree=null;
		Object char_literal38_tree=null;
		Object Id39_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dato");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(209, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:210:2: ( Number | Id | '-' Number | '-' Id )
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

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:210:4: Number
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(210,4);
					Number34=(Token)match(input,Number,FOLLOW_Number_in_dato518); 
					Number34_tree = (Object)adaptor.create(Number34);
					adaptor.addChild(root_0, Number34_tree);
					dbg.location(211,3);

							retval.lineas = 0;
							retval.codigo = "";
							retval.resultado = (Number34!=null?Number34.getText():null);
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:216:4: Id
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(216,4);
					Id35=(Token)match(input,Id,FOLLOW_Id_in_dato528); 
					Id35_tree = (Object)adaptor.create(Id35);
					adaptor.addChild(root_0, Id35_tree);
					dbg.location(217,3);
					 
							retval.lineas = 0;
							retval.codigo = "";
							retval.resultado = (Id35!=null?Id35.getText():null);
							
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:222:4: '-' Number
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(222,4);
					char_literal36=(Token)match(input,13,FOLLOW_13_in_dato538); 
					char_literal36_tree = (Object)adaptor.create(char_literal36);
					adaptor.addChild(root_0, char_literal36_tree);
					dbg.location(222,8);
					Number37=(Token)match(input,Number,FOLLOW_Number_in_dato540); 
					Number37_tree = (Object)adaptor.create(Number37);
					adaptor.addChild(root_0, Number37_tree);
					dbg.location(223,3);

							retval.lineas = 1;
							cnt++;
							retval.codigo = "L" + linea + " : (NEG, t" + cnt + "," + (Number37!=null?Number37.getText():null) + ", NULL)\n";
							++linea;
							retval.resultado = "t" + cnt;
							
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:230:4: '-' Id
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(230,4);
					char_literal38=(Token)match(input,13,FOLLOW_13_in_dato550); 
					char_literal38_tree = (Object)adaptor.create(char_literal38);
					adaptor.addChild(root_0, char_literal38_tree);
					dbg.location(230,8);
					Id39=(Token)match(input,Id,FOLLOW_Id_in_dato552); 
					Id39_tree = (Object)adaptor.create(Id39);
					adaptor.addChild(root_0, Id39_tree);
					dbg.location(231,3);

							retval.lineas = 1;
							cnt++;
							retval.codigo = "L" + linea + " : (NEG, t" + cnt + "," + (Id39!=null?Id39.getText():null) + ", NULL)\n";
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
		dbg.location(238, 1);

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



	public static final BitSet FOLLOW_ecuacion_in_entrada58 = new BitSet(new long[]{0x0000000000B00022L});
	public static final BitSet FOLLOW_ecuacion_in_entrada72 = new BitSet(new long[]{0x0000000000B00022L});
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
	public static final BitSet FOLLOW_24_in_ecuacion172 = new BitSet(new long[]{0x0000000000B00020L});
	public static final BitSet FOLLOW_programa_in_ecuacion178 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_ecuacion180 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ecuacion182 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ecuacion190 = new BitSet(new long[]{0x0000000000B00020L});
	public static final BitSet FOLLOW_programa_in_ecuacion196 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_ecuacion198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_ecuacion207 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_ecuacion210 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Id_in_ecuacion215 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Comp_in_ecuacion220 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_expresion_in_ecuacion226 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_ecuacion228 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ecuacion230 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ecuacion232 = new BitSet(new long[]{0x0000000000B00020L});
	public static final BitSet FOLLOW_programa_in_ecuacion238 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_ecuacion240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_ecuacion246 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_ecuacion249 = new BitSet(new long[]{0x0000000000B00020L});
	public static final BitSet FOLLOW_ecuacion_in_ecuacion255 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_ecuacion257 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Id_in_ecuacion263 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Comp_in_ecuacion269 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_expresion_in_ecuacion275 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_ecuacion277 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Id_in_ecuacion283 = new BitSet(new long[]{0x0000000000005000L});
	public static final BitSet FOLLOW_12_in_ecuacion286 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_14_in_ecuacion289 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_ecuacion292 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ecuacion300 = new BitSet(new long[]{0x0000000000B00020L});
	public static final BitSet FOLLOW_programa_in_ecuacion306 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_ecuacion308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ecuacion_in_programa338 = new BitSet(new long[]{0x0000000000B00022L});
	public static final BitSet FOLLOW_termino_in_expresion366 = new BitSet(new long[]{0x0000000000002802L});
	public static final BitSet FOLLOW_11_in_expresion376 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_termino_in_expresion380 = new BitSet(new long[]{0x0000000000002802L});
	public static final BitSet FOLLOW_13_in_expresion390 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_termino_in_expresion394 = new BitSet(new long[]{0x0000000000002802L});
	public static final BitSet FOLLOW_factor_in_termino423 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_10_in_termino433 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_factor_in_termino437 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_15_in_termino447 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_factor_in_termino451 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_8_in_factor476 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_expresion_in_factor482 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_factor484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dato_in_factor498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_dato518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Id_in_dato528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_dato538 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Number_in_dato540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_dato550 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Id_in_dato552 = new BitSet(new long[]{0x0000000000000002L});
}
