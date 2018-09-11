import math

total_fraudas = 0

while(True):
    n = int(input())  
    
    if(n <= 2):
        total_fraudas += 9*30
    else:
        total_fraudas += 6*30

    s = input()
    if(s != 'sim'):
        break
    
result = int(round(math.ceil(total_fraudas/100)))
print(result)
print(result*100 - total_fraudas)