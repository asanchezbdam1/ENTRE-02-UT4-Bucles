
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - 
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int cifra = 0;
        int i = 0;
        int res = 0;
        int aux = 0;
        while (n1 > 0) {
            cifra += n1 % 10 + n2 % 10 + aux;
            n1 /= 10;
            n2 /= 10;
            res += cifra % 8 * (int) Math.pow(10, i++);
            if (n1 == 0) {
                res += cifra / 8 * (int) Math.pow(10, i);
            }
            cifra /= 8;
        }
        return res;
    }
    
    
}
