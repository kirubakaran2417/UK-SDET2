package arrayss;

public class arraysdemo {

    //arrays is the data structure which is used to represent multiple values
    //  in a single variable

    public static void main(String[] args) {

        //syntax

        //datatype[] arrayname = new datatype[size];

        int[] arr;//array declaration
        arr=new int[5];//array creation
        //array elememnts can be accessed using index
        //index always starts from 0
        //initialization
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        int[] arr1={10,20,30,40,50};

        int size=arr1.length;
        System.out.println("size of array is "+size);

        System.out.println(arr1[2]); //30

        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }

     }
}
