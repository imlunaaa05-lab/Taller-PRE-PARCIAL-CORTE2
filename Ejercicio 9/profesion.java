interface Trabajable{
    void trabajar();
}

abstract class Profesion{
    String nombre;

    Profesion(String n){ nombre=n; }
}

class Medico extends Profesion implements Trabajable{
    Medico(){ super("Medico"); }

    public void trabajar(){
        System.out.println(nombre+" Atendiendo pacientes");
    }
}

class Ingeniero extends Profesion implements Trabajable{
    Ingeniero(){ super("Ingeniero"); }

    public void trabajar(){
        System.out.println( nombre + " Desarrollando sistema");
    }
}

class Profesor extends Profesion implements Trabajable{
    Profesor(){ super("Profesor"); }

    public void trabajar(){
        System.out.println(nombre+ " Enseñando a estudiantes");
    }
}

public class Main{
    public static void main(String[] args){

        Trabajable[] trabajos={
            new Medico(),
            new Ingeniero(),
            new Profesor()
        };

        for(Trabajable t:trabajos)
            t.trabajar();
    }
}
