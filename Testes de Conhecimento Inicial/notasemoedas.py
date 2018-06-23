'''
    Notas e Moedas
'''
n = float(input())

valores = [100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01]
quantidades = []

for valor in valores:
    quantidade = int(n/valor)
    quantidades.append(quantidade)
    n = round(n - (valor*quantidade), 2)

print('NOTAS:')
for i in range(0, 6):
    print("%d nota(s) de R$ %.2f" %(quantidades[i], valores[i]))

print('MOEDAS:')
for i in range(6, len(valores)):
    print("%d moeda(s) de R$ %.2f" %(quantidades[i], valores[i]))