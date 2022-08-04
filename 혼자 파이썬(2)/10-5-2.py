# for 반복문을 2개 중첩하여 2차원 리스트의 값을 출력하는 코드입니다.

array_2d = [["이", "차", "원"], ["리", "스", "트"]]
for array in array_2d:
    for a in array:
        print(a, end=" ")
    print()