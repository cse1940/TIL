# 지역 변수를 전역으로 사용한 코드입니다.

def cal(x, y):
    result = x + y
    return result
cal(4, 5)
print(result)