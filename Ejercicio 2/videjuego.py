from abc import ABC, abstractmethod


class AccionCombate(ABC):
    @abstractmethod
    def defender(self): 
        pass


class Personaje(AccionCombate, ABC):
    def __init__(self, nombre):
        self.nombre = nombre

    @abstractmethod
    def atacar(self): 
        pass


class Guerrero(Personaje):
    def atacar(self): 
        print(f"{self.nombre} ataca con la espada")
        
    def defender(self): 
        print("Bloquea con el escudo")

class Mago(Personaje):
    def atacar(self): 
        print(f"{self.nombre} lanza hechizo")
        
    def defender(self): 
        print("Usa Escudo mágico")

class Arquero(Personaje):
    def atacar(self): 
        print(f"{self.nombre} dispara con la flecha")
        
    def defender(self): 
        print("Hace Esquive rápido")


equipo = [
    Guerrero("El guerrero Stark"),
    Mago("La maga Frieren"),
    Arquero("El Heroe Himmel")
]

for p in equipo:
    p.atacar()
    p.defender()
    print("-" * 20)
