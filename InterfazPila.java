

//Interfaz haciendo uso de genericos  para esta interfaz de pila
public interface InterfazPila <T>{
   
    //metodo para saber si la pila esta vacia
    public boolean estaVacia();
    
    //Método push: para insertar/empujar un elemento en la Pila
    public void empujar(T elemento);
    
    // Metodo pop: Para sacar un elemento de la pila
    public  T sacar();
    
    //Método cima para saber quien esta en la cima de la Pila
    
    public T cima();
    
    //Método tamanoPila para saber el tamano de la pila
    public int tamanoPila();
    
    //metodo limpiar pila:para limpiar(vaciar) la pila
    public void limpiarPila();
        
    

}
    
    
    

