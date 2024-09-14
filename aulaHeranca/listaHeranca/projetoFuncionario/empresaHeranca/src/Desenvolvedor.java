public class Desenvolvedor extends Funcionario{
    public String linguagemFavorita;

    public Desenvolvedor(String nome, String idade, double salario, String linguagemFavorita) {
        super(nome, idade, salario);
        this.linguagemFavorita = linguagemFavorita;
    }

    public String getLinguagemFavorita() {
        return linguagemFavorita;
    }

    public void setLinguagemFavorita(String linguagemFavorita) {
        this.linguagemFavorita = linguagemFavorita;
    }

    public String imprimirDetalhes(){
       return (" Funcionario: " + super.imprimirDetalhes() + " Linguagem preferida: " + linguagemFavorita);
    }

    
}
