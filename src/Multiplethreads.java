public class Multiplethreads  extends  Thread {
    int sum=0;
    public void run(){
        int[] arr={7,8,9,10,11,12,13};

        for(int i=0;i<arr.length;i++){
            sum= arr[i]+sum;

        }
        System.out.println("Sum of an Array2 :"  +sum);
    }

    public long getSum() {

        return this.sum;
    }

    }
