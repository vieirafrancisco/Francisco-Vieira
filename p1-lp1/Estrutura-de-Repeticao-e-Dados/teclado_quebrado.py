text = input()
home = [] # pilha
end = [] # lista
char = ']'
home_str = ''
end_str = ''
res = '' # resultado

def condition(str1, str2):
    if(char == '[' and str1 != ''):
        home.append(str1)
        str1 = ''
    elif(char == ']' and str2 != ''):
        end.append(str2)
        str2 = ''
    return str1,str2

for letter in text:
    if(letter == '['):
        home_str,end_str = condition(home_str, end_str)
        char = '['
        continue
    elif(letter == ']'):
        home_str,end_str = condition(home_str, end_str)
        char = ']'
        continue

    if(char == '['):
        home_str+=letter
    elif(char == ']'):
        end_str+=letter

home_str,end_str = condition(home_str, end_str)

home_len=len(home)
end_len=len(end)

# pilha
for i in range(home_len):
    res+=home.pop()

# lista
for i in range(end_len):
    res+=end[i]

print(res)