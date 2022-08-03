# 무한 반복에서 사용자의 입력을 받아 반복문을 빠져나오는 코드입니다.

number = 0
while True: # 조건식이 무조건 참이므로 while 문이 무한 반복
    number = int(input("문을 여시겠습니다? (1:Y / 2:N) "))
    if number == 1:
        print("문이 열렸습니다.")
        break
    elif number == 2:
        print("문을 열 수 없습니다.")