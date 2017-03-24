
package proyectofichero;

import javax.swing.JOptionPane;


public class ProyectoFichero {

   
    public static void main(String[] args) {
        int select;
        Metodos metod = new Metodos();
        do{
          select = Integer.parseInt(JOptionPane.showInputDialog("1. Escribir \n 2. Leer \n 3. Ordear \n 0. Sair"));
          switch(select){
              
              case 1:metod.escribeFicheiro("suspensos.dat", "aprobados.dat");
              break;
              case 2:metod.ler("suspensos.dat","aprobados.dat");
              break;
              case 3:metod.OrdearNomes();
                      
              
          }  
            
        }while(select!=0);
        
        
    }
    
}
