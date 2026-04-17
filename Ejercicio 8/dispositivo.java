interface Encendible{
    void encender();
    void apagar();
}

abstract class Dispositivo implements Encendible{
    String nombre;

    Dispositivo(String n){ nombre=n; }

    abstract void info();
}

class TV extends Dispositivo implements Encendible{
    TV(){ super("TV"); }

    void info(){ System.out.println("Televisor:"); }

    public void encender(){ System.out.println("TV encendida"); }
    public void apagar(){ System.out.println("TV apagada"); }
}

class Radio extends Dispositivo implements Encendible{
    Radio(){ super("Radio"); }

    void info(){ System.out.println("Radio:"); }

    public void encender(){ System.out.println("Radio encendida"); }
    public void apagar(){ System.out.println("Radio apagada"); }
}

class Celular extends Dispositivo implements Encendible{
    Celular(){ super("Celular"); }

    void info(){ System.out.println("Celular:"); }

    public void encender(){ System.out.println("Celular encendido"); }
    public void apagar(){ System.out.println("Celular apagado"); }
}

public class Main{
    public static void main(String[] args){

        Dispositivo[] dispositivos={
            new TV(),
            new Radio(),
            new Celular()
        };

        for(Dispositivo d:dispositivos){
            d.info();
            d.encender();
            d.apagar();
    }
}
}
