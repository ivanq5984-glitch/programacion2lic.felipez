import math


class Estadistica:
    def __init__(self, datos):
        self.__datos = datos

    def promedio(self):
        suma = 0

        for numero in self.__datos:
            suma += numero

        return suma / len(self.__datos)

    def desviacion(self):
        promedio = self.promedio()

        suma = 0

        for numero in self.__datos:
            suma += (numero - promedio) ** 2

        return math.sqrt(suma / (len(self.__datos) - 1))


# Programa de prueba
print("ESTADÍSTICAS")

datos = []

for i in range(10):
    numero = float(input(f"Ingrese número {i + 1}: "))
    datos.append(numero)

estadistica = Estadistica(datos)

print()
print("El promedio es:", estadistica.promedio())
print("La desviación estándar es:", estadistica.desviacion())