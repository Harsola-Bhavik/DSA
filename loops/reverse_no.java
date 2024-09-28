public class reverse_no {
    public static void main(String[] args) {
        // first method
        // for(int i=234567;i>0;){
        //     int lastdigit= i%10;
        //     System.out.print(lastdigit);
        //     i=i/10;
        // }
        
        
        int n=10899;
        int rev=0;
        while (n>0) {
            int lastdigit=n%10;
            rev= (rev*10) + lastdigit;
            n=n/10;
        }
        
        System.out.println(rev);
    }
}
