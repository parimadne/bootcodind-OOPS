package Abstract;

public class Ex2 {
    public static void main(String[] args) {
        D d1 = new D();
        d1.print();
    }
}
// if i have to create a abstract method then the class is also declared abstract
abstract class C {
    //Abstract method does not have body it only have their prototype
    abstract void print();
}
/*if i want to call the abstract method present in abstract class then i have create another class
and then inherit those class and override the method present in abstract class*/
class D extends C{
    void print(){
        System.out.println("I am abstract method");
    }
 }
