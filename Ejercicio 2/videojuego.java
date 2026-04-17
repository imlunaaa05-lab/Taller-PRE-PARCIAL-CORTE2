interface AccionCombate{
    void defender();
}

abstract class Personaje implements AccionCombate{
    String nombre;

    Personaje(String n){ nombre=n; }

    abstract void atacar();
}

class Guerrero extends Personaje {
    Guerrero(String n){ super(n); }

    void atacar(){ System.out.println(nombre+" ataca con la espada"); }
    @Override
    public void defender(){ System.out.println("Bloquea con el escudo"); }
}

class Mago extends Personaje {
    Mago(String n){ super(n); }

    void atacar(){ System.out.println(nombre+" lanza hechizo"); }
    @Override
    public void defender(){ System.out.println("Usa Escudo mágico"); }
}

class Arquero extends Personaje {
    Arquero(String n){ super(n); }

    void atacar(){ System.out.println(nombre+" dispara con la flecha"); }
    @Override
    public void defender(){ System.out.println("Hace Esquive rápido"); }
}

public class Main{
    public static void main(String[] args){

        Personaje[] equipo={
            new Guerrero("El guerrero Stark"),
            new Mago("La maga Frieren"),
            new Arquero("El Heroe Himmel")
        };

        for(Personaje p:equipo) {
            p.atacar();
            p.defender();
    }
}
}
