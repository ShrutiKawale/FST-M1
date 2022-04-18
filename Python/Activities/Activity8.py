print("Enter 4 numbers into the list")
flag =0
my_list =[]
while flag<=3:
    num = int(input("Input the number  "))
    my_list.append(num)
    flag=flag+1

if(my_list[-1] == my_list[0]):
    print("First and last element is the same ")
else:      
    print("first and the last number is not the same ")