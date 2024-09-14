public class Dvd extends Produto{
    public double duracao;

    public Dvd(String nome, double preco, double duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    public String imprimirInfoProduto(){
        return (super.imprimirInfoProduto() + "\n Duração do DVD: " + duracao);
    }
}
