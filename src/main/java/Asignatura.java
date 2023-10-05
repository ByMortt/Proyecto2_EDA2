public class Asignatura {
    //atributos
    private String nombre;
    private int clave;
    private int creditos;
    //constructor
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
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", clave=" + clave + ", creditos=" + creditos + '}';
    }
}
