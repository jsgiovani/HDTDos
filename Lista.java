/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Lista {
    
    //todas las listas deben tener referencias hacia el inico y al fina de la lista
    //cola y inicio 
    protected Nodo inicio,fin;//punteros
    
    //constructor
    public Lista(){
        //apuntan a nada 
        inicio=null;
        fin=null;
    }
    
    
    //Método para saber si la lista esta vacia.
    public boolean estaVacia(){
        if(inicio==null){
            return true;// si esta vacia regresa un verdadero
        }
        else{
            return false;
        }
    }
    //Método para agrear un nodo al inicio de la lista
    public void agregarAlInicio(String elemento){
        //creando al nodo
        inicio=new Nodo(elemento, inicio);
        if(fin==null){ //si fin es igual a null significa que aún no habian nodos
            fin=inicio;
        }
    }
    //Método para insertar nodo al Final de la 
    public void agregarAlFinal(String elemento){
        if (!estaVacia()){//si no esta vacia ,algo tiene
            fin.siguiente=new Nodo(elemento);
            fin=fin.siguiente;
        }else{//si esta vacia 
            inicio=fin=new Nodo(elemento);
            
        }
        
    } 
    //Método para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer=inicio;
        //mientras recorrer sea diferente de nullo, es decir que mientras no llgue al final 
        while(recorrer!=null){
            System.out.print("["+recorrer.dato+"]\n");
            recorrer=recorrer.siguiente;
        }
    
    }
    
    
}
