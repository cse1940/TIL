# 반복문으로 피라미드 만들기(2)
output = ""

for i in range(1, 15):
    for j in range(14, i, -1):
        output = output + " "
    for k in range(0, 2 * i -1):
        output = output + "*"
    output = output + "\n"

print(output)