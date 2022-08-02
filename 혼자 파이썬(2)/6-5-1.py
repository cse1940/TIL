# 식사 메뉴 종류를 골라주는 프로그램입니다.

button = int(input("1~3 중에서 입력하세요. : "))
if button == 1:
    print("한식")
elif button == 2:
    print("중식")
elif button == 3:
    print("일식")
else:
    print("잘못된 번호 입력")
print("맛있게 드세요!")