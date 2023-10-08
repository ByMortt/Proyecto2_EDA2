import java.util.Collections;
import java.util.Comparator;
//import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class Alumno {
    //atributos
    private String nombre;
    private String apellidos;
    private String numeroCuenta;
    private String carrera;
    private int edad;
    private double Promedio;

    //constructor
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
    @Override
    public String toString() {
        return "\n- - - - - - - - - - - - - - -\n > NOMBRE: " + apellidos + nombre + "\n > NO. DE CUENTA: " + numeroCuenta + "\n > CARRERA: " + carrera + "\n > EDAD: " + edad + "\n > PROMEDIO: " + Promedio + '}';
    }

    //ordenamiento de lista alumnos por NOMBRE 
    public static void sortAluNombre(LinkedList<Alumno> listAlu){
        Collections.sort(listAlu, new Comparator<Alumno>(){
            @Override
            public int compare(Alumno alu1, Alumno alu2){
                String name1 = alu1.getNombre().toLowerCase();
                String name2 = alu2.getNombre().toLowerCase();
                return name1.compareTo(name2);
            }
        });
    }

    public static void aluInicial(LinkedList<Alumno> listAlu){
        listAlu.add(new Alumno("Oscar Abraham", "de la Cruz Lopez", "313311115", "Ingenieria en Computacion", 0, 0.0));
        listAlu.add(new Alumno("Grecia", "Meneses Calderas", "320254361", "Ingenieria en Computacion", 19, 9.7));
        listAlu.add(new Alumno("Jesus Yael", "Caballero Antunez", "324151231", "Ingenieria en Computacion", 19, 0.0));
        listAlu.add(new Alumno("Arturo", "Contreras", "412012988", "Ingenieria Ambiental", 21, 0));
        listAlu.add(new Alumno("Grecia", "Molina Roldan", "452101698", "Ingenieria en Computacion", 18, 0.0));
    }

    public static Alumno anadirAlu(LinkedList<Alumno> listAlu, Scanner sc){
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

        Alumno alu = new Alumno(nombre, ape, noCuenta, carr, edad, prom);
        return alu;
    }

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

    public static void printAlu(Alumno alu){
        System.out.println("- - - - - - - - - - - - - - - - - - -\n > NOMBRE: "+alu.getApellidos().toUpperCase() +" "+alu.getNombre().toUpperCase());
        System.out.println(" > NO. DE CUENTA: "+alu.getNumeroCuenta()+ "\n > CARRERA: "+ alu.getCarrera());
        System.out.println(" > EDAD: "+alu.getEdad()+"\n > PROMEDIO: "+alu.getPromedio());
        System.out.println("- - - - - - - - - - - - - - - - - - -"); System.out.println();
    } 

}