from abc import ABC,abstractmethod

class Trabajable(ABC):
    @abstractmethod
    def trabajar(self): pass

class Profesion:
    def __init__(self,nombre):
        self.nombre=nombre

class Medico(Profesion,Trabajable):
    def __init__(self): super().__init__("Medico")
    def trabajar(self): print(self.nombre+" Atendiendo pacientes")

class Ingeniero(Profesion,Trabajable):
    def __init__(self): super().__init__("Ingeniero")
    def trabajar(self): print(self.nombre+" Desarrollando sistema")

class Profesor(Profesion,Trabajable):
    def __init__(self): super().__init__("Profesor")
    def trabajar(self): print(self.nombre+ " Enseñando a estudiantes")

trabajos=[Medico(),Ingeniero(),Profesor()]

for t in trabajos:
    t.trabajar()
