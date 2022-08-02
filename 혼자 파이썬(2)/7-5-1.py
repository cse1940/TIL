# while 반복문 안에 조건문을 사용한 코드입니다.

hit = 0
while hit < 5:
    hit += 1
    print("나무를", hit, "번 찍었습니다.")
    if hit == 5:
        print("쓰러집니다~")