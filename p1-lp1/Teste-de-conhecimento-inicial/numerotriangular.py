'''
    É um número triangular?
'''
def verify(n, values):
    for i in range(len(values)-2):
        if(n == values[i]*values[i+1]*values[i+2]):
            return True
    return False

n = int(input())
if(n > 0):
    sqrtint = int(n**0.5)
    values = []

    for i in range(2,sqrtint+1):
        if(n % i == 0):
            values.append(i)

    if(verify(n, values)):
        print("Verdadeiro")
    else:
        print("Falso")
else:
    print("Falso")