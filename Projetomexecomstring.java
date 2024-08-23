import java.util.Scanner;

public class Projetomexecomstring{
    
    void seraqueseunomeeincrivel(){
        Scanner peganome = new Scanner(System.in);
        
        System.out.println("Enter username");
        
        String salvanome = peganome.nextLine();  
        String nomes[] = {"Joao", "Pedro", "Maria"};


        if(String salvanome == nomes[]) {
            System.out.println("Seu nome e incrivel!");
        }else{
            ("Seu nome nao e incrivel carinha triste");
        };
    }
     public static void main(String[] args){
     seraqueseunomeeincrivel();
     }
    
}