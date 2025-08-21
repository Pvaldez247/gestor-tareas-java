import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Tarea> listaTareas;

    public GestorTareas() {
        listaTareas = new ArrayList<>();
    }

    // Agregar tarea
    public void agregarTarea(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            System.out.println("⚠ La descripción no puede estar vacía.");
            return;
        }
        listaTareas.add(new Tarea(descripcion));
        System.out.println("✅ Tarea agregada.");
    }

    // Listar tareas
    public void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        for (int i = 0; i < listaTareas.size(); i++) {
            System.out.println((i + 1) + ". " + listaTareas.get(i));
        }
    }

    // Marcar tarea como completada
    public void completarTarea(int indice) {
        if (indice < 0 || indice >= listaTareas.size()) {
            System.out.println("⚠ Índice inválido.");
            return;
        }
        listaTareas.get(indice).marcarComoCompletada();
        System.out.println("✅ Tarea marcada como completada.");
    }

    // Eliminar tarea
    public void eliminarTarea(int indice) {
        if (indice < 0 || indice >= listaTareas.size()) {
            System.out.println("⚠ Índice inválido.");
            return;
        }
        listaTareas.remove(indice);
        System.out.println("🗑 Tarea eliminada.");
    }
}
