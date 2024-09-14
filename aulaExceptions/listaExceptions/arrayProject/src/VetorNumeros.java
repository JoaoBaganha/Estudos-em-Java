import java.util.ArrayList;

public class VetorNumeros {
    public static ArrayList<Numeros> listaNumeros = new ArrayList<>();

    public static ArrayList<Numeros> getListaNumeros() {
        return listaNumeros;
    }

    public static void setListaNumeros(ArrayList<Numeros> listaNumeros) {
        VetorNumeros.listaNumeros = listaNumeros;
    }

    public void adicionarNumeroAoVetor(Numeros num){
        listaNumeros.add(num);
    }
}
