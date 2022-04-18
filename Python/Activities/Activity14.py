
def fibbi(num):

    num1=0
    num2=1
    while(num>=0):
        sum=num1+num2
        num1=num2
        num2=sum
        print(num1)
        num=num-1



fibbi(5)