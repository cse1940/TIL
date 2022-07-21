# 해당하는 값 모두 제거하기
# 변수를 선언합니다.
list_test = [1, 2, 1, 2]
vaule = 2

# list_test 내부에 vaule가 있다면 반복
while vaule in list_test:
    list_test.remove(vaule)

# 출력합니다.
print(list_test)