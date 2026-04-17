interface Operaciones{
    void depositar(double monto);
    void retirar(double monto);
}

abstract class Cuenta{
    double saldo;

    Cuenta(double s){ saldo=s; }
}

class CuentaAhorro extends Cuenta implements Operaciones{

    CuentaAhorro(double s){ super(s); }

    public void depositar(double m){
        saldo+=m;
        System.out.println("Saldo depositado en cuenta de ahorro, saldo actual: "+saldo);
    }

    public void retirar(double m){
        saldo-=m;
        System.out.println("Saldo retirado en cuenta de ahorro, saldo actual: "+saldo);
    }
}

class CuentaCorriente extends Cuenta implements Operaciones{

    CuentaCorriente(double s){ super(s); }

    public void depositar(double m){
        saldo+=m;
        System.out.println("Saldo depositado en cuenta corriente, saldo actual: "+saldo);
    }

    public void retirar(double m){
        saldo-=m;
        System.out.println("Saldo retirado en cuenta corriente, saldo actual: "+saldo);
    }
}

public class Main{
    public static void main(String[] args){

        Operaciones[] cuentas={
            new CuentaAhorro(1000),
            new CuentaCorriente(2000)
        };

        for(Operaciones c:cuentas){
            c.depositar(500);
            c.retirar(2000);
        }
    }
}
