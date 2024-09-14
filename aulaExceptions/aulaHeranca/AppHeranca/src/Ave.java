public class Ave extends Animal{
    public boolean voa;
    public String tipoPenagem;

    public Ave(int tamanho, int peso, boolean podeFazerCarinho, String habitat, String nome, boolean voa,
            String tipoPenagem) {

        super(tamanho, peso, podeFazerCarinho, habitat, nome);
        this.voa = voa;
        this.tipoPenagem = tipoPenagem;
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public String getTipoPenagem() {
        return tipoPenagem;
    }

    public void setTipoPenagem(String tipoPenagem) {
        this.tipoPenagem = tipoPenagem;
    }

    
    
}
