import java.util.ArrayList;
//{0,1,0,2,1,0,1,2} {0,0,0,1,1,1,2,2}
public class Main8 {
    static ArrayList<Integer> sumOfSubArray(int[] arr, int sum){
        int st=0,la =0;
        int sum1 = 0;
        boolean flag = false;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            sum1 += arr[i];
            if(sum1>=sum){
                la = i;
                while(sum<sum1&&st<la){
                    sum1-=arr[st];
                    ++st;
                }
                if(sum1==sum){ 
                    res.add(st+1);
                    res.add(la+1);
                    flag = true;
                    break;
                }
                
            } 
          
        }
        if(!flag){
            res.add(-1);
            return res;
        }
        return res;
        
    }
    public static void main(String[] args) {
        int[] arr= {15,2,4,8,9,5,10,23};
        int sum = 23;
        ArrayList<Integer> res = sumOfSubArray(arr, sum);
        for(int i : res){
            System.out.print(i + " ");
        }
        
    }
   
    



   
}
