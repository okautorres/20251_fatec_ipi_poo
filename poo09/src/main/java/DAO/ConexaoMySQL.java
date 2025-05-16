package DAO;

import java.sql.*;

public class ConexaoMySQL {

    private Connection conexao;


    private final String urlSemBanco = "jdbc:mysql://localhost:3306/?useSSL=false&serverTimezone=UTC";
    private final String urlComBanco = "jdbc:mysql://localhost:3306/poo?useSSL=false&serverTimezone=UTC";
    private final String user = "root";
    private final String password = "root@4599";

    public boolean connect() {
        try {

            try (Connection conexaoTemp = DriverManager.getConnection(urlSemBanco, user, password);
                 Statement stmt = conexaoTemp.createStatement()) {
                stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS poo");
                System.out.println("Banco 'poo' criado ou já existia.");
            }


            this.conexao = DriverManager.getConnection(urlComBanco, user, password);
            System.out.println("Conectado ao banco 'poo' MySQL!");
            return true;

        } catch (SQLException err) {
            System.err.println("Erro na conexão: " + err.getMessage());
            return false;
        }
    }

    public boolean disconnect() {
        try {
            if (this.conexao != null && !this.conexao.isClosed()) {
                this.conexao.close();
                System.out.println("Desconectado do MySQL!");
            }
            return true;
        } catch (SQLException err) {
            System.err.println("Erro ao desconectar: " + err.getMessage());
            return false;
        }
    }

    public Statement createStatement() {
        try {
            return this.conexao.createStatement();
        } catch (SQLException err) {
            System.err.println("Erro ao criar Statement: " + err.getMessage());
            return null;
        }
    }

    public PreparedStatement prepareStatement(String sql) {
        try {
            return this.conexao.prepareStatement(sql);
        } catch (SQLException err) {
            System.err.println("Erro ao preparar statement: " + err.getMessage());
            return null;
        }
    }

    public Connection getConnection() {
        return this.conexao;
    }
}
