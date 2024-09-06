import java.util.Arrays;
import java.lang.*;
public class Main11 {
    static String lcPrefix(String [] str){
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        String ans = "";
        int min = Math.min(first.length(),last.length());
        int i = 0;
        while(i<min&&first.charAt(i)==last.charAt(i)){
            i++;
            ans = first.substring(0,i);
            
        }
          
            
        
        return ans;

    }
    public static void main(String[] args) {
        String []str = {"geeksfor","geeksss","geeker"};
        System.out.println(lcPrefix(str));
    }
}
