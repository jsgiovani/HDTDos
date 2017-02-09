
//La clase pila es generica
//Implementa la interfaz <InterfazPila>

public class Pila<T>  implements InterfazPila<T>{
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
    @Override
    public void empujar(T elemento){
        NodoPila nuevo=new NodoPila(elemento);//creamos puntero de tipo NodoPila
        nuevo.siguiente=cima;
        cima=nuevo;
        tamanoPila++;       
    }
    // Metodo pop: Para sacar un elemento de la pila
    @Override
    public  T sacar(){
        T aux=(T) cima.dato;
        cima=cima.siguiente;
        tamanoPila--;
        return aux;
        
        
    }
    //Método cima para saber quien esta en la cima de la Pila
    @Override
    public T cima(){
        return (T) cima.dato;
    }
    //Método tamanoPila para saber el tamano de la pila
    @Override
    public int tamanoPila(){
        return tamanoPila;
    }
    //metodo limpiar pila:para limpiar(vaciar) la pila
    @Override
    public void limpiarPila(){
        while(!estaVacia()){ //Mienstras la pila no este vacia 
            sacar();
        }
    }
    
    
}
