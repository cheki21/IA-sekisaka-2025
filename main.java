package tarea4;

public class main {
    public static void main(String[] args) {
        // Estado inicial mezclado para requerir más pasos
        String estadoInicial = "1234 5678"; // Ejemplo mezclado
        String estadoObjetivo = "12345678 "; // Objetivo clásico

        Nodo solucion = Arbol.bfs(estadoInicial, estadoObjetivo);

        if (solucion != null) {
            System.out.println("¡Solución encontrada!");
            int pasos = imprimirCamino(solucion);
            System.out.println("Pasos: " + (pasos - 1));
        } else {
            System.out.println("No se encontró solución.");
        }
    }

    // Imprime el camino y retorna el número de pasos
    public static int imprimirCamino(Nodo nodo) {
        if (nodo == null) return 0;
        int pasos = imprimirCamino(nodo.padre);
        System.out.println(nodo.estado);
        return pasos + 1;
    }
}