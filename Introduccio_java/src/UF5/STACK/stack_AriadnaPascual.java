package UF5.STACK;

import java.util.Stack;

public class stack_AriadnaPascual {
    public static void main(String[] args) {

        Stack<String> ActivitatsPendents = new Stack<>();

        // Crear una pila per gestionar activitats pendents
        ActivitatsPendents.push("Tasca 1: Rentar els plats");
        ActivitatsPendents.push("Tasca 2: Fer els deures");
        ActivitatsPendents.push("Tasca 3: Anar a comprar");

                // Veure la tasca del cim, però sense treure-la
        System.out.println("Tasca a fer (peek): " + ActivitatsPendents.peek());

        //el popo el q fa es treure la activitat del cim vull dir la fa i la treu
        System.out.println("Realitzant la tasca (pop): " + ActivitatsPendents.pop());

        System.out.println("Encara hi ha tasques pendents? " + !ActivitatsPendents.isEmpty());


        System.out.println("Realitzant la següent tasca pop " + ActivitatsPendents.pop());
        // Tornem a comprovar si queden activitats
        System.out.println("Encara hi ha tasques pendents? " + !ActivitatsPendents.isEmpty());

         //ara es fa la ultima tasca pop
        System.out.println("Realitzant lultima tasca (pop): " + ActivitatsPendents.pop());

        System.out.println("Encara hi ha tasques pendents..? " + !ActivitatsPendents.isEmpty());
    }
}
