import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerDouble = new Scanner(System.in);
        int menu;

        do{
            exibirMenu();
            menu = scannerInt.nextInt();

            switch (menu) {
                case 1:
                    
                    break;
            
                
            }
        }while (menu != 5); 
    }


    static void exibirMenu(){
        System.out.println("1 - Adicionar número ao vetor");
        System.out.println("5 - Sair da Agenda");

    }
}
