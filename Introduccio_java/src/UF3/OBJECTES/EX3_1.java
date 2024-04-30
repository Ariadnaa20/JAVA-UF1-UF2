package UF3.OBJECTES;

import java.io.File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class EX3_1 {

    public static void main(String[] args) {
        EX3_1 programa = new EX3_1();
        programa.crearCarpetaFotos();
        programa.moverArchivosPNG();
    }

    public void crearCarpetaFotos() {
        // Ruta de la carpeta "fotos" en el directorio del proyecto
        String rutaFotos = System.getProperty("user.dir") + File.separator + "fotos";
        File carpetaFotos = new File(rutaFotos);

        // Crear la carpeta "fotos" si no existe
        if (!carpetaFotos.exists()) {
            if (carpetaFotos.mkdirs()) {
                System.out.println("Se ha creado la carpeta 'fotos'.");
            } else {
                System.out.println("No se ha podido crear la carpeta 'fotos'.");
            }
        } else {
            System.out.println("La carpeta 'fotos' ya existe.");
        }
    }

    public void moverArchivosPNG() {
        // Ruta de la carpeta de descargas
        String rutaDescargas = System.getProperty("user.home") + File.separator + "Downloads";
        File carpetaDescargas = new File(rutaDescargas);

        // Obtener una lista de archivos en la carpeta de descargas
        File[] archivos = carpetaDescargas.listFiles();

        // Si la carpeta de descargas existe y contiene archivos
        if (archivos != null) {
            // Ruta de la carpeta "fotos" en el directorio del proyecto
            String rutaFotos = System.getProperty("user.dir") + File.separator + "fotos";

            // Mover los archivos PNG a la carpeta "fotos"
            for (int i = 0; i < archivos.length; i++) {
                File archivo = archivos[i];
                if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".png")) {
                    try {
                        Files.move(archivo.toPath(), new File(rutaFotos + File.separator + archivo.getName()).toPath(),
                                StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Se ha movido el archivo '" + archivo.getName() + "' a la carpeta 'fotos'.");
                    } catch (IOException e) {
                        System.out.println("Error al mover el archivo '" + archivo.getName() + "'.");
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("La carpeta de descargas no existe o está vacía.");
        }
    }
}
