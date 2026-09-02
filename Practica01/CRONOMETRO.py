import time
import random


class Cronometro:
    def __init__(self):
        self.__inicia = time.time()
        self.__finaliza = None

    def inicia(self):
        self.__inicia = time.time()

    def detener(self):
        self.__finaliza = time.time()

    def lapsoDeTiempo(self):
        return (self.__finaliza - self.__inicia) * 1000


def ordenamiento_seleccion(lista):
    n = len(lista)

    for i in range(n - 1):
        minimo = i

        for j in range(i + 1, n):
            if lista[j] < lista[minimo]:
                minimo = j

        lista[i], lista[minimo] = lista[minimo], lista[i]


# PROGRAMA PRINCIPAL
print("Cronómetro - Ordenamiento por selección")

numeros = [random.randint(0, 1000000) for _ in range(1000)]

cronometro = Cronometro()

print("Iniciando ordenamiento...")
cronometro.inicia()

ordenamiento_seleccion(numeros)

cronometro.detener()

print("Ordenamiento terminado.")
print("Tiempo:", cronometro.lapsoDeTiempo(), "milisegundos")