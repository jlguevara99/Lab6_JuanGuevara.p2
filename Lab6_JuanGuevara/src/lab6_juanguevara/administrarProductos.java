/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_juanguevara;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class administrarProductos {
    private ArrayList<Producto> productos = new ArrayList();
    private File archivo = null;

    public administrarProductos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return productos +"";
    }
    public void setProducto(Producto p){
        this.productos.add(p);
    }
    public void escribirArchivos() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,false);
            bw = new BufferedWriter(fw);
            for (Producto p: productos) {
                bw.write(p.getNombre()+";");
                bw.write(p.getCategoria()+";");
                bw.write(p.getPrecio()+";");
                bw.write(p.getDescuento()+";");
            }
            bw.flush();
            
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        Scanner sc = null;
        
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {                
                productos.add(new Producto(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble()));
            }
        } catch (Exception e) {}
        finally{
            sc.close();
        }
        
    }
    
    
}
