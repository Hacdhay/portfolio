public class Main18 {
    static int OperationBinaryString(String str){
        int res = str.charAt(0) - '0';

        for(int i =1;i<str.length();i+=2){
            int j = i+1;
            char a = str.charAt(i);
            if(a=='A'){
                res = res&str.charAt(j) - '0';
            }
            else if(a=='B'){
                res = res|str.charAt(j) - '0';
            }
            else if(a=='C'){
                res = res^str.charAt(j) - '0';
                
            }

        }
        return res;
    }
    public static void main(String[] args) {
       String str = "1C0C1C1A0B1";
       int res = OperationBinaryString(str);
       System.out.println(res);
    }
}


    
