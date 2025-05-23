package DAO;

import DTO.Funcionario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    private Connection conexao;

    public FuncionarioDAO(Connection conexao) {
        this.conexao = conexao;
        try {
            String sql = "CREATE TABLE IF NOT EXISTS funcionario (" +
                    "codigo INTEGER PRIMARY KEY, " +
                    "nome TEXT, " +
                    "email TEXT, " +
                    "telefone TEXT, " +
                    "documento TEXT, " +
                    "cargo TEXT)";
            try (Statement stmt = conexao.createStatement()) {
                stmt.execute(sql);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void guardar(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionario (codigo, nome, email, telefone, documento, cargo) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, funcionario.getCodigo());
            stmt.setString(2, funcionario.getNome());
            stmt.setString(3, funcionario.getEmail());
            stmt.setString(4, funcionario.getTelefone());
            stmt.setString(5, funcionario.getDocumento());
            stmt.setString(6, funcionario.getCargo());
            stmt.executeUpdate();
        }
    }

    public Funcionario carregar(int codigo) throws SQLException {
        String sql = "SELECT * FROM funcionario WHERE codigo = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setCodigo(rs.getInt("codigo"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setDocumento(rs.getString("documento"));
                funcionario.setCargo(rs.getString("cargo"));
                return funcionario;
            }
        }
        return null;
    }

    public List<Funcionario> listar() throws SQLException {
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionario";
        try (Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setCodigo(rs.getInt("codigo"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setDocumento(rs.getString("documento"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionarios.add(funcionario);
            }
        }
        return funcionarios;
    }
}
