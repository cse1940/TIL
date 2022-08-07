# Avatar 클래스 안에 생성자 __init__을 사용하는 코드입니다.

class Avatar:
    def __init__(self, name, hp):
        self.name = name
        self.hp = hp

    def increaseHp(self):
        self.hp = self.hp + 10

    def decreaseHp(self):
        self.hp = self.hp - 10
    
    def printHp(self):
        print("현재", self.name, "의 hp는", self.hp, "입니다.")

byunsoo = Avatar("byunsoo", 0)
byunsoo.printHp()

pythony = Avatar("pythony", 0)
pythony.printHp()