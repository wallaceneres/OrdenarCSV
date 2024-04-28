public class SortMethods {

    public static void selectionSort(Item[] item) {
        //itera sobre todas as posicoes do vetor
        for (int i = 0; i < item.length - 1; i++) {
            //atributo para gravar o menor valor encontrado
            int min = i;
            //realiza uma nova iteração dentro da primeira, comparando o valor da primeira iteração [I] com o valor da segunda [J].
            //Caso [J] > [I] o atributo min recebe [J].
            for (int j = i + 1; j < item.length; j++) {
                if (item[j].getRating()> item[min].getRating()) {
                    min = j;
                }
            }
            //realiza a troca dos valores de posicao.
            Item temp = item[min];
            item[min] = item[i];
            item[i] = temp;
        }
    }

    public static void bubbleSort(Item[] item) {
        //guarda o tamanho do vetor
        int n = item.length;
        //booleano para gravar estado de troca true = trocou alguma posicao do vetor, false = nao realizou nenhuma troca.
        boolean change;
        
        do {
            change = false;
            //itera sobre cada posicao do vetor
            for (int i = 1; i < n; i++) {
                //compara a posicao atual do vetor com a posicao anterior utilizando o metodo .compareTo, se for positivo retorna 1 e os vetores são trocados de posicao.
                if (item[i - 1].getCategory().compareTo(item[i].getCategory()) > 0) {
                    Item temp = item[i - 1];
                    item[i - 1] = item[i];
                    item[i] = temp;
                    change = true;
                }
            }
            //sempre após a iteração completa do vetor, a ultima posicao estará com o maior valor, portanto não será mais necessário iterar sobre ela.
            n--;
        } while (change);
    }

}
