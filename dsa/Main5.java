public class Main5 {
    static int binarySearch(int[] arr, int k){
        int right = 0;
        int left = arr.length-1;
       // int mid = right+(left-right)/2;
      while(right<=left){
        int mid = right+(left-right)/2;
        
        if(arr[mid]==k){
            
            return mid;
            
        }
        if(arr[mid]<k){
            right = mid+1; 
           
        }
        else{
            left = mid- 1;                  
        }
      }
      return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,8,10,12,14};
        int k = 12;
        int fou = binarySearch(arr, k);
        System.out.println(fou);
       /*  if(fou == -1){
            System.out.println("no");

        }else{
            System.out.println("fou");
        }
       // System.out.println(fou);*/
    }
}
