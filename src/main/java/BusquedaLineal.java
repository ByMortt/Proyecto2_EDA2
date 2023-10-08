import java.util.LinkedList;
//import java.util.List;

/**
 *
 * @author edaII06alu10
 */
public class BusquedaLineal {
    
    public static Asignatura getAsignatura(LinkedList<Asignatura> listAsig, int clave) {
        for(Asignatura asig : listAsig) {
            if(asig.getClave() == clave) {
                return asig;
            }
        }
        return null;
    }

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
