

public class MainClass {

    public static void main(String[] args){

//        OuterClass outerClass=new OuterClass();
//        outerClass.heyther();// for caliing outerclass


//        OuterClass outerClass=new OuterClass();
//        OuterClass.InnerClass innerClass= outerClass.new InnerClass();
//        innerClass.Innerclassmethod();// For Calling InnerClass


        //Static Ineer Class
        OuterClass outerClass=new OuterClass();
        OuterClass.InnerClass innerClass= new OuterClass.InnerClass();
        innerClass.Innerclassmethod();


          //Method Local InnerClass
        OuterClass outerClass1=new OuterClass();
        outerClass1.heyther();

    }
}
