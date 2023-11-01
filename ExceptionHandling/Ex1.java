package ExceptionHandling;

public class Ex1 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println("The value: " + c);
        } catch (ArithmeticException e){
            System.out.println(e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("The End");
        int a =10,b=5;
        int c = a+b;
        System.out.println(c);
    }
}
