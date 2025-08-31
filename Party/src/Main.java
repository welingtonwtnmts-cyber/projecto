
import java.util.Scanner;

import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        Main party = new Main();
        party.buildInvite();
    }

    public void buildInvite() {

        Frame f = new Frame("Pedido");
        Label l = new Label("Fça seu pedido!");
        TextArea t = new TextArea( 1, 20); // 3 linhas, 20 colunas
        Button b = new Button("Confirmar seu pedido");
        Button c = new Button(" retirada");
        Label fm = new Label("Forma de pagamento: ");
        Button cd = new Button("Crédito");
        Button db = new Button("Débito");
        Button dn = new Button("Dinheiro");


        // Ação do botão "Confirmar presença"
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = t.getText(); // pega o texto do TextArea
                System.out.println("Pidido Feito: " + nome);
            }
        });

        // Ação do botão "Me retiro"
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Reltira no local");
                String b = c.getLabel();
                System.exit(0);
            }


        });

        cd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pagamento em crédito ");
                String b = cd.getLabel();
                System.exit(0);
            }


        });

        db.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pagamento em Débito");
                String b = db.getLabel();
                System.exit(0);
            }


        });

        db.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pagamento em Dinheitro");
                String b = db.getLabel();
                System.exit(0);
            }


        });



        Panel p = new Panel();
        p.add(l);
        p.add(t);
        p.add(b);
        p.add(c);

        f.add(p);
        f.setSize(600, 400);
        f.setVisible(true);

        // Fecha a janela ao clicar no X
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}