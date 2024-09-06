import java.util.Arrays;
import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
       /*
        * 1 1
        212 5
        32123 11
        */
        int size = 3;
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int max =0;
       for(int i = 0;i<size;i++){
        arr1[i] = sc.nextInt();
       }
       for(int i = 0;i<size;i++){
        arr2[i] = sc.nextInt();
       }
       int [] arr3 = new int[size];
       for(int i = 0;i<size;i++){
        arr3[i] = arr1[i]+arr2[i];
        max = Math.max(arr3[i],arr2[i]);
       }
      
       System.out.println(Arrays.toString(arr1));
       System.out.println(Arrays.toString(arr2));
       System.out.println(Arrays.toString(arr3));
       System.out.println(max);
        
        
    }
}
