
package proyectofichero;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Metodos {
    ArrayList<Alumno> aprobados = new ArrayList<Alumno>();
    
    public void escribeFicheiro(String nomeFich,String nomeFichA){
        
        ObjectOutputStream fichero = null;
        ObjectOutputStream fich = null;
        try {
            fich = new  ObjectOutputStream(new FileOutputStream(nomeFichA));
            fichero = new ObjectOutputStream(new FileOutputStream(nomeFich));
             for(int i=0;i<3;i++){
            Alumno al = new Alumno(JOptionPane.showInputDialog(null,"Introduce o nome"),Integer.parseInt(JOptionPane.showInputDialog("introduce as notas")));
            if(al.getNotas()>=5){
            Alumno alc = new Alumno(JOptionPane.showInputDialog(null,"Introduce o nome"),Integer.parseInt(JOptionPane.showInputDialog("introduce as notas"))); 
            fich.writeObject(alc);
            }
            fichero.writeObject(al);
        }
            
            
        } catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
           if(fich!=null&&fichero!=null) 
               
           
                   
               try {
                   fichero.close();
                   fich.close();
               } catch (IOException ex) {
                   Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
               }
        }
        }
    public void ler(String nomeFich,String nomeFichA){
        ObjectInputStream leer= null;
        ObjectInputStream leerA = null;
        Alumno aux = null;
        Alumno auxA =null;
        try {
            leer = new ObjectInputStream(new FileInputStream(nomeFich));
            leerA = new ObjectInputStream(new FileInputStream(nomeFichA));
            aux=(Alumno)leer.readObject();
            auxA=(Alumno)leerA.readObject();
            while(aux!=null&&auxA !=null){
                
            aprobados.add(aux);
            System.out.println(auxA.toString());
            System.out.println(aux.toString());
            aux=(Alumno)leer.readObject();
            auxA=(Alumno)leerA.readObject();
            }
                    } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
           if(leer!=null&&leerA!=null){
               try {
                   leerA.close();
                   leer.close();
               } catch (IOException ex) {
                   Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        }
    }
    public void OrdearNomes(){
        for(int i=0;i<aprobados.size();i++){
            Collections.sort(aprobados);
            System.out.println(aprobados.toString());
            
        }
        
    }
}
