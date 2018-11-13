# Time limit exceeded - Ineficiente
def is_special(n):
    if(int(n) < 0):
        return False
    length = len(n)
    if(length == 1):
        return True
    if(n[0]==n[length-1]):
        return True
    return False

def special_array(a):
    result_list = []
    for num in a:
        if(is_special(str(num))):
            result_list.append(1)
        else:
            result_list.append(0)
    return result_list

n, q = map(int,input().split())
array = list(map(int, input().split()))
binary = special_array(array)

for i in range(q):
    a,b,c = map(int, input().split())
    if(a == 1):
        summ = 0
        for i in range(b-1, c):
            summ+=binary[i]
        print(summ)
        summ = 0
    elif(a == 2):
        array[b-1] = c
        binary = special_array(array) 