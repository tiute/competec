import java.util.Scanner;
public class Aula0 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if(numero %2== 0){
            System.out.println(" esse numero é par");
        } else {
            System.out.println(" esse numero é ímpar");
        }
           
    }
}