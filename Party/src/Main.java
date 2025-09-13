import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.Frame.getFrames;

public class Main {

    public static void main(String[] args) {
        Main party = new Main();
        party.buildInvite();
    }

    public void buildInvite() {
        Frame f = new Frame("Pedido");

        Label l = new Label("Faça seu pedido!");


        Label pratoLabel = new Label("Prato do dia:");
        CheckboxGroup pratos = new CheckboxGroup();
        Checkbox bife = new Checkbox("Bife - R$ 20,00", pratos, false);
        Checkbox bisteca = new Checkbox("Bisteca - R$ 16,00", pratos, false);
        Checkbox figado  = new Checkbox("Fígado - R$ 16,00", pratos, false);
        Checkbox feijoada  = new Checkbox("Feijoada- R$ 28,00", pratos, false);
        Checkbox lasanha  = new Checkbox("Lasanha- R$ 20,00", pratos, false);


        Label pagLabel = new Label("Forma de pagamento:");
        CheckboxGroup pagamentos = new CheckboxGroup();
        Checkbox credito = new Checkbox("Crédito", pagamentos, false);
        Checkbox debito = new Checkbox("Débito", pagamentos, false);
        Checkbox dinheiro = new Checkbox("Dinheiro", pagamentos, false);


        Label retentrLabel = new Label("Escolha opção:");
        CheckboxGroup retirarouentrega = new CheckboxGroup();
        Checkbox retira = new Checkbox("Retirar no local", retirarouentrega, false);
        Checkbox entrega = new Checkbox("Entrega = R$ 3,00", retirarouentrega, false);

        Label enderecoLabel = new Label("Endereço:");
        TextField endereco = new TextField(20);

        enderecoLabel.setVisible(false); // inicialmente escondido
        endereco.setVisible(false);

        retira.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                enderecoLabel.setVisible(false);
                endereco.setVisible(false);
            }
        });

        entrega.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                enderecoLabel.setVisible(true);
                endereco.setVisible(true);
            }
        });

        Button confirmar = new Button ( "Confirmar pedido");
        Button cancelar = new Button("Cancelar");

        // Ação do botão confirmar
        confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pratoEscolhido = pratos.getSelectedCheckbox() != null ? pratos.getSelectedCheckbox().getLabel() : "Nenhum";
                String entEntr = retirarouentrega.getSelectedCheckbox() != null ? retirarouentrega.getSelectedCheckbox().getLabel() : "Nenhuma";
                String Entr = endereco.getText() != null ? endereco.getText(): "Nenhuma";
                String formaPag = pagamentos.getSelectedCheckbox() != null ? pagamentos.getSelectedCheckbox().getLabel() : "Obrigatóto";


               System.out.println("Pedido feito: " + pratoEscolhido);
                System.out.println("Opção: " + entEntr);
                System.out.println("Endereço: " + Entr);
                System.out.println("Forma de pagamento: " + formaPag);

                        System.exit(0);
                return;
            }
        });

        // Ação do botão cancelar
        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pedido cancelado.");
                System.exit(0);
            }
        });

        // Monta interface
        Panel p = new Panel();
        p.setLayout(new GridLayout(0, 1)); // organiza em coluna

        p.add(l);
        p.add(pratoLabel);
        p.add(bife);
        p.add(bisteca);
        p.add(feijoada);
        p.add(figado);
        p.add(lasanha);

        p.add(retentrLabel);
        p.add(retira);
        p.add(entrega);
        p.add(enderecoLabel);
        p.add(endereco);


        p.add(pagLabel);
        p.add(credito);
        p.add(debito);
        p.add(dinheiro);



        p.add(confirmar);
        p.add(cancelar);

        f.add(p);
        f.setSize(600, 300);
        f.setBackground(Color.darkGray);
        f.setVisible(true);

        // Fecha no X
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });



    }
}