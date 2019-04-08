
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
    
 }
}
