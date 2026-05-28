
package listas_enlazadas;

/**
 *
 * @author sebas
 */
public class Listas_Enlazadas {
    
    
    private Nodoo cabeza;
    
    
    public Listas_Enlazadas(){
        cabeza =null; // Aqui la lista esta vacia
    
    }
    //Insertar el dato
    
    public void insertar (int dato){
        Nodoo nuevo = new Nodoo(dato);
        
 if (cabeza == null){
     cabeza = nuevo;
 }else{
     Nodoo actual = cabeza;
     while (actual.enlace !=null){
     }
    
 }
 
        
    }
}
