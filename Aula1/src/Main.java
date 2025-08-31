import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.printf("Nome: ");
        String nome  = p.nextLine();

        System.out.printf("Endereço: ");
        String cpf = p.nextLine();

        System.out.printf("CPF: ");
        String ende = p.nextLine();



        System.out.println( "Nome:" + nome);
        System.out.println( "CPF: " + cpf );
        System.out.println("Endereço: " + ende );


        System.out.println("Cadastro relizado com sucesso! ");





    }
}