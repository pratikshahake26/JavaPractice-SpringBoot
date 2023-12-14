public class methodoverloading {
    void A1(){
        System.out.println("this is first method");
    }
    void A2(int a){
        System.out.println("This is Second method");
    }
  public static void main(String args[]){
      methodoverloading A= new methodoverloading();
      A.A1();
      A.A2(1);
  }
}
