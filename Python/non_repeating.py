string = "aabbcdde"

count = {}
for char in string:
    if char in count:
        count[char] += 1
    else:
        count[char] = 1
for char in string:
    if count[char] == 1:
        print(char)
        break
