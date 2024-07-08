import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final var array = RandomUtilities.generarRandomArrayInt(1000, 10000, 2, new Random());
        final var listaPrimos = new ArrayList<Integer>();

        for (var n : array) {
            if (esPrimo(n)) {
                listaPrimos.add(n);
            }
        }
        System.out.printf("La lista de números primos es: %s%n", listaPrimos);
        System.out.printf("El tamaño de la lista es: %s%n", listaPrimos.size());
    }

    private static boolean esPrimo(int n) {
        var i = 2;
        while (i < n) {
            if (n % i != 0) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
