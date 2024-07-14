package arrayss;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int[] array1={95,65,75,42,35,25};

        int min=findMin(array1);
        System.out.println(min);

    }

    public static int findMin(int[] arr){
        int min=arr[0];//assuming the first element is the smallest as of now
        for(int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
      return min;
    }
}
