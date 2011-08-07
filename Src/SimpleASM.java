

import java.io.*;
import org.antlr.runtime.*;

public class SimpleASM {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SimpleASMLexer lex = new SimpleASMLexer(new ANTLRFileStream(args[0], "UTF8"));
	}

}
