import java.util.ArrayList;
import java.util.Arrays;
public class Main13 {
    public static void main(String[] args) {
        int [] arr = {200,100,20,10,30,150,5,7,9,345};//10 20 30 100 200
        Arrays.sort(arr);
        int k = 3;
        int a = Integer.MAX_VALUE;
        ArrayList<Integer> b =new ArrayList<>();
        b.add(arr[k-1]-arr[0]);
       for(int i = k;i<arr.length;i++){

        b.add(arr[i]-arr[i-2]);
        
       }
       System.out.println(b.get(7));
       

       
       



    }
}
