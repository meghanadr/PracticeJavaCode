import java.security.PublicKey;

public class OuterClass {

    int number =6;

    public  void heyther(){
        System.out.println("Hi There");

       class LocalInnerClass{
           String s1="Meghana Gowda";


           public void localInnerclassMethod(){
           System.out.println(s1);}
       }

       LocalInnerClass lic =new LocalInnerClass();
       lic.localInnerclassMethod();
    }

    public static class InnerClass {
        int num=6;

        public  void Innerclassmethod(){
            System.out.println("Hi There Inner");
        }
    }
}
