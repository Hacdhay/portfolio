import java.util.*;
class Main10{
    public static void main(String[] args) {
        String str = "hello this computer hi to this i can't ";
        String[] arr = str.split(" ");
        for(int i = arr.length-1;i>=0;i--){

            System.out.println((arr[i]));
            
        }

    }
}
