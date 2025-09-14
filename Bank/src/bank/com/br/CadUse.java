package bank.com.br;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

        System.out.printf("Conta: ");
        conta.setConta(scn.nextInt());

        System.out.print("Saldo: ");
        conta.setSaldo(scn.nextFloat());

        String url = "jdbc:mysql://localhost:3306/CADUSUBANK";
        String user = "root";
        String password = "root";

        String sql = "INSERT INTO CADADOSBNK (CADNM, CADPFC, CADEMAIL, CADIDAD, CADAGC, CNTBNK, SLD) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(3, email);
            stmt.setInt(4, idade);
            stmt.setInt(5, conta.getAgencia());
            stmt.setInt(6, conta.getConta());
            stmt.setFloat(7, conta.getSaldo());

            stmt.executeUpdate();
            System.out.println("\n✅ Cliente cadastrado com sucesso no banco!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

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