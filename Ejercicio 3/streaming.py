from abc import ABC,abstractmethod

class Reproducible(ABC):
    @abstractmethod
    def reproducir(self): pass

class Contenido:
    def __init__(self,titulo):
        self.titulo=titulo

class Pelicula(Contenido,Reproducible):
    def reproducir(self):
        print("Reproduciendo película -",self.titulo, "- en TV")

class Serie(Contenido,Reproducible):
    def reproducir(self):
        print("Reproduciendo serie -",self.titulo, "- en telefono")

class Documental(Contenido,Reproducible):
    def reproducir(self):
        print("Reproduciendo documental -",self.titulo, "- en Tablet")

lista=[Pelicula("Avatar"),Serie("Dark"),Documental("Planeta Tierra")]

for c in lista:
    c.reproducir()
