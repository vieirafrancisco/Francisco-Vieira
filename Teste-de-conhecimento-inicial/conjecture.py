def is_prime(n):
    sqrtint = int(pow(n, 0.5))+1
    for i in range(2, sqrtint):
        if(n % i == 0):
            return False
    return True

def factor(n):
    fact = {} # empty dictionary
    for i in range(2, int(n/2)+1):
        while(n % i == 0):
            n = n / i
            if(i in fact):
                fact[i] = fact.get(i) + 1
            else:
                fact[i] = 1
        if(n == 1):
            break

    if(len(fact.keys()) == 0):
        fact[n] = 1

    return fact

n = int(input())

the_factor = factor(n)
s = 0
for fact in the_factor.items():
    s += fact[0] * fact[1]

if is_prime(n):
    if(n == s):
        print("To " + str(n)+ " the conjecture is True")
    else:
        print("To " + str(n)+ " the conjecture is False")
else:
    print(str(n) + " isn't prime!")
print("The sum is: " + str(s))