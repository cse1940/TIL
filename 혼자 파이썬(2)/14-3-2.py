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
byunsoo.printHp()
