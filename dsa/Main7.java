import java.util.Arrays;
public class Main7 {
    static void reverseArray(int[] arr){
        for(int i = 0, j = arr.length-1;i<j;i++,j--){
            int end =j,temp = 0;
            temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
        }
        
        
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
