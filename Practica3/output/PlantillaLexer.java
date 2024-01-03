// $ANTLR 3.5.1 /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g 2022-12-28 20:06:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PlantillaLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public PlantillaLexer() {} 
	public PlantillaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public PlantillaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g"; }

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:2:6: ( '(' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:2:8: '('
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
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:3:6: ( ')' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:3:8: ')'
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
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:4:7: ( '*' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:4:9: '*'
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
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:5:7: ( '+' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:5:9: '+'
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
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:6:7: ( '-' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:6:9: '-'
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:7:7: ( '/' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:7:9: '/'
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:8:7: ( ';' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:8:9: ';'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:9:7: ( '=' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:9:9: '='
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:10:7: ( 'if (' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:10:9: 'if ('
			{
			match("if ("); 

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
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:11:7: ( 'then {' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:11:9: 'then {'
			{
			match("then {"); 

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
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:12:7: ( '}' )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:12:9: '}'
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
	// $ANTLR end "T__18"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:144:5: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:144:9: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:144:9: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:144:21: ( '.' ( '0' .. '9' )+ )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='.') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:144:22: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:144:26: ( '0' .. '9' )+
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
							// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:
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

	// $ANTLR start "Id"
	public final void mId() throws RecognitionException {
		try {
			int _type = Id;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:148:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:148:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:148:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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

	// $ANTLR start "Comparacion"
	public final void mComparacion() throws RecognitionException {
		try {
			int _type = Comparacion;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:151:5: ( ( Id )+ ( '>' | '<' | '=' | '!=' )+ ( '=' )? )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:151:7: ( Id )+ ( '>' | '<' | '=' | '!=' )+ ( '=' )?
			{
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:151:7: ( Id )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:151:7: Id
					{
					mId(); 

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:151:10: ( '>' | '<' | '=' | '!=' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=5;
				switch ( input.LA(1) ) {
				case '=':
					{
					alt6=3;
					}
					break;
				case '>':
					{
					alt6=1;
					}
					break;
				case '<':
					{
					alt6=2;
					}
					break;
				case '!':
					{
					alt6=4;
					}
					break;
				}
				switch (alt6) {
				case 1 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:151:11: '>'
					{
					match('>'); 
					}
					break;
				case 2 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:151:15: '<'
					{
					match('<'); 
					}
					break;
				case 3 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:151:19: '='
					{
					match('='); 
					}
					break;
				case 4 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:151:23: '!='
					{
					match("!="); 

					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:151:29: ( '=' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='=') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:151:30: '='
					{
					match('='); 
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
	// $ANTLR end "Comparacion"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:158:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:158:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
		// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | Number | Id | Comparacion | WS )
		int alt8=15;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:38: T__13
				{
				mT__13(); 

				}
				break;
			case 7 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:44: T__14
				{
				mT__14(); 

				}
				break;
			case 8 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:50: T__15
				{
				mT__15(); 

				}
				break;
			case 9 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:56: T__16
				{
				mT__16(); 

				}
				break;
			case 10 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:62: T__17
				{
				mT__17(); 

				}
				break;
			case 11 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:68: T__18
				{
				mT__18(); 

				}
				break;
			case 12 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:74: Number
				{
				mNumber(); 

				}
				break;
			case 13 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:81: Id
				{
				mId(); 

				}
				break;
			case 14 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:84: Comparacion
				{
				mComparacion(); 

				}
				break;
			case 15 :
				// /home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/Plantilla.g:1:96: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\11\uffff\2\20\2\uffff\1\20\1\uffff\1\20\2\uffff\1\20\1\uffff\2\20\1\uffff";
	static final String DFA8_eofS =
		"\27\uffff";
	static final String DFA8_minS =
		"\1\11\10\uffff\2\41\2\uffff\1\41\1\uffff\1\40\2\uffff\1\41\1\uffff\1\41"+
		"\1\40\1\uffff";
	static final String DFA8_maxS =
		"\1\175\10\uffff\2\172\2\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\uffff"+
		"\2\172\1\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\13\1\14\1\uffff\1"+
		"\17\1\uffff\1\15\1\16\1\uffff\1\11\2\uffff\1\12";
	static final String DFA8_specialS =
		"\27\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\16\2\uffff\1\16\22\uffff\1\16\7\uffff\1\1\1\2\1\3\1\4\1\uffff\1\5"+
			"\1\uffff\1\6\12\14\1\uffff\1\7\1\uffff\1\10\3\uffff\32\15\6\uffff\10"+
			"\15\1\11\12\15\1\12\6\15\2\uffff\1\13",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\21\32\uffff\3\21\2\uffff\32\15\6\uffff\5\15\1\17\24\15",
			"\1\21\32\uffff\3\21\2\uffff\32\15\6\uffff\7\15\1\22\22\15",
			"",
			"",
			"\1\21\32\uffff\3\21\2\uffff\32\15\6\uffff\32\15",
			"",
			"\1\23\1\21\32\uffff\3\21\2\uffff\32\15\6\uffff\32\15",
			"",
			"",
			"\1\21\32\uffff\3\21\2\uffff\32\15\6\uffff\4\15\1\24\25\15",
			"",
			"\1\21\32\uffff\3\21\2\uffff\32\15\6\uffff\15\15\1\25\14\15",
			"\1\26\1\21\32\uffff\3\21\2\uffff\32\15\6\uffff\32\15",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | Number | Id | Comparacion | WS );";
		}
	}

}
