package Abstract;

public class Ex1 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.showA();
    }
}
abstract class A{
    void showA(){
        System.out.println("I am in A");
    }
}
class B extends A{
    void showB(){
        System.out.println("I am in B");
    }
}

