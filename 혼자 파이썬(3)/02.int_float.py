# 1. 정수 및 부동 소수점 수
print(30)
print(7)
print(10000)
print(-9)

print(8 + 10) # 적절한 공백은 코드의 가독성을 높여 줌
print(8 - 10)
print(8 * 10)

print(8 // 2) # //은 나머지는 버리고 몫만 구하는 연산자임
print(9 // 5)
print(-9 // 5)

print(8 % 2) # %는 나눗셈의 나머지를 구하는 연산자임, = mod
print(8 % 3)

print(8 / 2) # /는 //와 대조적으로 반올림을 수행하지 않음, float 타입
print(9 / 5)
print(-9 / 5)

print(12.5 * 2)
print(50 + 10 * 2)
print((50 + 10) * 2)

print((5).bit_length()) # 어떤 정수가 차지하는 메모리의 크기를 구할 수 있는 bit_length 메서드
print((100).bit_length())
print((99999).bit_length()) # 정수가 클수록 더 많은 메모리가 필요함

# 2. 변수
# 3. 할당문
dollars = 250
print(dollars)
print(dollars + 10)
print(dollars)
dollars = 300
print(dollars)

purchase_price1 = 58
purchase_price2 = 12
print(purchase_price1 + purchase_price2)

start = "Monday"
end = "Friday"
print(start)
print(end)
print(start + "-" + end)

# 4. 변수 값 변경
dollars = 250
print(dollars + 1)
print(dollars)
dollars = dollars + 1
print(dollars)
dollars = dollars + 1
print(dollars)