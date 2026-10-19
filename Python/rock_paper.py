# Write code below 💖
import random

print("======")
print("Rock Paper Scissors")
print("======")

print("1) ✊")
print("2) ✋")
print("3) ✌️")

player = int(input("pick a number: "))
choices = {1: "✊", 2: "✋", 3: "✌️"}
print("You chose:", choices[player])

computer = random.randint(1, 3)
print("CPU chose: ", choices[computer])

if player == computer:
    print("It is a tie!")

elif player == 2 and computer == 1:
    print("The Player Won!")

elif player == 3 and computer == 2:
    print("The Player Won!")

elif player == 1 and computer == 3:
    print("The Player Won!")

else:
    print("The CPU Won!")
