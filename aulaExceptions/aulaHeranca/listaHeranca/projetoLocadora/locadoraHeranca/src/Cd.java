public class Cd extends Produto{
    public int numeroDeFaixas;

    public Cd(String nome, double preco, int numeroDeFaixas) {
        super(nome, preco);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public String imprimirInfoProduto(){
        return (super.imprimirInfoProduto() + "\n Número de faixas do CD: " + numeroDeFaixas);
    }
}
