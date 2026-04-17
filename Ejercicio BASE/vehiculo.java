interface Conducible{
    void acelerar();
    void frenar();
}

abstract class Vehiculo{
    String marca;
    String modelo;
    double velocidadMaxima;

    Vehiculo(String m,String mo,double v){
        marca=m;
        modelo=mo;
        velocidadMaxima=v;
    }

    abstract void mostrarInformacion();
}

class Carro extends Vehiculo implements Conducible{

    Carro(String m,String mo,double v){ super(m,mo,v); }

    void mostrarInformacion(){
        System.out.println("Informacion del Carro: "+marca+" "+modelo);
    }

    public void acelerar(){ System.out.println("El Carro esta acelerando"); }
    public void frenar(){ System.out.println("El Carro esta frenando"); }
}

class Moto extends Vehiculo implements Conducible{

    Moto(String m,String mo,double v){ super(m,mo,v); }

    void mostrarInformacion(){
        System.out.println("Informacion de la Moto: "+marca+" "+modelo);
    }

    public void acelerar(){ System.out.println("La Moto esta acelerando"); }
    public void frenar(){ System.out.println("La Moto esta frenando"); }
}

class Camion extends Vehiculo implements Conducible{

    Camion(String m,String mo,double v){ super(m,mo,v); }

    void mostrarInformacion(){
        System.out.println("Informacion del Camion "+marca+" "+modelo);
    }

    public void acelerar(){ System.out.println("El Camion esta acelerando"); }
    public void frenar(){ System.out.println("El Camion esta frenando"); }
}

public class Main{
    public static void main(String[] args){

        Vehiculo[] lista={
            new Carro("Toyota","Corolla",180),
            new Moto("Yamaha","R1",220),
            new Camion("Volvo","FH",140)
        };

        for(Vehiculo v:lista){
            v.mostrarInformacion();
        }
    }
}
