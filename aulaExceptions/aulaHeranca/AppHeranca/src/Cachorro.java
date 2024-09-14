public class Cachorro extends Mamifero {
    public String volumeLatido;
    public String raçaCanina;

    public Cachorro(int tamanho, int peso, boolean podeFazerCarinho, String habitat, String nome, String tipoDePelagem,
            int tempoDeGestacao, String volumeLatido, String raçaCanina) {
        super(tamanho, peso, podeFazerCarinho, habitat, nome, tipoDePelagem, tempoDeGestacao);
        this.volumeLatido = volumeLatido;
        this.raçaCanina = raçaCanina;
    }

    public String getVolumeLatido() {
        return volumeLatido;
    }

    public void setVolumeLatido(String volumeLatido) {
        this.volumeLatido = volumeLatido;
    }

    public String getRaçaCanina() {
        return raçaCanina;
    }

    public void setRaçaCanina(String raçaCanina) {
        this.raçaCanina = raçaCanina;
    }

}
