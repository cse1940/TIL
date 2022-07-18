#1
word = 'banana'
count=0
for i in word :
    if i == 'a':
        count = count+1
    elif i == 'b':
        count = count+1
    elif i == 'n':
        count=count+1
print(count)

#2
word = 'banana'
result = {}
result['a'] = 0 #키-값의 쌍 추가
print(result)

my_list = []
my_list.append(1) #list값의 추가
print(my_list)

#3
word = 'banana'
result = {}
for char  in word : #문자열 반복하면서 알파벳 하나씩 char
    #만약 기존에 키가 없다면, 1로 초기화를 하고
    if char not in result:
        result[char] =1
    #키가 있으면, 기존 값에 더하자
    else:
         result[char] =  result[char] +1
print(result)