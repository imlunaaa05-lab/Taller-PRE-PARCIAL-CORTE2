from abc import ABC,abstractmethod

class Transportar(ABC):
    @abstractmethod
    def transportarPersonas(self): pass

class TransportePublico:
    def __init__(self,tipo):
        self.tipo=tipo

class Bus(TransportePublico,Transportar):
    def __init__(self): super().__init__("Bus")
    def transportarPersonas(self):
        print("Bus transportando 50 pasajeros")

class Metro(TransportePublico,Transportar):
    def __init__(self): super().__init__("Metro")
    def transportarPersonas(self):
        print("Metro transportando 100 pasajeros")

class Taxi(TransportePublico,Transportar):
    def __init__(self): super().__init__("Taxi")
    def transportarPersonas(self):
        print("Taxi transportando 4 pasajeros")

lista=[Bus(),Metro(),Taxi()]

for t in lista:
    t.transportarPersonas()
