public class MainMultiplethreads {

    public static void main(String[] args) {
        Multiplethreads multiplethreads = new Multiplethreads();
        MyAnotherthread multiplethreads1 = new MyAnotherthread();
        ArrayProgram arrayProgram = new ArrayProgram();
        multiplethreads.start();
//        multiplethreads1.start();
        arrayProgram.start();


    }
}
