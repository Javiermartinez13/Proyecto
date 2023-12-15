package Presentacion;

import java.util.ArrayList;
import dominio.*;
import java.io.*;
import java.util.Scanner;

public class Interfaz {
    
    private ArrayList<Profesor> profesores;
    private Scanner sc = new Scanner(System.in);

    public Interfaz()
    {
        leer();
    }
    private void leer()
    {
        ObjectInputStream obj;
        File file = new File ("meritos.txt");
            try
            {
                 obj = new ObjectInputStream(new FileInputStream(file));
                    try
                    {
                        profesores=(ArrayList<Profesor>) obj.readObject();
                        obj.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error al abrir el archivo");
                        profesores=new ArrayList<>();
                    }
            }
            catch(Exception e)
            {
                profesores=new ArrayList<>();
            }

    }

    private void grabar()
    {
        ObjectOutputStream obj;
        File file = new File("meritos.txt");
            try
            {
                obj = new ObjectOutputStream(new FileOutputStream(file));
                obj.writeObject(profesores);
                    obj.close();
                System.out.println("Guardado");
            }
            catch(Exception e)
            {
                System.out.println("Error al guardar");
                System.out.println(e);
            }
    }
    private void annadirProfesorTitular()
    {
        System.out.println("Introduzca el nombre del profesor:"); 
        String nombre = sc.nextLine();
        profesores.add(new ProfesorTitular(nombre));
     
    }

    private void annadirCatedratico()
    {
        System.out.println("Introduzca el nombre del catedrático"); 
        String nombre = sc.nextLine();
        profesores.add(new Catedratico(nombre));
     
    }

    private void annadirMerito()
    {
        System.out.println("Introduce el nombre del profesor: ");
        String nombre = sc.nextLine();
        int n = profesores.indexOf(new ProfesorTitular(nombre));
        if(n==-1)
        {
            System.out.println("Profesor no encontrado");
        }
        else
        {
            System.out.println("Titulo del merito: ");
            String titulo = sc.nextLine();
            System.out.println("Escoja el tipo de mérito: ");
            System.out.println("1) Articulo: ");
            System.out.println("2) Proyecto");
            int opcion = sc.nextInt();
            if(opcion==1)
            {
                System.out.println("Introduzca el impacto del artículo: ");
                double impacto = sc.nextDouble();
                sc.nextLine();
                profesores.get(n).annadirMerito(new Articulo(titulo, impacto));

            }
            else if(opcion==2)
            {
                System.out.println("Introduzca la financiación del proyecto: ");
                double financiacion = sc.nextDouble();
                sc.nextLine();
                profesores.get(n).annadirMerito(new Articulo(titulo, financiacion));
                
            }
            else 
            {
                System.out.println("Opcion no disponible ");
            }

        }
        
    }

    private void borrarProfesor()
    {
        System.out.println("Nombre del profesor a borrar: ");
        String n = sc.nextLine();
        ProfesorTitular p = new ProfesorTitular(n);
        int posicion = profesores.indexOf(p);

        if (posicion == -1)
        {
            System.out.println("Profesor no encontrado");
        }
        else
        {
            profesores.remove(posicion);
            System.out.println("Profesor borrado");
            System.out.println("Pulse <enter> para continuar");
            sc.nextLine();
        }
    }
     
    private String menu()
    {
        System.out.println("\n----------Menú----------");
        System.out.println("1. Agregar Profesor Titular");
        System.out.println("2. Agragar Patedratico");
        System.out.println("3. Añadir Merito");
        System.out.println("4. Borrar Profesro");
        System.out.println("5. Mostrat Profesor");
        System.out.println("6. Salir");
        System.out.println("Ingrese su opinión");

        String opcion = sc.nextLine();
        return opcion;

    }

    public void ejecutar()
    {   String opcion;
        do
        {
             opcion = menu();
            switch (opcion) 
            {
                case "1":
                    annadirProfesorTitular();
                    break;

                case "2":
                    annadirCatedratico();
                    break;
                    
                case "3":
                    annadirMerito();
                    break;

                case "4":
                    borrarProfesor();
                    break;
                
                case "5":
                    mostrar();
                    break;

                case "6":
                    grabar();
                    break;

                default:
                System.out.println("opción incorrecta ");
                    break;
            }

        }while (! opcion.equals("6"));
        
    }

    public void mostrar()
    {
        System.out.println("Profesores " + profesores);
        System.out.println("Pulse <enter> para continuar");
        sc.nextLine();
        
    }
}

