// Java Program to demonstrate
// BiFunction's apply() method

// import java.util.function.BiFunction; // Remove the unused import statement

public class App {
    public static void main(String args[])
    {
        /*
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println("Sum = " + add.apply(2, 3));

        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        System.out.println("Product = " + multiply.apply(2, 3));
        */
        Operacion o=new Operacion((a,b)->a*b);
        o.ejecutar(10, 20);
        System.out.println("El resultado es : " +o.ejecutar(10, 20));      
    }
}
