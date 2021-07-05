package uh.ac.cr;
import  uh.ac.cr.model.Authors;

import java.util.Scanner;
                                            //Examen I - Programacion I
                                     //Estudiantes: Andrey Vargas & Génesis Delgado. :)

public class Main {


    public static void main(String[] args) {
        AuthorsAdministrator authorsAdministrator = new AuthorsAdministrator();
        EditorialAdministrator editorialAdministrator = new EditorialAdministrator();
        UserAdministrator userAdministrator = new UserAdministrator();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        int selectedOption;

        while (!exit) { //Menu principal
            System.out.println("\n---------------------------------------------------------------------\n");

            System.out.println("1 = Administrar catálogos de datos.\n2 = Solicitar nuevo préstamo\n3 = Consultar todos los préstamos.\n4 = Consultar todos los préstamos realizados por un usuario.\n5 = Consultar todos los préstamos realizados de un libro.\n6 = Consultar préstamos en demora.\n7 = Salir del sistema.");
            selectedOption = scanner.nextInt();



            System.out.println("\n---------------------------------------------------------------------\n");
            System.out.println("Opción seleccionada: " + selectedOption);


            switch (selectedOption){
                case 1://
                    System.out.println("¿Qué catalogo desea utilizar?\n1.Catálogo de autor\n2.Catálogo de editorial\n3.Catalogo de libro\n4.Catalogo de usuario\n5.Salir del sub menú y volver al menú\n" );
                    int optionSelectedCatalog = scanner.nextInt();
                    boolean existSubmenu = false;

                    while (existSubmenu == false){
                        if (optionSelectedCatalog ==1) {


                            //catalogos autor


                            System.out.println("¿Qué acción desea realizar?\n1. Ingresar un nuevo autor.\n2. Consultar datos de un autor.\n3. Actualizar datos de un autor.\n4. Eliminar un autor.\n5.Desea volver al submenu.");
                            int subCatalogOptionSelected = scanner.nextInt();
                            switch (subCatalogOptionSelected) {

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
                                    System.out.println("Ingrese la fecha de nacimiento del nuevo autor que desea agregar, por favor utilizar el formato dd/mm/aa.");
                                    String authorDateBirth = scanner.nextLine();

                                    boolean authorCreated = authorsAdministrator.createAuthors(authorsId, authorName, authorLastName, authorSecondSurname, authorDateBirth);

                                    if (authorCreated) {
                                        System.out.println("\nSe creo un nuevo autor con la identificación:  " + authorsId + "\n");
                                    } else {
                                        System.out.println("\nNo podemos crear el autor, ya que la identificacion " + authorsId + " esta registrada.\n ");
                                    }
                                    break;
                                case 2://consultar autor existente
                                    System.out.println("Ingrese la identificación del autor que desea consultar.");
                                    authorsId = scanner.nextInt();
                                    scanner.nextLine();
                                    authorsAdministrator.getAuthor(authorsId);
                                    break;
                               case 3://actulizar datos del autor
                                   System.out.println("Ingrese la identificación del autor que desea actualizar.");
                                   authorsId = scanner.nextInt();
                                   scanner.nextLine();
                                   System.out.println("Ingrese la nombre del autor que desea actualizar.");
                                   authorName = scanner.nextLine();
                                   System.out.println("Ingres el primer apellido del autor que desea actualizar");
                                   authorLastName = scanner.nextLine();
                                   System.out.println("Ingrese el segundo apellido del  autor que desea actualizar");
                                   authorSecondSurname = scanner.nextLine();
                                   System.out.println("Ingrese la fecha de nacimiento del autor que desea actualizar,por favor usar el formato dd/mm/aa");
                                   authorDateBirth = scanner.nextLine();
                                   authorsAdministrator.updateAuthor(authorsId,authorName,authorLastName,authorSecondSurname,authorDateBirth);

                                    break;
                                case 4://eliminar autor
                                    System.out.println("Ingrese la identificación del autor que desea eliminar.");
                                    authorsId = scanner.nextInt();
                                    scanner.nextLine();
                                    authorsAdministrator.deleteAuthor(authorsId);
                                    break;
                                case 5://salir al submenu
                                    existSubmenu = true;
                                    break;
                                default:
                                    System.out.println("Por favor ingrese una opción valida, del rango del 1 al 5.");
                                    break;

                            }

                        }else if (optionSelectedCatalog == 2) {

                            //catalogo editorial.

                            System.out.println("¿Qué acción desea realizar?\n1. Agregar una nueva editorial.\n2. Consultar datos de una editorial.\n3. Eliminar una editorial. \n4. Volver al submenu");
                            int subCatalogOptionSelected = scanner.nextInt();
                            switch (subCatalogOptionSelected) {
                                case 1:

                                    //crear una nueva editorial

                                    System.out.println("Ingrese la identificación de la nueva editorial que desea agregar.");
                                    int editorialId = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.println("Ingrese el nombre de la nueva editorial que desea agregar.");
                                    String editorialName = scanner.nextLine();
                                    System.out.println("Ingrese la ubicacion fisica de la nueva editorial que desea agregar");
                                    String editorialLocation = scanner.nextLine();
                                    System.out.println("Ingrese el numero de contacto de la nueva editorial que desea agregar");
                                    String editorialNumber = scanner.nextLine();

                                    boolean editorialCreated = editorialAdministrator.createEditorial(editorialId, editorialName, editorialLocation, editorialNumber);
                                    if (editorialCreated) {
                                        System.out.println("\nSe creo una nueva editorial con la identificación: " + editorialId + "\n");

                                    } else {
                                        System.out.println("\nNo podemos crear la editorial, ya que la identificación " + editorialId + " esta registrada. ");
                                    }
                                    break;
                                case 2://consultar datos de una editorial
                                    System.out.println("Ingrese la identificación de la editorial que desea consultar.");
                                    editorialId = scanner.nextInt();
                                    scanner.nextLine();
                                    editorialAdministrator.geteditorial(editorialId);

                                    break;
                                case 3://eliminar una editorial

                                    System.out.println("Ingrese la identificación de la editorial que desea eliminar.");
                                    editorialId = scanner.nextInt();
                                    scanner.nextLine();
                                    editorialAdministrator.deleteEditorial(editorialId);

                                    break;

                                case 4://salir al submenu
                                    existSubmenu = true;
                                    break;
                                default:
                                    System.out.println("Por favor ingrese una opción valida, del rango del 1 al 4.");
                                    break;
                            }
                        }else if (optionSelectedCatalog ==3) {


                            //catalogo libro.


                            System.out.println("¿Qué acción desea realizar?\n1. Agregar un nuevo libro.\n2. Consultar datos de un libro.\n3.Eliminar un libro.\n4. Volver al submenu");
                            int subCatalogOptionSelected = scanner.nextInt();
                            switch (subCatalogOptionSelected) {
                                case 1:
                                    //Agregar un nuevo libro
                                    System.out.println("Ingrese la identificación del nuevo libro que desea agregar");
                                    int bookId = scanner.nextInt();
                                    scanner.nextLine();

                                    //Seleccion autor

                                    System.out.println("Seleccione el autor con la identificación correspondiente");
                                    System.out.println(authorsAdministrator.printAuthor());
                                    int authorBookId = scanner.nextInt();
                                    scanner.nextLine();

                                    //Fecha de publicacion
                                    System.out.println("Ingrese la fecha de publicación del libro,por favor usar el formato dd/mm/aa");
                                    String publicationDate = scanner.nextLine();

                                    //Edicion libro
                                    System.out.println("Ingrese la edicion del libro");
                                    int bookEdition = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.println("Ingrese el titulo del libro");
                                    String bookTitle = scanner.nextLine();

                                    //Seleccion editorial

                                    System.out.println("Seleccione la editorial con la identificación correspondiente");
                                    System.out.println(editorialAdministrator.printEditorial());
                                    int editorialBookId = scanner.nextInt();
                                    scanner.nextLine();

                                    //Copias libro

                                    System.out.println("Ingrese la cantidad de copias disponibles");
                                    int bookCopy = scanner.nextInt();
                                    scanner.nextLine();



                                    break;
                                case 2:  //consultar datos de un libro
                                    break;
                                case 3: //eliminar un libro
                                    break;
                                case 4: //salir al submenu
                                    existSubmenu = true;
                                    break;
                                default:
                                    System.out.println("Por favor ingrese una opción valida, del rango del 1 al 4.");
                                    break;
                            }
                        }else if (optionSelectedCatalog == 4){


                            //Catalogo de usurio


                                System.out.println("¿Que accion desea realizar?\n1. Agregar un nuevo usuario.\n2. Consultar datos de un usuario.\n3. Actualizar los datos de un usuario.\n4. Eliminar un usuario.\n5. Volver al submenu");
                                 int subCatalogOptionSelected = scanner.nextInt();
                                switch (subCatalogOptionSelected){
                                    case 1: //Agregar un nuevo usuario
                                        System.out.println("Ingrese la identificación del nuevo usuario.");
                                        int usersId = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("Ingrese la nombre del nuevo usuario.");
                                        String userName = scanner.nextLine();
                                        System.out.println("Ingrese el primer apellido del nuevo usuario.");
                                        String userLastName = scanner.nextLine();
                                        System.out.println("Ingrese el segundo apellido del nuevo usuario.");
                                        String userSecondSurname = scanner.nextLine();
                                        System.out.println("Ingrese el número de teléfono de contacto del usuario.");
                                        String userNumber = scanner.nextLine();
                                        scanner.nextLine();

                                        boolean userCreate = userAdministrator.createUser(usersId,userName, userLastName,userSecondSurname,userNumber);
                                        if (userCreate) {
                                            System.out.println("\nSe a creado un nuevo usuario con la identificación: " + usersId);
                                        } else {
                                            System.out.println("\nNo podemos crear un usuario, ya que la identificacion " + usersId + " esta registrada. ");
                                        }
                                        break;
                                    case 2://Consultar datos de un usuario.

                                        System.out.println("Ingrese la identificación del usuario que desea consultar.");
                                        usersId = scanner.nextInt();
                                        scanner.nextLine();
                                        userAdministrator.getUser(usersId);
                                        break;
                                    case 3://Actualizar datos de un usuario.
                                        System.out.println("Ingrese la identificación del usuario que desea actualizar.");
                                        usersId = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("Ingrese la nombre del usuario.");
                                         userName = scanner.nextLine();
                                        System.out.println("Ingrese el primer apellido del nuevo usuario.");
                                         userLastName = scanner.nextLine();
                                        System.out.println("Ingrese el segundo apellido del usuario.");
                                         userSecondSurname = scanner.nextLine();
                                        System.out.println("Ingrese el número de teléfono de contacto del usuario.");
                                         userNumber = scanner.nextLine();
                                        scanner.nextLine();

                                        userAdministrator.updateUser(usersId,userName, userLastName, userSecondSurname,userNumber);


                                        break;
                                    case 4://Eliminar un usuario.
                                        System.out.println("Ingrese la identificación del usuario que desea eliminar.");
                                        usersId = scanner.nextInt();
                                        scanner.nextLine();
                                        userAdministrator.deleteUser(usersId);

                                        break;
                                    case 5://salir al submenu.
                                        existSubmenu = true;
                                        break;
                                    default:
                                        System.out.println("Por favor ingrese una opción valida, del rango del 1 al 5.");
                                        break;

                                }

                        }
                    }






            }

        }

    }
}
