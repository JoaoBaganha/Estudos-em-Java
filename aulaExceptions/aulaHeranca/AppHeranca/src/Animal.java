public class Animal {
    public int tamanho;
    public int peso;
    public boolean podeFazerCarinho;
    public String habitat;
    public String nome;

    public Animal(int tamanho, int peso, boolean podeFazerCarinho, String habitat, String nome) {
        this.tamanho = tamanho;
        this.peso = peso;
        this.podeFazerCarinho = podeFazerCarinho;
        this.habitat = habitat;
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isPodeFazerCarinho() {
        return podeFazerCarinho;
    }

    public void setPodeFazerCarinho(boolean podeFazerCarinho) {
        this.podeFazerCarinho = podeFazerCarinho;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    
}
