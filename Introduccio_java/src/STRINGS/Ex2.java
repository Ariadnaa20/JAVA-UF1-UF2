package STRINGS;

public class Ex2 {
    public static void main(String[] args) {
        String path = "home/user/index.html";
        int barra = path.lastIndexOf('/');  // selecciona la segona barra
        int punto = path.indexOf('.');  // selecciona el punt

        String nombre = path.substring(barra + 1, punto); // devuelve la cadena que hay en medio desde barra + 1 hasta el punto
        System.out.println(nombre);


        String extension= path.substring(punto + 1); // devuelve todo despues del punto
        System.out.println(extension);

    }
}



