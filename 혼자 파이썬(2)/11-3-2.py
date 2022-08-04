# 최솟값과 최댓값을 튜플 자료형으로 반환하는 함수를 작성한 코드입니다.

def minmax(ex_lst):
    return min(ex_lst), max(ex_lst)

a = [1, 2, 3, 4, 5]
result = minmax(a)
print(result)
print(type(result))