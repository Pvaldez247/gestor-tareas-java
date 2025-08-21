import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final GestorTareas gestor = new GestorTareas();

    public static void main(String[] args) {

        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Elige una opción: ");
            ejecutarOpcion(opcion);
        } while (opcion != 0);

        System.out.println("👋 Saliendo del sistema...");
        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENÚ DE TAREAS ---");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Listar tareas");
        System.out.println("3. Marcar tarea como completada");
        System.out.println("4. Eliminar tarea");
        System.out.println("0. Salir");
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> agregarTarea();
            case 2 -> gestor.listarTareas();
            case 3 -> completarTarea();
            case 4 -> eliminarTarea();
            case 0 -> {} // salir
            default -> System.out.println("⚠ Opción inválida.");
        }
    }

    private static void agregarTarea() {
        System.out.print("Descripción de la tarea: ");
        String desc = sc.nextLine();
        gestor.agregarTarea(desc);
    }

    private static void completarTarea() {
        gestor.listarTareas();
        int indice = leerEntero("Número de tarea a completar: ") - 1;
        gestor.completarTarea(indice);
    }

    private static void eliminarTarea() {
        gestor.listarTareas();
        int indice = leerEntero("Número de tarea a eliminar: ") - 1;
        gestor.eliminarTarea(indice);
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.println("⚠ Entrada inválida. Ingresa un número.");
            sc.next(); // limpiar entrada inválida
            System.out.print(mensaje);
        }
        int numero = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        return numero;
    }
}
