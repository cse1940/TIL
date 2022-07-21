# 1. 간단한 대화 프로그램
import datetime
now = datetime.datetime.now()

talk = input("입력: ")
if "안녕" in talk:
    print("안녕하세요.")
elif "지금" in talk:
    print(f"지금은 {now.hour}시입니다.")
else:
    print(talk)

# 2. 나누어 떨어지는 숫자
number = int(input("정수를 입력해주세요: "))

if number % 2 == 0:
    print(f"{number}은 2로 나누어 떨어지는 숫자입니다.")
else:
    print(f"{number}은 2로 나누어 떨어지는 숫자가 아닙니다.")
if number % 3 == 0:
    print(f"{number}은 3으로 나누어 떨어지는 숫자입니다.")
else:
    print(f"{number}은 3으로 나누어 떨어지는 숫자가 아닙니다.")
if number % 4 == 0:
    print(f"{number}은 4로 나누어 떨어지는 숫자입니다.")
else:
    print(f"{number}은 4로 나누어 떨어지는 숫자가 아닙니다.")
if number % 5 == 0:
    print(f"{number}은 5로 나누어 떨어지는 숫자입니다.")
else:
    print(f"{number}은 5로 나누어 떨어지는 숫자가 아닙니다.")