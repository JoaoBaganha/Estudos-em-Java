public class Homem extends Mamifero{
    public String cpf;
    

    public Homem(int tamanho, int peso, boolean podeFazerCarinho, String habitat, String nome, String tipoDePelagem,
            int tempoDeGestacao, String cpf) {
        super(tamanho, peso, podeFazerCarinho, habitat, nome, tipoDePelagem, tempoDeGestacao);
        this.cpf = cpf;
        
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
