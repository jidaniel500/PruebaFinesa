package org.finesaprueba.prueba;

public class Ordenamiento {

    public Ordenamiento(TipoOrdenamiento ordenamiento, int[] numeros) {
        switch (ordenamiento) {
            case MAYORAMENOR:
                imprimirNumeros(OrdenarMayorMenor(numeros));
                break;
            case MENORAMAYOR:
                imprimirNumeros(OrdenarMenorMayor(numeros));
                break;
            default:
                OrdenarMayorMenor(numeros);
                break;
        }

    }

    public int[] OrdenarMenorMayor(int[] numeros) {

        int tmp, a = 1;
        int vueltas = numeros.length;
        boolean ordenado = false;
        while (a < vueltas && ordenado == false) {
            a = a + 1;
            ordenado = true;
            for (int pos = 0; pos < numeros.length - 1; pos++) {
                if (numeros[pos] > numeros[pos + 1]) {
                    ordenado = false;
                    tmp = numeros[pos];
                    numeros[pos++] = numeros[pos];
                    numeros[pos] = tmp;

                }

            }
        }
        return numeros;

    }

    public int[] OrdenarMayorMenor(int[] numeros) {
        int tmp, a = 1;
        int vueltas = numeros.length;
        boolean ordenado = false;
        while (a < vueltas && ordenado == false) {
            a = a + 1;
            ordenado = true;
            for (int pos = 0; pos < numeros.length - 1; pos++) {
                if (numeros[pos] < numeros[pos + 1]) {
                    ordenado = false;
                    tmp = numeros[pos];
                    numeros[pos++] = numeros[pos];
                    numeros[pos] = tmp;

                }

            }
        }
        return numeros;
    }

    public void imprimirNumeros(int[] numeros) {
        for (int a = 0; a < numeros.length; a++) {
            System.out.printf("%d ", numeros[a]);
        }
    }

}
