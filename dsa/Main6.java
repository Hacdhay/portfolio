import java.util.Arrays;
public class Main6 {
    static int[] selSort(int [] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i]<arr[j]){   
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {2,6,3,4,1};
        int []arr1 = selSort(arr);
        System.out.println(Arrays.toString(arr1));
    }
}
