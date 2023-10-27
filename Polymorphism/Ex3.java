package Polymorphism;

public class Ex3 {
    public static void main(String[] args) {
    A a = new A();
    a.add();
    a.add(30,40);
    a.add("Boot","coding");
    }
}
class A {
    void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    void add(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }

    void add(String s, String p) {
        String q = s + p;
        System.out.println(q);
    }
}


