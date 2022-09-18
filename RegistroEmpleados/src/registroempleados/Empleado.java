/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroempleados;

/**
 *
 * @author yanyg
 */
public class Empleado {
    String nombre;
    int codigo;
    boolean tipoEmpleado;
    int meses;

    public Empleado(String nombre, int codigo, boolean tipoEmpleado, int meses) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipoEmpleado = tipoEmpleado;
        this.meses = meses;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(boolean tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", codigo=" + codigo + ", tipoEmpleado=" + tipoEmpleado + ", meses=" + meses + '}';
    }
    
    
}
    //datos del empleado
    //to string -> valores  

