package UF3.OBJECTES;

import java.io.File;

import java.io.File;

public class EX3_2 {

    public static void main(String[] args) {
        EX3_2 programa = new EX3_2();
        programa.borrarCarpetaFotos();
    }

    public void borrarCarpetaFotos() {
        // Ruta de la carpeta "fotos" en el directorio del proyecto
        String rutaFotos = System.getProperty("user.dir") + File.separator + "fotos";
        File carpetaFotos = new File(rutaFotos);

        // Comprobar si la carpeta "fotos" existe y es un directorio
        if (carpetaFotos.exists() && carpetaFotos.isDirectory()) {
            // Borrar la carpeta "fotos" y su contenido
            if (eliminarDirectorio(carpetaFotos)) {
                System.out.println("Se ha borrado la carpeta 'fotos' y su contenido.");
            } else {
                System.out.println("No se ha podido borrar la carpeta 'fotos' y su contenido.");
            }
        } else {
            System.out.println("La carpeta 'fotos' no existe o no es un directorio válido.");
        }
    }

    // Método para eliminar un directorio y su contenido recursivamente
    private boolean eliminarDirectorio(File directorio) {
        if (directorio.isDirectory()) {
            // Obtener la lista de archivos y subdirectorios en el directorio
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (int i = 0; i < archivos.length; i++) {
                    // Eliminar el archivo o subdirectorio
                    if (!eliminarDirectorio(archivos[i])) {
                        return false; // Si no se pudo eliminar, salir
                    }
                }
            }
        }
        // Eliminar el directorio vacío o el archivo
        return directorio.delete();
    }
}
