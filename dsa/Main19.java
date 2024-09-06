class Main19{
    public static void main(String[] args) {
        int [] arr = {22,45,82,37,90,87,89,100,646,64,526};
        int max = arr[0];
        int index = 0;
        int sMax = arr[1];
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
            else if(arr[i]>sMax&&arr[i]!=max){
                sMax = arr[i];
                index = i;
            }
            
        }
        
        System.out.println(sMax);
        System.out.println(index);
    }
    

       
}