import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFile{

    public void read() {
        String filePath = "C:\\Users\\Wallace\\Desktop\\Projeto faculdade\\lista4.csv";
            
            try {
                File file = new File(filePath);
                Scanner scanner = new Scanner(file);

                Item[] item = new Item[10];

                Item item1 = new Item("Jogo1", "Classificação1", "teste");

                item[0] = item1;

                Item teste = item[0];

                System.out.println(teste.getGame());
                
                // Loop pelas linhas do arquivo CSV
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();

                    // Dividir a linha em colunas usando a vírgula como separador
                    String[] columns = line.split(",");

                    // Processar as colunas conforme necessário
                    for (String column : columns) {

                    }
                }
                
                scanner.close(); // Fechar o scanner quando terminar de ler o arquivo
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não encontrado: " + e.getMessage());
            }
    }
}