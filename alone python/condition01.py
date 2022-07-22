# 입력을 받습니다.
number = input("정수 입력: ") # 273(str)

# 마지막 자리 숫자를 추출
last_char = number[-1] # 3

# 숫자로 변환하기
last_number = int(last_char)

# 짝수 확인
if last_number == 0 or last_number == 2 or last_number == 4 or last_number == 6 or last_number == 8:
    print("짝수입니다")
else :
    print("홀수입니다")