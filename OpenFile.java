import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFile{

    public void read() {
        String filePath = "C:\\Users\\Wallace\\Desktop\\Projeto faculdade\\Unordered Documents\\lista3.csv";
            
            try {
                File file = new File(filePath);
                Scanner scanner = new Scanner(file);

                Item[] item = new Item[100];

                int i = 0;
                
                // Loop pelas linhas do arquivo CSV
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();

                    // Dividir a linha em colunas usando a vírgula como separador
                    String[] columns = line.split(",");
                    // Cada coluna é salva em uma variavel.
                    String game = columns[0];
                    String category = columns[1];
                    double rating = Double.parseDouble(columns[2]);
                    //O objeto Item é instanciado e salvo dentro de uma posição dentro do vetor item do tipo Item
                    item[i] = new Item(game, category, rating);
            
                    i++;
                }

                Item teste = item[10];

                System.err.println(teste);

                scanner.close(); // Fechar o scanner quando terminar de ler o arquivo
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não encontrado: " + e.getMessage());
            }
    }
}