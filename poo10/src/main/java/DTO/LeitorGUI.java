package DTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeitorGUI extends JFrame {
    private JLabel cadastroLeitorLabel;
    private JTextField nomeField;
    private JLabel nomeTxt;
    private JPanel Painel1;
    private JTextField emailField;
    private JLabel emailTxt;
    private JLabel telefoneTxt;
    private JTextField telefoneField;
    private JLabel Documentotxt;
    private JTextField documentoField;
    private JButton saveButton;
    private JLabel mensagemTxt;
    private JButton exibirButton;
    private JButton atualizarButton;
    private JButton deletarButton;
    private JButton cadastroFuncionarioButton;
    boolean modoEdicao = false;

    public LeitorGUI() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setContentPane(Painel1);
        setTitle("Painel leitor");
        setSize(600, 300);
        Leitor obj = new Leitor();

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.setNome(nomeField.getText());
                obj.setEmail(emailField.getText());
                obj.setTelefone(telefoneField.getText());
                obj.setDocumento(documentoField.getText());
                mensagemTxt.setText("Salvo com sucesso!");
                limpar();

            }


        });


        exibirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nomeField.setText(obj.getNome());
                emailField.setText(obj.getEmail());
                telefoneField.setText(obj.getTelefone());
                documentoField.setText(obj.getDocumento());
                mensagemTxt.setText("");
            }
        });


        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!modoEdicao) {
                    nomeField.setText(obj.getNome());
                    emailField.setText(obj.getEmail());
                    telefoneField.setText(obj.getTelefone());
                    documentoField.setText(obj.getDocumento());
                    mensagemTxt.setText("Atualize os campos e depois *Atualizar* !");
                    modoEdicao = true;
                } else {
                    obj.setNome(nomeField.getText());
                    obj.setEmail(emailField.getText());
                    obj.setTelefone(telefoneField.getText());
                    obj.setDocumento(documentoField.getText());
                    mensagemTxt.setText("Atualizado com sucesso!");
                    limpar();
                    modoEdicao = false;
                }
            }
        });


        deletarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.setNome(null);
                obj.setEmail(null);
                obj.setTelefone(null);
                obj.setDocumento(null);
                limpar();
                mensagemTxt.setText("Deletado.");
            }
        });
        cadastroFuncionarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FuncionarioGUI gui2 = new FuncionarioGUI(LeitorGUI.this);
                gui2.setVisible(true);
                LeitorGUI.this.setVisible(false);
            }
        });
    }

    public void limpar() {
        nomeField.setText("");
        emailField.setText("");
        telefoneField.setText("");
        documentoField.setText("");
    }

}
