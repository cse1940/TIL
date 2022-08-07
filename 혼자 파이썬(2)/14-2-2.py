# Avatar 클래스로 생성된 객체 byunsoo에 속성을 부여하는 코드입니다.

class Avatar:
    def setAvatar(self, height, skill):
        self.height = height
        self.skill = skill

byunsoo = Avatar()
byunsoo.setAvatar(120, "점프")

print(byunsoo.height)
print(byunsoo.skill)