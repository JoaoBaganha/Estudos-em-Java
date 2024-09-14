public class App {
    public static void main(String[] args) throws Exception {
        Funcionario funcionarioGeral = new Funcionario("Isaac", "35", 100);
        Gerente gerenteGeral = new Gerente("Luis Baganha", "47", 100, 2);
        Desenvolvedor desenvolvedorGeral = new Desenvolvedor("João Baganha", "19", 10, "JavaScript");

        funcionarioGeral.calcularBonusAnual();
        System.out.println(funcionarioGeral.imprimirDetalhes());

        gerenteGeral.calcularBonusAnual();
        System.out.println(gerenteGeral.imprimirDetalhes());

        desenvolvedorGeral.calcularBonusAnual();
        System.out.println(desenvolvedorGeral.imprimirDetalhes());
    }
}
