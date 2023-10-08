import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Asignatura {
    //atributos
    private String nombre;
    private int clave;
    private int creditos;
    //constructor
    /**
     * Constructor para crear un nuevo objeto Asignatura.
     *
     * @param nombre   Nombre de la asignatura.
     * @param clave    Clave de la asignatura.
     * @param creditos Creditos de la asignatura.
     */
    public Asignatura(String nombre, int clave, int creditos) {
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public int getClave() {
        return clave;
    }
    public int getCreditos() {
        return creditos;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    //sobreescritura del método toString
    /**
     * Devuelve una representación en cadena de caracteres de la asignatura.
     *
     * @return Cadena de caracteres con la información de la asignatura.
     */
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", clave=" + clave + ", creditos=" + creditos + '}';
    }

    //ordenamiento por CLAVE ASIG
    /**
     * Ordena una lista de asignaturas por su clave.
     *
     * @param listAsig Lista de asignaturas que se ordenará.
     */
    public static void sortClave(LinkedList<Asignatura> listAsig){
        listAsig.sort(Comparator.comparingInt(Asignatura::getClave));
    }
    public static void asigInicial(LinkedList<Asignatura> listAsig){
        listAsig.add(new Asignatura("Probabilidad", 1436, 8));
        listAsig.add(new Asignatura("EDA II", 1317, 10));
        listAsig.add(new Asignatura("POO", 1323, 10));
        listAsig.add(new Asignatura("Ecuaciones Diferenciales", 1325, 8));
        listAsig.add(new Asignatura("Calculo Integral", 1221, 8));
        listAsig.add(new Asignatura("Calculo Vectorial", 1321, 8));
    }
    /**
     * Imprime la lista de asignaturas.
     *
     * @param asig Lista de asignaturas a imprimir.
     */
    public static void printAsig(Asignatura asig){
        System.out.println("- - - - - - - - - - - - - - - - - - -\n > NOMBRE: "+asig.getNombre());
        System.out.println(" > CLAVE: "+asig.getClave()+ "\n > CREDITOS: "+ asig.getCreditos());
        System.out.println("- - - - - - - - - - - - - - - - - - -");            System.out.println();
    }

    /**
     * añaide una asignatura a la lista de asignaturas
     * @param sc Scanner para leer datos de entrada.
     * @return Asignatura creada.
     */
    public static Asignatura anadirAsig(Scanner sc){
        System.out.print("\n > NOMBRE: ");
        String nombre = sc.nextLine();

        System.out.print(" > CLAVE: ");
        int clave = sc.nextInt();

        System.out.print(" > CREDITOS: ");
        int creds = sc.nextInt();

        return new Asignatura(nombre, clave, creds);
    }
    /**
     *
     * Modifica una asignatura de la lista de asignaturas.
     *
     * @param listAsig Lista de asignaturas.
     * @param asig Asignatura a modificar.
     */
    public static void modifAsig(LinkedList<Asignatura> listAsig, Asignatura asig){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n > NOMBRE: ");
        String nombre = sc.nextLine();
        asig.setNombre(nombre);

        System.out.print(" > CLAVE: ");
        int clave = sc.nextInt();
        asig.setClave(clave);

        System.out.print(" > CREDITOS: ");
        int creds = sc.nextInt();
        asig.setCreditos(creds);

        Asignatura.sortClave(listAsig);
    }

}
