'''
    Inverte digitos 2
'''
n = int(input())
string = ''

while(n != 0):
    value = (int(n/10) * 10)
    digit = n - value
    string += str(digit)
    n = int(value / 10)

print(string)