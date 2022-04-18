from ast import Break


flag=1
def sum(num):
    num1=int(num)
    if(num1<=1):
        return num1
    else:
        return num1 + sum(num1-1)

print(sum(10))
    

    