numbers = [10, 20, 10, 30, 20]

# set to store numbers we have already seen
seen = set()

# set to store duplicate numbers
duplicate = set()

# go through each number in the list
for number in numbers:

    # check if we have already seen this number
    if number in seen:
        # if yes, it is a duplicate
        duplicate.add(number)
    else:
        # if not, remember this number
        seen.add(number)

# print all duplicate numbers
print("Duplicates are", duplicate)
