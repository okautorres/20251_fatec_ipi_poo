public class TesteLivroDeNotas{
    public static void main(String...args){
        //1. Consturir um livro de notas
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        LivroDeNotas livro2 = new LivroDeNotas();

        //livroDeNotas.nomeDaDisciplina = "POO";
        //livro2.nomeDaDisciplina = "BD";
        //livro2.abrirMensagem();
        
        livroDeNotas.setNomeDaDisciplina("POO");

        //2. Acionar o comportamento de exibir mensagem de boas vindas
        livroDeNotas.abrirMensagem();
    }
}