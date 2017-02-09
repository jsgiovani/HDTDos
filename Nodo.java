
//Clase nodo, paara la clase Lista
//Tipo generica
public class Nodo<T> {
   
    
    //Vamos hacer una lista enlazada que contiene solo numereso enteros
    public T dato;
    public Nodo siguiente; //PUntero enlace,para poder ir uniendo los difeentes nodos.
    
    //constructor para insertar al final
    public Nodo(T d){ //para cuando vamos a crear un NOdo al final. 
        this.dato =d;
        this.siguiente=null;
    }
    //Constructor para insertar al inicio de nuestra lista. 
    public Nodo(T dato, Nodo puntero){ // nos va ayudar a insertar al inicio de nuestra lista simple enlazada
        this.dato = dato;
        this.siguiente = puntero;
    }
    
    
}
