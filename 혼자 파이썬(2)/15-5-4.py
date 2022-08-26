# map() 함수를 사용하는 코드입니다.

def multiply(num):
    return num * 2
mapped = list(map(multiply, [1, 3, 4, 2, 5, 3]))
print(mapped)