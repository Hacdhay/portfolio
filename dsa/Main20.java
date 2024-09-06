import java.util.HashMap;
public class Main20 {
    public static void main(String[] args) {
        int [] charcount = new int[256];
        String str = "hrkhlrooh";
        int mas = 0;
        char c = '\0';
        for(char b:str.toCharArray()){
            charcount[b]++;
            System.out.println(charcount[b]);
            /*if(charcount[b]>mas){
                mas=charcount[b];
                c = b;
            }
            System.out.print(c);*/

        }
    }
    
}
