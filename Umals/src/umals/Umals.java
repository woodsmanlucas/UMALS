/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umals;

import java.io.IOException;
import java.io.StringBufferInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import umals.recognizer.UMALSBaseVisitor;
import umals.recognizer.UMALSLexer;
import umals.recognizer.UMALSParser;
import umals.session.Session;

/**
 *
 * @author lucas
 */
public class Umals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Session session = new Session();
        String in = 
            "a\n" +
            "Maxima c\n" +
            "function set()\na=2\nend" +
            "Maxima function set()\na=2\nend";
        StringBufferInputStream inputStream = new StringBufferInputStream(in);
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        UMALSLexer lexer = new UMALSLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        UMALSParser parser = new UMALSParser(tokens);
        ParseTree tree = parser.chunk();
        execute(tree, session);
        
    }
    
    public static void execute(ParseTree tree, Session session) {
        UMALSVisitorImpl visitor = new UMALSVisitorImpl();
        visitor.visit(tree);
    }
    
}
