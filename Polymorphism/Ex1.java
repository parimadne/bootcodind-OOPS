package Polymorphism;

public class Ex1 {
    public static void main(String[] args) {
        Magic m = new Magic();
        Jio j = new Jio();
        Airtel airtel = new Airtel();
        VI v = new VI();
        m.print(airtel);
        m.print(v);
        m.print(j);
    }
}
abstract class Sim{
    abstract void intialize();
}
class Airtel extends Sim{
    void intialize(){
        System.out.println("Airtel sim initialize");
    }
}
class VI extends Sim{
    void intialize(){
        System.out.println("VI sim initialize");
    }
}
class Jio extends Sim{
    void intialize(){
        System.out.println("Jio sim initialised");
    }
}
class Magic{
    public void print(Sim sim){
        System.out.println("Start");
        System.out.println("Sim initialize");
        System.out.println("End");
    }
}

