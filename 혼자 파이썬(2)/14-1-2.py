# 클래스의 변수를 변경할 때 모든 객체의 변수가 바뀌는 코드입니다.

class Waffle:
    name = "waffle"

choco = Waffle()
Waffle.name = "choco waffle"
print(choco.name)

banana = Waffle()
print(banana.name)