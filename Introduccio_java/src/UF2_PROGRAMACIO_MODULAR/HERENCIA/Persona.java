package UF2_PROGRAMACIO_MODULAR.HERENCIA;

public class Persona {
    private String nombre;
    private String apellido;

    private String edad;

    public String getNombre() {
        return nombre;
    }

    public String edadEmpleado(){
        return edad;
    }


    public class Empleado extends Persona{
       private double salario;

       public double calcularSalari(){
           return salario;
       }

    }
}
