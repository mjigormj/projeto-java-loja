
import java.util.Scanner;

public class ClassePrincipal {
 public static void main(String[] args){
     
     Carro carro = new Carro();
     
     
     Scanner scan = new Scanner (System.in);
     
     System.out.print("Digite o nome do carro: ");
     carro.nome = scan.next();
     System.out.print("Digite a marca do carro: ");
     carro.marca = scan.next();
     System.out.print("Digite o modelo do carro: ");
     carro.modelo = scan.next();
     System.out.print("Digite a cor do carro: ");
     carro.cor = scan.next();
     System.out.print("Digite a largura do carro: ");
     carro.largura = scan.next();
     System.out.print("Digite o peso do carro: ");
     carro.peso = scan.next();
    
     System.out.println("\n");
     
     System.out.println("O nome do carro é " + carro.nome);
     System.out.println("A marca do carro é " + carro.marca);
     System.out.println("O modelo do carro é " + carro.modelo);
     System.out.println("A cor do carro é " + carro.cor);          
     System.out.println("A largura do carro é " + carro.largura);
     System.out.println("O peso do carro é " + carro.peso);          
    
     System.out.println("\n");
     
     Carro carro2 = new Carro();
     
     System.out.print("Digite o nome do carro: ");
     carro2.nome = scan.next();
     System.out.print("Digite a marca do carro: ");
     carro2.marca = scan.next();
     System.out.print("Digite o modelo do carro: ");
     carro2.modelo = scan.next();
     System.out.print("Digite a cor do carro: ");
     carro2.cor = scan.next();
     System.out.print("Digite a largura do carro: ");
     carro2.largura = scan.next();
     System.out.print("Digite o peso do carro: ");
     carro2.peso = scan.next();
    
     System.out.println("\n");
     
     System.out.println("O nome do carro é " + carro2.nome);
     System.out.println("A marca do carro é " + carro2.marca);
     System.out.println("O modelo do carro é " + carro2.modelo);
     System.out.println("A cor do carro é " + carro2.cor);          
     System.out.println("A largura do carro é " + carro2.largura);
     System.out.println("O peso do carro é " + carro2.peso);          
 
     Carro carro3 = new Carro();
     
     System.out.println("\n");  
   
     System.out.print("Digite o nome do carro: ");
     carro3.nome = scan.next();
     System.out.print("Digite a marca do carro: ");
     carro3.marca = scan.next();
     System.out.print("Digite o modelo do carro: ");
     carro3.modelo = scan.next();
     System.out.print("Digite a cor do carro: ");
     carro3.cor = scan.next();
     System.out.print("Digite a largura do carro: ");
     carro3.largura = scan.next();
     System.out.print("Digite o peso do carro: ");
     carro3.peso = scan.next();
    
     System.out.println("\n");
     
     System.out.println("O nome do carro é " + carro3.nome);
     System.out.println("A marca do carro é " + carro3.marca);
     System.out.println("O modelo do carro é " + carro3.modelo);
     System.out.println("A cor do carro é " + carro3.cor);          
     System.out.println("A largura do carro é " + carro3.largura);
     System.out.println("O peso do carro é " + carro3.peso);          
 
 }
}
