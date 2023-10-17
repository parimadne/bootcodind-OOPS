package Inheritance;
public class Example1 {
    public static void main(String[] args) {
        B b1=new B();
        b1.setB(100);
        b1.setA(10);
        b1.showB();
        b1.showA();
    }
}
class A{
    private int a;
    void setA(int a){
        this.a=a;
    }
    void showA(){
        System.out.println("A - "+a);
    }
}
class B extends A{
    private int b;
    void setB(int b){
        this.b=b;
    }
    void showB(){
        System.out.println("B - "+b);
    }
}
