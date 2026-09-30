import java.util.Scanner;

public class EjercicioDoWhile {
    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);

                String opcion = "";

                do {

                    System.out.println();
                    System.out.println("----------- MENÚ -----------");
                    System.out.println("1. Consultar saldo");
                    System.out.println("2. Depositar dinero");
                    System.out.println("3. Retirar dinero");
                    System.out.println("4. Salir");
                    System.out.println("-----------------------------");
                    System.out.print("Seleccione una opción: ");

                    opcion = scanner.nextLine();

                    if (opcion.equals("1")) {
                        System.out.println("Consultando saldo...");

                    } else if (opcion.equals("2")) {
                        System.out.println("Depositando dinero...");

                    } else if (opcion.equals("3")) {
                        System.out.println("Retirando dinero...");

                    } else if (opcion.equals("4")) {
                        System.out.println("Saliendo del programa...");

                    } else {
                        System.out.println("Opción no válida.");
                    }

                } while (!opcion.equals("4"));

                scanner.close();
            }
        }
