package Final;

public class Ex1 {
    public static void main(String[] args) {
        A a1 = new A ();
        B b1 = new B();
    }
}
/*final*/ class A{
   /*final*/ void show(){
        System.out.println("I am in A");
    }
}
class B extends A{
    void show(){
        System.out.println("I am in B");
    }
}
