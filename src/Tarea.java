public class Tarea {
    private String descripcion;
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

    // Para guardar en archivo
    public String toFileFormat() {
        return descripcion + ";" + estado;
    }

    // Para leer desde archivo
    public static Tarea fromFileFormat(String linea) {
        String[] partes = linea.split(";");
        Tarea t = new Tarea(partes[0]);
        if (partes.length > 1 && partes[1].equals("completada")) {
            t.marcarComoCompletada();
        }
        return t;
    }
}
