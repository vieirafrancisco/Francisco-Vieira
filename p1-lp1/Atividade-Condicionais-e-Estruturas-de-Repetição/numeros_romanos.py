numbers = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}

n = list(str(input()))
value = 0
length = len(n)

for i in range(length-1):
    if(n[i] != '0'):
        if(numbers[n[i]] < numbers[n[i+1]]):
            value += numbers[n[i+1]] - numbers[n[i]]
            n[i+1] = '0'
        else:
            value += numbers[n[i]] + numbers[n[i+1]]
            n[i+1] = '0'
    elif(i+2 == len(n)):
        value += numbers[n[i+1]]

if(length == 1):
    value = numbers[n[0]]

if(value % 5 == 0):
    print("O numero e multiplo de 5!")
else:
    print( "O resto pela divisao por 5 do numero dado e igual a %d!" %(value%5))