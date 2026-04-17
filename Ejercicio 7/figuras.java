interface Calculable{
    double area();
}

abstract class Figura{
    abstract void nombre();
}

class Circulo extends Figura implements Calculable{
    double r;

    Circulo(double r){ this.r=r; }

    void nombre(){ System.out.println("Circulo"); }

    public double area(){
        return Math.PI*r*r;
    }
}

class Rectangulo extends Figura implements Calculable{
    double a,b;

    Rectangulo(double a,double b){
        this.a=a;
        this.b=b;
    }

    void nombre(){ System.out.println("Rectangulo"); }

    public double area(){
        return a*b;
    }
}

class Triangulo extends Figura implements Calculable{
    double b,h;

    Triangulo(double b,double h){
        this.b=b;
        this.h=h;
    }

    void nombre(){ System.out.println("Triangulo"); }

    public double area(){
        return (b*h)/2;
    }
}

public class Main{
    public static void main(String[] args){

        Calculable[] figuras={
            new Circulo(3),
            new Rectangulo(4,5),
            new Triangulo(6,2)
        };

        for(Calculable f:figuras)
            System.out.println("Area: "+f.area());
    }
}
