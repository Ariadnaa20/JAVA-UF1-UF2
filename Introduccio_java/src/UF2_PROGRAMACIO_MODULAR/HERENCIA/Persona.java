package UF2_PROGRAMACIO_MODULAR.HERENCIA;

public class Persona {
    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }


    public class Empleado extends Persona{
        private String edad;
        public String edadEmpleado(){
            return edad;
        }
    }
}
