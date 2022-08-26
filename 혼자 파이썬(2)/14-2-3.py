# Avatar 클래스에 출력용 메소드를 추가한 코드입니다.

class Avatar:
    def setAvatar(self, height, skill):
        self.height = height
        self.skill = skill

    def printAvatar(self):
        print("키는", self.height, "cm,", "스킬은", self.skill, "입니다.")

byunsoo = Avatar()
byunsoo.setAvatar(120, "점프")
byunsoo.printAvatar()