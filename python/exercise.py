''' = ['이영희', '김철수', '이영희', '조민지', '김철수', '조민지', '이영희', '이영희']

a=0
for i in students :
    if i == '이영희':
        a= a+1
print(a)

a=0
numbers = [7, 17, 10, 5, 4, 3, 17, 5, 2, 5]
for i in numbers:
    if i == 5:
        a=a+1
print(a)'''

'''word=str(input("단어입력:"))
for i in word :
    word.remove('a')
print(word)'''

'''def cube (n):
    return n*n*n

print(cube(12))'''

'''def rectangle (a,b):
    return (a*b),((a+b)*2)
print(rectangle(20,30))


students=['최승은','박진형','김나향','최승은']
print(students.count('최승은'))
'''
j=1
for i in range(2,10,1):
    print(i,"단")
    if i ==2:
        j=j+1
        tot=i*j
    print(i,"*",j,"=",tot)

