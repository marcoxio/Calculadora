
package logica;

public class operaciones {
    
    
    public static String sumar (int num1, int num2){
        return Integer.toString(num1+num2);
    }
    
    public static String restar (int num1, int num2){
        return Integer.toString(num1-num2);
    }
    
    public static String multiplicar (int num1, int num2){
        return Integer.toString(num1*num2);
    }
    
    public static String dividir(int num1, int num2) {
        if (num2 == 0) {
            return "La division por 0, no esta permitida";
        } else {
            return Integer.toString(num1 / num2);
        }
    }
}
