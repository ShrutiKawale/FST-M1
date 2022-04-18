	
class Car:
    'This class represents a car'
 
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
 
    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")
 
    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")
 

   


car1 = Car("Huyndai", "XI", "2016", "Auto", "Grey")
car2 = Car("Audi", "ZIX", "2012", "Manual", "Red")
car3 = Car("BMW", "AII", "2022", "Auto", "Black")
 
car1.accelerate()

