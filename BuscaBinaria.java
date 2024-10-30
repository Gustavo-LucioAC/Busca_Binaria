public class BuscaBinaria {

    public static void main(String[] args) 
    {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        
        int elemento = 7;
        
        int resultado = Busca(array, elemento, 0, array.length - 1);
        
        if (resultado == -1) 
        {
            System.out.println("Elemento não encontrado no array.");
        } 
        else 
        {
            System.out.println("Elemento encontrado no índice: " + resultado);
        }
    }

    public static int Busca(int[] lista, int n, int start, int end)
    {
        if(start <= end){
            
            int busca = start+(end-start)/2;


            if(lista[busca] == n){
                return busca;
            }
            if (lista[busca] > n) {
                return Busca(lista, n, start, end - 1);
            }

            return Busca(lista, n, busca+1, end);
        }

        return -1;
    }
}
