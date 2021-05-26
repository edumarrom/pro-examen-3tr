package ejer1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class Barras {

    /**
     * Este método main no se solicitaba, pero lo agrego para realizar uno de los tests
     * que indicaba en el enunciado.
     */
    public static void main(String[] args) {
        System.out.println(barras(Arrays.asList(1, 3, 4), '*').equals("*\n***\n****")); // == true
    }

    /**
     * A partir de una lista de enteros, devuelve una cadena que contenga un carácter repetido
     * n veces separadas por un salto de lína. n dependerá del valor cada entero de dicha lista,
     * y habrá tantas líneas como enteros contenga la lista.
     * @param lista Una lista de enteros.
     * @param caracter Un carácter a repetir.
     * @return La cadena resultado de realizar las barras de caracteres.
     */
    public static String barras(List<Integer> lista, char caracter){
        Iterator<Integer> iter = lista.iterator();
        String resultado = "";
        while (iter.hasNext()) {
            Integer entero = iter.next();
            StringBuilder linea = new StringBuilder();
            for (int i = 0; i < entero; i++) {
                linea.append(caracter);
            }
            resultado += linea;
            if (iter.hasNext()) {
                resultado += "\n";
            }
        }
        return resultado;
    }
}
