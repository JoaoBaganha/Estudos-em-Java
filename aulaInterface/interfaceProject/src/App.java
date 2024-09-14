public class App {
    public static void main(String[] args) throws Exception {
        Bicicleta bike = new Bicicleta();
        Carro cike = new Carro();
        Moto mike = new Moto();

        System.out.println(bike.acelerar());
        System.out.println(cike.obterVelocidadeMaxima());
        System.out.println(mike.frear());
    }
}
