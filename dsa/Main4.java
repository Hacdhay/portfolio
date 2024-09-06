public class Main4 {
    static int linearSearch(int[] arr, int k){
        for(int i = 0;i<arr.length;i++){
            if(k==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {-2,3,4,5,6,7,8,9,10,11,12,13};
        int k = 13;
        int found = linearSearch(arr, k);
        System.out.println(found);
    }
        
}
