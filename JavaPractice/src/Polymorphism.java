
//Runtime Polymorphism
public class Polymorphism {
    void method(){
        System.out.println("This is Superclass");
    }
}
class b extends Polymorphism{
    void method(){
        System.out.println("This is Subclass");
    }

  public static void main(String args[]) {
        Polymorphism a=new Polymorphism();
        b B=new b();

        a.method();
        B.method();
  }
}
