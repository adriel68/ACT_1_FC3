package tarea;

import java.util.Scanner;

/**
 *
 * @author adriel
 */
public class Main {

    //Insercion ascendente
    private static void insercion(int m[]) {
        int temp;
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i] > m[j]) {
                    temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
    }

    //Insercion descendente
    private static void insercionDesc(int m[]) {
        int temp;
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i] < m[j]) {
                    temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
    }

    private static void imprimirVector(int m[]) {
        for (int i = 1; i <= m.length; i++) {
            System.out.print("  " + m[i - 1] + "    ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        boolean salir = false;
        do {
            System.out.println("Favor de seleccionar lo que desea utilizar");
            System.out.println("1.- Crear lista (Aleatorio)");
            System.out.println("2.- Ordernar lista");
            System.out.println("3.- Agregar nodo");
            System.out.println("4.- Contiene elementos la lista?");
            System.out.println("5.- Eliminar nodo");
            System.out.println("6.- Número de nodos de la lista?");
            System.out.println("7.- Mostrar todos los elementos de la lista?");
            System.out.println("8.- Mostrar la posición de un nodo?");
            System.out.println("9.- Mostrar los nodos que superen el valor de:");
            System.out.println("10.- Salir");
            Scanner entrada = new Scanner(System.in);
            int opcion;
            int arreglo[] = new int[lista.size()];
            do {
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        lista.addPrimero((int) (Math.random() * 10) + 1);
                        lista.addPrimero((int) (Math.random() * 10) + 1);
                        lista.addPrimero((int) (Math.random() * 10) + 1);
                        System.out.println("Lista creada!");
                        break;

                    case 2:
                        System.out.println("Quieres ordenar la lista? ");

                        System.out.println("1 = Ascendente o 2 = descendente? ");

                        int ord = entrada.nextInt();
                        for (int i = 0; i < lista.size(); i++) {
                            arreglo[i] = (int) (lista.obtener(i));

                        }
                        if (ord == 1) {
                            insercion(arreglo);
                            imprimirVector(arreglo);
                        }

                        if (ord == 2) {
                            insercionDesc(arreglo);
                            imprimirVector(arreglo);
                        }

                        break;

                    case 3:
                        lista.addPrimero((int) (Math.random() * 10) + 1);
                        System.out.println("Nodo añadido!");
                        break;

                    case 4:
                        System.out.println("Esta vacia: " + lista.estaVacia());
                        break;

                    case 5:
                        lista.eliminarPrimero();
                        System.out.println("Eliminaste el primer nodo!");
                        break;

                    case 6:
                        System.out.println("Tamaño: " + lista.size());
                        break;

                    case 7:
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println("index " + i + ": " + lista.obtener(i));

                        }
                        break;

                    case 8:
                        System.out.println("Ingrese el index del nodo: ");
                        int index = entrada.nextInt();
                        if (index == 0) {
                            System.out.println("Nodo anterior: No existe.");
                            System.out.println("Nodo ingresado: " + lista.obtener(index));
                            System.out.println("Nodo siguiente: " + lista.obtener(index + 1));

                        }
                        if (index > lista.size()) {
                            System.out.println("No existe ese nodo. ");

                        }
                        if (index > 0) {
                            System.out.println("Nodo anterior: " + lista.obtener(index - 1));
                            System.out.println("Nodo ingresado: " + lista.obtener(index));
                            System.out.println("Nodo siguiente: " + lista.obtener(index + 1));

                        }
                        break;
                    case 9:
                        System.out.println("Escribe un valor y te mostraré los que sean más grandes:");
                        int numero = entrada.nextInt();
                        for (int i = 0; i < lista.size(); i++) {
                            if (numero < (int) (lista.obtener(i))) {
                                System.out.println("index " + i + ": " + lista.obtener(i));
                            }

                        }
                        break;
                    case 10:
                        salir = true;

                        break;
                }

            } while (opcion > 10 || opcion < 1);

        } while (salir == false);

    }

}
