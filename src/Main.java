import modelo.*;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    // variables globales
    static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream salida = System.out;
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Animal> animales = new ArrayList<>();
    private static ArrayList<Avistamiento> avistamientos = new ArrayList<>();
    private static ArrayList<ObjParaObservacion> accesorios = new ArrayList<>();
    private static ArrayList<Direccion> direcciones = new ArrayList<>();

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
        rellenarAccesorios();
        rellenarDirecciones();
        do {
            mostrarMenu();
            opcion = seleccionarOpcion();
            procesarOpcion(opcion);
        }while (opcion !=0);
    }
    private static void mostrarMenu() {
        mostrarTexto("\n   Las opciones a escoger son: ");
        mostrarTexto("1. Registrar Administrador");
        mostrarTexto("2. Registrar Observador Extranjero");
        mostrarTexto("3. Registrar Observador Costarricense");
        mostrarTexto("4. Registrar Ave");
        mostrarTexto("5. Registrar Mamifero");
        mostrarTexto("6. Registrar Avistamiento");
        mostrarTexto("7. Listar Todo: Usuarios, Animales y Avistamientos");
        mostrarTexto("0. Salir del programa");
    }
    private static int seleccionarOpcion() throws IOException {
        mostrarTexto("Por favor indicar con numero la opcion deseada");
        return Integer.parseInt(leerTexto());
    }
    private static void procesarOpcion(int opcion) throws IOException {
        switch (opcion){
            case 0:
                mostrarTexto("Adios, vuelva pronto");
                break;
            case 1:
                mostrarTexto("Escogio la opcion 1 Registrar Administrador");
                registrarAdministrador();
                break;
            case 2:
                mostrarTexto("Escogio la opcion 2 Registrar Observador Extranjero");
                registrarObsExtranjero();

                break;
            case 3:
                mostrarTexto("Escogio la opcion 3 Registrar Observador Costarricense");
                registrarObsLocal();
                break;
            case 4:
                mostrarTexto("Escogio la opcion 4 Registrar Ave");
                registrarAve();
                break;
            case 5:
                mostrarTexto("Escogio la opcion 5 Registrar Mamifero");
                //registrarMamifero();
                break;
            case 6:
                mostrarTexto("Escogio la opcion 6 Registrar Avistamiento");
                //registrarAvistamiento();
                break;
            case 7:
                mostrarTexto("Escogio la opcion 7 Listar Todo: Usuarios, Animales y Avistamientos");
                listarTodo();
                break;
            default:
                mostrarTexto("Opcion invalida por favor confirme la opcion deseada");
                break;
        }
    }

    private static void registrarAve() {
    }

    public static void registrarAdministrador() throws IOException {
        mostrarTexto("ingrese email");
        String email = leerTexto();
        mostrarTexto("ingrese contraseña");
        String contrasenia = leerTexto();
        mostrarTexto("ingrese departamento");
        String departamento = leerTexto();
        Adm tmpAdm = new Adm(email, contrasenia, departamento);
        usuarios.add(tmpAdm);
        mostrarTexto("usuario Adm registrado");
    }
    public static void registrarObsExtranjero(){
        ObjParaObservacion accesorio = accesorios.get(3);
        ObsExtrajero tempExtranjero = new ObsExtrajero("otro@pais.com","789","Smith",accesorio,"Canada");
        mostrarTexto("Extranjero registrado");
    }
    private static void registrarObsLocal() throws IOException {
        mostrarTexto("ingrese email");
        String email = leerTexto();
        mostrarTexto("ingrese contraseña");
        String contrasenia = leerTexto();
        mostrarTexto("ingrese nombre");
        String nombre = leerTexto();
        mostrarTexto("ingrese el numero correspondiente al accesorio");
        for (int i = 0; i < accesorios.size(); i++) {
            mostrarTexto("accesorio # "+String.valueOf(i+1)+" es: "+accesorios.get(i).toString());
        }
        int posicion = Integer.parseInt(leerTexto())-1;
        ObjParaObservacion accesorio = accesorios.get(posicion);
        mostrarTexto("ingrese ocupacion");
        String ocupacion = leerTexto();
        mostrarTexto("Ingrese el número corresponde a direccion");
        for (int i = 0; i < direcciones.size(); i++) {
            mostrarTexto("dirección numero # :"+ String.valueOf(i+1)+" es: "+direcciones.get(i).toString());
        }
        int posDir = Integer.parseInt(leerTexto())-1;
        Direccion direccion = direcciones.get(posDir);
        Usuario tmpUsuario = new ObsLocal(email,contrasenia, nombre,accesorio,ocupacion,direccion);
        usuarios.add(tmpUsuario);
        Usuario otroUsuario = new ObsLocal("otro@usu.com","456","Lucas",accesorios.get(2),"Guia Turista",direcciones.get(2));
        usuarios.add(otroUsuario);
    }
    private static void listarTodo() {
        mostrarTexto("\nLos Usuarios");
        for (int i = 0; i <usuarios.size() ; i++) {
            System.out.println(usuarios.get(i));
        }
        mostrarTexto("\nLos Animales");
        for (int i = 0; i < animales.size() ; i++) {
            mostrarTexto(animales.get(i).toString());
        }
        mostrarTexto("\nLos Avistamientos");
        for (int i = 0; i < avistamientos.size() ; i++) {
            salida.println(avistamientos.get(i).toString());
        }
        mostrarTexto("\nLos Acessorios");
        for (int i = 0; i < accesorios.size(); i++) {
            mostrarTexto("accesorio "+i+1+" es: "+accesorios.get(i).toString());
        }
    }
    private static void rellenarAccesorios() {
        accesorios.add(new ObjParaObservacion("n/a"));
        accesorios.add(new ObjParaObservacion("Monóculo"));
        accesorios.add(new ObjParaObservacion("Binocular"));
        accesorios.add(new ObjParaObservacion("Cámara"));
    }
    private static void rellenarDirecciones() {
        direcciones.add(new Direccion("Guanacaste", "Cañas", "Javilla", "finca"));
        direcciones.add(new Direccion("Heredia", "Heredia", "Ulloa", "Cariari"));
        direcciones.add(new Direccion("Cartago", "Paraiso", "Cachi","llanura"));
    }


}// fin clase main