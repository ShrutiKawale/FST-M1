import pandas

data_frame = pandas.read_csv("C:\\Users\\0030WR744\\Desktop\\employee.csv")

#all the valeues under column usernames
print(data_frame["Usernames"])
#values in second row
print(data_frame["Usernames"][1] +" "+ data_frame ["Passwords"][1])
#sorting use name in assending order
print(data_frame.sort_values("Usernames"))

#sorting password in decending order
print(data_frame.sort_values("Passwords", ascending=False))
