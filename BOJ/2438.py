t = int(input())
output = ""

for i in range(t):
    for j in range(1, i+1):
        output += "*"
    output += "\n"

print(output)