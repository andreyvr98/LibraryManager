package uh.ac.cr;
import  uh.ac.cr.model.Authors;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        AuthorsAdministrator authorsAdministrator = new AuthorsAdministrator();
        EditorialAdministrator editorialAdministrator = new EditorialAdministrator();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        int selectedOption;
        boolean existSubmenu = false;

        while (!exit) {
            System.out.println("\n---------------------------------------------------------------------\n");

            System.out.println("1 = Administrar catálogos de datos.\n2 = Solicitar nuevo préstamo\n3 = Consultar todos los préstamos.\n4 = Consultar todos los préstamos realizados por un usuario.\n5 = Consultar todos los préstamos realizados de un libro.\n6 = Consultar préstamos en demora.\n7 = Salir del sistema.");
            selectedOption = scanner.nextInt();



            System.out.println("\n---------------------------------------------------------------------\n");
            System.out.println("Option selected: " + selectedOption);


            switch (selectedOption){
                case 1://
                    System.out.println("¿Que catalogo desea utilizar?\n1.Catálogo de autor\n2.Catálogo de editorial\n3.Catalogo de libro\n4.Catalogo de usuario\n5.Salir del sub menú y volver al menú\n" );
                    selectedOption = scanner.nextInt();
                    while (!existSubmenu){
                        switch (selectedOption){
                            case 1 :
                            //catalogos autor
                            System.out.println("¿Que accion desea realizar?\n1. Ingresar un nuevo autor.\n2. Consultar datos de un autor.\n3. Actualizar datos de un autor.\n4. Eliminar un autor.\n5.Desea volver al submenu.");
                            selectedOption = scanner.nextInt();
                            switch (selectedOption){

                                case 1: //nuevo autor
                                    System.out.println("Ingrese la identificación del nuevo autor que desea agregar.");
                                    int authorsId = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.println("Ingrese la nombre del nuevo autor que desea agregar.");
                                    String authorName = scanner.nextLine();
                                    System.out.println("Ingres el primer apellido del nuevo autor que desea agregar");
                                    String authorLastName = scanner.nextLine();
                                    System.out.println("Ingrese el segundo apellido del nuevo autor que desea agregar");
                                    String authorSecondSurname = scanner.nextLine();
                                    System.out.println("Ingrese la fecha de nacimiento del nuevo autor que desea agregar");
                                    int authorDateBirth = scanner.nextInt();
                                    scanner.nextLine();

                                    boolean authorCreated = authorsAdministrator.createAuthors(authorsId,authorName,authorLastName,authorSecondSurname,authorDateBirth);

                                    if (authorCreated) {
                                        System.out.println("\nSe creo un nuevo autor con la identificación: " + authorsId);
                                    } else {
                                        System.out.println("\nNo podemos crear el autor, ya que la identificacion " + authorsId + " esta registrada. ");
                                    }
                                    break;
                                case 2://consultar autor existente
                                    System.out.println("Ingrese la identificación del autor que desea consultar.");
                                    authorsId = scanner.nextInt();
                                    scanner.nextLine();
                                    break;
                                case 3://actulizar datos del autor
                                    break;
                                case 4://eliminar autor
                                    break;
                                case 5://salir al submenu
                                    existSubmenu =true;
                                    break;

                            }

                            case 2://editorial catalogos

                                System.out.println("¿Que accion desea realizar?\n1. Agregar una nueva editorial.\n2. Consultar datos de una editorial.\n3. Eliminar una editorial. \n 4. Volver al submenu");
                                selectedOption = scanner.nextInt();
                                switch (selectedOption){
                                    case 1: //crear una nueva editorial
                                        System.out.println("Ingrese la identificación de la nueva editorial que desea agregar.");
                                        int editorialId = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("Ingrese el nombre de la nueva editorial que desea agregar.");
                                        String editorialName = scanner.nextLine();
                                        System.out.println("Ingrese la ubicacion fisica de la nueva editorial que desea agregar");
                                        String editorialLocation = scanner.nextLine();
                                        System.out.println("Ingrese el numero de contacto de la nueva editorial que desea agregar");
                                        int editorialNumber = scanner.nextInt();
                                        scanner.nextLine();

                                        boolean editorialCreated = editorialAdministrator.createEditorial(editorialId,editorialName,editorialLocation,editorialNumber);
                                        if (editorialCreated) {
                                            System.out.println("\nSe creo una nueva editorial con la identificación: " + editorialId);
                                        } else {
                                            System.out.println("\nNo podemos crear la editorial, ya que la identificacion " + editorialId + " esta registrada. ");
                                        }
                                        break;
                                    case 2://consultar datos de una editorial
                                        break;
                                    case 3://eliminar una editorial
                                        break;
                                    case 4://salir al submenu
                                        break;
                                        // pendientes defaul en todos
                                }
                            case 3://Catalogo libro.
                                System.out.println("¿Que accion desea realizar?\n1. Agregar un nuevo libro.\n2. Consultar datos de un libro.\n3.Eliminar un libro.\n 4. Volver al submenu");
                                selectedOption = scanner.nextInt();
                                switch (selectedOption){
                                    case 1: //agregar un nuevo libro
                                        break;
                                    case 2: //consultar datos de un libro
                                        break;
                                    case 3: //eliminar un libro
                                        break;
                                    case 4: //salir al submenu
                                        break;
                                }

                            case 4://catalago de usuario.
                                System.out.println("¿Que accion desea realizar?\n1. Agregar un nuevo usuario.\n2. Consultar datos de un usuario.\n3.Actualizar los datos de un usuario.\n4. Eliminar un usuario. \n 5. Volver al submenu");
                                selectedOption = scanner.nextInt();
                                switch (selectedOption){
                                    case 1:
                                        System.out.println("Ingrese la identificación del nuevo usuario.");
                                        int usersId = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("Ingrese la nombre del nuevo usuario.");
                                        String userName = scanner.nextLine();
                                        System.out.println("Ingrese el primer apellido del nuevo usuario.");
                                        String userLastName = scanner.nextLine();
                                        System.out.println("Ingrese el segundo apellido del nuevo usuario.");
                                        String secondSurname = scanner.nextLine();
                                        System.out.println("Ingrese el número de teléfono de contacto del usuario.");
                                        int userNumber = scanner.nextInt();
                                        scanner.nextLine();

                                        boolean userCreate = authorsAdministrator.createAuthors(usersId,userName, userLastName,secondSurname,userNumber);
                                        if (userCreate) {
                                            System.out.println("\nSe a creado un nuevo usuario con la identificación: " + usersId);
                                        } else {
                                            System.out.println("\nNo podemos crear un usuario, ya que la identificacion " + usersId + " esta registrada. ");
                                        }



                                }






                        }
                    }






            }

        }

    }
}
