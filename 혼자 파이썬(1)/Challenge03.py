# 1. 숫자의 종류
list = [1, 2, 3, 4, 1, 2, 3, 1, 4, 1, 2, 3]
counter = {}
for i in list :
    if i not in counter :
        counter[i] = 0
        counter[i] += 1


print(f"{list}에서")
print(f"사용된 숫자의 종류는 {len(counter)}입니다.")
print(f"참고: {counter}")

# 2. 염기의 개수
dnas = input("염기 서열을 입력해주세요: ")
counter = {
    "a" : 0,
    "t" : 0,
    "g" : 0,
    "c" : 0
}
for dna in dnas:
    counter[dna] += 1

for key in counter:
    print(f"{key}의 개수: {counter[key]}")

# 3. 염기 코돈 개수
dnas = input("염기 서열을 입력해주세요: ")
counter = {
    "cta" : 0,
    "caa" : 0,
    "tgt" : 0,
    "cag" : 0,
    "tat" : 0,
    "acc" : 0,
    "cat" : 0,
    "tgc" : 0,
    "att" : 0,
    "agc" : 0,
    "cgg" : 0
}
for dna in dnas:
    counter[dna] += 1

for key in counter:
    print(f"{key}의 개수: {counter[key]}")