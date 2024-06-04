import java.util.function.BiFunction;

public class Operacion {
    /*int a ; atributo primitivo
    Student s; //Tipo de dato compuesto o basado en clases*/
    BiFunction<Integer, Integer, Integer> op; //Variable que pueda soportar funciones
    Operacion(BiFunction<Integer, Integer, Integer> o){
        op=o;
    }
    Integer ejecutar (Integer a, Integer b){
        return op.apply(a,b);
    }
}
