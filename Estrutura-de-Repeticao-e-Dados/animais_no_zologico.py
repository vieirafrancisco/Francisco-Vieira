animais = []

while(True):
    tipo = input()
    peso = float(input())
    local = input()

    animais.append({'tipo':tipo, 'peso': peso, 'local': local})

    s = input()
    if(s.upper() == 'PARAR'):
        break

tigres, macacos, cobras = 0, 0, 0
peso_tigres = 0
for animal in animais:
    if(animal['tipo'].upper() == 'TIGRE'):
        tigres += 1
        peso_tigres += animal['peso']
    elif(animal['tipo'].upper() == 'MACACO'):
        macacos += 1
    elif(animal['tipo'].upper() == 'COBRA'):
        if(animal['local'].upper() == 'VENEZUELA'):
            cobras += 1

print(macacos)
if(tigres != 0):
    print("{0:.2f}".format(peso_tigres/tigres))
else:
    print("{0:.2f}".format(0))
print(cobras)