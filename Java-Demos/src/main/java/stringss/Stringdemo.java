package stringss;

public class Stringdemo {
    //string is a sequence of characters
    //string is immutable
    //string is an object
    public static void main(String[] args) {
        String str="hello";
        String str1=new String("hello");
        System.out.println(str);
        //length
        System.out.println(str1.length());
        System.out.println(str.toCharArray());
        System.out.println(str.charAt(4));
        System.out.println(str.substring(0,3));
        //concatenation
        String str2="world";
        String str3=str+str2;
        System.out.println(str3);
        String str4=str.concat(str2);
        System.out.println(str4);

        String str5="hello world";
        String[] arr=str5.split(" ");

        System.out.println(str.indexOf("e"));
        System.out.println(str.lastIndexOf("e"));

        //replace
        String str6="hello";
        String str7=str6.replace("e","a");
        System.out.println(str7);

        //trim
        String str8="  hello  ";
        String str9=str8.trim();
        System.out.println(str9);

        //toLowercase
        String str10="HELLO";
        System.out.println(str10.toLowerCase());

        //toUppercase
        String str11="hello";
        System.out.println(str11.toUpperCase());

        //isEmpty
        String str12="";
        System.out.println(str12.isEmpty());

        //comparing with ==
        String str13="hello";

        System.out.println(str13==str1);
        System.out.println(str13.equals(str1));

        String sentence="This is a simple sentence";
       int count=0;
       //check sentence is having how many vowel
       for(int i=0;i<sentence.length();i++){
           if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||
                   sentence.charAt(i)=='i'||sentence.charAt(i)=='o'||
                   sentence.charAt(i)=='u'){
               count++;
           }
       }
        System.out.println(count);
    }
}
