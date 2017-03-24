
package proyectofichero;

import java.io.Serializable;


public class Alumno implements Serializable,Comparable<Alumno>{
    private String nome;
    private int notas;
    
   public Alumno(){
       
       
   }

    public Alumno(String nome, int notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public int getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", notas=" + notas + '}';
    }
    @Override
   public int compareTo(Alumno comparar){
       int comp = this.nome.compareToIgnoreCase(comparar.getNome());
     return comp ;
   }
   
}
