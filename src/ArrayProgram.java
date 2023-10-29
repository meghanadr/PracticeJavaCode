public class ArrayProgram extends Thread{
    int sum=0;
    public void run(){
        int[] arr={1,2,3,4,5,6,7};

        for(int i=0;i<arr.length;i++){
         sum= arr[i]+sum;

        }
        System.out.println("Sum of an Array :"  +sum);
    }
    public long getSum() {
        return this.sum;
    }
}
