public class LivroDeNotas{
    private String nomeDaDisciplina; // inicia null

    public void setNomeDaDisciplina(String nomeDaDisciplina){ // Poderia ser String n
        this.nomeDaDisciplina = nomeDaDisciplina; // Poderia ser nomeDaDisciplina = n
    }

    public void abrirMensagem(){
        System.out.println("Boas vindas a "+ nomeDaDisciplina);
    }
}


