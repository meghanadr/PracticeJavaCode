public class MyAnotherthread extends Thread{
    public  void run(){
        for(int i=0;i<4;i++){
            System.out.println("My another Thread"  +i);
        }
        try {
            Thread.sleep(7000);

        }
        catch (Exception e){
            System.out.println("Raised Exception");
        }
    }

}
