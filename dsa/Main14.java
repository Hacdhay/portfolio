import java.util.ArrayList;
public class Main14 {
   public static ArrayList<Integer> Index(int k,int[] arr){
      int curSum = 0;
      int ed = 0;
      int st =0;
      ArrayList<Integer> res = new ArrayList<>();
      for(int i = 0;i<arr.length;i++){
         curSum+=arr[i];
         if(curSum>=k){
            ed = i;
         }
         while(curSum>k&&st<ed){
            curSum-=arr[st];
            ++st;
         }
         if(curSum==k){
            res.add(st+1);
            res.add(ed+1);
         }
      }

      
     return res;
   }
   public static void main(String[] args) {
      int k = 7;
      int [] arr = {1,4,0,0,3,10,5};
      ArrayList<Integer> a = Index(k, arr);
      for(int i:a)
      System.out.print(i + " ");
   }






   
   }
   
