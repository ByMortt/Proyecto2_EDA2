public class Alumno {
    //atributos
    private String nombre;
    private String apellidos;
    private String numeroCuenta;
    private int edad;
    private int Promedio;
    private Asignatura asignatura;
    //constructor
    public Alumno(String nombre, String apellidos, String numeroCuenta, int edad, int Promedio, Asignatura asignatura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroCuenta = numeroCuenta;
        this.edad = edad;
        this.Promedio = Promedio;
        this.asignatura = asignatura;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public int getEdad() {
        return edad;
    }
    public int getPromedio() {
        return Promedio;
    }
    public Asignatura getAsignatura() {
        return asignatura;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPromedio(int Promedio) {
        this.Promedio = Promedio;
    }
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    //sobreescritura del método toString
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", numeroCuenta=" + numeroCuenta + ", edad=" + edad + ", Promedio=" + Promedio + ", asignatura=" + asignatura + '}';
    }
}
