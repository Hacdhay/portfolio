public class Main3 {
    static int slideWin(int[]arr,int k){
        int maxValue = 0; int curSum = 0;
        for(int i = 0;i<k;i++){
            curSum+=arr[i];
        }
        maxValue = curSum;
        for(int i  = k;i<arr.length;i++){
            maxValue += arr[i]-arr[i-k]; //{2,9,4,2,6,7} c = 5 
            maxValue = Math.min(maxValue, curSum);
        }
        
        return maxValue;

    }
    public static void main(String[] args) {
        int [] arr = {2,1,4,5,6,7};
        int k = 2;
        int max = slideWin(arr, k);
        System.out.println(max);
    }
}

