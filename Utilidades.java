import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - 
 */
public class Utilidades
{

    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
        int i = 1;
        int cifra;
        while (n > 0) {
            cifra = n % 10;
            n /= 10;
            if (cifra > 7) {
                return false;
            }
        }
        return true;

    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        int cifras = 0;
        while (n > 0) {
            cifras++;
            n /= 10;
        }
        return cifras;

    }

    
}
