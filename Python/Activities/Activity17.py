import pandas

my_dect={
    "Usernames" :["admin","admin11","admin22"],
    "Passwords" :["se123","wer123","lkj123"] 
}
data_Frame = pandas.DataFrame(my_dect)
print(data_Frame)
data_Frame.to_csv("C:\\Users\\0030WR744\\Desktop\\employee.csv", index=False)