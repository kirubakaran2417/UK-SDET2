package stringss;

public class Stringbuilderdemo {
    //string builder is used to create mutable string
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb.toString());//it will be converted to a string
        sb.append("world");
        System.out.println(sb);
        //string builder methods
        sb.delete(1,3);
        System.out.println(sb);
        sb.insert(1,"java");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        StringBuilder reversed = new StringBuilder();
        StringBuilder sb2=new StringBuilder("world");//dlrow
        for(int i=sb2.length()-1; i>=0; i--){
           reversed.append(sb2.charAt(i));
        }

    }
}
