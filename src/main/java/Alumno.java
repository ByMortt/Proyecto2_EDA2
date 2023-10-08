import java.util.LinkedList;
import java.util.Scanner;
/**
 * La clase Alumno representa a un estudiante con información relacionada.
 */
public class Alumno {
    //atributos
    private String nombre;
    private String apellidos;
    private String numeroCuenta;
    private String carrera;
    private int edad;
    private double Promedio;

    //constructor
    /**
     * Constructor para crear un nuevo objeto Alumno.
     *
     * @param nombre       Nombre del alumno.
     * @param apellidos    Apellidos del alumno.
     * @param numeroCuenta Número de cuenta del alumno.
     * @param carrera      Carrera del alumno.
     * @param edad         Edad del alumno.
     * @param Promedio     Promedio del alumno.
     */
    public Alumno(String nombre, String apellidos, String numeroCuenta, String carrera, int edad, double Promedio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.edad = edad;
        this.Promedio = Promedio;
    }

    //metodos getters
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public String getCarrera(){
        return carrera;
    }
    public int getEdad() {
        return edad;
    }
    public double getPromedio() {
        return Promedio;
    }

    //metodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }


    //sobreescritura del método toString
    /**
     * Sobreescritura del método toString para obtener una representación en cadena del objeto Alumno.
     *
     * @return Representación en cadena del objeto Alumno.
     */
    @Override
    public String toString() {
        return "\n- - - - - - - - - - - - - - -\n > NOMBRE: " + apellidos + nombre + "\n > NO. DE CUENTA: " + numeroCuenta + "\n > CARRERA: " + carrera + "\n > EDAD: " + edad + "\n > PROMEDIO: " + Promedio + '}';
    }

    //ordenamiento de lista alumnos por NOMBRE
    /**
     * Ordena una lista de alumnos por nombre de manera ascendente.
     *
     * @param listAlu Lista de alumnos a ordenar.
     */
    public static void sortAluNombre(LinkedList<Alumno> listAlu){
        listAlu.sort((alu1, alu2) -> {
            String name1 = alu1.getNombre().toLowerCase();
            String name2 = alu2.getNombre().toLowerCase();
            return name1.compareTo(name2);
        });
    }

    /**
     * Crea instancias iniciales de alumnos y las agrega a la lista.
     *
     * @param listAlu Lista donde se agregarán los alumnos iniciales.
     */
    public static void aluInicial(LinkedList<Alumno> listAlu){
        listAlu.add(new Alumno("Oscar Abraham", "de la Cruz Lopez", "313311115", "Ingenieria en Computacion", 0, 0.0));
        listAlu.add(new Alumno("Grecia", "Meneses Calderas", "320254361", "Ingenieria en Computacion", 19, 9.7));
        listAlu.add(new Alumno("Jesus Yael", "Caballero Antunez", "324151231", "Ingenieria en Computacion", 19, 0.0));
        listAlu.add(new Alumno("Arturo", "Contreras", "412012988", "Ingenieria Ambiental", 21, 0));
        listAlu.add(new Alumno("Grecia", "Molina Roldan", "452101698", "Ingenieria en Computacion", 18, 0.0));
    }
    /**
     * Crea una nueva instancia de Alumno a partir de la entrada del usuario.
     *
     * @param sc Scanner para leer la entrada del usuario.
     * @return Una nueva instancia de Alumno creada con los datos proporcionados por el usuario.
     */
    public static Alumno anadirAlu(Scanner sc){
        System.out.print("\n > NOMBRE: ");
        String nombre = sc.nextLine();

        System.out.print(" > APELLIDOS(s): ");
        String ape = sc.nextLine();

        System.out.print(" > NO. DE CUENTA: ");
        String noCuenta = sc.nextLine();

        System.out.print(" > CARRERA: ");
        String carr = sc.nextLine();

        System.out.print(" > EDAD: ");
        int edad = sc.nextInt();

        System.out.print(" > PROMEDIO: ");
        double prom = sc.nextDouble();

        return new Alumno(nombre, ape, noCuenta, carr, edad, prom);
    }
    /**
     * Modifica los datos de un alumno existente.
     *
     * @param listAlu Lista de alumnos donde se buscará y modificará el alumno.
     * @param alu     El objeto Alumno que se modificará.
     */
    public static void modifAlu(LinkedList<Alumno> listAlu, Alumno alu){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n > NOMBRE: ");
        String nombre = sc.nextLine();
        alu.setNombre(nombre);

        System.out.print(" > APELLIDOS(s): ");
        String ape = sc.nextLine();
        alu.setApellidos(ape);

        System.out.print(" > NO. DE CUENTA: ");
        String noCuenta = sc.nextLine();
        alu.setNumeroCuenta(noCuenta);

        System.out.print(" > CARRERA: ");
        String carr = sc.nextLine();
        alu.setCarrera(carr);

        System.out.print(" > EDAD: ");
        int edad = sc.nextInt();
        alu.setEdad(edad);

        System.out.print(" > PROMEDIO: ");
        double prom = sc.nextDouble();
        alu.setPromedio(prom);

        Alumno.sortAluNombre(listAlu);
    }
    /**
     * Imprime los datos de un alumno en la consola.
     *
     * @param alu El objeto Alumno cuyos datos se imprimirán.
     */
    public static void printAlu(Alumno alu){
        System.out.println("- - - - - - - - - - - - - - - - - - -\n > NOMBRE: "+alu.getApellidos().toUpperCase() +" "+alu.getNombre().toUpperCase());
        System.out.println(" > NO. DE CUENTA: "+alu.getNumeroCuenta()+ "\n > CARRERA: "+ alu.getCarrera());
        System.out.println(" > EDAD: "+alu.getEdad()+"\n > PROMEDIO: "+alu.getPromedio());
        System.out.println("- - - - - - - - - - - - - - - - - - -"); System.out.println();
    } 

}