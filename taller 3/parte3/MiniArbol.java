// Clase que representa cada nodo del árbol
class Node {
    String dato;
    Node izquierda;
    Node derecha;

    public Node(String dato) {
        this.dato = dato;
        izquierda = null;
        derecha = null;
    }
}

public class MiniArbol {

    // Método PreOrder
    public static void preOrder(Node nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preOrder(nodo.izquierda);
            preOrder(nodo.derecha);
        }
    }

    public static void main(String[] args) {

        // Crear árbol
        
        // todos los datos se guardan en la variable dato

        Node director = new Node("Director");

        director.izquierda = new Node("Departamento A");
        director.derecha = new Node("Departamento B");

        director.izquierda.izquierda = new Node("Empleado A1");
        director.izquierda.derecha = new Node("Empleado A2");

        director.derecha.izquierda = new Node("Empleado B1");
        director.derecha.derecha = new Node("Empleado B2");

        // Mostrar recorrido PreOrder
        System.out.println("Recorrido PreOrder:");
        preOrder(director);
    }
}