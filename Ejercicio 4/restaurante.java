interface Preparacion{
    void preparar();
}

abstract class Alimento{
    String nombre;

    Alimento(String n){ nombre=n; }
}

class Hamburguesa extends Alimento implements Preparacion{
    Hamburguesa(){ super("Hamburguesa"); }
    public void preparar(){ System.out.println("Preparando hamburguesa en la Sarten"); }
}

class Pizza extends Alimento implements Preparacion{
    Pizza(){ super("Pizza"); }
    public void preparar(){ System.out.println("Preparando pizza en el Horno"); }
}

class Ensalada extends Alimento implements Preparacion{
    Ensalada(){ super("Ensalada"); }
    public void preparar(){ System.out.println("Preparando ensalada en el Bowl"); }
}

public class Main{
    public static void main(String[] args){

        Preparacion[] menu={
            new Hamburguesa(),
            new Pizza(),
            new Ensalada()
        };

        for(Preparacion a:menu)
            a.preparar();
    }
}
