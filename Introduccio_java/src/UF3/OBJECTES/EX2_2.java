package UF3.OBJECTES;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EX2_2 {

    public static void main(String[] args) {
        EX2_2 programa = new EX2_2();
        programa.mostrarInfoDescargas();
    }

    public void mostrarInfoDescargas() {
        // Ruta de la carpeta de descargas
        String rutaDescargas = System.getProperty("user.home") + File.separator + "Downloads";

        // Crear un objeto File para la carpeta de descargas
        File carpetaDescargas = new File(rutaDescargas);

        // Comprobar si la carpeta de descargas existe
        if (carpetaDescargas.exists() && carpetaDescargas.isDirectory()) {
            // Obtener una lista de archivos en la carpeta de descargas
            File[] archivos = carpetaDescargas.listFiles();

            // Mostrar información para cada archivo
            for (int i = 0; i < archivos.length; i++) {
                File archivo = archivos[i];
                if (archivo.isFile()) {
                    System.out.println("Archivo: " + archivo.getName());
                    System.out.println("Tamaño: " + obtenerTamañoKB(archivo.length()) + " KB");
                    System.out.println("Última modificación: " + obtenerFechaFormateada(archivo.lastModified()));
                    System.out.println();
                }
            }
        } else {
            System.out.println("La carpeta de descargas no existe o no es un directorio válido.");
        }
    }

    // Método para obtener el tamaño en kilobytes
    private long obtenerTamañoKB(long bytes) {
        return bytes / 1024;
    }

    // Método para obtener la fecha en formato legible para el usuario
    private String obtenerFechaFormateada(long milisegundos) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fecha = new Date(milisegundos);
        return sdf.format(fecha);
    }
}
