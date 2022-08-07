# 메소드를 사용하여 객체별로 다른 속성을 부여하는 코드입니다.

class Waffle:
    def setName(self, n):
        self.name = n

choco = Waffle()
choco.setName("choco waffle")
print(choco.name)

banana = Waffle()
banana.setName("banana waffle")
print(banana.name)