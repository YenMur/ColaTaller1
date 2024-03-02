/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import cola.Base;
import java.util.Random;

/**
 *
 * @author lxyen
 */
public class Cliente extends Base{
    
    String nombre;
    int edad;
    int tiempoAtencion;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, int tiempoAtencion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tiempoAtencion = tiempoAtencion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTiempoAtencion() {
        return tiempoAtencion;
    }

    public void setTiempoAtencion(int tiempoAtencion) {
        this.tiempoAtencion = tiempoAtencion;
    }
    
    public static String generarNombreAleatorio(){
    String[] nombreGenerado={"Juan","Martha","Karen","Alejandro","Andrea","Marcelo","Felipe","Camila","Maria","Sebastian","Liliana"};
    String[] apellidosGenerados={"Ramirez","Perez","Rodriguez","Pabon","Murillo","Lopez","Martinez","Hernandez","Garcia","Torres","Camacho"};
    
    Random rnd=new Random();
    String nombreAleatorio=nombreGenerado[rnd.nextInt(nombreGenerado.length)];
    String apellidoAleatorio=apellidosGenerados[rnd.nextInt(apellidosGenerados.length)];
    
    return nombreAleatorio+" "+apellidoAleatorio;
    }
    
    public static int generarEdadAleatoria(int min, int max){
        Random rnd=new Random();
        return rnd.nextInt(max-min+1)+min;
    }
    
    public static int generarTiempoAtencionAleatorio(int minSegundos,int maxSegundos){
        Random rnd=new Random();
        return rnd.nextInt(maxSegundos-minSegundos + 1)+minSegundos;
    }
    

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", tiempoAtencion=" + tiempoAtencion + '}';
    }
    
    @Override
    
    public Base copy(){
        
        return new Cliente(nombre,edad,tiempoAtencion);
    }
    
}
