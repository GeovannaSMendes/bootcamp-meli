public class Main {
    public static void main(String[] args) {
        String[] cidades = {
                "Londres",
                "Madrid",
                "Nova York",
                "Buenos Aires",
                "Asunción",
                "São Paulo",
                "Lima",
                "Santiago do Chile",
                "Lisboa",
                "Tokio"
        };

        int[][] temperaturas = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        int indiceTempBaixa = 0;
        int indiceTempAlta = 0;
        int tempMaisBaixa = temperaturas[0][0];
        int tempMaisAlta = temperaturas[0][1];

        for (int l = 0; l < temperaturas.length; l++) {
            for (int c = 0; c < temperaturas[l].length; c++) {
                if (temperaturas[l][c] < tempMaisBaixa) {
                    tempMaisBaixa = temperaturas[l][c];
                    indiceTempBaixa = l;
                }

                if (temperaturas[l][c] > tempMaisAlta) {
                    tempMaisAlta = temperaturas[l][c];
                    indiceTempAlta = l;
                }
            }
        }
        String cidadeComTempMaisBaixa = cidades[indiceTempBaixa];
        String cidadeComTempMaisAlta = cidades[indiceTempAlta];

        System.out.println("A cidade com a temperatura mais baixa foi: " + cidadeComTempMaisBaixa + " chegando a " + tempMaisBaixa + "º C.");
        System.out.println("A cidade com a temperatura mais alta foi: " + cidadeComTempMaisAlta + " chegando a " + tempMaisAlta + "º C.");

    }
}
