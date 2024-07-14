package stringss;

import java.util.StringTokenizer;

public class stringtokenizerdemo {

    public static void main(String[] args) {
        StringTokenizer tokens=new StringTokenizer("hello world java");
        //stringtokenizer methods
        //hasmoretokens,nexttoken
        while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }

    }
}
