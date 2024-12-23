package Java_Basico.Semana2.Ejercicios_05_Dia6.Ej1;

public class Ejercicio1_Main {

    public static void main(String[] args) {

        // Creamos los objetos de cada clase hija

        Ejercicio1_Mamifero mamifero = new Ejercicio1_Mamifero(1, "León", 8, "Pelaje", "Carnívoro", 4, "Vivíparo", "Marrón", "Sabana");
        Ejercicio1_Ave ave = new Ejercicio1_Ave(2, "Águila", 5, "Plumas", "Carnívoro", 2.0, "Planeador", "Marrón", "Curvo");
        Ejercicio1_Reptil reptil = new Ejercicio1_Reptil(3, "Serpiente", 3, "Escamas", "Carnívoro", 1.5, "Lisas", "Neurotóxico", "Selva");

        // Para imprimir los saludos de cada animal

        mamifero.saludar();
        ave.saludar();
        reptil.saludar();

        // Intentamos asignar un objeto de tipo Mamífero a una variable de tipo Animal

        Ejercicio1_Animal animal = mamifero; // Esto es posible por polimorfismo
        animal.saludar(); // Llamará al método sobrescrito de Mamifero debido al polimorfismo

        /*Ahora respondamos a las preguntas:

        P(d): Crear un objeto de tipo animal e intentar asignarle al Mamífero creado. ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?
        R: Sí, es posible debido a polimorfismo. Un objeto de tipo Mamifero puede ser asignado a una variable de tipo Animal porque Mamifero es una subclase de Animal. Sin embargo, si accedemos a métodos específicos de Mamifero, no estarán disponibles desde la referencia de tipo Animal.

        P(e): Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?
        R: No es posible acceder a métodos privados desde el main o cualquier otra clase externa, ya que los métodos con el modificador private son accesibles solo dentro de la propia clase. Esto generará un error de compilación.*/


    }
}
