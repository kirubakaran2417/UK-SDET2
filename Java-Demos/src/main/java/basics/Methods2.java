package basics;

public class Methods2 {

    public int add(int a,int b){
        int c=a+b;
        return c;
    }



    public static void main(String[] args) {

        Methods2 obj = new Methods2();
        int result=obj.add(13,24);

        System.out.println(result);
    }

}
