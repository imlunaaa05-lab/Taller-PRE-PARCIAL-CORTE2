interface Reproducible{
    void reproducir();
}

abstract class Contenido{
    String titulo;

    Contenido(String t){ titulo=t; }
}

class Pelicula extends Contenido implements Reproducible{
    Pelicula(String t){ super(t); }
    public void reproducir(){ System.out.println("Reproduciendo película: - "+titulo + " - en TV"); }
}

class Serie extends Contenido implements Reproducible{
    Serie(String t){ super(t); }
    public void reproducir(){ System.out.println("Reproduciendo serie - "+titulo+ "- en Telefono"); }
}

class Documental extends Contenido implements Reproducible{
    Documental(String t){ super(t); }
    public void reproducir(){ System.out.println("Reproduciendo documental - "+titulo+ "- en Tablet"); }
}

public class Main{
    public static void main(String[] args){

        Reproducible[] lista={
            new Pelicula("Avatar"),
            new Serie("Dark"),
            new Documental("Planeta Tierra")
        };

        for(Reproducible c:lista)
            c.reproducir();
    }
}
