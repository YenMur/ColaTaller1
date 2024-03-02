/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

import java.util.LinkedList;

/**
 *
 * @author lxyen
 */
public class ColaBanco <T extends Base> {
    
     private LinkedList<T> elementos;
    
    public ColaBanco(){
        elementos=new LinkedList<>();
    }
    
    public void encolar(T elemento){
        elementos.addLast(elemento);
    }
    
    public T desencolar(){
        return elementos.removeFirst();
    }
    
    public boolean estaVacia(){
        return elementos.isEmpty();
    }
    
    @Override
    public String toString(){
        String cad="[";
        for(T e:elementos){
            cad+=" "+e.toString();
        }
        return cad+"]";
    }
    
}
