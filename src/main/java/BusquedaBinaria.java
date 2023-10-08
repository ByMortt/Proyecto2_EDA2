import java.util.LinkedList;
//import java.util.List;

/**
 *
 * @author grecia
 */
public class BusquedaBinaria {
    public LinkedList<Integer> index = new LinkedList<>();
    
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


    //método que devuelve apariciones e indice
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
