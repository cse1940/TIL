# filter() 함수를 사용하는 코드입니다.

def isEven(num):
    return num % 2 == 0
filtered = list(filter(isEven, [1, 3, 4, 2, 5, 3]))
print(filtered)