class EcuacionLineal:
    def __init__(self, a, b, c, d, e, f):
        self.__a = a
        self.__b = b
        self.__c = c
        self.__d = d
        self.__e = e
        self.__f = f

    def tieneSolucion(self):
        return self.__a * self.__d - self.__b * self.__c != 0

    def getX(self):
        return (
            self.__e * self.__d - self.__b * self.__f
        ) / (
            self.__a * self.__d - self.__b * self.__c
        )

    def getY(self):
        return (
            self.__a * self.__f - self.__e * self.__c
        ) / (
            self.__a * self.__d - self.__b * self.__c
        )


# Programa de prueba
print("ECUACIÓN LINEAL 2 x 2")

a = float(input("Ingrese a: "))
b = float(input("Ingrese b: "))
c = float(input("Ingrese c: "))
d = float(input("Ingrese d: "))
e = float(input("Ingrese e: "))
f = float(input("Ingrese f: "))

ecuacion = EcuacionLineal(a, b, c, d, e, f)

if ecuacion.tieneSolucion():
    print("x =", ecuacion.getX())
    print("y =", ecuacion.getY())
else:
    print("La ecuación no tiene solución")