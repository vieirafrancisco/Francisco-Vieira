'''
    Interseção entre listas
'''

lista1 = []
lista2 = []
intersecao = []
tamanho = 40

i = 0
while(i < tamanho):
    value = input()
    if(value != ''):
        if(i < 20):
            lista1.append(int(value))
        else:
            lista2.append(int(value))
    i += 1

for value1 in lista1:
    for value2 in lista2:
        if(value1 == value2 and value1 not in intersecao):
            intersecao.append(value1)

if(intersecao == []):
    print('VAZIO')
else:
    intersecao.sort()
    for value in intersecao:
        print(value)