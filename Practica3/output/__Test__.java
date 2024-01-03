import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        BucleWhileyForLexer lex = new BucleWhileyForLexer(new ANTLRFileStream("/home/lemon/Escritorio/ApuntesVarios/LPPL/Practicas/Practica3/pruebasDoWhile", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        BucleWhileyForParser g = new BucleWhileyForParser(tokens, 49100, null);
        try {
            g.entrada();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}