words = ["aws", "python", "aws", "sql", "python", "aws"]

count = {}

for word in words:
    if word in count:
        count[word] = count[word] + 1
    else:
        count[word] = 1
print("Result", count)
