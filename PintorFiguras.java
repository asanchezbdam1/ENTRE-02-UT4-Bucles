
/**
 *  Clase que dibuja una figura 
 * 
 * @author - 
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';


    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public void dibujarFigura(int altura) {
        for (int i = 1; i <= altura; i++) {
            int espacios = (altura - i) * ANCHO_BLOQUE / 2;
            for (int j = 0; j < espacios; j++) {
                System.out.print(ESPACIO);
            }
            
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < ANCHO_BLOQUE; k++) {
                    if (j % 2 == 0) {
                        System.out.print(CAR1);
                    }
                    else {
                        System.out.print(CAR2);
                    }
                }
            }
            System.out.println();
        }
    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
         

    }
}
