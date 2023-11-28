package javaapplication1;


import java.util.Arrays;

public class Logica {

    public int[] PistaAtravesada(int[] pistas, int valorinicial) {
        int tamaño = pistas.length;
        int listaPistasAtravezadas[] = new int[tamaño];

        listaPistasAtravezadas[0] = Math.abs(valorinicial - pistas[0]);
        for (int i = 1; i < tamaño; i++) {
            listaPistasAtravezadas[i] = Math.abs(pistas[i] - pistas[i-1]);
        }
        return listaPistasAtravezadas;
    }

    public int[] atenderSolicitudFIFO(int[] pistas, int valorinicial) {
        return PistaAtravesada(pistas, valorinicial);
    }

    public int[] atenderSolicitudSSTF(int[] datos, int pInicial) {
        int nSoli = datos.length;
        int[] OrdenSSTF = new int[nSoli];
        boolean[] numVisitado = new boolean[nSoli];

        for (int i = 0; i < nSoli; i++) {
            int indNumCercano = indnCercano(datos, pInicial, numVisitado);
            OrdenSSTF[i] = datos[indNumCercano];
            numVisitado[indNumCercano] = true;
            pInicial = datos[indNumCercano];
        }
        return OrdenSSTF;
    }

    public int[] atenderSolicitudLOOK(int[] pistas, int valorinicial) {
        int tamaño = pistas.length;
        int i = 0, j = 0;
        int listaordenada[] = pistas;
        Arrays.sort(listaordenada);
        int listalook[] = new int[tamaño];
        int valorAnterior = 0, valorSuperior = 0;
        try {
                    while (true) {
            if (valorinicial > listaordenada[i]) {
                i++;
            } else {
                System.out.println("el valor inicial esta entre " + listaordenada[i - 1] + " y " + listaordenada[i]);
                valorAnterior = i - 1;
                valorSuperior = i;
                break;
            }
        }

        while (valorSuperior <= listaordenada.length - 1) {
            listalook[j] = listaordenada[valorSuperior];
            valorSuperior++;
            j++;
        }
        while (valorAnterior >= 0) {
            listalook[j] = listaordenada[valorAnterior];
            j++;
            valorAnterior--;
        }

        } catch (Exception e) {
            System.out.println("Hubo un error en look");
        }

        return listalook;
    }

    public int[] atenderSolicitudCLOOK(int[] pistas, int valorinicial) {
        int tamaño = pistas.length;
        int i = 0, j = 0;
        int listaordenada[] = pistas;
        Arrays.sort(listaordenada);
        int listaclook[] = new int[tamaño];
        int valorAnterior = 0, valorSuperior = 0;

        while (true) {
            if (valorinicial > listaordenada[i]) {
                i++;
            } else {
                valorSuperior = i;
                break;
            }
        }

        while (valorSuperior <= tamaño - 1) {
            listaclook[j] = listaordenada[valorSuperior];
            valorSuperior++;
            j++;
        }
        i = 0;
        while (j <= tamaño - 1) {
            listaclook[j] = listaordenada[i];
            j++;
            i++;
        }

        return listaclook;
    }

    public int[] atenderSolicitudSCAN(int[] pistas, int valorinicial, int valorFinal) {
        int tamaño = pistas.length;
        int i = 0, j = 0;
        int listaordenada[] = pistas;
        int totaldepistas = valorFinal - 1;
        Arrays.sort(listaordenada);
        System.out.println(Arrays.toString(listaordenada));
        int listascan[] = new int[tamaño + 1];

        int valorAnterior = 0, valorSuperior = 0;

        while (true) {
            if (valorinicial > listaordenada[i]) {
                i++;
            } else {
                valorSuperior = i;
                valorAnterior = i - 1;
                break;
            }
        }

        while (valorSuperior <= tamaño - 1) {
            listascan[j] = listaordenada[valorSuperior];
            valorSuperior++;
            j++;
        }
        listascan[j] = totaldepistas;
        j++;
        while (valorAnterior >= 0) {
            listascan[j] = listaordenada[valorAnterior];
            j++;
            valorAnterior--;
        }

        return listascan;
    }

    public int[] atenderSolicitudCSCAN(int[] pistas, int valorinicial,int valorFinal) {
        int tamaño = pistas.length;
        int i = 0, j = 0;
        int listaordenada[] = pistas;
        Arrays.sort(listaordenada);
        int listacscan[] = new int[tamaño+2];
        int valorAnterior = 0, valorSuperior = 0;

        while (true) {
            if (valorinicial > listaordenada[i]) {
                i++;
            } else {
                valorSuperior = i;
                break;
            }
        }

        while (valorSuperior <= tamaño - 1) {
            listacscan[j] = listaordenada[valorSuperior];
            valorSuperior++;
            System.out.println(Arrays.toString(listacscan));
            j++;
        }
        listacscan[j]=valorFinal-1;
        listacscan[j+1]=0;
        j=j+2;
        i = 0;
        System.out.println(Arrays.toString(listacscan));
        while (j <= listacscan.length - 1) {
            listacscan[j] = listaordenada[i];
            j++;
            i++;
            System.out.println(Arrays.toString(listacscan));
        }
        return listacscan;
    }

    //Función para encontrar el mas cercano entre la posicion inicial
    public static int indnCercano(int[] datos, int posActual, boolean[] visitado) {
        int nSoli = datos.length;
        int distMinima = Integer.MAX_VALUE;
        int indiceCercano = 0;

        for (int i = 0; i < nSoli; i++) {
            if (!visitado[i]) {
                int distancia = Math.abs(datos[i] - posActual);
                if (distancia < distMinima) {
                    distMinima = distancia;
                    indiceCercano = i;
                }
            }
        }

        return indiceCercano;
    }

    public float Promedio(int lista[]) {
        int suma = 0;
        float promedio = 0;
        float tamaño = (float) (lista.length * 1.0);
        for (int i = 0; i < tamaño; i++) {
            suma = lista[i] + suma;
        }
        promedio = suma / tamaño;
        return promedio;
    }
}
