import java.util.Arrays;

public class Main {
    static final int N_WORDS = 1;
    static String[] texto = {"palavra"};

    static double encontrarPalavra(String[] array, int length) {
        double time_execution;

        long start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            if (array[i].equals("palavra")) {
                System.out.println("Palavra Encontrada!");
            }
        }
        long stop = System.currentTimeMillis();
        time_execution = (double) (stop - start) / 1000.0;
        return time_execution;
    }

    public static void main(String[] args) {
        double time;
        int tamanho = texto.length;

        time = encontrarPalavra(texto, tamanho);

        System.out.println("Quantidade de palavras: " + tamanho);
        System.out.println("Tempo de execução total: " + time + " segundos");
    }
}
