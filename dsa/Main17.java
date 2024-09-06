//10,20,30,40,55,66,77,83
// 3-5 = -2
import java.util.Arrays;
import java.util.Scanner;
class Main17{
    public static void main(String[] args) {
        int [] arr = {-1,2,3,-4,-6,2,-1,-1,};
         Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int curCount = 1;
        int maxCount =1;
        int mostFre = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                curCount++;
                if(curCount>maxCount){
                    int temp = curCount;
                    curCount = maxCount;
                    maxCount = temp; 
                    mostFre = arr[i];
                }
            else{
                curCount =1;
            }
            }
                
        }   
        System.out.println(mostFre);    

            
           
            
        
        

    }

    private static void elseif(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'elseif'");
    }
    
   
}