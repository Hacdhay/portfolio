import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Collection;
import java.util.TreeSet;
public class Main15 {
    public static ArrayList<Integer> UnionArray(int[]arr,int[] arr1,int n,int m){
        TreeSet<Integer> set = new TreeSet<>();
        for(int i:arr)
         set.add(i);
        for(int i :arr1)
         set.add(i);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: set)
          list.add(i);
         return list;
        

    }
    public static void main(String[] args) {
        int []arr ={1,2,3,3,4,1,5};
        int [] arr1 ={6,7,6,8,7,9,10};
        int n = arr.length;
        int m = arr.length;
        ArrayList<Integer> uni = UnionArray(arr, arr1, n, m);
        for(int i :uni){
            System.out.print(i + " ");
        }
        //System.out.println(i + " ");
    }
}
