# 반복문과 함께 사용하는 경우
print("프로그램이 시작되었습니다.")

while True:
    try:
        print("try 구문이 실행되었습니다.")
        break
        print("try 구문의 break 키워드 뒤입니다.")
    except:
        print("except 구문이 실행되었습니다.")
    finally:
        print("finally 구문이 실행되었습니다.")
    print("whilw 반복문의 마지막 줄입니다.")
print("프로그램이 종료되었습니다.")

# 코드를 실행하면 break 키워드를 try 구문 전체를 빠져나가도 
# finally 구문이 실행되는 것을 볼 수 있다.