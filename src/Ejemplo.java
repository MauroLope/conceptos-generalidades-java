import javax.swing.*;

class Animal {
    String nombre;
    int edad;
    String raza;

    public Animal( String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void sonido(){
        System.out.println("Sonido especifico del animal: ");
    }
    public void correr(){
        System.out.println("corrida especifica del animal: ");
    }
    public void comer(){
        System.out.println("Como come el animal: ");
    }
}


class Perro extends Animal{
    public Perro(String nombre, int edad, String raza){


        super(nombre, edad, raza);
        }
        @Override
    public void sonido(){
         System.out.println("mi perro hace guau");
     }
    }
class Gato extends Animal{
    public Gato(String nombre, int edad, String raza){
        super(nombre, edad, raza);
    }
    @Override
    public void sonido(){
        System.out.println("mi gato hace miau");
    }
}


class Main {
    public static void main(String[] Args) {
        String perroNombre = JOptionPane.showInputDialog("Ingrese el nombre del perro: ");
        int perroEdad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del perro: "));
        String perroRaza = JOptionPane.showInputDialog("Ingrese la raza del perro: ");

        Perro perro = new Perro(perroNombre, perroEdad, perroRaza);

        String perro2Nombre = JOptionPane.showInputDialog("Ingrese el nombre del perro: ");
        int perro2Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del perro: "));
        String perro2Raza = JOptionPane.showInputDialog("Ingrese la raza del perro: ");
        
        Perro perro2 = new Perro(perro2Nombre, perro2Edad, perro2Raza);

        String gatoNombre = JOptionPane.showInputDialog("Ingrese el nombre del gato: ");
        int gatoEdad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del gato: "));
        String gatoRaza = JOptionPane.showInputDialog("Ingrese la raza del gato: ");

        Gato gato = new Gato(gatoNombre, gatoEdad, gatoRaza);


        System.out.println("El nombre del perro es: " + perro.nombre);
        System.out.println("la edad del perro es: " + perro.edad);
        System.out.println("la raza del perro es: " + perro.raza);
        perro.sonido();
        
        System.out.println("El nombre del perro es: " + perro2.nombre);
        System.out.println("la edad del perro es: " + perro2.edad);
        System.out.println("la raza del perro es: " + perro2.raza);
        perro2.sonido();

        System.out.println("El nombre del gato es: " + gato.nombre);
        System.out.println("la edad del gato es: " + gato.edad);
        System.out.println("la raza del gato es: " + gato.raza);
        gato.sonido();
    }

}

