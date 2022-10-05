#예제3
numbers = map(int, input().split())
print(sum(numbers))

#예제4
words = list(map(str, input().split()))
print(words)

#예제5
number = '22020718'
print(len(number))

#예제6
N = 10
answer = []
for number in range(N + 1):
    answer.append(number * 2)

print(answer)

#예제7
number_list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

total = 0
count = 0

for number in number_list:
    total = total +number
    count = count + 1

print(total / count)

#예제8
word = "HappyHacking"

count = 0

for char in word:
    if char == "a" or char == "e" or char == "i" or char == "o" or char == "u":
        count = count + 1 
print(count)

#예제9

#예제10
number_list = [1, 23, 9, 6, 91, 59, 29]
max1 = max(number_list)

number_list2 = [2, 5, 100, 20, 50, 10, 91, 82]
max2 = max(number_list2)

if max1 > max2:
    print("첫 번째 리스트의 최댓값이 더 큽니다.")

elif max1 < max2:
    print("두 번째 리스트의 최댓값이 더 큽니다.")

else:
    print("첫 번째 리스트의 최댓값과 두 번째 리스트의 최댓값은 같습니다.")

#예제11

#문제19
number = input('숫자입력:')

count = 0
for i in number : 
    count = count +1
print(count)