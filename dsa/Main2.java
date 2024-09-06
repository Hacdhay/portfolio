import java.util.Arrays;

public class Main2 {
    static int longestOne(int[] arr,int k){
        int zerocount=0;int oneCount =0;
        int left =0;
        int right =0;
        while(right<arr.length){
            if(arr[right]==0){
                zerocount++;
            }
            right++;
            System.out.println(right);
            
            if(zerocount>k){
                if(arr[left]==0){
                    zerocount--;
                    System.out.println(left);
                }
                left++;
                System.out.println(left);
            }
            
            //oneCount=Math.max(oneCount, right-left+1);
            

        }
        
        return right-left;
       
        
    }
    public static void main(String[] args) {
        int [] arr_1 = {1,0,1,0,0,1,0,1,1,0};
        int k = 2;
        int oneCount = longestOne(arr_1, k);
        System.out.println(oneCount);
    }
    
           
       
}
