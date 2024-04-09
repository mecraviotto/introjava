public class Main {
    private static final String[] ciudades = {
            "Londres",
            "Madrid",
            "Nueva York",
            "Buenos Aires",
            "Asunción",
            "São Paulo",
            "Lima",
            "Santiago de Chile",
            "Lisboa",
            "Tokio"
    };

    private static final int[][] temperaturas = {
            {-2, 33},
            {-3, 32},
            {-8, 27},
            {-4, 37},
            {-6, 42},
            {-5, 43},
            {0, 39},
            {-7, 26},
            {-1, 31},
            {-10, 35},
    };

    public static void main(String[] args) {

        Integer indiceMaximaTemperatura = null;
        Integer indiceMinimaTemperatura = null;
        for (int i = 0; i < temperaturas.length; i++) {
            if(indiceMinimaTemperatura == null || temperaturas[i][0] <= indiceMinimaTemperatura) {
                indiceMinimaTemperatura = i;
            }

            if(indiceMaximaTemperatura == null || temperaturas[i][1] >= indiceMaximaTemperatura) {
                indiceMaximaTemperatura = i;
            }
        }

        System.out.println(
                "La mayor temperatura es de " + temperaturas[indiceMaximaTemperatura][1] + "º" +
                        " y sucedió en la ciudad de " + ciudades[indiceMaximaTemperatura] + "."
        );
        System.out.println(
                "La menor temperatura es de " + temperaturas[indiceMinimaTemperatura][0] + "º" +
                        " y sucedió en la ciudad de " + ciudades[indiceMinimaTemperatura] + "."
        );
    }
}

