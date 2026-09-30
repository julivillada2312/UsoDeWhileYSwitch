import java.util.Scanner;

public class UsoDeSwitchYWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 4) {

            System.out.println();
            System.out.println("----------- MENÚ -----------");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            if (!sc.hasNextInt()) {

                if (!sc.hasNext()) {
                    break;
                }

                System.out.println("Entrada no válida. Escribe un número del 1 al 4.");
                sc.next();
                continue;
            }

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Consultando saldo...");
                    break;

                case 2:
                    System.out.println("Depositando dinero...");
                    break;

                case 3:
                    System.out.println("Retirando dinero...");
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Elige del 1 al 4.");
            }
        }

        sc.close();
    }
}