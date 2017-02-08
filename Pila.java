/*
 * NetBeans IDE 8.2
 * 

/**
 *
 * @author Juan Carlos Solís Cruz-15564
 *        
 */
public class Pila {
    private NodoPila cima; //encapsulamos puntero de NodoPila
    int tamanoPila;
    //constructor
    public Pila(){
        cima=null;
        tamanoPila=0;
    }
    
    //metodo para saber si la pila esta vacia
    public boolean estaVacia(){
        return cima==null;
    }
    //Método push: para insertar/empujar un elemento en la Pila
    public void empujar(int elemento){
        NodoPila nuevo=new NodoPila(elemento);//creamos puntero de tipo NodoPila
        nuevo.siguiente=cima;
        cima=nuevo;
        tamanoPila++;       
    }
    // Metodo pop: Para sacar un elemento de la pila
    public  int sacar(){
        int aux=cima.dato;
        cima=cima.siguiente;
        tamanoPila--;
        return aux;
        
        
    }
    //Método cima para saber quien esta en la cima de la Pila
    public int cima(){
        return cima.dato;
    }
    //Método tamanoPila para saber el tamano de la pila
    public int tamanoPila(){
        return tamanoPila;
    }
    //metodo limpiar pila:para limpiar(vaciar) la pila
    public void limpiarPila(){
        while(!estaVacia()){ //Mienstras la pila no este vacia 
            sacar();
        }
    }  
}
