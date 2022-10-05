t = int(input())

output = ""
for i in range(t):
    for j in range(0, i+1):
        output += "*\t"
    output += "\n"
print(output)