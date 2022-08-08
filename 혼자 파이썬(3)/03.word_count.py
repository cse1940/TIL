# 1. 변수를 사용하여 단어 수 세기
line = "this is a string with a few words"
total_words = line.count(" ") + 1
print(total_words)

print("this is a string with a few words".count(" ") + 1)

# 2. 입력 읽기 
print(input())

result = input()
print(result)
print(result.upper())

# 3. 출력 쓰기
print("abc")
print("abc".upper())
print(45 + 9)
print("abc", 45 + 9)

# 4. DMOJ - Word Count(dmopc15c7pe) 
word = "problem one is really long"
print(word.count(" ") + 1)

# 5. DOMJ - Cone Volume(dmopc14c5p1)
r = int(input()) # 원뿔의 반지름
h = int(input()) # 원뿔의 높이
print("직원뿔의 부피는", (3.14 * r ** 2 * h)/3, "입니다.")

