public class PrimeorNot {
    public static void main(String[] args){
        int s=47;
        int m=0;
        m=s/2;
     int  flag=0; // its number we checked
       if(s==0 || s==1){
           System.out.println("its not a prime number");
       }else {
           for(int i=2;i<s;i++) {
               if (s % i == 0) {
                   System.out.println("its a not Primenumber");
                   flag = 1;
                   break;
               }
           }
               if(flag==0){
                   System.out.println("its a Prime Number");

           }
       }
    }
}
