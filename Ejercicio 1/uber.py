from abc import ABC, abstractmethod

class Conduccion(ABC):
    @abstractmethod
    def iniciarViaje(self): 
        pass

class Transporte(ABC):
    def __init__(self, conductor):
        self.conductor = conductor

    @abstractmethod
    def tipo(self): 
        pass


class CarroUber(Transporte, Conduccion):
    def tipo(self): 
        print(f"Carro Uber de {self.conductor}")
        
    def iniciarViaje(self): 
        print("Viaje en carro iniciado")

class MotoUber(Transporte, Conduccion):
    def tipo(self): 
        print(f"Moto Uber de {self.conductor}")
        
    def iniciarViaje(self): 
        print("Viaje en moto iniciado")

class Bicicleta(Transporte, Conduccion):
    def tipo(self): 
        print(f"Bicicleta de {self.conductor}")
        
    def iniciarViaje(self): 
        print("Viaje en bici iniciado")


transportes = [
    CarroUber("Juan"),
    MotoUber("Ana"),
    Bicicleta("Luis")
]


for t in transportes:
    t.tipo()
    t.iniciarViaje()
    print("-" * 20)
