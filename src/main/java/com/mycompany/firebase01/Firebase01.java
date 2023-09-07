package com.mycompany.firebase01;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Firebase01 {

    public static void main(String[] args) {
        Conexion.conectarFirebase();
        FirebaseDataManager dataManager = new FirebaseDataManager(Conexion.db);
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            // Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1. Agregar datos");
            System.out.println("2. Actualizar datos");
            System.out.println("3. Eliminar datos");
            System.out.println("4. Obtener datos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt(); // Obtener la opción del usuario
            
            switch (opcion) {
                case 1:
                    // Agregar datos
                    Map<String, Object> datosAgregar = new HashMap<>();
                    datosAgregar.put("nombre", "Andres");
                    datosAgregar.put("edad", 25);
                    datosAgregar.put("documento", 130312010);
                    dataManager.agregarDatos("miColeccion", "miDocumento", datosAgregar);
                    System.out.println("Datos agregados exitosamente.");
                    break;
                case 2:
                    // Actualizar datos
                    Map<String, Object> datosActualizar = new HashMap<>();
                    datosActualizar.put("nombre", "Andres");
                    datosActualizar.put("edad", 26);
                    datosActualizar.put("documento", 999910101);
                    dataManager.actualizarDatos("miColeccion", "miDocumento", datosActualizar);
                    System.out.println("Datos actualizados exitosamente.");
                    break;
                case 3:
                    // Eliminar datos
                    dataManager.eliminarDatos("miColeccion", "miDocumento");
                    System.out.println("Datos eliminados exitosamente.");
                    break;
                case 4:
                    // Obtener datos
                    Usuario usuarioRecuperado = (Usuario) dataManager.obtenerDatos("miColeccion", "miDocumento", Usuario.class);
                    if (usuarioRecuperado != null) {
                        System.out.println("Los datos almacenados son:");
                        System.out.println("Nombre del usuario: " + usuarioRecuperado.getNombre());
                        System.out.println("Edad del usuario: " + usuarioRecuperado.getEdad());
                        System.out.println("Documento del usuario: " + usuarioRecuperado.getDocumento());
                    } else {
                        System.out.println("El documento no se encontró.");
                    }
                    break;
                case 5:
                    // Salir del programa
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
        
        scanner.close();
    }
}
