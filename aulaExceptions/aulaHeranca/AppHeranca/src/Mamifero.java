public class Mamifero extends Animal {

    public String tipoDePelagem;
    public int tempoDeGestacao;

    public Mamifero(int tamanho, int peso, boolean podeFazerCarinho, String habitat, String nome, String tipoDePelagem, int tempoDeGestacao) {

        super(tamanho, peso, podeFazerCarinho, habitat, nome);
        this.tipoDePelagem = tipoDePelagem;
        this.tempoDeGestacao = tempoDeGestacao;
    }

    public String getTipoDePelagem() {
        return tipoDePelagem;
    }

    public void setTipoDePelagem(String tipoDePelagem) {
        this.tipoDePelagem = tipoDePelagem;
    }

    public int getTempoDeGestacao() {
        return tempoDeGestacao;
    }

    public void setTempoDeGestacao(int tempoDeGestacao) {
        this.tempoDeGestacao = tempoDeGestacao;
    }

    
}
