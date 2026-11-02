numbers = [10, 20, 80, 10, 10, 20, 60]

# output is like key and value, so number and count

count = 0
seen = {}  # empty dictonary to store already seen

for number in numbers:
    if number in seen:
        seen.add(number, count + 1)
    else:
        seen.add(number, 1)
print("Each number appears", seen)
