
from datetime import datetime


age=input("Please enter your present age")
temp=100-int(age);
current_year= datetime.today().year
temp=temp+current_year
print("By this year " + str(temp) +" you would be 100 years old" )
