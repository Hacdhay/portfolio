/**
 * Main1
 * "abcde k = 2
   1"
 */
import java.util.Scanner;
import java.util.Arrays;
public class Main1 {
    static int slideWin(String str,int k){
        int maxVowel =0;
        int count=0;
        for(int i = 0;i<k;i++){
            char a = str.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                maxVowel++;
               // System.out.println("vow");
            } 
        }
        count=maxVowel; 
        for(int i = k;i<str.length();i++){
            char a = str.charAt((i-k));
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                maxVowel--;
                //System.out.println("vow");
            } 
             a = str.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                maxVowel++;
                //System.out.println("vo");
            } 
            count = Math.max(maxVowel, count);
            

        }

        return count;
    }
    public static void main(String[] args) {
        String str_1 = "leetcode";
        int k = 3;
        int vow = slideWin(str_1, k);
        System.out.println(vow);
    }
}
    
    
    
