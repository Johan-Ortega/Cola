
package cola;

import javax.swing.JOptionPane;

public class Cola {

    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        
        Colas colas = new Colas();
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar un elemento en la cola\n"
                        + "2. Quitar un elemento de la cola\n"
                        + "3. ¿La cola esta vacia?\n"
                        + "4. ¿Quien esta al inicio?\n"
                        + "5. Tamaño de la cola\n"
                        + "6. Salir", "Menu de opciones", JOptionPane.QUESTION_MESSAGE));
                
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a insertar",
                                    "Insertando en la cola", JOptionPane.QUESTION_MESSAGE));
                        colas.insertar(elemento);
                        break;
                        
                    case 2:
                        if(!colas.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento atendido es " + colas.quitar(),
                                    "Quitando elementos de la cola", JOptionPane.INFORMATION_MESSAGE);
                        } else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacia",
                                    "Cola vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 3:
                        if(colas.estaVacia()){
                            JOptionPane.showMessageDialog(null, "La cola esta vacia",
                                    "Cola vacia", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola no esta vacia",
                                    "Cola NO vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 4:
                        if(!colas.estaVacia()){
                            JOptionPane.showMessageDialog(null, "Elemento ubicado al inicio de la cola es " + colas.inicioCola(),
                                    "Elemento de inicio", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia",
                                    "Cola vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la cola es " + colas.tamanioCola(),
                                "Tamaño de cola", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                                "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        }while(opcion != 6);
    }
    
}
