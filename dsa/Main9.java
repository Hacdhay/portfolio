import java.util.Arrays;

public class Main9 {
    static int sumOfPairs(int [] arr,int k){
        int len = 1;
        int endLen = len;
        int curSum = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++ ){
            for(int j = 1+i ; j<arr.length;j++){
               if( arr[i]+arr[j]==k){
                count++;
               }
            

            }
            
            
        }
        return count>0?count:-1;
        
    }
    public static void main(String[] args) {
        int [] arr = {1,-5,7,1};
        int k = 6;
        int res = sumOfPairs(arr, k);
        System.out.println(res);
    }
}