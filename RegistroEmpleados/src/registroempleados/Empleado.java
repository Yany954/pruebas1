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
    String codigo;
    String tipoEmpleado;
    String meses;

    public Empleado(String codigo, String nombre, String tipoEmpleado, String meses) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoEmpleado = tipoEmpleado;
        this.meses = meses;
    }

    @Override
    public String toString() {
        String informacion = codigo + "\t" + nombre + "\t" 
                + tipoEmpleado + "\t" + meses; 
        return  informacion;
    }
    
    
}
    //datos del empleado
    //to string -> valores  

