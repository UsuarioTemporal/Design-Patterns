from abc import ABCMeta , abstractmethod
class Imprimir:
    # def __init__(self, name, age):
    #     self.name = name
    #     self.age = age
    # @classmethod
    # def metodoClase(cls):
    #     return cls('asdasd','asdasd')
    @staticmethod
    def mostrar(obj):
        print(obj.__str__())

class Rectangulo(object):
    def __init__(self, base, altura):
        self.__base = base
        self.__altura = altura
    @property
    def base(self):
        return self.__base
    @base.setter
    def base(self,value):
        self.__base = value
    @property
    def altura(self):
        return self.__altura
    @altura.setter
    def altura(self,value):
        self.__altura = value
    def area(self):
        return self.__base * self.__altura
    def __str__(self): # encargado de que mostrar mas nó de como mostrarlo SINGLE RESPONSABILITY, separar el como en otra clase
        return self.__dict__

if __name__ == "__main__":
    rec = Rectangulo(17,10)
    # print(rec.__str__())
    print(rec.area())
    print(Imprimir.mostrar(rec))
    # print(Imprimir.metodoClase().__dict__)