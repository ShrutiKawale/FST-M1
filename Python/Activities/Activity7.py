
from sys import flags
from turtle import clear


print("Enter the 4 numbers you want to put in a list ")
flag=0;
my_list =list(())
while flag<=3:
    num = input("enter number 1")
    my_list.append(int(num))
    flag=flag+1

sum=0
for x in my_list:
    sum=x+sum

print(sum)