package DAO;

import DTO.CategoriaLeitor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaLeitorDAO {
    private Connection conexao;

    public CategoriaLeitorDAO(Connection conexao) {
        this.conexao = conexao;
        try {
            String sql = "CREATE TABLE IF NOT EXISTS categoria_leitor (" +
                    "id INTEGER PRIMARY KEY, " +
                    "nome TEXT)";
            try (Statement stmt = conexao.createStatement()) {
                stmt.execute(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void guardar(CategoriaLeitor categoria) {
        try {
            String sql = "INSERT INTO categoria_leitor (id, nome) VALUES (?, ?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, categoria.getCodigo());
            stmt.setString(2, categoria.getNome());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void inserirCategoriaPadrao() {
        try {
            String sql = "INSERT IGNORE INTO categoria_leitor (id, nome) VALUES (?, ?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, 1);
            stmt.setString(2, "Aluno");
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public List<CategoriaLeitor> listar() {
        List<CategoriaLeitor> categorias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM categoria_leitor";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                CategoriaLeitor categoria = new CategoriaLeitor();
                categoria.setCodigo(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));
                categorias.add(categoria);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categorias;
    }
}
