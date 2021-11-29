package tudresden.ocl.parser;

import tudresden.ocl.parser.lexer.Lexer;
import tudresden.ocl.parser.node.Start;

public class OclParser{

    public OclParser(Lexer lexer) {
    }

    public Start parse() {
        return new Start();
    }
}