# Write code below 💖
import math

print("===")
print("Area Calculator 📐")
print("===")


shape = {1: "Square", 2: "Rectangle", 3: "Triangle", 4: "Circle", 5: "Quit"}
choice = int(input("Which shape: "))
if choice == 1:
    side = int(input("side: "))
    Square = side * side
    print("The area is", Square)
elif choice == 3:
    height = int(input("height: "))
    base = int(input("width: "))
    Triangle = (height * base) / 2
    print("The area is", Triangle)
elif choice == 4:
    radius = int(input("Enter radius: "))
    Circle = math.pi * ((radius) ** 2)
    print("The area is", Circle)
