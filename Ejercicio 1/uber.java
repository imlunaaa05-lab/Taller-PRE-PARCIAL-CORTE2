interface Conduccion {
    void iniciarViaje();
}


abstract class Transporte implements Conduccion {
    String conductor;

    Transporte(String c) { this.conductor = c; }

    abstract void tipo();
    
}

class CarroUber extends Transporte {
    CarroUber(String c) { super(c); }

    void tipo() { System.out.println("Carro Uber de " + conductor); }
    @Override
    public void iniciarViaje() { System.out.println("Viaje en carro iniciado"); }
}

class MotoUber extends Transporte {
    MotoUber(String c) { super(c); }

    void tipo() { System.out.println("Moto Uber de " + conductor); }
    @Override
    public void iniciarViaje() { System.out.println("Viaje en moto iniciado"); }
}

class Bicicleta extends Transporte {
    Bicicleta(String c) { super(c); }

    void tipo() { System.out.println("Bicicleta de " + conductor); }
    @Override
    public void iniciarViaje() { System.out.println("Viaje en bici iniciado"); }
}

public class Main {
    public static void main(String[] args) {
        Transporte[] lista = {
            new CarroUber("Juan"),
            new MotoUber("Ana"),
            new Bicicleta("Luis")
        };

        for (Transporte t : lista) {
            t.tipo();
            t.iniciarViaje();
            System.out.println("---");
        }
    }
}
