my_list1=[1,2,3,4,5,6,7]
my_list2=[11,12,13,14,15,16,17]

for x in my_list1:
    if(x%2 == 0):
        my_list1.remove(x)


for x in my_list2:
    if(x%2 != 0):
        my_list2.remove(x)

my_list = my_list1+my_list2
print(my_list)

