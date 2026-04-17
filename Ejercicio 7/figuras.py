from abc import ABC,abstractmethod
import math

class Calculable(ABC):
    @abstractmethod
    def area(self): pass

class Figura(ABC):
    @abstractmethod
    def nombre(self): pass

class Circulo(Figura,Calculable):
    def __init__(self,r): self.r=r
    def nombre(self): print("Circulo")
    def area(self): return math.pi*self.r*self.r

class Rectangulo(Figura,Calculable):
    def __init__(self,a,b):
        self.a=a
        self.b=b
    def nombre(self): print("Rectangulo")
    def area(self): return self.a*self.b

class Triangulo(Figura,Calculable):
    def __init__(self,b,h):
        self.b=b
        self.h=h
    def nombre(self): print("Triangulo")
    def area(self): return (self.b*self.h)/2

figuras=[Circulo(3),Rectangulo(4,5),Triangulo(6,2)]

for f in figuras:
    print("Area:",f.area())
