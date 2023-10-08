import java.util.LinkedList;
//import java.util.List;

/**
 *
 * @author grecia
 *
 * La clase BusquedaBinaria proporciona métodos para realizar búsquedas binarias en listas de alumnos y asignaturas.
 */
public class BusquedaBinaria {

    //método que devuelve verdadero si la clave se encuentra en la lista y falso en caso contrario.
    public static boolean binSearchAluBool(LinkedList<Alumno> listAlum, String identificador, int modo) {
        Alumno.sortAluNombre(listAlum);
        int l = 0;
        int r = listAlum.size() - 1;
    
        while (l <= r) {
            int mid = l + (r - l) / 2;
            Alumno alumVisitado = listAlum.get(mid);
            String[] datosAlum = new String[2];
            datosAlum[0] = alumVisitado.getNombre();
            datosAlum[1] = alumVisitado.getApellidos();
    
            int ordenDeComparacion = identificador.compareToIgnoreCase(datosAlum[modo]);
    
            if (ordenDeComparacion == 0) {
                return true; // Se encontró una coincidencia
            } else if (ordenDeComparacion == 1) {
                l = mid + 1;
            }   else {
                r = mid - 1;
            }
        }
        return false;
    }
    /**
     * Busca una asignatura en una lista de asignaturas por su clave.
     * @param listAsig Lista de asignaturas en la que se realizará la búsqueda.
     * @param clave    Clave de la asignatura que se está buscando.
     * @return La asignatura encontrada o null si no se encuentra.
     */
    @SuppressWarnings("JavadocReference")
    public static boolean binSearchAluBool(LinkedList<Alumno> listAlum, String nombres, String apellidos) {
        Alumno.sortAluNombre(listAlum);
        int izq = 0;
        int der = listAlum.size() - 1;
        String nombreCompletoBuscar = apellidos + " " + nombres;

        while (izq <= der) {
            int medio = izq + (der - izq) / 2;

            Alumno alumVisitado = listAlum.get(medio);
            String nombreCompletoVisitado = alumVisitado.getApellidos() + " " + alumVisitado.getNombre();
            int ordenDeComparacion = nombreCompletoBuscar.compareToIgnoreCase(nombreCompletoVisitado);

            if (ordenDeComparacion == 0) {
                return true;
            } else if (ordenDeComparacion == 1) {
                izq = medio + 1;
            }   else {
                der = medio - 1;
            }
        }
        return false;
    }
    /**
     * Busca una asignatura en una lista de asignaturas por su clave.
     * @param listAsig Lista de asignaturas en la que se realizará la búsqueda.
     * @param clave    Clave de la asignatura que se está buscando.
     * @return La asignatura encontrada o null si no se encuentra.
     */
    public static boolean binSearchBool(LinkedList<Asignatura> listAsig, int clave){
        Asignatura.sortClave(listAsig);
        int l=0;
        int r= listAsig.size()-1;
        
        while(l<=r){
            int mid = l+(r-l)/2;

            if(listAsig.get(mid).getClave() == clave){
                return true; 
            }else if(listAsig.get(mid).getClave() > clave){
                r= mid-1;
            } else {
                l= mid+1;
            }
        }
        return false;
    }

    //METODOS QUE DEVUELVEN EL OBJETO
    /**
     * Busca una asignatura en una lista de asignaturas por su clave.
     * @param listAsig Lista de asignaturas en la que se realizará la búsqueda.
     * @param clave    Clave de la asignatura que se está buscando.
     * @return La asignatura encontrada o null si no se encuentra.
     */
    public static Asignatura busquedaBinaria(LinkedList<Asignatura> listAsig, int clave) {
        Asignatura.sortClave(listAsig);
        int izq = 0;
        int der = listAsig.size() - 1;

        while (izq <= der) {
            int medio = izq + (der - izq) / 2;

            Asignatura AsigVisitada = listAsig.get(medio); 
            if (AsigVisitada.getClave() == clave) {
                return AsigVisitada;
            } else if (AsigVisitada.getClave() < clave) {
                izq = medio + 1;
            }   else {
                der = medio - 1;
            }
        }
        return null;
    }
    /**
     * Busca un alumno en una lista de alumnos por nombres y apellidos.
     * @param listAlum   Lista de alumnos en la que se realizará la búsqueda.
     * @param nombres    Nombres del alumno que se está buscando.
     * @param apellidos  Apellidos del alumno que se está buscando.
     * @return El alumno encontrado o null si no se encuentra.
     */
    public static Alumno busquedaBinariAlumno(LinkedList<Alumno> listAlum, String nombres, String apellidos) {
        Alumno.sortAluNombre(listAlum);
        int izq = 0;
        int der = listAlum.size() - 1;
        String nombreCompletoBuscar = apellidos + " " + nombres;

        while (izq <= der) {
            int medio = izq + (der - izq) / 2;

            Alumno alumVisitado = listAlum.get(medio);
            String nombreCompletoVisitado = alumVisitado.getApellidos() + " " + alumVisitado.getNombre();
            int ordenDeComparacion = nombreCompletoBuscar.compareToIgnoreCase(nombreCompletoVisitado);

            if (ordenDeComparacion == 0) {
                return alumVisitado;
            } else if (ordenDeComparacion == 1) {
                izq = medio + 1;
            }   else {
                der = medio - 1;
            }
        }
        return null;
    }
    /**
     * Busca un alumno en una lista de alumnos por identificador (nombres o apellidos).
     * @param listAlum       Lista de alumnos en la que se realizará la búsqueda.
     * @param identificador  Identificador (nombres o apellidos) del alumno que se está buscando.
     * @return El alumno encontrado o null si no se encuentra.
     */
    public static Alumno busquedaBinariAlumno(LinkedList<Alumno> listAlum, String identificador, int modo) {
        Alumno.sortAluNombre(listAlum);
        int l = 0;
        int r = listAlum.size() - 1;
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            Alumno alumVisitado = listAlum.get(mid);
            String[] datosAlum = new String[2];
            datosAlum[0] = alumVisitado.getNombre();
            datosAlum[1] = alumVisitado.getApellidos();

            int ordenDeComparacion = identificador.compareToIgnoreCase(datosAlum[modo]);

            if (ordenDeComparacion == 0) {
                return alumVisitado;
            } else if (ordenDeComparacion == 1) {
                l = mid + 1;
            }   else {
                r = mid - 1;
            }
        }
        return null;
    }
    //método que devuelve apariciones e indices de la clave en la lista
    public static void aparicionAlu(LinkedList<Alumno> listAlu, String nombre){
        Alumno.sortAluNombre(listAlu);
        LinkedList<Integer> index = new LinkedList<>();
        int l=0;
        int r= listAlu.size()-1;
        int cont = 0;
        
        while(l<=r){
            int mid = l+(r-l)/2;
            String aluMid = listAlu.get(mid).getNombre().toLowerCase();

            if(aluMid.equalsIgnoreCase(nombre)){
                index.add(mid);
                cont++;
                
                int le = mid-1;
                while (le>= 0 && listAlu.get(le).getNombre().equalsIgnoreCase(nombre)) {
                    index.add(le);
                    le--;
                    cont++;
                }
                int ri = mid+1;
                while(ri< listAlu.size() && listAlu.get(ri).getNombre().equalsIgnoreCase(nombre)){
                    index.add(ri);
                    ri++;
                    cont++;
                }

                //chequeo de apariciones para comodar el mensaje
                if(cont>1)
                    System.out.println("\nSe han encontrado "+cont+" resultados coincidentes . . .");
                else
                    System.out.println("Se encontro 1 resultado coincidente.");
                
                //IMPRESION DE CADA ALUMNO COINCIDENTE
                for(Integer alu : index){
                    System.out.println("En la posicion no. "+ alu +". . .");
                    Alumno.printAlu(listAlu.get(alu));
                }
                break;
            }else if(aluMid.compareToIgnoreCase(nombre) > 0){
                r= mid-1;
            } else {
                l= mid+1;
            }
        }

        if(index.isEmpty()){
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
        Asignatura.sortClave(listAsig);
        LinkedList<Integer> index = new LinkedList<>();
        int l=0;
        int r= listAsig.size()-1;
        int cont = 0;
        
        while(l<=r){
            int mid = l+(r-l)/2;
            int claveMid = listAsig.get(mid).getClave();

            if(claveMid == clave){
                index.add(mid);
                cont++;
                
                int le = mid-1;
                while (le>= 0 && listAsig.get(le).getClave() == clave) {
                    index.add(le);
                    le--;
                    cont++;
                }
                int ri = mid+1;
                while(ri< listAsig.size() && listAsig.get(ri).getClave() == clave){
                    index.add(ri);
                    ri++;
                    cont++;
                }

                //chequeo de apariciones para comodar el mensaje
                if(cont>1)
                    System.out.println("\nSe han encontrado "+cont+" resultados coincidentes . . .");
                else
                    System.out.println("Se encontro 1 resultado coincidente.");
                
                //IMPRESION DE CADA ASIGNATURA COINCIDENTE
                for(Integer asig : index){
                    System.out.println("En la posicion no. "+ asig +". . .");
                    Asignatura.printAsig(listAsig.get(asig));
                }
                break;
            }else if(claveMid > clave){
                r= mid-1;
            } else {
                l= mid+1;
            }
        }

        if(index.isEmpty()){
            System.out.println("\n\tNo se encontraron resultados coincidentes.");
        }
    }

}
