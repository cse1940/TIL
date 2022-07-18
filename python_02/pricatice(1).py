#1
x,y = 10,20
x,y = y,x 
print(x,y)

#2 
num =100
print(num >= 100 and num %3 == 1) 

#3
print('''문자열 안에 '작은 따옴표'나 "큰 따옴표"를 사용할 수 있고 여러 줄을 사용할 때도 편리하다.''')

#4
a= 'abcdefg'
print(a[2:5])
print(a[2:5:2])
print(a[:3])
print(a[5:])
print(a[::]) #전체
print(a[::-1]) #전체 거꾸로

#5
print('hi'*3) #반복
print('a' in 'apple') #포함

#6
a= [1,2,3]
print(a[0])
a[0] = 4 #값 변경
print(a)
a.append(10) #값 추가
print(a)
a.pop(1) #값 삭제
print(a)

#7
print(list(range(6,1,-1)))

#8 
numbers = {1,2,3} #set 값 추가
numbers.add(5)
print(numbers)
numbers.remove(3) #set 값 제거
print(numbers)

name = ['승은','승은','승은','진형','승혁','승혁']
print(set(name))
print(len(set(name))) #중복 제거 값 이름의 갯수

#9
students = {'홍길동':30, '최승은':25} #딕셔너리
print(students['홍길동'])
students['홍길동']=90 #딕셔너리 키값 변경
students['박영희']=95 #딕셔너리 키값 추가
print(students['홍길동'])
print(students)

movie = {
    'title':'설국열차',
    'genres':['sf','액션','드라마'],
    'open_data':'2013-08-01',
    'time':126,
    'adult':False
}
print(movie['genres'])
