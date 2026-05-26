class Nodo {
    String dato;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(String dato) {
        this.dato = dato;
        izquierda = null;
        derecha = null;
    }
}

public class ArbolEmpresa {

    // Recorrido Preorden
    public static void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preorden(nodo.izquierda);
            preorden(nodo.derecha);
        }
    }

    // Recorrido Postorden
    public static void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierda);
            postorden(nodo.derecha);
            System.out.print(nodo.dato + " ");
        }
    }

    public static void main(String[] args) {


        // CREACIÓN DEL ÁRBOL
  

        Nodo director = new Nodo("Director");

        director.izquierda = new Nodo("Departamento A");
        director.derecha = new Nodo("Departamento B");

        director.izquierda.izquierda = new Nodo("Empleado A1");
        director.izquierda.derecha = new Nodo("Empleado A2");

        director.derecha.izquierda = new Nodo("Empleado B1");
        director.derecha.derecha = new Nodo("Empleado B2");

  
        // REPRESENTACIÓN DEL ÁRBOL


        System.out.println("ESTRUCTURA DEL ÁRBOL:\n");

        System.out.println("                Director");
        System.out.println("               /        \\");
        System.out.println("     Departamento A   Departamento B");
        System.out.println("        /      \\         /      \\");
        System.out.println("Empleado A1 Empleado A2 Empleado B1 Empleado B2");

        // =========================
        // PARTE 1
        // =========================

        System.out.println("\n--- PARTE 1 ---");

        System.out.println("Raíz: Director");

        System.out.println("Nodos internos:");
        System.out.println("- Director");
        System.out.println("- Departamento A");
        System.out.println("- Departamento B");

        System.out.println("Hojas:");
        System.out.println("- Empleado A1");
        System.out.println("- Empleado A2");
        System.out.println("- Empleado B1");
        System.out.println("- Empleado B2");

        System.out.println("Altura del árbol: 2");

        // =========================
        // PARTE 2
        // =========================

        System.out.println("\n--- PARTE 2 ---");

        System.out.print("Recorrido Preorden: ");
        preorden(director);

        System.out.print("\nRecorrido Postorden: ");
        postorden(director);

        // =========================
        // EXPLICACIÓN
        // =========================

        System.out.println("\n\nDiferencia entre recorridos:");
        System.out.println("El recorrido Preorden visita primero la raíz y luego los hijos.");
        System.out.println("El recorrido Postorden visita primero los hijos y al final la raíz.");
        System.out.println("Preorden sirve para copiar estructuras y Postorden para eliminar árboles.");
    }
}