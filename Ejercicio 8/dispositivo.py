from abc import ABC,abstractmethod

class Encendible(ABC):
    @abstractmethod
    def encender(self): pass
    @abstractmethod
    def apagar(self): pass

class Dispositivo(ABC):
    def __init__(self,nombre):
        self.nombre=nombre

    @abstractmethod
    def info(self): pass

class TV(Dispositivo,Encendible):
    def __init__(self): super().__init__("TV")
    def info(self): print("Televisor:")
    def encender(self): print("TV encendida")
    def apagar(self): print("TV apagada")

class Radio(Dispositivo,Encendible):
    def __init__(self): super().__init__("Radio")
    def info(self): print("Radio:")
    def encender(self): print("Radio encendida")
    def apagar(self): print("Radio apagada")

class Celular(Dispositivo,Encendible):
    def __init__(self): super().__init__("Celular")
    def info(self): print("Celular:")
    def encender(self): print("Celular encendido")
    def apagar(self): print("Celular apagado")

dispositivos=[TV(),Radio(),Celular()]

for d in dispositivos:
    d.info()
    d.encender()
    d.apagar()
