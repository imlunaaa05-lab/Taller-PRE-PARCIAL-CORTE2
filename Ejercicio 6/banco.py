from abc import ABC,abstractmethod

class Operaciones(ABC):
    @abstractmethod
    def depositar(self,m): pass

    @abstractmethod
    def retirar(self,m): pass

class Cuenta:
    def __init__(self,saldo):
        self.saldo=saldo

class CuentaAhorro(Cuenta,Operaciones):
    def depositar(self,m):
        self.saldo+=m
        print("Saldo depositado en cuenta de ahorro, saldo actual:",self.saldo)

    def retirar(self,m):
        self.saldo-=m
        print("Saldo retirado en cuenta de ahorro, saldo actual:",self.saldo)

class CuentaCorriente(Cuenta,Operaciones):
    def depositar(self,m):
        self.saldo+=m
        print("Saldo depositado en cuenta corriente, saldo actual:",self.saldo)

    def retirar(self,m):
        self.saldo-=m
        print("Saldo retirado en cuenta corriente, saldo actual:",self.saldo)

cuentas=[CuentaAhorro(1000),CuentaCorriente(2000)]

for c in cuentas:
    c.depositar(500)
    c.retirar(2000)
