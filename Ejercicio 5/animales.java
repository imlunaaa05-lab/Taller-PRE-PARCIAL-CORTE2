interface AccionAnimal{
    void moverse();
}

abstract class Animal implements AccionAnimal{
    String nombre;

    Animal(String n){ nombre=n; }

    abstract void hacerSonido();
}

class Perro extends Animal implements AccionAnimal{
    Perro(String n){ super(n); }

    void hacerSonido(){ System.out.println(nombre+" ladra"); }
    public void moverse(){ System.out.println(nombre+" Corre y juega"); }
}

class Gato extends Animal implements AccionAnimal{
    Gato(String n){ super(n); }

    void hacerSonido(){ System.out.println(nombre+" maulla"); }
    public void moverse(){ System.out.println(nombre+" Camina sigilosamente"); }
}

class Vaca extends Animal implements AccionAnimal{
    Vaca(String n){ super(n); }

    void hacerSonido(){ System.out.println(nombre+" Hace muu"); }
    public void moverse(){ System.out.println(nombre+" Camina lentamente"); }
}

public class Main{
    public static void main(String[] args){

        Animal[] animales={
            new Perro("El perro de mi tia"),
            new Gato("Mi gato"),
            new Vaca("La vaca")
        };

        for(Animal a:animales){
            a.hacerSonido();
            a.moverse();
    }
}
}
