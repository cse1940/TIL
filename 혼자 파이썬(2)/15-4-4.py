# 오류별로 다른 메세지를 출력하는 코드입니다.

x = [10, 20, 30]
try:
    index = int(input("인덱스를 입력하세요. : "))
    num = x[index]
    y = int(input("나눌 숫자를 입력하세요. : "))
    print(num / y)
except indexError:
    print("인덱스는 0부터 2까지 가능합니다.")
except ZeroDivisionError:
    print("숫자를 0으로 나눌 수 없습니다.")