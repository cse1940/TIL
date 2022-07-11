x,y =10,20
print(x,y)
y,x = x,y
print(x,y)

fruit = 'abcdefg'
print(len(fruit))

print(fruit[1])
print(fruit[1:3]) #1이상, 3미만
# a b c d e
# 0 1 2 3 4
# -5 -4 -3 -2 -1
print(fruit[-4])
print(fruit[2:5:2])
print(fruit[5:2:-1])
print(fruit[:3]) # 처음부터 3미만
print(fruit[4:]) # 4번째부터 끝까지
print(fruit[::]) # 처음부터 끝까지 1씩(그대로)
print(fruit[::-1]) # 끝부터 처음까지 1씩(거꾸로)

print('안녕하세요 \n반갑습니다')
print("따옴표를 '씁니다'")
print('따옴표를 \'씁니다\'')

score = 100
print(f'내 점수는 {score}이야')

# 리스트
students = ['동현','승은','진형','예지','수경','나영']
print(students[0])
print(students[-1])
students=[['동현','승은'],['진형','예지'],['수경','나영']]

# 딕셔너리
studends = {
    '1회차':['동현','승은'],
    '2회차':['진형','예지'],
    '3회차':['수경','나영']
}
print(studends['1회차'])

numbers = [1, 100, 20, 50]
print(sum(numbers))
print(max(numbers))
print(min(numbers))
print(len(numbers))
print(numbers[1]) # 100
# print([1, 100, 20, 50][1])
print(numbers[2:3]) # 20
# print([1, 100, 20, 50][2:3])
print([1,2]+[3]) #[1,2,3]

a = [0,1]
a[0] = -1
# index가 0에 해당하는 값을 -1로 바꿈
print(a)

boxes = ['apple','banana']
len(boxes) #2
boxes[1] #banana
boxes[1][0] #b

a = (1,2,3,1)
a[1]
# a[1]=

movie = {
    'title' : '설국열차'
    'genres' : ['sf','액션','드라마']
}
movie['genres']