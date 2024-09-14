public class App {
    public static void main(String[] args) throws Exception {
        Animal aguaVivaAnimal = new Animal(12, 2, false, "oceano", "agua-viva");
        Mamifero gatoMamifero = new Mamifero(15, 8, true, "doméstico", "gato", "curto", 2);
        Ave aguiaAve = new Ave(70, 30, false, "montanhas", "águia", true, "média");
        Cachorro pitbullCachorro = new Cachorro(100, 50, true, "doméstico", "princesa", "curto", 2, "alto", "pitbull");
        Homem alessandraHomem = new Homem(165, 70, true, "cesupa", "Alessandra", "curta", 9, "000333");
        BeijaFlor beijinhBeijaFlor = new BeijaFlor(5, 1, true, "floresta", "beija-florinha", true, "curta", "rosa");

        System.out.println("Nome: " + aguaVivaAnimal.getNome() + " tamanho: " + aguaVivaAnimal.getTamanho() + " peso: "
                + aguaVivaAnimal.getPeso() + " habitat: " + aguaVivaAnimal.getHabitat() + " pode fazer carinho?: " + aguaVivaAnimal.isPodeFazerCarinho());

        System.out.println("Nome: " + gatoMamifero.getNome() + " tamanho: " + gatoMamifero.getTamanho() + " peso: "
                + gatoMamifero.getPeso() + " habitat: " + gatoMamifero.getHabitat() + " pelagem: " + gatoMamifero.getTipoDePelagem() + " tempo gestação: " + gatoMamifero.getTempoDeGestacao() + " pode fazer carinho?: " + gatoMamifero.isPodeFazerCarinho());

        System.out.println("Nome: " + alessandraHomem.getNome() + " tamanho: " + alessandraHomem.getTamanho() + " peso: "
                + alessandraHomem.getPeso() + " habitat: " + alessandraHomem.getHabitat() + " pelagem: " + alessandraHomem.getTipoDePelagem() + " tempo gestação: " + alessandraHomem.getTempoDeGestacao() + " cpf: " + alessandraHomem.getCpf() + " pode fazer carinho?: " + alessandraHomem.isPodeFazerCarinho());

        System.out.println("Nome: " + aguiaAve.getNome() + " tamanho: " + aguiaAve.getTamanho() + " peso: "
                + aguiaAve.getPeso() + " habitat: " + aguiaAve.getHabitat() + " essa ave voa?: " + aguiaAve.isVoa() + " tipo penagem: " + aguiaAve.getTipoPenagem() + " pode fazer carinho?: " + aguiaAve.isPodeFazerCarinho());

        System.out.println("Nome: " + pitbullCachorro.getNome() + " tamanho: " + pitbullCachorro.getTamanho() + " peso: "
                + pitbullCachorro.getPeso() + " habitat: " + pitbullCachorro.getHabitat() + " tempo gestação: " + pitbullCachorro.getTempoDeGestacao() + " raça canina: " + pitbullCachorro.getRaçaCanina() + " volume latido: " + pitbullCachorro.getVolumeLatido() + " pode fazer carinho?: " + pitbullCachorro.isPodeFazerCarinho());

        System.out.println("Nome: " + beijinhBeijaFlor.getNome() + " tamanho: " + beijinhBeijaFlor.getTamanho() + " peso: "
                + beijinhBeijaFlor.getPeso() + " habitat: " + beijinhBeijaFlor.getHabitat() + " essa ave voa?: " + beijinhBeijaFlor.isVoa() + " tipo penagem: " + beijinhBeijaFlor.getTipoPenagem() + " flor favorita: " + beijinhBeijaFlor.getFlorFavorita() + " pode fazer carinho?: " + beijinhBeijaFlor.isPodeFazerCarinho());

    }
}
