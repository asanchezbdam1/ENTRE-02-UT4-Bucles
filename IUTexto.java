import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - 
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        char opcion = ' ';
        do {
            System.out.println('\u000C');
            System.out.print("Teclee número1: ");
            int n1 = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Teclee número2: ");
            int n2 = teclado.nextInt();
            teclado.nextLine();
            if (comprobacion(n1, n2)) {
                System.out.println("--------------------------");
                System.out.printf("%21d\n%21d\n%13s%8d\n",
                    n1, n2, "Suma octal:", calculadora.sumarEnOctal(n1, n2));
            }
            System.out.print("¿Desea hacer otra suma en octal? (S / s): ");
            opcion = teclado.nextLine().charAt(0);
        } while (opcion == 'S' || opcion == 's');

    }
    /**
     * Comprueba que se han introducido números correctos
     */
    private boolean comprobacion(int n1, int n2)
    {
        if (Utilidades.contarCifras(n1) != Utilidades.contarCifras(n2)) {
            System.out.println("No tienen el mismo nº de cifras");
            return false;
        }
        else if (!Utilidades.estaEnOctal(n1) || !Utilidades.estaEnOctal(n2)) {
            System.out.println("Alguno de los números no está en octal");
            return false;
        }
        return true;
    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        System.out.println("¿Altura de la figura? (1-10) ");
        int n = teclado.nextInt();
        teclado.nextLine();
        while (!(n > 1 && n < 10)) {
            System.out.println("Error, ¿altura de la figura? (1-10) ");
            n = teclado.nextInt();
            teclado.nextLine();
        }
        pintor.dibujarFigura(n);
    }

}
