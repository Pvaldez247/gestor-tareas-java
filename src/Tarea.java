public class Tarea {
    private final String descripcion;
    private String estado; // "pendiente" o "completada"

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.estado = "pendiente";
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void marcarComoCompletada() {
        this.estado = "completada";
    }

    @Override
    public String toString() {
        return descripcion + " [" + estado + "]";
    }

}
