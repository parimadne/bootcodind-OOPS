package Encapsulation;
public class Ex1 {
    public static void main(String[] args) {
        A a = new A();
        a.setValue(100);
        a.getValue();
        System.out.println(a.getValue());
    }
}
class A {
    private int value;
    public void setValue(int x) {
        value = x;
    }
    public int getValue() {
        return value;
    }
}