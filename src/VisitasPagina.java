import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VisitasPagina {
    public static void main(String[] args) {
        HashMap<String, Integer> visitas = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String pagina;

        System.out.println("Visitas a una pagina");
        System.out.println("Introduce nombres de páginas (o 'fin' para terminar):");

        while (true) {
            System.out.print("Visitar página: ");
            pagina = sc.nextLine().toLowerCase().trim();

            if (pagina.equals("fin")) {
                break;
            }

            if (!visitas.containsKey(pagina)) {
                visitas.put(pagina, 1);
            } else {
                int contadorActual = visitas.get(pagina);
                visitas.put(pagina, contadorActual + 1);
            }
        }

        // Mostrar resultados
        System.out.println("Estadisticas finales: ");
        if (visitas.isEmpty()) {
            System.out.println("No se registraron visitas.");
        } else {
            for (Map.Entry<String, Integer> entrada : visitas.entrySet()) {
                System.out.println("Página: [" + entrada.getKey() + "] - Visitas: " + entrada.getValue());
            }
        }

        sc.close();
    }
}