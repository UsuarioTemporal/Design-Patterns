from abc import ABCMeta , abstractmethod

# OPEN / CLOSE
class Figura(metaclass=ABCMeta):

    def __str__(self): # encargado de que mostrar mas nó de como mostrarlo SINGLE RESPONSABILITY, separar el como en otra clase
        return self.__dict__
    @abstractmethod
    def area(self):
        pass

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

    @staticmethod
    def area(obj):
        if isinstance(obj,Figura):
            return print(obj.area())
        print('?')

class Rectangulo(Figura):
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
        return self.__altura*self.__base

class Triangulo(Figura) :
    def __init__(self, base, altura):
        self.__base = base
        self.__altura = altura
    def area(self):
        return self.__altura*self.__base/2

if __name__ == "__main__":
    rec = Rectangulo(17,10)
    tri = Triangulo(17,10)
    # print(rec.__str__())
    Imprimir.mostrar(rec)
    Imprimir.mostrar(tri)
    Imprimir.area(rec)
    Imprimir.area(tri)
    # print(isinstance(rec,Figura))
    # print(Imprimir.metodoClase().__dict__)