
package cola;

public class Colas {
    NodoCola inicio, fin;
    int tama;
    
    //Metodo constructor
    public Colas(){
        inicio = fin = null;
        tama = 0;
    }
    
    //Metodo para saber si la cola esta vacia
    public boolean estaVacia(){
        return inicio == null;
    }
    
    //Metodo para insertar un elemento a la cola
    public void insertar(int elemento){
        NodoCola nuevo = new NodoCola(elemento);
        
        if(estaVacia()){
            inicio = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        
        fin = nuevo;
        tama++;
    }
    
    //Metodo para quitar un elemento de la cola
    public int quitar(){
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tama--;
        return aux;
    }
    
    //Metodo para saber quien esta al inicio de la cola
    public int inicioCola(){
        return inicio.dato;
    }
    
    public int tamanioCola(){
        return tama;
    }
}
