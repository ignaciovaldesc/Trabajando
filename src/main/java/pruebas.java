/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import paquete.clases;
import paquete.usuario;


public class pruebas {
    public static void main(String[] args){
        //System.out.println("Ignacio");
        clases nombre = new clases("null","null");
        usuario nuevoUsuario = new usuario("null","null",0);
        //nombre.cadena();
        Scanner entrada = new Scanner(System.in);
        int usuarioEntrada;
        //menu
        int opcion=0;
        do{
            System.out.println("1.- AGREGAR USUARIO");
            System.out.println("2.- VER USUARIO");
            System.out.println("3.- AGREGAR EDAD AL USUARIO 1");
            System.out.println("4.- AGREGAR USUARIO 2");
            System.out.println("5.- Comparar al mayor");
            
            System.out.println("Ingrese el numero de la opcion deseada: ");
            opcion=Integer.parseInt(entrada.nextLine());
            switch(opcion){
                case 1:
                    String nombreUsuario,apellidoUsuario;
                    System.out.println("Ingrese el nombre del usuario: ");
                    nombreUsuario = entrada.nextLine();
                    System.out.println("Ingrese el apellido del usuario: ");
                    apellidoUsuario = entrada.nextLine();
                    
                    //llenamos la clase con los datos ingresados por usuario
                    nombre.comprobar(nombreUsuario, apellidoUsuario);
                    opcion = 0;
                    break;
                case 2:
                    nombre.cadena();
                    opcion = 0;
                    break;
                case 4:
                    String Usuario;
                    String apellido;
                    int edad;
                    System.out.println("Ingrese el nombre del usuario");
                    Usuario = entrada.nextLine();
                    System.out.println("Ingrese apellido del usuario");
                    apellido = entrada.nextLine();
                    System.out.println("Ingrese la edad del usuario");
                    edad = Integer.parseInt(entrada.nextLine());
                    
                    nuevoUsuario.comprobar(Usuario,apellido,edad);
                    System.out.println("Usuario agregado correctamente\n");
                    opcion = 0;
                    break;
                    
                case 3:
                    int Edad;
                    System.out.println("Ingresa la edad del usuario 1");
                    Edad = Integer.parseInt(entrada.nextLine());
                    nombre.getEdad(Edad);
                    opcion = 0;
                    break;
                    
                case 5:
                    String usuario_1 = nombre.CadenaVuelta();
                    String usuario_2 = nuevoUsuario.Cadena();
                    
                    String[] parte = usuario_1.split(",");
                    String[] parts = usuario_2.split(",");
                    
                    int E_usuario1=Integer.parseInt(parte[2]);
                    int E_usuario2=Integer.parseInt(parts[2]);
                    
                    if(E_usuario1 > E_usuario2){
                        System.out.println(parte[0]+" "+parte[1]+" es el mayor");
                    }
                    else{
                        System.out.println(parts[1]+" "+parts[2]+" es el mayor");
                    }
                //default:
                  //  System.out.println("Saliendo");
                    //opcion=1;

                //default:
                  //  System.out.println("Saliendo");
                    //opcion=1;

            }
        }while(opcion==0);
        
        
    }

    
    
}
