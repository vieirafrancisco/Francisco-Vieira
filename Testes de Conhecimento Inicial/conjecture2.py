def conjecture(n):
    sqrtint = int(pow(n, 0.5))+1
    for i in range(2, sqrtint):
        if(n % i == 0):
            return i + conjecture(int(n/i))
    return n
        
n = int(input())
while(n > 0):
    soma = conjecture(n)
    print(soma)
    n = int(input())