package DTO;

import DAO.CategoriaLeitorDAO;
import DAO.FuncionarioDAO;
import DAO.LeitorDAO;
import DAO.ConexaoMySQL;
import DTO.Funcionario;
import DTO.Leitor;
import DTO.CategoriaLeitor;

import java.sql.Connection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConexaoMySQL conexaoMySQL = new ConexaoMySQL();

        if (!conexaoMySQL.connect()) {
            System.err.println("Falha ao conectar no banco MySQL.");
            return;
        }

        Connection conexao = conexaoMySQL.getConnection();

        try {
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO(conexao);
            LeitorDAO leitorDAO = new LeitorDAO(conexao);
            CategoriaLeitorDAO categoriaDAO = new CategoriaLeitorDAO(conexao);

            funcionarioDAO.guardar(new Funcionario(2, "Abraham Silva", "abrhanm@gmail.com", "11988887777", "34512353", "Bibliotecário", new ArrayList<>()));
            System.out.println("Funcionário salvo com sucesso!");

            categoriaDAO.inserirCategoriaPadrao();

            CategoriaLeitor categoria = new CategoriaLeitor();
            categoria.setCodigo(1);

            Leitor leitor = new Leitor(2, "bbb Souza", "bbb@hotmail.com", "1252132", "5135315", categoria, new ArrayList<>(), new ArrayList<>());
            leitorDAO.guardar(leitor);
            System.out.println("Leitor salvo com sucesso!");

            System.out.println("Funcionários:");
            for (Funcionario f : funcionarioDAO.listar()) {
                System.out.println("- " + f.getNome() + " | Cargo: " + f.getCargo());
            }

            System.out.println("Leitores:");
            for (Leitor l : leitorDAO.listar()) {
                System.out.println("- " + l.getNome() + " | Categoria ID: " + l.getCategorialeitor().getCodigo());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexaoMySQL.disconnect();
        }
    }
}
