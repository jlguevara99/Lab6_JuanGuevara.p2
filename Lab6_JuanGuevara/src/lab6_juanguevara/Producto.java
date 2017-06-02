/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_juanguevara;

/**
 *
 * @author HP
 */
public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private double descuento;

    public Producto() {
    }

    public Producto(String nombre, String categoria, double precio, double descuento) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", descuento=" + descuento + '}';
    }
    
    
}
