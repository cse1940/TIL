# 2차원 리스트에 반복문 두번 사용하기
list_of_list = [
    [1, 2, 3],
    [4, 5, 6, 7],
    [8, 9]
]

for items in list_of_list:
    for item in items:
        print(items)

numbers = [123, 12, 1]
for number in numbers:
    print(f"{number}는 {len(str(number))} 자릿수입니다.")