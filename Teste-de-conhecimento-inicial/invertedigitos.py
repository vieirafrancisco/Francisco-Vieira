'''
    Inverte digitos
'''
n = int(input())
length = len(str(n))
nd = length-1

inverso = 0
while(nd >= 0):
    power = 10**nd
    v = int(n/power)
    inverso += v * (10**(length-nd-1))
    n = n % power
    nd -= 1

# Se a quantidade de digitos do número for maior
# que a quantidade de digitos do seu inverso
if(length > len(str(inverso))):
    diff = length - len(str(inverso))
    resultado = diff * "0" + str(inverso)
    print(resultado)
else:
    print(inverso)