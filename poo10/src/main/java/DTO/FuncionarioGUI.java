package DTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FuncionarioGUI extends JFrame{
    private JPanel Painel2;
    private JLabel cadastroLeitorLabel;
    private JLabel nomeTxt;
    private JTextField nomeField;
    private JTextField emailField;
    private JLabel telefoneTxt;
    private JTextField telefoneField;
    private JLabel Documentotxt;
    private JTextField documentoField;
    private JButton saveButton;
    private JLabel emailTxt;
    private JLabel mensagemTxt;
    private JButton exibirButton;
    private JButton atualizarButton;
    private JButton deletarButton;
    private JButton voltarButton;
    private JTextField cargoField;
    private JLabel cargoTxt;
    private  LeitorGUI telaLeitor;
    boolean modoEdicao = false;

    public FuncionarioGUI(LeitorGUI telaLeitor) {
        this.telaLeitor = telaLeitor;
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setContentPane(Painel2);
        setTitle("Painel Funcionario");
        setSize(600, 300);
        Funcionario obj = new Funcionario();

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.setNome(nomeField.getText());
                obj.setEmail(emailField.getText());
                obj.setTelefone(telefoneField.getText());
                obj.setDocumento(documentoField.getText());
                obj.setCargo(cargoField.getText());
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
                cargoField.setText(obj.getCargo());
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
                    cargoField.setText(obj.getCargo());
                    mensagemTxt.setText("Atualize os campos e depois *Atualizar* !");
                    modoEdicao = true;
                } else {
                    obj.setNome(nomeField.getText());
                    obj.setEmail(emailField.getText());
                    obj.setTelefone(telefoneField.getText());
                    obj.setDocumento(documentoField.getText());
                    obj.setCargo(cargoField.getText());
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
                obj.setCargo(null);
                limpar();
                mensagemTxt.setText("Deletado.");
            }
        });

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaLeitor.setVisible(true);
                FuncionarioGUI.this.setVisible(false);
            }
        });
    }

    public void limpar() {
        nomeField.setText("");
        emailField.setText("");
        telefoneField.setText("");
        documentoField.setText("");
        cargoField.setText("");
    }

}

