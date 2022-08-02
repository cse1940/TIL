# else를 elif보다 먼저 적은 코드입니다.

button = int(input("1~3 중에서 입력하세요. : "))
if button == 1:
    print("한식")
elif button == 2:
    print("중식")
else:
    print("잘못된 번호 입력")
elif button == 3:
    print("일식")
print("맛있게 드세요!")

# else는 항상 마지막에 와야 합니다.