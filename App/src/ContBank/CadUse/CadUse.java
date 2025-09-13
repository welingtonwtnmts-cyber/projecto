package ContBank.CadUse;

import java.util.Scanner;

public class CadUse {
    public static void main(String[] args) {

        ContBank conta = new ContBank();

            String nome;
            String cpf;
            String email;
            int idade;

        Scanner scn = new Scanner(System.in);

        System.out.printf("Nome: ");
        nome  = scn.nextLine();

        System.out.printf("CPF: ");
        cpf  = scn.nextLine();

        System.out.printf("Email: ");
        email  = scn.nextLine();

        System.out.printf("Idade:  ");
        idade  = scn.nextInt();

        System.out.printf("Agência: ");
        conta.setAgencia(scn.nextInt());

        System.out.printf("Canta: ");
        conta.setConta(scn.nextInt());

        System.out.print("Saldo: ");
        conta.setSaldo(scn.nextFloat());

        System.out.println(" =====Dados do cliente===== \n" +
                "Nome: " + nome + " \n"
                + "CPF: " + cpf + " \n"
                + "Idade: " + idade + " \n"
                +  "Email: " + email + " \n" );

        System.out.println("\n=== Dados da Conta ===");
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Conta: " + conta.getConta());
        System.out.println("Saldo: R$ " + conta.getSaldo());

        }

}