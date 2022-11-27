import modelo.Animal;
import modelo.Avistamiento;
import modelo.Usuario;

import java.io.*;
import java.util.ArrayList;

public class Main {

    // variables globales
    static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream salida = System.out;
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Animal> animales = new ArrayList<>();
    private ArrayList<Avistamiento> avistamientos = new ArrayList<>();

    // metodos utilitarios mostrar y leer
    static String leerTexto()throws IOException{
        return entrada.readLine();
    }
    static void mostrarTexto(String msj){
        salida.println(msj);
    }


    public static void main(String[] args) throws IOException {
        mostrarTexto("\n*** Bienvenido al sistema registro de avistamiento de fauna ***");
        int opcion = -1;
        do {
            mostrarMenu();
            opcion = seleccionarOpcion();
            procesarOpcion(opcion);
        }while (opcion !=0);
    }
    private static void mostrarMenu() {
        mostrarTexto("   Las opciones a escoger son: ");
        mostrarTexto("1. Registrar algo");
        mostrarTexto("2. Imprimir algo");
        mostrarTexto("3. Borrar algo");
        mostrarTexto("0. Salir del programa");
    }
    private static int seleccionarOpcion() throws IOException {
        mostrarTexto("Por favor indicar con numero la opcion deseada");
        return Integer.parseInt(leerTexto());
    }
    private static void procesarOpcion(int opcion) {
        switch (opcion){
            case 0:
                mostrarTexto("Adios, vuelva pronto");
                break;
            case 1:
                mostrarTexto("Escogio la opcion 1 registrar");
                break;
            case 2:
                mostrarTexto("Escogio la opcion 2 imprimir o listar");
                break;
            case 3:
                mostrarTexto("Escogio la opcion 3 borrar");
                break;
            default:
                mostrarTexto("Opcion invalida por favor confirme la opcion deseada");
                break;
        }
    }


}// fin clase main