public class Funcionario {
    public String nome;
    public String idade;
    public double salario;

    public Funcionario(String nome, String idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularBonusAnual(){
        setSalario( salario + salario * 0.10 );
    }
    
    public String imprimirDetalhes() {
        return (" Nome: " + nome + " Idade: " + idade + " Salário: " + salario);
       

    }

    
    
}
