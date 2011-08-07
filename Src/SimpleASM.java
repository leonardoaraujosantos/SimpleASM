

import java.io.*;
import org.antlr.runtime.*;

public class SimpleASM {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// Get input and pass to our lexer
		System.out.println("Compiling source... " + args[0]);
		SimpleASMLexer lex = new SimpleASMLexer(new ANTLRFileStream(args[0]));
		
		// Create tokens from lexer....
		CommonTokenStream tokens = new CommonTokenStream(lex);
		
		// Output our tokens to the parser
        SimpleASMParser g = new SimpleASMParser(tokens);
        
        // Parse...
        try
        {
        	// "program" is our first rule in our grammar, so let's parse our code beginning with this rule
        	g.program();
        } catch (RecognitionException e)
        {
        	e.printStackTrace();
        }
	}

}
