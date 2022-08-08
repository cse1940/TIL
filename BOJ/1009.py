T = int(input()) 

for i in range(T):
    a, b = map(int, input().split())
    data = (a ** b) % 10
    print(data)
# 시간 초과