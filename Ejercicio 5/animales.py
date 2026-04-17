from abc import ABC,abstractmethod

class AccionAnimal(ABC):
    @abstractmethod
    def moverse(self): pass

class Animal(ABC):
    def __init__(self,nombre):
        self.nombre=nombre

    @abstractmethod
    def hacerSonido(self): pass

class Perro(Animal,AccionAnimal):
    def hacerSonido(self): print(self.nombre," ladra")
    def moverse(self): print(self.nombre," Corre y juega")

class Gato(Animal,AccionAnimal):
    def hacerSonido(self): print(self.nombre," maulla")
    def moverse(self): print(self.nombre, " Camina sigilosamente")

class Vaca(Animal,AccionAnimal):
    def hacerSonido(self): print(self.nombre," hace muu")
    def moverse(self): print(self.nombre," Camina lentamente")

animales=[Perro("El perro de mi tia"),Gato("Mi gato"),Vaca("La vaca")]

for a in animales:
    a.hacerSonido()
    a.moverse()
