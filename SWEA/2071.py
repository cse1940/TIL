T = int(input())
for i in range(1, T + 1):
    a,b,c,d,e,f,g,h,i,j = map(int, input().split())
    print('#'+str(i), (a+b+c+d+e+f+g+h+i+j)/10)