a = int(input()) # 150
b = int(input()) # 266
c = int(input()) # 427

result = list(str(a * b * c))

for i in range(10):
    print(result.count(str(i)))