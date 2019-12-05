from SINGLE_RESPONSABILITY import Rectangulo,Triangulo,Imprimir

if __name__ == "__main__":
    rec = Rectangulo(17,10)
    tri = Triangulo(17,10)
    # print(rec.__str__())
    Imprimir.mostrar(rec)
    Imprimir.mostrar(tri)
    Imprimir.area(rec)
    Imprimir.area(tri)
