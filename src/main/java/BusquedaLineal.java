import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author edaII06alu10
 */
public class BusquedaLineal {
    //método que devuelve verdadero si un valor(clave) se encuentra en la lista y falso en caso contrario
    public static boolean busquedaLineal1(List<Integer> ListSearch, int searchedElement) {
        for (Integer integer : ListSearch) {
            if (integer==searchedElement) {
                return true;
            }
        }
        return false;
    }
    //método que devuelve el índice donde se encuentra la clave
    public static int buscarIndice(LinkedList<Integer> list, int clave) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == clave) {
                return i;
            }
        }
        return -1;
    }
    //método que devuelve el número de veces que aparece la clave en la lista
    public static int contarApariciones(LinkedList<Integer> lista, int clave) {
        int count = 0;
        for (Integer integer : lista) {
            if (integer == clave) {
                count++;
            }
        }
        return count;
    }
}
