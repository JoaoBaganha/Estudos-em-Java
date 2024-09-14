public class Livro extends Produto {
    public String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String imprimirInfoProduto(){
        return (super.imprimirInfoProduto() + "\n autor do livro: " + autor);
    }
}
