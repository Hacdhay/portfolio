
import java.util.Arrays;
public class Main16 {
    public static void main(String[] args) {
        int [] arr = {1,2,7,4,6};
        //arr[0]=arr[arr.length-1];
        int lasel = arr[2];
        int las = arr[arr.length-1];
        for( int i = arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
         //arr[0]=lasEl;
        }
       arr[0]=las;
        System.out.println(Arrays.toString(arr));
    }
}
