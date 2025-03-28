import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Administrador admin1 = new Administrador("1", "kauan", "Offline", new Date(), "Kauan", "kauanzinho@gmail.com");


        Cliente cliente1 = new Cliente("2", "junior", "Offline", new Date(), "Junior",
                "rua janeiro, 22", "junior@gmail.com", "92314523", "12512523", 2);


        DetalhesDoPedido detalhesDoPedido = new DetalhesDoPedido(1, 2, "Mouse Gamer", 10, 50, 1, null);
        InformacoesDeEnvio informacoesDeEnvio = new InformacoesDeEnvio(1, "SEDEX", 30, 1, null);

        Pedido pedido = new Pedido(1, new Date().toString(), "Em andamento", informacoesDeEnvio, detalhesDoPedido, cliente1);

        cliente1.getPedidos().add(pedido);

        try {
            admin1.verificarLogin("kauan");
            admin1.atualizarCatalogo("teste");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            cliente1.registrar();
            cliente1.login("junior@gmail.com", "junior");
            cliente1.atualizarPerfil("pedro", "pedro@gmail.com", "pedro");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            pedido.efetuarPedido();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Pedidos do Cliente ---");
        for (Pedido p : (List<Pedido>) cliente1.getPedidos()) {
         System.out.println("Pedido nº " + p.getNumPedido() + " | Status: " + p.getStatus());
        }

    }
}
