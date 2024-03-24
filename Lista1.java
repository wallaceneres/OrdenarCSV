import java.util.Scanner;
//import java.io.File;
//import java.io.FileNotFoundException;

public class Lista1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Item[] item = {};

        do {
            System.out.println("MENU:");
            System.out.println("[1] Ler arquivo");
            System.out.println("[2] Ordenar por categoria");
            System.out.println("[3] Ordenar por avaliação");
            System.out.println("[4] Sair");
            System.out.print("Escolha uma opção: ");

            //Le o dado inserido pelo usuario
            choice = scanner.nextInt();
            //Insere quebra de linha após a leitura do dado digitado.
            scanner.nextLine();

            FileHandler openFile = new FileHandler();

            switch (choice) {
                case 1:

                    System.out.println("Opção 1 selecionada: Ler arquivo");
                    item = openFile.read();
                    break;

                case 2:

                    SortMethods.selectionSort(item);
                    openFile.saveFile(item);
                    break;
                    
                case 3:
                    System.out.println("Opção 3 selecionada: Ordenar por avaliação");
                    // Chame a função para ordenar por avaliação aqui
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}