package DAO;

import DTO.Leitor;
import DTO.CategoriaLeitor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LeitorDAO {

    private Connection conexao;

    public LeitorDAO(Connection conexao) {
        this.conexao = conexao;
        try {
            String sql = "CREATE TABLE IF NOT EXISTS leitor (" +
                    "codigo INTEGER PRIMARY KEY, " +
                    "nome TEXT, " +
                    "email TEXT, " +
                    "telefone TEXT, " +
                    "documento TEXT, " +
                    "id_categoria INTEGER)";
            try (Statement stmt = conexao.createStatement()) {
                stmt.execute(sql);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void guardar(Leitor leitor) throws SQLException {
        String sql = "INSERT INTO leitor (codigo, nome, email, telefone, documento, id_categoria) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, leitor.getCodigo());
            stmt.setString(2, leitor.getNome());
            stmt.setString(3, leitor.getEmail());
            stmt.setString(4, leitor.getTelefone());
            stmt.setString(5, leitor.getDocumento());
            stmt.setInt(6, leitor.getCategorialeitor().getCodigo());
            stmt.executeUpdate();
        }
    }

    public Leitor carregar(int codigo) throws SQLException {
        String sql = "SELECT * FROM leitor WHERE codigo = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Leitor leitor = new Leitor();
                leitor.setCodigo(rs.getInt("codigo"));
                leitor.setNome(rs.getString("nome"));
                leitor.setEmail(rs.getString("email"));
                leitor.setTelefone(rs.getString("telefone"));
                leitor.setDocumento(rs.getString("documento"));

                CategoriaLeitor categoria = new CategoriaLeitor();
                categoria.setCodigo(rs.getInt("id_categoria"));
                leitor.setCategorialeitor(categoria);

                return leitor;
            }
        }
        return null;
    }

    public List<Leitor> listar() throws SQLException {
        List<Leitor> leitores = new ArrayList<>();
        String sql = "SELECT * FROM leitor";
        try (Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Leitor leitor = new Leitor();
                leitor.setCodigo(rs.getInt("codigo"));
                leitor.setNome(rs.getString("nome"));
                leitor.setEmail(rs.getString("email"));
                leitor.setTelefone(rs.getString("telefone"));
                leitor.setDocumento(rs.getString("documento"));

                CategoriaLeitor categoria = new CategoriaLeitor();
                categoria.setCodigo(rs.getInt("id_categoria"));
                leitor.setCategorialeitor(categoria);

                leitores.add(leitor);
            }
        }
        return leitores;
    }
}
