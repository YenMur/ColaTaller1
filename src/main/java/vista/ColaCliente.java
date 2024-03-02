/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import cola.ColaBanco;
import java.util.LinkedList;
import java.util.Queue;
import modelo.Cliente;
import java.util.Random;


/**
 *
 * @author lxyen
 */

public class ColaCliente {
    
    private LinkedList<Cliente> colaPreferencial;
    private LinkedList<Cliente> colaPersonaNatural;
    private LinkedList<Cliente> colaCliente;

    public ColaCliente() {
        colaPreferencial = new LinkedList<>();
        colaPersonaNatural = new LinkedList<>();
        colaCliente = new LinkedList<>();
    }
        
        public void generarClientes() {
        for (int i = 0; i < 10; i++) {
            String nombre = Cliente.generarNombreAleatorio();
            int edad = Cliente.generarEdadAleatoria(18, 90);
            int tiempoAtencion = Cliente.generarTiempoAtencionAleatorio(60, 600);

            Cliente cliente = new Cliente(nombre, edad, tiempoAtencion);

            Random rnd = new Random();
            int numeroAleatorio = rnd.nextInt(3);

            if (cliente.getEdad() >= 60) {
                colaPreferencial.addLast(cliente);
            } else if (numeroAleatorio == 0) {
                colaPersonaNatural.addLast(cliente);
            } else {
                colaCliente.addLast(cliente);
            }
        }
    }

    public LinkedList<Cliente> getColaPreferencial() {
        return colaPreferencial;
    }

    public LinkedList<Cliente> getColaPersonaNatural() {
        return colaPersonaNatural;
    }

    public LinkedList<Cliente> getColaCliente() {
        return colaCliente;
    }
    
    public static void main(String[] args) {
        ColaCliente colaCliente = new ColaCliente();
        colaCliente.generarClientes();
    
    }

    }
    
    

