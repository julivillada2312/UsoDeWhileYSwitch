import java.util.Scanner;

public class EjercicioCajero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        int cantidadUsuarios = 0;

        // Arrays para guardar usuarios y contraseñas
        String[] usuarios = new String[5];
        String[] contrasenas = new String[5];

        while (opcion != 6) {

            System.out.println();
            System.out.println("----------- MENÚ -----------");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Mostrar usuarios");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Depositar dinero");
            System.out.println("5. Retirar dinero");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    if (cantidadUsuarios < 5) {

                        System.out.println();
                        System.out.println("----- REGISTRO DE USUARIO -----");

                        System.out.print("Escribe tu usuario: ");
                        usuarios[cantidadUsuarios] = scanner.nextLine();

                        System.out.print("Escribe tu contraseña: ");
                        contrasenas[cantidadUsuarios] = scanner.nextLine();

                        cantidadUsuarios++;

                        System.out.println("Usuario registrado correctamente.");

                    } else {

                        System.out.println("Ya hay 5 usuarios registrados.");
                    }

                    break;


                case 2:

                    System.out.println();
                    System.out.println("----- USUARIOS REGISTRADOS -----");

                    if (cantidadUsuarios == 0) {

                        System.out.println("No hay usuarios registrados.");

                    } else {

                        for (int i = 0; i < cantidadUsuarios; i++) {

                            System.out.println(
                                    (i + 1) + ". " + usuarios[i]
                            );
                        }
                    }

                    break;


                case 3:

                    System.out.println();
                    System.out.println("Tu saldo es de $100.000");

                    break;


                case 4:

                    System.out.println();
                    System.out.println("Depositando dinero...");

                    break;


                case 5:

                    System.out.println();
                    System.out.println("Retirando dinero...");

                    break;


                case 6:

                    System.out.println();
                    System.out.println("Saliendo del cajero...");

                    break;


                default:

                    System.out.println();
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}