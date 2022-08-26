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

# setAvatar() 메소드로 객체의 name과 hp를 설정하기 전에 다른 메소드를 호출하여 오류가 발생