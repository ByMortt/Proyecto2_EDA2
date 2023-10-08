import java.util.LinkedList;
//import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaraciones e inicializaciones
        boolean ver = true, ver2 = true, ver3 = true;
        LinkedList<Alumno> listAlumnos = new LinkedList<>();
        LinkedList<Asignatura> listAsig = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        Alumno.aluInicial(listAlumnos);
        Asignatura.asigInicial(listAsig);

        //menu principal
        while(ver){
            ver2 = true;
            System.out.println("\n\t- - - DATOS ESCOLARES - - -\n"+
                                "Aqui podras encontrar datos académidos.\n"+
                                "\n\t1. Busqueda.\n\t2. Modificar datos.\n\t3. Registrar nuevos datos.\n\t4. Salir. ");
                                System.out.print("  > ");
            int opc = sc.nextInt();
            sc.nextLine();
            switch(opc){
                case 1->{
                    while(ver2){
                        System.out.println("\n^^^ Que estrategia de busqueda desea utilizar? ^^^"+
                                "\n\n\t1. Busqueda Lineal.\n\t   a1) Alumnado.\n\t   b1) Asignaturas.\n\n\t2. Busqueda Binaria.\n\t   a2) Alumnado.\n\t   b2) Asignaturas.\n\n\t3. Salir al menu principal.");
                                System.out.print("  > ");
                        String opc2 = sc.nextLine();
                        opc2 = opc2.toLowerCase();
                        ver3 = true;
                        switch(opc2){
                            case "a1"-> {// CASO BUSQUEDA LINEAL ALUMNO
                                while(ver3){
                                    System.out.println("\n\t^^^ Que desea saber? (ALUMNADO)^^^"+
                                    "\n\n\t1. Si se encuentra registrado.\n\t  a1) Buscar por nombre o apellido.\n\t  b1) Buscar por nombre completo.\n\n\t2. Los datos del alumno.\n" + //
                                            "\t  a2) Buscar por nombre o apellido.\n\t  b2) Buscar por nombre completo.\n\n\t3. Apariciones del alumno (solamente nombre).\n\n\t4. Salir al menu anterior."); System.out.print("  > ");
                                    String opc3 = sc.nextLine();
                                    opc3 = opc3.toLowerCase();
                                    //sc.nextLine();
                                    switch(opc3){
                                        case "a1"-> {
                                            System.out.println("\nIngrese el identificador del alumno a buscar."); System.out.print("  > ");
                                            String identificador = sc.nextLine();
                                            boolean a1 = BusquedaLineal.linSearchBool(listAlumnos, identificador);
                                            if(a1)
                                                System.out.println("\n\tSe encontro un resultado coincidente.");
                                            else 
                                                System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                        }
                                        case "b1"-> {
                                            System.out.println("\nIngrese el nombre completo del alumno (1ro nombres)."); System.out.print("  > ");
                                            String nombre = sc.nextLine();
                                            String ape = sc.nextLine();
                                            boolean a1 = BusquedaLineal.linSearchBool(listAlumnos, nombre, ape);
                                            if(a1)
                                                System.out.println("\n\tSe encontro un resultado coincidente.");
                                            else 
                                                System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                        }
                                        case "a2"-> {
                                            System.out.println("\nIngrese el identificador del alumno a buscar."); System.out.print("  > ");
                                            String identificador = sc.nextLine();
                                            Alumno alu = BusquedaLineal.getAlumno(listAlumnos, identificador);
                                            if(alu!= null){
                                                Alumno.printAlu(alu);
                                            }else{
                                                System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                            }
                                        }
                                        case "b2"-> {
                                            System.out.println("\nIngrese el nombre completo del alumno a buscar."); System.out.print("  > ");
                                            String nombre = sc.nextLine(); System.out.print("  > ");
                                            String ape = sc.nextLine();
                                            Alumno alu = BusquedaLineal.getAlumno(listAlumnos, nombre, ape);
                                            if(alu!= null)
                                                Alumno.printAlu(alu);
                                            else
                                                System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                        }
                                        case "3"-> {
                                            System.out.println("\nIngrese el nombre del alumno a buscar."); System.out.print("  > ");
                                            String name = sc.nextLine();
                                            BusquedaLineal.aparicionAlu(listAlumnos, name);
                                        }
                                        case "4"-> ver3 = false;
                                        default-> System.out.println("\n\tEsta opcion no es correcta.\n\tIntente de nuevo.\n");
                                    } 
                                }
                            }
                            case "b1"-> {// CASO BUSQUEDA LINEAL CLAVES
                                while(ver3){
                                    System.out.println("\n\t^^^ Que desea saber? (CLAVES) ^^^"+
                                        "\n\n\t1. Si se encuentra registrada.\n\t2. Los datos de la asignatura.\n\t3. Apariciones de asignatura.\n\t4. Salir al menu anterior."); System.out.print("  > ");
                                    int opc3 = sc.nextInt();
                                    sc.nextLine();
                                    switch(opc3){
                                        case 1-> {
                                            System.out.println("\nIngrese la clave de la asignatura a buscar."); System.out.print("  > ");
                                            int clave = sc.nextInt();
                                            boolean bool1 = BusquedaLineal.linSearchBool(listAsig, clave);
                                            if(bool1)
                                                System.out.println("\n\tSe encontro un resultado coincidente.");
                                            else 
                                                System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                        }
                                        case 2-> {
                                            System.out.println("\nIngrese la clave de la asignatura."); System.out.print("  > ");
                                            int clave = sc.nextInt();
                                            Asignatura asig = BusquedaLineal.getAsignatura(listAsig, clave);
                                            if(asig != null)
                                                Asignatura.printAsig(asig);
                                            else
                                                System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                        }
                                        case 3-> {
                                            System.out.println("\nIngrese la clave de la asignatura."); System.out.print("  > ");
                                            int clave = sc.nextInt();
                                            BusquedaLineal.aparicionClave(listAsig, clave);
                                        }
                                        case 4-> ver3 = false;
                                        default-> System.out.println("\n\tEsta opcion no es correcta.\n\tIntente de nuevo.\n");
                                    } 
                                }
                            }
                            case "a2"-> {//CASO BUSQUEDA BINARIA ALUMNO
                                while(ver3){
                                    System.out.println("\n\t^^^ Que desea saber? (ALUMNADO) ^^^"+
                                        "\n\n\t1. Si se encuentra registrado.\n\t  a1) Buscar por nombre o apellido.\n\t  b1) Buscar por nombre completo.\n\n\t2. Los datos del alumno.\n" + //
                                                "\t  a2) Buscar por nombre o apellido.\n\t  b2) Buscar por nombre completo.\n\n\t3. Apariciones del alumno (solamente nombre).\n\n\t4. Salir al menu anterior."); System.out.print("  > ");
                                    String opc3 = sc.nextLine();
                                    opc3 = opc3.toLowerCase();
                                    switch(opc3){
                                        case "a1"-> {
                                            System.out.println("\n\t1. Busqueda por nombre.\n\t2. Busqueda por apellido.");
                                            String opc4 = sc.nextLine();
                                            sc.nextLine(); //!!!!!!!!!!!
                                            if(opc4.equalsIgnoreCase("1")){
                                                System.out.println("\nIngrese el nombre del alumno a buscar."); System.out.print("  > ");
                                                String identificador = sc.nextLine();
                                                boolean a11 = BusquedaBinaria.binSearchAluBool(listAlumnos, identificador, 0);
                                                if(a11)
                                                    System.out.println("\n\tSe encontro un resultado coincidente.");
                                                else 
                                                    System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                            }else if(opc4.equalsIgnoreCase("2")){
                                                System.out.println("\nIngrese el apellido del alumno a buscar."); System.out.print("  > ");
                                                String identificador = sc.nextLine();
                                                boolean a2 = BusquedaBinaria.binSearchAluBool(listAlumnos, identificador, 1);
                                                if(a2)
                                                    System.out.println("\n\tSe encontro un resultado coincidente.");
                                                else 
                                                    System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                            }else{
                                                break;
                                            }
                                        }
                                        case "b1"-> {
                                            System.out.println("\nIngrese el nombre completo del alumno (1ro nombres)."); System.out.print("  > ");
                                            String nombre = sc.nextLine(); System.out.print("  > ");
                                            String ape = sc.nextLine();
                                            boolean a2 = BusquedaBinaria.binSearchAluBool(listAlumnos, nombre, ape);
                                            if(a2)
                                                System.out.println("\n\tSe encontro un resultado coincidente.");
                                            else 
                                                System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                        }
                                        case "a2"-> {
                                            System.out.println("\n\t1. Busqueda por nombre.\n\t2. Busqueda por apellido.");
                                            String opc4 = sc.nextLine();
                                            sc.nextLine(); //!!!!!!!!!!!
                                            if(opc4.equalsIgnoreCase("1")){
                                                System.out.println("\nIngrese el nombre del alumno a buscar."); System.out.print("  > ");
                                                String identificador = sc.nextLine();
                                                Alumno a21 = BusquedaBinaria.busquedaBinariAlumno(listAlumnos, identificador, 0);
                                                if(a21!=null)
                                                    Alumno.printAlu(a21);
                                                else 
                                                    System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                            }else if(opc4.equalsIgnoreCase("2")){
                                                System.out.println("\nIngrese el apellido del alumno a buscar."); System.out.print("  > ");
                                                String identificador = sc.nextLine();
                                                Alumno a22 = BusquedaBinaria.busquedaBinariAlumno(listAlumnos, identificador, 1);
                                                if(a22!=null)
                                                    Alumno.printAlu(a22);
                                                else 
                                                    System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                            }else{
                                                break;
                                            }
                                        }
                                        case "b2"-> {
                                            System.out.println("\nIngrese el nombre completo del alumno (1ro nombres)."); System.out.print("  > ");
                                            String nombre = sc.nextLine(); System.out.print("  > ");
                                            String ape = sc.nextLine();
                                            Alumno b21 = BusquedaBinaria.busquedaBinariAlumno(listAlumnos, nombre, ape);
                                            if(b21 != null)
                                                Alumno.printAlu(b21);
                                            else 
                                                System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                        }
                                        case "3"-> { //SOLAMENTE NOMBRE
                                            System.out.println("\nIngrese el nombre del alumno a buscar."); System.out.print("  > ");
                                            String name = sc.nextLine();
                                            BusquedaBinaria.aparicionAlu(listAlumnos, name);
                                        }
                                        case "4"-> ver3 = false;
                                        default-> System.out.println("\n\tEsta opcion no es correcta.\n\tIntente de nuevo.\n");
                                    }
                                }
                            }
                            case "b2"-> {//CASO BUSQUEDA BINARIA CLAVES
                                while(ver3){
                                    System.out.println("\n\t^^^ Que desea saber? (CLAVES) ^^^"+
                                        "\n\n\t1. Si se encuentra registrada.\n\t2. Los datos de la asignatura.\n\t3. Apariciones de asignatura.\n\t4. Salir al menu anterior."); System.out.print("  > ");
                                    int opc3 = sc.nextInt();
                                    sc.nextLine();
                                    switch(opc3){
                                        case 1->{
                                            System.out.println("\nIngrese la clave de la asignatura a buscar."); System.out.print("  > ");
                                            int clave = sc.nextInt();
                                            boolean bool1 = BusquedaBinaria.binSearchBool(listAsig, clave);
                                            if(bool1)
                                                System.out.println("\n\tSe encontro un resultado coincidente.");
                                            else 
                                                System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                        }
                                        case 2-> {
                                            System.out.println("\nIngrese la clave de la asignatura."); System.out.print("  > ");
                                            int clave = sc.nextInt();
                                            Asignatura asig = BusquedaBinaria.busquedaBinaria(listAsig, clave);
                                            if(asig != null)
                                                Asignatura.printAsig(asig);
                                            else
                                                System.out.println("\n\tNo se encontraron resultados coincidentes.");
                                        }
                                        case 3-> {
                                            System.out.println("\nIngrese la clave de la asignatura."); System.out.print("  > ");
                                            int clave = sc.nextInt();
                                            BusquedaBinaria.aparicionClave(listAsig, clave);
                                        }
                                        case 4-> ver3 = false;
                                        default-> System.out.println("\n\tEsta opcion no es correcta.\n\tIntente de nuevo.\n");
                                    }
                                }//fin while(opc3)
                            }
                            case "3"-> ver2 = false; //CASO SALIR
                            default-> System.out.println("\n\tEsta opcion no es correcta.\n\tIntente de nuevo.\n");
                        }//FIN SWITCH TIPO BUSQUEDAS
                    }
                }
                case 2-> { //MODIFICAR ALUMNOS
                    while(ver2){
                        System.out.println("\n^^^ Que desea modificar? ^^^\n\n\t1. Alumnos.\n\t2. Claves.\n\t3. Salir al menu principal."); System.out.print("  > ");
                        String opc5 = sc.nextLine();
                        switch(opc5){
                            case "1"-> {
                                System.out.println( "\nIngrese los apellidos del alumno a modificar: "); System.out.print("  > ");
                                String apeBuscar = sc.nextLine();
                                Alumno alunuevo = null;

                                for (Alumno alumno : listAlumnos) {
                                    if(alumno.getApellidos().equalsIgnoreCase(apeBuscar)){
                                        alunuevo = alumno;
                                        break;
                                    }
                                }

                                if(alunuevo != null){
                                    Alumno.modifAlu(listAlumnos, alunuevo);
                                    Alumno.printAlu(alunuevo);
                                }else{
                                    System.out.println("\n\tNo se encontro ningun alumno con el identificador ingresado.");
                                }
                            }//fin CASE ALUMNOS MOD
                            case "2"-> {
                                System.out.println( "\nIngrese la clave de la asignatura a modificar: "); System.out.print("  > ");
                                int clave = sc.nextInt();
                                sc.nextLine();
                                Asignatura asigNueva = null;

                                for (Asignatura asig : listAsig) {
                                    if(asig.getClave() == clave){
                                        asigNueva = asig;
                                        break;
                                    }
                                }

                                if(asigNueva != null){
                                    Asignatura.modifAsig(listAsig, asigNueva);
                                    Asignatura.printAsig(asigNueva);
                                }else{
                                    System.out.println("\n\tNo se encontro ninguna asignatura con el identificador ingresado.");
                                }
                            }
                            case "3"-> ver2 = false; //CASO SALIR
                            default-> System.out.println("\n\tEsta opcion no es correcta.\n\tIntente de nuevo.\n");
                        }//FIN SWITCH
                    }
                    
                }
                case 3-> {
                    while(ver2){
                        System.out.println("\n^^^ Que desea añadir? ^^^\n\n\t1. Alumnos.\n\t2. Claves.\n\t3. Salir al menu principal."); System.out.print("  > ");
                        String opc6 = sc.nextLine();
                        switch(opc6){
                            case "1"->{
                                Alumno aluN = Alumno.anadirAlu(listAlumnos, sc);
                                System.out.println("\tAlumno anadido: ");
                                Alumno.printAlu(aluN);
                            }
                            case "2"->{
                                Asignatura claveN = Asignatura.anadirAsig(listAsig, sc);
                                System.out.println("\tAsignatura anadida: ");
                                Asignatura.printAsig(claveN);
                            }
                            case "3"-> ver2 = false; //CASO SALIR
                            default-> System.out.println("\n\tEsta opcion no es correcta.\n\tIntente de nuevo.\n");
                        }
                    }
                }  
                case 4-> {
                    System.out.println("\n\tHasta luego !");
                    ver = false; ver2 = false; ver3 = false;
                }
                default-> System.out.println("\n\tEsta opcion no es correcta.\n\tIntente de nuevo.\n");
            }//FIN SWITCH PRINCIPAL
        }
        
    }

}
