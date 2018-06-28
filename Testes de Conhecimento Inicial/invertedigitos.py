'''
    Inverte digitos
'''
n = int(input())
string = str(n)

while(string != '0'):
    inverso = ''

    for i in range(len(string)-1, -1, -1):
        inverso += '[' + string[i] + ']'

    print(inverso)
    n = int(input())
    string = str(n)