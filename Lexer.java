package trsegroup.terse.lexical;


import java.util.ArrayList;
public class Lexer {
    public static enum Type{
        // TRSE has multiple types of tokens
        KEY, IDENT, NUM, PUNC, MATH, COMM, SEPS, QUOT;
    }

    public static List<Token> lex(String input){
        List<Token> result = new ArrayList<Token>();
        for(int i = 0; i < input.length(); ) {
            switch(input.charAt(i)) {

            }
        }
        return result;
    }
}
