// $ANTLR 3.5.1 /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g 2022-12-28 20:29:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Plantilla2Lexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Plantilla2Lexer() {} 
	public Plantilla2Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public Plantilla2Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g"; }

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:7:6: ( '(' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:7:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:8:6: ( ')' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:8:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:9:7: ( '*' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:9:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:10:7: ( '+' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:10:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:11:7: ( '++' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:11:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:12:7: ( '-' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:12:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:13:7: ( '--' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:13:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:14:7: ( '/' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:14:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:15:7: ( ';' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:15:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:16:7: ( '=' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:16:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:17:7: ( 'do' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:17:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:18:7: ( 'else' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:18:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:19:7: ( 'for' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:19:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:20:7: ( 'if' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:20:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:21:7: ( 'then' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:21:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:22:7: ( 'while' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:22:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:23:7: ( '{' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:23:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:24:7: ( '}' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:24:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "Id"
	public final void mId() throws RecognitionException {
		try {
			int _type = Id;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:242:2: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:242:4: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:242:4: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Id"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:247:2: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:247:4: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:247:4: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:247:16: ( '.' ( '0' .. '9' )+ )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:247:17: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:247:21: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Number"

	// $ANTLR start "Comp"
	public final void mComp() throws RecognitionException {
		try {
			int _type = Comp;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:251:2: ( ( '>' | '<' | '>=' | '<=' | '==' | '!=' ) )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:251:4: ( '>' | '<' | '>=' | '<=' | '==' | '!=' )
			{
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:251:4: ( '>' | '<' | '>=' | '<=' | '==' | '!=' )
			int alt5=6;
			switch ( input.LA(1) ) {
			case '>':
				{
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='=') ) {
					alt5=3;
				}

				else {
					alt5=1;
				}

				}
				break;
			case '<':
				{
				int LA5_2 = input.LA(2);
				if ( (LA5_2=='=') ) {
					alt5=4;
				}

				else {
					alt5=2;
				}

				}
				break;
			case '=':
				{
				alt5=5;
				}
				break;
			case '!':
				{
				alt5=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:251:5: '>'
					{
					match('>'); 
					}
					break;
				case 2 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:251:11: '<'
					{
					match('<'); 
					}
					break;
				case 3 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:251:17: '>='
					{
					match(">="); 

					}
					break;
				case 4 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:251:24: '<='
					{
					match("<="); 

					}
					break;
				case 5 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:251:31: '=='
					{
					match("=="); 

					}
					break;
				case 6 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:251:38: '!='
					{
					match("!="); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comp"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:259:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:259:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | Id | Number | Comp | WS )
		int alt6=22;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt6=1;
			}
			break;
		case ')':
			{
			alt6=2;
			}
			break;
		case '*':
			{
			alt6=3;
			}
			break;
		case '+':
			{
			int LA6_4 = input.LA(2);
			if ( (LA6_4=='+') ) {
				alt6=5;
			}

			else {
				alt6=4;
			}

			}
			break;
		case '-':
			{
			int LA6_5 = input.LA(2);
			if ( (LA6_5=='-') ) {
				alt6=7;
			}

			else {
				alt6=6;
			}

			}
			break;
		case '/':
			{
			alt6=8;
			}
			break;
		case ';':
			{
			alt6=9;
			}
			break;
		case '=':
			{
			int LA6_8 = input.LA(2);
			if ( (LA6_8=='=') ) {
				alt6=21;
			}

			else {
				alt6=10;
			}

			}
			break;
		case 'd':
			{
			int LA6_9 = input.LA(2);
			if ( (LA6_9=='o') ) {
				int LA6_26 = input.LA(3);
				if ( ((LA6_26 >= 'A' && LA6_26 <= 'Z')||(LA6_26 >= 'a' && LA6_26 <= 'z')) ) {
					alt6=19;
				}

				else {
					alt6=11;
				}

			}

			else {
				alt6=19;
			}

			}
			break;
		case 'e':
			{
			int LA6_10 = input.LA(2);
			if ( (LA6_10=='l') ) {
				int LA6_27 = input.LA(3);
				if ( (LA6_27=='s') ) {
					int LA6_33 = input.LA(4);
					if ( (LA6_33=='e') ) {
						int LA6_38 = input.LA(5);
						if ( ((LA6_38 >= 'A' && LA6_38 <= 'Z')||(LA6_38 >= 'a' && LA6_38 <= 'z')) ) {
							alt6=19;
						}

						else {
							alt6=12;
						}

					}

					else {
						alt6=19;
					}

				}

				else {
					alt6=19;
				}

			}

			else {
				alt6=19;
			}

			}
			break;
		case 'f':
			{
			int LA6_11 = input.LA(2);
			if ( (LA6_11=='o') ) {
				int LA6_28 = input.LA(3);
				if ( (LA6_28=='r') ) {
					int LA6_34 = input.LA(4);
					if ( ((LA6_34 >= 'A' && LA6_34 <= 'Z')||(LA6_34 >= 'a' && LA6_34 <= 'z')) ) {
						alt6=19;
					}

					else {
						alt6=13;
					}

				}

				else {
					alt6=19;
				}

			}

			else {
				alt6=19;
			}

			}
			break;
		case 'i':
			{
			int LA6_12 = input.LA(2);
			if ( (LA6_12=='f') ) {
				int LA6_29 = input.LA(3);
				if ( ((LA6_29 >= 'A' && LA6_29 <= 'Z')||(LA6_29 >= 'a' && LA6_29 <= 'z')) ) {
					alt6=19;
				}

				else {
					alt6=14;
				}

			}

			else {
				alt6=19;
			}

			}
			break;
		case 't':
			{
			int LA6_13 = input.LA(2);
			if ( (LA6_13=='h') ) {
				int LA6_30 = input.LA(3);
				if ( (LA6_30=='e') ) {
					int LA6_36 = input.LA(4);
					if ( (LA6_36=='n') ) {
						int LA6_40 = input.LA(5);
						if ( ((LA6_40 >= 'A' && LA6_40 <= 'Z')||(LA6_40 >= 'a' && LA6_40 <= 'z')) ) {
							alt6=19;
						}

						else {
							alt6=15;
						}

					}

					else {
						alt6=19;
					}

				}

				else {
					alt6=19;
				}

			}

			else {
				alt6=19;
			}

			}
			break;
		case 'w':
			{
			int LA6_14 = input.LA(2);
			if ( (LA6_14=='h') ) {
				int LA6_31 = input.LA(3);
				if ( (LA6_31=='i') ) {
					int LA6_37 = input.LA(4);
					if ( (LA6_37=='l') ) {
						int LA6_41 = input.LA(5);
						if ( (LA6_41=='e') ) {
							int LA6_44 = input.LA(6);
							if ( ((LA6_44 >= 'A' && LA6_44 <= 'Z')||(LA6_44 >= 'a' && LA6_44 <= 'z')) ) {
								alt6=19;
							}

							else {
								alt6=16;
							}

						}

						else {
							alt6=19;
						}

					}

					else {
						alt6=19;
					}

				}

				else {
					alt6=19;
				}

			}

			else {
				alt6=19;
			}

			}
			break;
		case '{':
			{
			alt6=17;
			}
			break;
		case '}':
			{
			alt6=18;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'u':
		case 'v':
		case 'x':
		case 'y':
		case 'z':
			{
			alt6=19;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt6=20;
			}
			break;
		case '!':
		case '<':
		case '>':
			{
			alt6=21;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt6=22;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 6, 0, input);
			throw nvae;
		}
		switch (alt6) {
			case 1 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:38: T__13
				{
				mT__13(); 

				}
				break;
			case 7 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:44: T__14
				{
				mT__14(); 

				}
				break;
			case 8 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:50: T__15
				{
				mT__15(); 

				}
				break;
			case 9 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:56: T__16
				{
				mT__16(); 

				}
				break;
			case 10 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:62: T__17
				{
				mT__17(); 

				}
				break;
			case 11 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:68: T__18
				{
				mT__18(); 

				}
				break;
			case 12 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:74: T__19
				{
				mT__19(); 

				}
				break;
			case 13 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:80: T__20
				{
				mT__20(); 

				}
				break;
			case 14 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:86: T__21
				{
				mT__21(); 

				}
				break;
			case 15 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:92: T__22
				{
				mT__22(); 

				}
				break;
			case 16 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:98: T__23
				{
				mT__23(); 

				}
				break;
			case 17 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:104: T__24
				{
				mT__24(); 

				}
				break;
			case 18 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:110: T__25
				{
				mT__25(); 

				}
				break;
			case 19 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:116: Id
				{
				mId(); 

				}
				break;
			case 20 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:119: Number
				{
				mNumber(); 

				}
				break;
			case 21 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:126: Comp
				{
				mComp(); 

				}
				break;
			case 22 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla2.g:1:131: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
