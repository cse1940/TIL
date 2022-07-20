# 입력을 받습니다.
number = input("정수 입력: ")
last_char = number[-1]

# 짝수 조건
if last_char in "02468":
    print("짝수입니다")
else:
    print("홀수입니다")