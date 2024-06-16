/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entidades;

/**
 *
 * @author USUARIO
 */
public class Producto {
    
    private String nombreProducto;
    private double precio;
    private int cantidad;
    private String descripcion;
    private final double IMPUESTO = 9;

    public Producto(String nombreProducto, double precio, int cantidad, String descripcion) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    public double calcularImpuesto() {
        return (precio * cantidad) * IMPUESTO / 100;
    }

    public double calcularTotal() {
        return (precio * cantidad) + calcularImpuesto();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("nombre:").append(nombreProducto);
        sb.append(", precio:").append(precio);
        sb.append(", cantidad:").append(cantidad);
        sb.append(", descripcion:").append(descripcion);
        sb.append(", Calculo Impuesto:").append(calcularImpuesto());
        sb.append('}');
        return sb.toString();
    }

    
   
    
}
