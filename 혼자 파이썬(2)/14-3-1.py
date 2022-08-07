# 아바타의 이름과 HP를 속성으로 가지고 있는 Avatar 클래스입니다.

class Avatar:
    def setAvatar(self, name, hp):
        self.name = name
        self.hp = hp

    def increaseHp(self):
        self.hp = self.hp + 10
    
    def decreaseHp(self):
        self.hp = self.hp - 10
    
    def printHp(self):
        print("현재", self.name, "의 hp는", self.hp, "입니다.")

byunsoo = Avatar()
byunsoo.setAvatar("byunsoo", 0)
byunsoo.printHp()

pythony = Avatar()
pythony.setAvatar("pythony", 0)
pythony.printHp()