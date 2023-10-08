import java.util.LinkedList;
//import java.util.List;

/*

  @author edaII06alu10
 */

/**
 * La clase BusquedaLineal proporciona métodos para realizar búsquedas lineales en listas de alumnos y asignaturas.
 */
@SuppressWarnings("ALL")
public class BusquedaLineal {
    /**
     * Busca una asignatura en una lista de asignaturas por su clave.
     *
     * @param listAsig Lista de asignaturas en la que se realizará la búsqueda.
     * @param clave    Clave de la asignatura que se está buscando.
     * @return La asignatura encontrada o null si no se encuentra.
     */
    public static Asignatura getAsignatura(LinkedList<Asignatura> listAsig, int clave) {
        for(Asignatura asig : listAsig) {
            if(asig.getClave() == clave) {
                return asig;
            }
        }
        return null;
    }
    /**
     * Busca un alumno en una lista de alumnos por nombres y apellidos.
     *
     * @param listAlum   Lista de alumnos en la que se realizará la búsqueda.
     * @param nombres    Nombres del alumno que se está buscando.
     * @param apellidos  Apellidos del alumno que se está buscando.
     * @return El alumno encontrado o null si no se encuentra.
     */
    public static Alumno getAlumno(LinkedList<Alumno> listAlum, String nombres, String apellidos) {
        String nombreCompletoBuscado = apellidos + " " + nombres;
        for(Alumno alu : listAlum) {
            String nombreCompletoVisitado = alu.getApellidos() + " " + alu.getNombre();
            if(nombreCompletoBuscado.equalsIgnoreCase(nombreCompletoVisitado)) {
                return alu;
            }
        }
        return null;
    }
    /**
     * Busca un alumno en una lista de alumnos por identificador (nombres o apellidos).
     *
     * @param listAlum       Lista de alumnos en la que se realizará la búsqueda.
     * @param identificador  Identificador (nombres o apellidos) del alumno que se está buscando.
     * @return El alumno encontrado o null si no se encuentra.
     */
    public static Alumno getAlumno(LinkedList<Alumno> listAlum, String identificador) {
        for(Alumno alu : listAlum) {
            String nombres = alu.getNombre();
            String apellidos = alu.getApellidos();
            if(identificador.equalsIgnoreCase(nombres) || identificador.equalsIgnoreCase(apellidos)) {
                return alu;
            }
        }
        return null;
    }
    /**
     * Realiza una búsqueda booleana en una lista de alumnos por nombres y apellidos.
     *
     * @param listAlum   Lista de alumnos en la que se realizará la búsqueda.
     * @param nombres    Nombres del alumno que se está buscando.
     * @param apellidos  Apellidos del alumno que se está buscando.
     * @return true si se encuentra al menos un alumno con los nombres y apellidos, false si no se encuentra.
     */
    public static boolean linSearchBool(LinkedList<Alumno> listAlum, String identificador){
        for(Alumno alu : listAlum) {
            String nombres = alu.getNombre();
            String apellidos = alu.getApellidos();
            if(identificador.equalsIgnoreCase(nombres) || identificador.equalsIgnoreCase(apellidos)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Realiza una búsqueda booleana en una lista de asignaturas por su clave.
     *
     * @param listAsig Lista de asignaturas en la que se realizará la búsqueda.
     * @param clave    Clave de la asignatura que se está buscando.
     * @return true si se encuentra al menos una asignatura con la clave, false si no se encuentra.
     */
    public static boolean linSearchBool(LinkedList<Alumno> listAlum, String nombres, String apellidos){
        String nombreCompletoBuscado = apellidos + " " + nombres;
        for(Alumno alu : listAlum) {
            String nombreCompletoVisitado = alu.getApellidos() + " " + alu.getNombre();
            if(nombreCompletoBuscado.equalsIgnoreCase(nombreCompletoVisitado)) {
                return true;
            }
        }
        return false;
    }

    public static boolean linSearchBool(LinkedList<Asignatura> listAsig, int clave){
        for(Asignatura asig : listAsig) {
            if(asig.getClave() == clave) {
                return true;
            }
        }
        return false;
    }
    /**
     * Imprime la aparición de alumnos con un nombre dado en la lista de alumnos.
     *
     * @param listAlu Lista de alumnos en la que se buscará el nombre.
     * @param nombre  Nombre de los alumnos que se están buscando.
     */
    public static void aparicionAlu(LinkedList<Alumno> listAlu, String nombre){
        LinkedList<Integer> index = new LinkedList<>();
        int cont = 0;
    
        for(int i=0; i<listAlu.size(); i++){
            String aluNombre = listAlu.get(i).getNombre().toLowerCase();
            
            if(aluNombre.equalsIgnoreCase(nombre)){
                index.add(i);
                cont++;
            }
        }
        //Verificando contador
        if(cont > 0){
            System.out.println("\nSe han encontrado "+ cont +" resultado(s) coincidente(s) . . .");
            
            // Imprimir cada resultado
            for(Integer alu : index){
                System.out.println("\nEn la posicion no. " + alu + ". . .");
                Alumno.printAlu(listAlu.get(alu));
            }
        } else {
            System.out.println("\n\tNo se encontraron resultados coincidentes.");
        }
    }
    /**
     * Imprime la aparición de asignaturas con una clave dada en la lista de asignaturas.
     *
     * @param listAsig Lista de asignaturas en la que se buscará la clave.
     * @param clave    Clave de las asignaturas que se están buscando.
     */
    public static void aparicionClave(LinkedList<Asignatura> listAsig, int clave){
        LinkedList<Integer> index = new LinkedList<>();
        int cont = 0;
    
        for(int i=0; i< listAsig.size(); i++){
            if(listAsig.get(i).getClave() == clave){
                index.add(i);
                cont++;
            }
        }
        //Verificando contador
        if(cont > 0){
            System.out.println("\nSe han encontrado "+ cont +" resultado(s) coincidente(s) . . .");
            // Imprimir cada resultado
            for(Integer asig : index){
                System.out.println("\nEn la posicion no. " + asig + ". . .");
                Asignatura.printAsig(listAsig.get(asig));
            }
        } else {
            System.out.println("\n\tNo se encontraron resultados coincidentes.");
        }
    }

}
