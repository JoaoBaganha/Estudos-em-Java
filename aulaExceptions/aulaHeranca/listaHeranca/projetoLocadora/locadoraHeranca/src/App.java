import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Produto> produtinho = new ArrayList<Produto>();

        Cd cdzinho = new Cd("Chaves", 15.0, 3);
        Dvd dvdzinho = new Dvd("RENATO GAUCHO HIGHLIGHTS", 50, 10.0);
        Livro livrinho = new Livro("Vida do Lira", 100, "Lira");
        Produto produtinhoGenerico = new Produto("paçoquinha", 2.0);

        produtinho.add(livrinho);   
        produtinho.add(dvdzinho);
        produtinho.add(cdzinho);
        produtinho.add(produtinhoGenerico);
        

        for (Produto p : produtinho) {
            System.out.println(p.imprimirInfoProduto() + "\n");
        }

        



    }
}
