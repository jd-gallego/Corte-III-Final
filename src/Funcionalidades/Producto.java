package Funcionalidades;

public class Producto {
    private String nombre;
    private int ide;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int ide, String descripcion, int cantidad, double precio) {
        this.nombre = nombre;
        this.ide = ide;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Nombre= '" + nombre + '\'' +
                ", ID= '" + ide + '\'' +
                ", descripcion= '" + descripcion + '\'' +
                ", cantidad= " + cantidad +
                ", precio=" + precio +
                '}';
    }
}
