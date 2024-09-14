import java.util.ArrayList;

public class Locadora {
    public static ArrayList<Produto> listaProduto = new ArrayList<>();

    public static ArrayList<Produto> getListaProduto() {
        return listaProduto;
    }

    public static void setListaProduto(ArrayList<Produto> listaProduto) {
        Locadora.listaProduto = listaProduto;
    }

    public static void adicionarProduto(Produto produto){
        listaProduto.add(produto);
    }
        

    
}
