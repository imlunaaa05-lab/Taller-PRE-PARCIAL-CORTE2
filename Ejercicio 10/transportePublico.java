interface Transportar{
    void transportarPersonas();
}

abstract class TransportePublico{
    String tipo;

    TransportePublico(String t){ tipo=t; }
}

class Bus extends TransportePublico implements Transportar{
    Bus(){ super("Bus"); }

    public void transportarPersonas(){
        System.out.println("Bus transportando 50 pasajeros");
    }
}

class Metro extends TransportePublico implements Transportar{
    Metro(){ super("Metro"); }

    public void transportarPersonas(){
        System.out.println("Metro transportando 100 pasajeros");
    }
}

class Taxi extends TransportePublico implements Transportar{
    Taxi(){ super("Taxi"); }

    public void transportarPersonas(){
        System.out.println("Taxi transportando 4 pasajeros");
    }
}

public class Main{
    public static void main(String[] args){

        Transportar[] lista={
            new Bus(),
            new Metro(),
            new Taxi()
        };

        for(Transportar t:lista)
            t.transportarPersonas();
    }
}
