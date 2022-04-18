import pandas

data ={
    "FirstName":["Satvik","Avinash","Lahri"],
    "LastName":["Saha","Kati","Rath"],
    "Email":["satshah@example.com","avinashk@example.com","	lahri.rath@example.com"],
    "PhoneNumber":[4537829158,537829222,4537829333]
}
data_frame = pandas.DataFrame(data)

	
writer = pandas.ExcelWriter("C:\\Users\\0030WR744\\Desktop\\emp.xlsx")
data_frame.to_excel(writer,sheet_name="Sheet1",index=False)
writer.save()

data_frame = pandas.read_excel("C:\\Users\\0030WR744\\Desktop\\emp.xlsx")
print(data_frame)