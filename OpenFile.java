import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFile{

    public Item[] read() {
        String filePath = "C:\\Users\\Wallace\\Desktop\\Projeto faculdade\\Unordered Documents\\lista3.csv";
        //variavel para guardar a contagem de linhas dentro do arquivo .csv
        int numLines = countLines(filePath);
        //declaracao da variavel item com a alocação correta com a quantidade de posicoes necessárias.
        Item[] item = new Item[numLines];

        try {
            //contador para guardar o objeto dentro de uma posicao no vetor item
            int i = 0;

            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            
            // Loop pelas linhas do arquivo CSV
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Dividir a linha em colunas usando a vírgula como separador
                String[] columns = line.split(",");
                // Cada coluna é salva em uma variavel.
                String game = columns[0];
                String category = columns[1];
                Double rating = Double.parseDouble(columns[2]);
                //O objeto Item é instanciado e salvo dentro de uma posição dentro do vetor item do tipo Item
                item[i] = new Item(game, category, rating);
        
                i++;
            }

            System.out.println("Carregado com sucesso! \n");

            scanner.close(); // Fechar o scanner quando terminar de ler o arquivo
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }

        return item;
    }

//Metodo para contar as linhas dentro do arquivo .csv
    public int countLines(String filePath) {
        //contador
        int lineCount = 0;

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                //Lê a proxima linha
                scanner.nextLine();
                // Incrementa o contador de linhas
                lineCount++;
            }

            System.out.println("O arquivo CSV possui: " + lineCount + " linhas");

            // Fecha o scanner quando terminar de ler o arquivo
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }

        return lineCount;
    }
}