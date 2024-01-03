// $ANTLR 3.5.1 /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g 2022-12-28 20:06:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PlantillaParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Comparacion", "Id", "Number", 
		"WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "';'", "'='", "'if ('", 
		"'then {'", "'}'"
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
	public static final int Comparacion=4;
	public static final int Id=5;
	public static final int Number=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "ecuacion", "condicional_if", "termino", "factor", "entrada", 
		"expresion", "dato"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public PlantillaParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public PlantillaParser(TokenStream input, int port, RecognizerSharedState state) {
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

	public PlantillaParser(TokenStream input, DebugEventListener dbg) {
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
	@Override public String[] getTokenNames() { return PlantillaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g"; }


	     int cnt = -1;


	public static class entrada_return extends ParserRuleReturnScope {
		public String codigo;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "entrada"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:20:1: entrada returns [String codigo] : ec1= ecuacion (ec2= ecuacion )* ;
	public final PlantillaParser.entrada_return entrada() throws RecognitionException {
		PlantillaParser.entrada_return retval = new PlantillaParser.entrada_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ec1 =null;
		ParserRuleReturnScope ec2 =null;


		try { dbg.enterRule(getGrammarFileName(), "entrada");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:21:5: (ec1= ecuacion (ec2= ecuacion )* )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:21:7: ec1= ecuacion (ec2= ecuacion )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(21,10);
			pushFollow(FOLLOW_ecuacion_in_entrada53);
			ec1=ecuacion();
			state._fsp--;

			adaptor.addChild(root_0, ec1.getTree());
			dbg.location(22,9);
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:22:9: (ec2= ecuacion )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==Id) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:23:9: ec2= ecuacion
					{
					dbg.location(23,12);
					pushFollow(FOLLOW_ecuacion_in_entrada102);
					ec2=ecuacion();
					state._fsp--;

					adaptor.addChild(root_0, ec2.getTree());

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(24,29);

			                              retval.codigo = "(" + "HALT" + "," + "NULL" + "," + "NULL" + "," + "NULL" + ")";
			                              System.out.println(retval.codigo); 
			                            
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
		dbg.location(28, 4);

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
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ecuacion"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:31:1: ecuacion returns [String codigo] : Id '=' exp= expresion ';' ;
	public final PlantillaParser.ecuacion_return ecuacion() throws RecognitionException {
		PlantillaParser.ecuacion_return retval = new PlantillaParser.ecuacion_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Id1=null;
		Token char_literal2=null;
		Token char_literal3=null;
		ParserRuleReturnScope exp =null;

		Object Id1_tree=null;
		Object char_literal2_tree=null;
		Object char_literal3_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "ecuacion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:32:5: ( Id '=' exp= expresion ';' )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:32:10: Id '=' exp= expresion ';'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(32,10);
			Id1=(Token)match(input,Id,FOLLOW_Id_in_ecuacion158); 
			Id1_tree = (Object)adaptor.create(Id1);
			adaptor.addChild(root_0, Id1_tree);
			dbg.location(32,13);
			char_literal2=(Token)match(input,15,FOLLOW_15_in_ecuacion160); 
			char_literal2_tree = (Object)adaptor.create(char_literal2);
			adaptor.addChild(root_0, char_literal2_tree);
			dbg.location(32,20);
			pushFollow(FOLLOW_expresion_in_ecuacion164);
			exp=expresion();
			state._fsp--;

			adaptor.addChild(root_0, exp.getTree());
			dbg.location(32,31);
			char_literal3=(Token)match(input,14,FOLLOW_14_in_ecuacion166); 
			char_literal3_tree = (Object)adaptor.create(char_literal3);
			adaptor.addChild(root_0, char_literal3_tree);
			dbg.location(33,5);
			  
			    	if ((exp!=null?((PlantillaParser.expresion_return)exp).resultado:null).length() == 1) 
			    	    retval.codigo = "(" + "ASSIGN" + "," + (Id1!=null?Id1.getText():null) + "," + (exp!=null?((PlantillaParser.expresion_return)exp).resultado:null) + "," + "NULL" + ")";
			            else retval.codigo = "(" + "ASSIGN" + "," + (Id1!=null?Id1.getText():null) + "," + "t" + cnt + "," + "NULL" + ")";
			            System.out.println(retval.codigo);
			    
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
		dbg.location(38, 5);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ecuacion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ecuacion"


	public static class expresion_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expresion"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:45:1: expresion returns [String codigo, String resultado] : m1= termino ( '+' m2= termino | '-' m2= termino )* ;
	public final PlantillaParser.expresion_return expresion() throws RecognitionException {
		PlantillaParser.expresion_return retval = new PlantillaParser.expresion_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal4=null;
		Token char_literal5=null;
		ParserRuleReturnScope m1 =null;
		ParserRuleReturnScope m2 =null;

		Object char_literal4_tree=null;
		Object char_literal5_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expresion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:46:5: (m1= termino ( '+' m2= termino | '-' m2= termino )* )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:46:10: m1= termino ( '+' m2= termino | '-' m2= termino )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(46,12);
			pushFollow(FOLLOW_termino_in_expresion201);
			m1=termino();
			state._fsp--;

			adaptor.addChild(root_0, m1.getTree());
			dbg.location(47,19);

			                     retval.resultado = (m1!=null?((PlantillaParser.termino_return)m1).resultado:null);
			                  dbg.location(50,10);
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:50:10: ( '+' m2= termino | '-' m2= termino )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=3;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==11) ) {
					alt2=1;
				}
				else if ( (LA2_0==12) ) {
					alt2=2;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:50:12: '+' m2= termino
					{
					dbg.location(50,12);
					char_literal4=(Token)match(input,11,FOLLOW_11_in_expresion234); 
					char_literal4_tree = (Object)adaptor.create(char_literal4);
					adaptor.addChild(root_0, char_literal4_tree);
					dbg.location(50,18);
					pushFollow(FOLLOW_termino_in_expresion238);
					m2=termino();
					state._fsp--;

					adaptor.addChild(root_0, m2.getTree());
					dbg.location(51,17);
					 
					                    cnt++;
					                    retval.codigo = "(" + "ADD" + "," +  "t" + cnt + "," + (m1!=null?((PlantillaParser.termino_return)m1).resultado:null) + "," + (m2!=null?((PlantillaParser.termino_return)m2).resultado:null) + ")"; 
					                    System.out.println(retval.codigo);
					                    retval.resultado = "t" + cnt;
					                
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:57:12: '-' m2= termino
					{
					dbg.location(57,12);
					char_literal5=(Token)match(input,12,FOLLOW_12_in_expresion270); 
					char_literal5_tree = (Object)adaptor.create(char_literal5);
					adaptor.addChild(root_0, char_literal5_tree);
					dbg.location(57,18);
					pushFollow(FOLLOW_termino_in_expresion274);
					m2=termino();
					state._fsp--;

					adaptor.addChild(root_0, m2.getTree());
					dbg.location(57,34);
					 
					                                   cnt++;
					                                   retval.codigo = "(" + "SUB" + "," +  "t" + cnt + "," + (m1!=null?((PlantillaParser.termino_return)m1).resultado:null) + "," + (m2!=null?((PlantillaParser.termino_return)m2).resultado:null) + ")"; 
					                                   System.out.println(retval.codigo);
					                                   retval.resultado = "t" + cnt;
					                                 
					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}

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
		dbg.location(64, 4);

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
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "termino"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:70:1: termino returns [String codigo, String resultado] : a1= factor ( '*' a2= factor | '/' a2= factor )* ;
	public final PlantillaParser.termino_return termino() throws RecognitionException {
		PlantillaParser.termino_return retval = new PlantillaParser.termino_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal6=null;
		Token char_literal7=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;

		Object char_literal6_tree=null;
		Object char_literal7_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "termino");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:71:5: (a1= factor ( '*' a2= factor | '/' a2= factor )* )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:71:10: a1= factor ( '*' a2= factor | '/' a2= factor )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(71,12);
			pushFollow(FOLLOW_factor_in_termino344);
			a1=factor();
			state._fsp--;

			adaptor.addChild(root_0, a1.getTree());
			dbg.location(71,37);
			  
			                                      retval.resultado = (a1!=null?((PlantillaParser.factor_return)a1).resultado:null);
			                                    dbg.location(74,10);
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:74:10: ( '*' a2= factor | '/' a2= factor )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=3;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==10) ) {
					alt3=1;
				}
				else if ( (LA3_0==13) ) {
					alt3=2;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:74:12: '*' a2= factor
					{
					dbg.location(74,12);
					char_literal6=(Token)match(input,10,FOLLOW_10_in_termino376); 
					char_literal6_tree = (Object)adaptor.create(char_literal6);
					adaptor.addChild(root_0, char_literal6_tree);
					dbg.location(74,18);
					pushFollow(FOLLOW_factor_in_termino380);
					a2=factor();
					state._fsp--;

					adaptor.addChild(root_0, a2.getTree());
					dbg.location(74,37);
					 
					                                      cnt++;
					                                      retval.codigo = "(" + "MULT" + "," +  "t" + cnt + "," + (a1!=null?((PlantillaParser.factor_return)a1).resultado:null) + "," + (a2!=null?((PlantillaParser.factor_return)a2).resultado:null) + ")";
					                                      System.out.println(retval.codigo);
					                                      retval.resultado = "t" + cnt;
					                                    
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:80:12: '/' a2= factor
					{
					dbg.location(80,12);
					char_literal7=(Token)match(input,13,FOLLOW_13_in_termino406); 
					char_literal7_tree = (Object)adaptor.create(char_literal7);
					adaptor.addChild(root_0, char_literal7_tree);
					dbg.location(80,18);
					pushFollow(FOLLOW_factor_in_termino410);
					a2=factor();
					state._fsp--;

					adaptor.addChild(root_0, a2.getTree());
					dbg.location(80,37);
					 
					                                      cnt++;
					                                      retval.codigo = "(" + "DIV"  + "," +  "t" + cnt + "," + (a1!=null?((PlantillaParser.factor_return)a1).resultado:null) + "," + (a2!=null?((PlantillaParser.factor_return)a2).resultado:null) + ")"; 
					                                      System.out.println(retval.codigo);
					                                      retval.resultado = "t" + cnt;
					                                    
					}
					break;

				default :
					break loop3;
				}
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
		dbg.location(87, 4);

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
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:90:1: factor returns [String codigo, String resultado] : ( '(' exp= expresion ')' |n= dato );
	public final PlantillaParser.factor_return factor() throws RecognitionException {
		PlantillaParser.factor_return retval = new PlantillaParser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal8=null;
		Token char_literal9=null;
		ParserRuleReturnScope exp =null;
		ParserRuleReturnScope n =null;

		Object char_literal8_tree=null;
		Object char_literal9_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "factor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(90, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:91:5: ( '(' exp= expresion ')' |n= dato )
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==8) ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= Id && LA4_0 <= Number)||LA4_0==12) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:91:7: '(' exp= expresion ')'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(91,7);
					char_literal8=(Token)match(input,8,FOLLOW_8_in_factor464); 
					char_literal8_tree = (Object)adaptor.create(char_literal8);
					adaptor.addChild(root_0, char_literal8_tree);
					dbg.location(91,14);
					pushFollow(FOLLOW_expresion_in_factor468);
					exp=expresion();
					state._fsp--;

					adaptor.addChild(root_0, exp.getTree());
					dbg.location(91,25);
					char_literal9=(Token)match(input,9,FOLLOW_9_in_factor470); 
					char_literal9_tree = (Object)adaptor.create(char_literal9);
					adaptor.addChild(root_0, char_literal9_tree);
					dbg.location(91,34);
					 
					                                     retval.codigo = (exp!=null?((PlantillaParser.expresion_return)exp).codigo:null); 
					                                     retval.resultado = (exp!=null?((PlantillaParser.expresion_return)exp).resultado:null);
					                                   
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:95:9: n= dato
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(95,10);
					pushFollow(FOLLOW_dato_in_factor489);
					n=dato();
					state._fsp--;

					adaptor.addChild(root_0, n.getTree());
					dbg.location(95,36);
					 
					                                     retval.codigo = (n!=null?((PlantillaParser.dato_return)n).codigo:null);  
					                                     retval.resultado = (n!=null?((PlantillaParser.dato_return)n).resultado:null);
					                                   
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
		dbg.location(99, 4);

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
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dato"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:102:1: dato returns [String codigo, String resultado] : ( Number | Id | '-' Number | '-' Id );
	public final PlantillaParser.dato_return dato() throws RecognitionException {
		PlantillaParser.dato_return retval = new PlantillaParser.dato_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number10=null;
		Token Id11=null;
		Token char_literal12=null;
		Token Number13=null;
		Token char_literal14=null;
		Token Id15=null;

		Object Number10_tree=null;
		Object Id11_tree=null;
		Object char_literal12_tree=null;
		Object Number13_tree=null;
		Object char_literal14_tree=null;
		Object Id15_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dato");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:103:4: ( Number | Id | '-' Number | '-' Id )
			int alt5=4;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			switch ( input.LA(1) ) {
			case Number:
				{
				alt5=1;
				}
				break;
			case Id:
				{
				alt5=2;
				}
				break;
			case 12:
				{
				int LA5_3 = input.LA(2);
				if ( (LA5_3==Number) ) {
					alt5=3;
				}
				else if ( (LA5_3==Id) ) {
					alt5=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 3, input);
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
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:103:8: Number
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(103,8);
					Number10=(Token)match(input,Number,FOLLOW_Number_in_dato564); 
					Number10_tree = (Object)adaptor.create(Number10);
					adaptor.addChild(root_0, Number10_tree);
					dbg.location(103,33);
					 
					                                     retval.codigo = (Number10!=null?Number10.getText():null);  
					                                     retval.resultado = (Number10!=null?Number10.getText():null);
					                                   
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:107:11: Id
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(107,11);
					Id11=(Token)match(input,Id,FOLLOW_Id_in_dato596); 
					Id11_tree = (Object)adaptor.create(Id11);
					adaptor.addChild(root_0, Id11_tree);
					dbg.location(107,36);
					 
					                                     retval.codigo = (Id11!=null?Id11.getText():null);  
					                                     retval.resultado = (Id11!=null?Id11.getText():null);
					                                   
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:111:7: '-' Number
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(111,7);
					char_literal12=(Token)match(input,12,FOLLOW_12_in_dato628); 
					char_literal12_tree = (Object)adaptor.create(char_literal12);
					adaptor.addChild(root_0, char_literal12_tree);
					dbg.location(111,11);
					Number13=(Token)match(input,Number,FOLLOW_Number_in_dato630); 
					Number13_tree = (Object)adaptor.create(Number13);
					adaptor.addChild(root_0, Number13_tree);
					dbg.location(111,36);
					 
					                                     cnt++;
					                                     retval.codigo = "(" + "NEG" + "," +  "t" + cnt + "," + (Number13!=null?Number13.getText():null) + "," + "NULL" + ")"; 
					                                     System.out.println(retval.codigo);
					                                     retval.resultado = "t" + cnt;
					                                   
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:117:7: '-' Id
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(117,7);
					char_literal14=(Token)match(input,12,FOLLOW_12_in_dato658); 
					char_literal14_tree = (Object)adaptor.create(char_literal14);
					adaptor.addChild(root_0, char_literal14_tree);
					dbg.location(117,11);
					Id15=(Token)match(input,Id,FOLLOW_Id_in_dato660); 
					Id15_tree = (Object)adaptor.create(Id15);
					adaptor.addChild(root_0, Id15_tree);
					dbg.location(117,36);
					 
					                                     cnt++;
					                                     retval.codigo = "(" + "NEG" + "," +  "t" + cnt + "," + (Id15!=null?Id15.getText():null) + "," + "NULL" + ")"; 
					                                     System.out.println(retval.codigo);
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
		dbg.location(123, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dato");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "dato"


	public static class condicional_if_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condicional_if"
	// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:125:4: condicional_if returns [String codigo, String resultado] : 'if (' comp= Comparacion ')' 'then {' (ec= ecuacion )* '}' ;
	public final PlantillaParser.condicional_if_return condicional_if() throws RecognitionException {
		PlantillaParser.condicional_if_return retval = new PlantillaParser.condicional_if_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token comp=null;
		Token string_literal16=null;
		Token char_literal17=null;
		Token string_literal18=null;
		Token char_literal19=null;
		ParserRuleReturnScope ec =null;

		Object comp_tree=null;
		Object string_literal16_tree=null;
		Object char_literal17_tree=null;
		Object string_literal18_tree=null;
		Object char_literal19_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "condicional_if");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(125, 3);

		try {
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:126:5: ( 'if (' comp= Comparacion ')' 'then {' (ec= ecuacion )* '}' )
			dbg.enterAlt(1);

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:127:5: 'if (' comp= Comparacion ')' 'then {' (ec= ecuacion )* '}'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(127,5);
			string_literal16=(Token)match(input,16,FOLLOW_16_in_condicional_if717); 
			string_literal16_tree = (Object)adaptor.create(string_literal16);
			adaptor.addChild(root_0, string_literal16_tree);
			dbg.location(127,16);
			comp=(Token)match(input,Comparacion,FOLLOW_Comparacion_in_condicional_if721); 
			comp_tree = (Object)adaptor.create(comp);
			adaptor.addChild(root_0, comp_tree);
			dbg.location(127,29);
			char_literal17=(Token)match(input,9,FOLLOW_9_in_condicional_if723); 
			char_literal17_tree = (Object)adaptor.create(char_literal17);
			adaptor.addChild(root_0, char_literal17_tree);
			dbg.location(127,33);

			   		retval.codigo = (comp!=null?comp.getText():null); 
			   		retval.resultado = (comp!=null?comp.getText():null);
			   	dbg.location(131,5);
			string_literal18=(Token)match(input,17,FOLLOW_17_in_condicional_if731); 
			string_literal18_tree = (Object)adaptor.create(string_literal18);
			adaptor.addChild(root_0, string_literal18_tree);
			dbg.location(132,5);
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:132:5: (ec= ecuacion )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==Id) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:132:6: ec= ecuacion
					{
					dbg.location(132,8);
					pushFollow(FOLLOW_ecuacion_in_condicional_if740);
					ec=ecuacion();
					state._fsp--;

					adaptor.addChild(root_0, ec.getTree());

					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(133,5);
			char_literal19=(Token)match(input,18,FOLLOW_18_in_condicional_if748); 
			char_literal19_tree = (Object)adaptor.create(char_literal19);
			adaptor.addChild(root_0, char_literal19_tree);
			dbg.location(133,9);

			   		 cnt++;
			                          retval.codigo = "(" + "IF_TRUE" + "," +  (comp!=null?comp.getText():null) + "," + "GOTO" + "," + "L0" + ")"; 
			                          System.out.println(retval.codigo);
			   	
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
		dbg.location(138, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condicional_if");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "condicional_if"

	// Delegated rules



	public static final BitSet FOLLOW_ecuacion_in_entrada53 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ecuacion_in_entrada102 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_Id_in_ecuacion158 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ecuacion160 = new BitSet(new long[]{0x0000000000001160L});
	public static final BitSet FOLLOW_expresion_in_ecuacion164 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ecuacion166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termino_in_expresion201 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_11_in_expresion234 = new BitSet(new long[]{0x0000000000001160L});
	public static final BitSet FOLLOW_termino_in_expresion238 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_12_in_expresion270 = new BitSet(new long[]{0x0000000000001160L});
	public static final BitSet FOLLOW_termino_in_expresion274 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_factor_in_termino344 = new BitSet(new long[]{0x0000000000002402L});
	public static final BitSet FOLLOW_10_in_termino376 = new BitSet(new long[]{0x0000000000001160L});
	public static final BitSet FOLLOW_factor_in_termino380 = new BitSet(new long[]{0x0000000000002402L});
	public static final BitSet FOLLOW_13_in_termino406 = new BitSet(new long[]{0x0000000000001160L});
	public static final BitSet FOLLOW_factor_in_termino410 = new BitSet(new long[]{0x0000000000002402L});
	public static final BitSet FOLLOW_8_in_factor464 = new BitSet(new long[]{0x0000000000001160L});
	public static final BitSet FOLLOW_expresion_in_factor468 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_factor470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dato_in_factor489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_dato564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Id_in_dato596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_dato628 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Number_in_dato630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_dato658 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Id_in_dato660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_condicional_if717 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Comparacion_in_condicional_if721 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_condicional_if723 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_condicional_if731 = new BitSet(new long[]{0x0000000000040020L});
	public static final BitSet FOLLOW_ecuacion_in_condicional_if740 = new BitSet(new long[]{0x0000000000040020L});
	public static final BitSet FOLLOW_18_in_condicional_if748 = new BitSet(new long[]{0x0000000000000002L});
}
