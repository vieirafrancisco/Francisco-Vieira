'''
    Carros de João e Maria
'''

char = input()
max_ano = 0
max_velocidade = 0
vmedia = 0
count = 0

if(char == 's' or char == 'S'):
    while(char == 's' or char == 'S'):
        ano = int(input())
        if(ano > max_ano):
            max_ano = ano

        velocidade = float(input())
        if(velocidade > max_velocidade):
            max_velocidade = velocidade

        vmedia += velocidade
        count += 1
        char = input()

    print("{:.2f}".format(max_velocidade))
    print(max_ano)
    print("{:.2f}".format(vmedia/count))
elif(char == 'n' or char == 'N'):
    print('zero')
else:
    print('Letra incorreta!')