statuses = ["success", "failed", "success", "pending", "failed", "success"]

count = {}

for status in statuses:
    if status in count:
        count[status] = count[status] + 1
    else:
        count[status] = 1
print("result", count)
