my_dict={"orange":25,"apple":45,"chiku":34}
flag=0
given_fruit=input("Enter the fruit you want to search it persent in the dict or not ")
for x in my_dict:
    if(x==given_fruit):
        flag=1

if(flag==1):
    print("the given fruit is present")
else:
    print("the given fruit is absent")
