import math


class EcuacionCuadratica:
    def __init__(self, a, b, c):
        self.__a = a
        self.__b = b
        self.__c = c

    def getDiscriminante(self):
        return self.__b ** 2 - 4 * self.__a * self.__c

    def getRaiz1(self):
        discriminante = self.getDiscriminante()

        return (
            -self.__b + math.sqrt(discriminante)
        ) / (2 * self.__a)

    def getRaiz2(self):
        discriminante = self.getDiscriminante()

        return (
            -self.__b - math.sqrt(discriminante)
        ) / (2 * self.__a)


# Programa de prueba
print("ECUACIÓN CUADRÁTICA")

a = float(input("Ingrese a: "))
b = float(input("Ingrese b: "))
c = float(input("Ingrese c: "))

ecuacion = EcuacionCuadratica(a, b, c)

discriminante = ecuacion.getDiscriminante()

if discriminante > 0:
    print("La ecuación tiene dos raíces")
    print("Raíz 1 =", ecuacion.getRaiz1())
    print("Raíz 2 =", ecuacion.getRaiz2())

elif discriminante == 0:
    print("La ecuación tiene una raíz")
    print("Raíz =", ecuacion.getRaiz1())

else:
    print("La ecuación no tiene raíces reales")