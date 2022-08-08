#1
num = int(input('숫자 입력:'))
if num % 2 == 0:
    print('짝수입니다')
else :
    print('홀수입니다')

#2
dust = int(input("미세먼지 농도 값:"))
if dust <=30 :
    print("미세먼지 좋음")
elif dust <=80:
    print("미세먼지 보통")
elif dust <=150:
    print("미세먼지 나쁨")
else :
    print("미세먼지 매우나쁨")

#3 
dust = int(input("미세먼지 농도 값:"))
if dust <0:
    print("음수예요")
    if dust<=30 :
        print("미세먼지 좋음")
elif dust <=80:
    print("미세먼지 보통")
elif dust <=150:
    print("미세먼지 나쁨")
else :
    if dust >300:
        print("실외활동 자제")
    print("미세먼지 매우나쁨")

#4 
num =-5
if num >=0:
    print(value=num)
else :
    print(value=0)
