public class BeijaFlor extends Ave {
    public String florFavorita;

    public BeijaFlor(int tamanho, int peso, boolean podeFazerCarinho, String habitat, String nome, boolean voa,
            String tipoPenagem, String florFavorita) {
        super(tamanho, peso, podeFazerCarinho, habitat, nome, voa, tipoPenagem);
        this.florFavorita = florFavorita;
    }

    public String getFlorFavorita() {
        return florFavorita;
    }

    public void setFlorFavorita(String florFavorita) {
        this.florFavorita = florFavorita;
    }

    
}
