skills = ["Python", "SQL", "AWS"]

# PRINT ENTIRE LIST
print(skills)

# add new file
print(skills[0])

# add a new file
skills.append("Meg")

# change a value
skills[1] = "Java"

# check if a vlaue exists
if "SQL" in skills:
    print("File round")

# looping through the list
for skill in skills:
    print("Languages", skill)

# number of files
print("total languages", len(skills))
