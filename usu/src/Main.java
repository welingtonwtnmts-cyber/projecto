
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cpf = "000.000.000-00";
        String nome = "Champs";
        String endereco = " Rua: Jatobá" ;
        int nr = 77;
        float valor = 2000 ;


        System.out.println("Dados Pessoais: " );
        System.out.println("Nome: " + nome + ", CPF: " + cpf + ", Endereço" + endereco + ", Número da residencia" + nr + "Conta" + valor );

        String nom = scanner.nextLine();
        System.out.println( "Olá, " + nom + "!");



    }
}