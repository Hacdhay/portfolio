import java.util.Scanner;
import java.util.Arrays;
class ReverseArray{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int size = sc.nextInt();
  int [] arr = new int[size];
  int [] arr1 = new int[size];
  for(int i = 0;i<size;i++){
   arr[i] = sc.nextInt();
  }
  for(int i = size-1,j=0;i>=0;i--,j++){
   arr1[j] = arr[i];
   
  }
  System.out.println(Arrays.toString(arr1));
 }
}