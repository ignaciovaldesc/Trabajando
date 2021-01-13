package paquete;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ignaciovaldeschavez
 */
public class clases {
    //public class nombres{
    private String nombre;
    private String apellido;
    private int edad;
    
    
    public clases(String nombreLlegado, String apellidoLlegado){
        nombre = nombreLlegado;
        apellido = apellidoLlegado;
    }
    
    public void getEdad(int EDAD){
        edad = EDAD;
    }
//}
    public void cadena(){
        String cadena = nombre+" "+apellido;
        System.out.println(cadena);
    }
    
    public void comprobar(String Nllega, String Allega){
        //this();
        Boolean respuestaUsuario;
        if(nombre=="null" && apellido=="null"){
            this.apellido=Allega;
            this.nombre=Nllega;
        }
        else{
            System.out.println("Ya hay datos guardados, ¿esta seguro de sobreescribir?");
            respuestaUsuario = capturar();
            if(respuestaUsuario == true){
                this.nombre = Nllega;
                this.apellido = Allega;
                //clases(Nllega,Allega);
            }
            else{
                System.out.println("Datos no guardados");
            }
        }
    }
    public Boolean capturar(){
        String respuesta;
        Boolean rest;
        int opcion=1;
        Scanner teclado = new Scanner(System.in);
        respuesta = teclado.nextLine();
        if(respuesta=="si"){
            System.out.println("Hola mundo");
        }
        while(opcion!=0){
            //String se compara usando metodo equals
            if(respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI")){
            return rest = true;
            }
        else{
            if(respuesta.equals("no") || respuesta.equals("No") || respuesta.equals("NO")){
                return rest = false;
                }
            else{
                System.out.println("Respuesta no valida, vuelva a ingresar");
                System.out.println("Ya hay datos guardados, ¿esta seguro de sobreescribir?");
                respuesta = teclado.nextLine();
                System.out.println(respuesta);
                opcion=2;
                }
        
            }
        }
        return rest = false;
    }
    
    
    public String CadenaVuelta(){
        String devolucion = nombre+","+apellido+","+edad;
        return devolucion;
    }
    
}


