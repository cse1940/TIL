# 1. 문자열 표현
print("hello")
print("a bunch of words")

''' print('don't say that')
    don't라는 단어에 있는 작은따옴표가 문자열의 종료를 방해하여
    구문 오류 발생 
'''
print("don't say that")

# 2. 문자열 연산자
print("hello" + "there")
print("hello " + "there")
print("-" * 30)

# 3. 문자열의 메서드들
print("hello".upper()) # 문자열의 문자들을 대문자로 변환하는 upper 메서드

print("    abc".strip()) # 처음과 끝의 모든 공백을 제거하는 strip 메서드
print("  abc   ".strip())
print("abc".strip())
print("abc".strip("a")) # 문자열의 처음과 끝에서 주어진 문자를 제거할 수도 있음
print("abcc".strip("c"))
print("abca".strip("ab"))

print("abc".count("a")) # 해당 인자가 문자열 안에 몇 개가 있는지 알려주는 count 메서드
print("abc".count("d"))
print("aaabaaa".count("a"))
print("aaabccc".count("ab")) # 인자가 겹치면, 첫 번째로 발견한 것만 count함
print("this is a string with a few words".count(" "))