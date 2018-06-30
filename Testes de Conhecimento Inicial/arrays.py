'''
    Arrays
'''
def get_values(length):
    lista = []
    while(length > 0):
        lista.append(int(input()))
        length -= 1
    return lista

def verify(lista_a, lista_b, k, m):
    for i in range(k):
        for j in range(m):
            if(lista_a[i] >= lista_b[j]):
                return "NO"
    return "YES"

len_a = int(input())
len_b = int(input())
k = int(input())
m = int(input())

lista_a = get_values(len_a)
lista_b = get_values(len_b)

lista_a.sort()
lista_b.reverse()

print(verify(lista_a, lista_b, k, m))