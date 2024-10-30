public class BuscaBinariaTestes {
    
    public static int buscaBinaria(int[] array, int elemento) {
        int inicio = 0, fim = array.length - 1;
        int contagemTestes = 0;

        while (inicio <= fim) {
            contagemTestes++;
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == elemento) {
                return contagemTestes;
            } else if (array[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        
        return contagemTestes;
    }

    public static void main(String[] args) {
        int[] tamanhos = {10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};
        int elementoNaoExistente = -1;
        System.out.println("Tamanho da lista | Número de testes");

        for (int tamanho : tamanhos) {
            int[] array = new int[tamanho];
            for (int i = 0; i < tamanho; i++) {
                array[i] = i; 
            }

            int testes = buscaBinaria(array, elementoNaoExistente);
            System.out.println("Tamanho da lista: "+tamanho + " | Número de Testes: " + testes);
        }
    }
}