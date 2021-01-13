/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;
import paquete.clases;
/**
 *
 * @author ignaciovaldeschavez
 */
public class usuario {
    String nombre;
    String apellido;
    int edad;
    
    public usuario(String Nombre, String Apellido, int EDAD){
        nombre = Nombre;
        apellido = Apellido;
        edad = EDAD;
    }
    
    public void comprobar(String N,String A, int E){
        nombre = N;
        apellido = A;
        edad = E;
    }
    
    public String Cadena(){
        String cadena = nombre+","+apellido+","+edad;
        return cadena;
    }
}
