# Write code below 💖
houses = ["🦁 Gryffindor", "🦅 Ravenclaw", "🦡 Hufflepuff", "🐍 Slytherin"]

q1 = input("Do you like Dawn or Dusk?: ")
q2 = input("When I’m dead, I want people to remember me as: ")
q3 = input("Which kind of instrument most pleases your ear?: ")

if q2 == 1:
    houses[2] = +2
elif q2 == 2:
    houses[3] = +2
elif q2 == 3:
    houses[1] = +2
elif q2 == 4:
    houses[0] = +2
else:
    print("Wrong input")

if q3 == 1:
    houses[3] = +4
elif q3 == 2:
    houses[2] = +4
elif q3 == 3:
    houses[1] = +4
elif q3 == 4:
    houses[0] = +4
else:
    print("Wrong input")
