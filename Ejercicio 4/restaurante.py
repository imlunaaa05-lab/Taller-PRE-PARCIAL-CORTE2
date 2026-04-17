from abc import ABC,abstractmethod

class Preparacion(ABC):
    @abstractmethod
    def preparar(self): pass

class Alimento:
    def __init__(self,nombre):
        self.nombre=nombre

class Hamburguesa(Alimento,Preparacion):
    def __init__(self): super().__init__("Hamburguesa")
    def preparar(self): print("Preparando hamburguesa en la Sarten")

class Pizza(Alimento,Preparacion):
    def __init__(self): super().__init__("Pizza")
    def preparar(self): print("Preparando pizza en el Horno")

class Ensalada(Alimento,Preparacion):
    def __init__(self): super().__init__("Ensalada")
    def preparar(self): print("Preparando ensalada en el Bowl")

menu=[Hamburguesa(),Pizza(),Ensalada()]

for a in menu:
    a.preparar()
