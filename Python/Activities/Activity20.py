from operator import index
import pandas

data_frame = pandas.read_excel("C:\\Users\\0030WR744\\Desktop\\emp.xlsx")
print("Number of rows and columns:", data_frame.shape)

print("-------------------------------------")
print("-------------------------------------")

print(data_frame["Email"])

print("-------------------------------------")
print("-------------------------------------")

print(data_frame.sort_values("FirstName"))