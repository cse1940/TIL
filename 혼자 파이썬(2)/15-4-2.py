# 예외 처리를 추가한 코드입니다.

try:
    x = int(input("첫 번째 숫자를 입력하세요. : "))
    y = int(input("두 번째 숫자를 입력하세요. : "))
    print(x/y)
except:
    print("오류가 발생했습니다. 다시 시도해 주세요.")