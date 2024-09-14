public class Gerente extends Funcionario{
    public int projetosGerenciados;

    public Gerente(String nome, String idade, double salario, int projetosGerenciados) {
        super(nome, idade, salario);
        this.projetosGerenciados = projetosGerenciados;
    }

    public int getProjetosGerenciados() {
        return projetosGerenciados;
    }

    public void setProjetosGerenciados(int projetosGerenciados) {
        this.projetosGerenciados = projetosGerenciados;
    }

    public void calcularBonusAnual(){
        setSalario(salario + salario * 0.15 + (1000 * projetosGerenciados));
    }

    public String imprimirDetalhes() {
        return (" Funcionario: " + super.imprimirDetalhes() + " Projetos gerenciados: "  + projetosGerenciados);

    }

 

    
}
