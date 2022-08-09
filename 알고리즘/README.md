## 이차원 리스트

### 1. 이차원 리스트

- ```리스트를 원소로 가지는 리스트```일 뿐

```python
matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

print(matrix[0])
print(matrix[1])
print(matrix[2])
print(matrix[0][0])
print(matrix[1][2])
print(matrix[2][0])
```

- 이차원 리스트는 ```행렬(matrix)```임

```python
# 보기 좋게 변경하면 행렬(matrix)의 형태가 나옴
matrix = [
    [1, 2, 3],
    [4, 5 ,6],
    [7, 8, 9]
]
print(matrix[1][2])
```

- 특정 값으로 초기화 된 이차원 리스트 만들기

1. 직접 작성(4 * 3 행렬)

```python
matrix1 = [[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]]

matrix2 = [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0]
]
```

             2. 반복문으로 작성(100 * 100 행렬)

```python
matrix = []

for _ in range(100):
    matrix.append([0] * 100)
```

2. 반복문으로 작성(n * m 행렬)

```python
n = 4 # 행
m = 3 # 열
matrix = []

for _ in range(n):
    matrix.append([0] * m)

print(matrix)
```

3. 리스트 컴프리헨션으로 작성(n * m 행렬)

```python
n = 4 # 행
m = 3 # 열
matrix = [[0] * m for _ in range(n)]
print(matrix)
```

[주의] 리스트 컴프리헨션 vs 리스트 곱셈 연산

```python
n = 4 # 행
m = 3 # 열

matrix1 = [[0] * m for _ in range(n)]
matrix2 = [[0] * m] * n

# 원소 값 변경을 꼭 해줘야 함
matrix1[0][0] = 1
matrix2[0][0] = 1

print(matrix1)
print(matrix2)
```

### 2. 입력받기

1. 행렬의 크기가 미리 주어지는 경우

```python
matrix = []

# input 함수가 한 줄을 입력 받기 때문에 열의 크기는 사용되지 않음
for _ in range(8):
    line = list(input())
    matrix.append(line)
    
# 리스트 컴프리헨션을 통해 이차원 리스트의 입력을 간단히 받을 수 있음
matrix = [list(input()) for _ in range(8)]

# 3 * 3 크기의 입력을 받아보자.
matrix = []

for _ in range(3):
    line = list(map(int, input().split()))
    matrix.append(line)
```

2. 행렬의 크기가 입력으로 주어지는 경우

```python
n, m = map(int, input().split())
matrix = []

for _ in range(n):
    line = list(map(int, input().split()))
    matrix.append(line)
    
# 리스트 컴프리헨션을 통해 이차원 리스트의 입력을 간단히 받을 수 있음
matrix = [list(map(int, input().split())) for _ in range(n)]
```

### 3. 순회

- 이차원 리스트에 담긴 모든 원소를 정렬하여 출력하고 싶다면?

```python
# 인덱스를 통해 각각 출력하면 가능
matrix = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 0, 1, 2]
]
print(matrix[0][0], matrix[0][1], matrix[0][2], matrix[0][3])
print(matrix[1][0], matrix[1][1], matrix[1][2], matrix[1][3])
print(matrix[2][0], matrix[2][1], matrix[2][2], matrix[2][3])
```

- 그러나 이차원 리스트의 크기가 100 * 100이라도 윗 내용처럼 출력할 수 있을까?
- 이중 반복문을 통해 순회하며 이차원 리스트를 출력함

1. 이중 for문을 이용한 ```행 우선 순회```

```python
matrix = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 0, 1, 2]
]
for i in range(3): # 행
    for j in range(4): # 열
        print(matrix[i][j], end=" ") # 하나의 행을 출력
    print()
```

2. 이중 for문을 이용한 ```열 우선 순회```

```python
matrix = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 0, 1, 2]
]
for i in range(4): # 열
    for j in range(3): # 행
        print(matrix[j][i], end=" ") # 하나의 열을 출력
    print()
```

- 행 우선 순회를 이용해 이차원 리스트의 ```총합``` 구하기

```python
matrix = [
    [1, 1, 1, 1],
    [1, 1, 1, 1],
    [1, 1, 1, 1]
]

total = 0
for i in range(3):
    for j in range(4):
        total += matrix[i][j]
print(total)
```

[참고] Pythonic한 방법으로 이차원 리스트의 ```총합``` 구하기

```python
matrix = [
    [1, 1, 1, 1],
    [1, 1, 1, 1],
    [1, 1, 1, 1]
]
total = sum(map(sum, matrix))
print(total)
```

- 행 우선 순회를 이용해 이차원 리스트의 최대값, 최소값 구하기

```python
# 최대값
matrix = [
    [0, 5, 3, 1],
    [4, 6, 10, 8],
    [9, -1, 1, 5]
]
max_value = 0
for i in range(3):
    for j in range(4):
        if matrix[i][j] > max_value:
            max_value = matrix[i][j]
print(max_value)

# 최소값
matrix = [
    [0, 5, 3, 1],
    [4, 6, 10, 8],
    [9, -1, 1, 5]
]
max_value = 999999
for i in range(3):
    for j in range(4):
        if matrix[i][j] < max_value:
            max_value = matrix[i][j]
print(max_value)
```

[참고] Pythonic한 방법으로 이차원 리스트의 최대값, 최소값 구하기

```python
matrix = [
    [0, 5, 3, 1],
    [4, 6, 10, 8],
    [9, -1, 1, 5]
]
max_value = max(map(max, matrix))
min_value = min(map(min, matrix))

print(max_value)
print(min_value)
```

- 이차원 리스트 순회 연습

```python
list_a = [list(map(int, input().split())) for i in range(2)]
list_b = [list(map(int, input().split())) for i in range(2)]
list_c = [[0] * 3 for _ in range(2)]

# 두 배열의 같은 위치끼리 곱하여 새로운 이차원 리스트에 저장
for i in range(2):
    for j in range(3):
        list_c[i][j] = list_a[i][j] * list_b[i][j]
# 결과 출력
for i in range(2):
    for j in range(3):
        print(list_c[i][j], end=" ")
    print()
```

### 4. 전치

- 행렬의 행과 열을 서로 맞바꾸는 것을 의미함

```python
matrix = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 0, 1, 2]
]
transposed_matrix = [[0] * 3 for _ in range(4)]

for i in range(4):
    for j in range(3):
        transposed_matrix[i][j] = matrix[j][i] # 행, 열 맞바꾸기
```

### 5. 회전

- 문제에서 이차원 리스트를 왼쪽, 오른쪽으로 90도 회전하는 경우도 존재함

```python
# 1. 왼쪽으로 90도 회전하기
matrix = [
    [1, 2, 3],
    [4, 5 ,6],
    [7, 8, 9]
]
n = 3
rotated_matrix = [[0] * n for _ in range(n)]

for i in range(n):
    for j in range(n):
        rotated_matrix[i][j] = matrix[j][n - i - 1]
       
# 2. 오른쪽으로 90도 회전하기
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
n = 3
rotated_matrix = [[0] * n for _ in range(n)]

for i in range(n):
    for j in range(n):
        rotated_matrix[i][j]= matrix[n - j -1][i]
```

## 완전탐색 I

### 1. 무식하게 다해보기(Brute-force)

- ```모든 경우의 수```를 탐색하여 문제를 해결하는 방식
  - ```브루트포스```라고도 하며, 무식하게 밀어붙인다는 뜻
  - 가장 단순한 풀이 기법, 단순 조건문과 반복문을 이용해서 풀 수 있음
  - 복잡한 알고리즘 보다는, 아이디어를 어떻게 코드를 구현할 것인지가 중요함

- BOJ 2798 (블랙잭)을 통해 완전탐색 이해하기

```python
def blackjack(n, m, cards):
    max_total = 0 # 현재 가장 큰 합
    
    # 완전탐색(Brute-force)
    # 3중 for문을 이용해 모든 경우의 수를 탐색
    # i, j, k는 세 장의 카드의 인덱스를 의미
    # 중복으로 뽑는 경우를 방지하기 위해 range 범위
    for i in range(n - 2):
        for j in range(i + 1, n -1):
            for k in range(j + 1, n):
                total = cards[i] + cards[j] + cards[k]
                
                # 현재 가장 큰 합보다는 크고, m을 넘지 않아야 갱신
                if max_total < total <= m:
                    max_total = total
                
                # 합과 m이 같으면 더 이상 탐색하는 의미가 없으므로 종료
                if total == m:
                    return total
     return max_total
```

### 2. 델타 탐색(Delta Search)

- ```이차원 리스트의 완전탐색```에서 많이 등장하는 유형인 ```델타 탐색(상하좌우 탐색)```을 알아보자.
- (0, 0)에서부터 이차원 리스트의 모든 원소를 순회하며(완전탐색) ```각 지점에서 상하좌우에 위치한 다른 지점을 조회하거나 이동```하는 방식
- 행과 열의 변량인 -1, +1을 ```델타(delta)값```이라고 함
- 델타(delta)값을 이용해 상하좌우로 이동하기

```python
# 1) 행을 x, 열을 y로 표현
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# 2) 행을 r, 열을 c로 표현
dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]

# 행은 x or r로 나타내고 열은 y or c로 나타냄
```

```python
# 상(x - 1, y)
nx = x + dx[0]
ny = y + dy[0]

# 하(x + 1, y)
nx = x + dx[1]
ny = y + dy[1]

# 좌(x, y -1)
nx = x + dx[2]
ny = y + dy[2]

# 우(x, y + 1)
nx = x + dx[3]
ny = y + dy[3]

# 1. 델타값을 이용해 상하좌우 이동 
# for문을 이용해서 상하좌우 이동을 간단히 표현할 수 있음
for i in range(4):
    nx = x + dx[i]
    ny = y + dy[i]
    
    # 2. 범위를 벗어나지 않으면 갱신
    if 0 <= nx < 3 and 0 <= ny <3:
        x = nx
        y = ny
```

- 이차원 리스트의 상하좌우 탐색 정리

```python
# 1. 델타값 정의(상하좌우)
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# 2. 이차원 리스트 순회
for x in range(n):
    for y in range(m):
        
        # 3. 델타값을 이용해 상하좌우 이동
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            # 4. 범위를 벗어나지 않으면 갱신
            if 0 <= nx < n and 0 <= ny <m:
                x = nx
                y = ny
```

[참고] ```상하좌우 + 대각선```의 8방향 델타값

```python
# 상, 하, 좌, 우, 좌상, 좌하, 우상, 우하

dx = [-1, 1, 0, 0, -1, 1, -1, 1]
dy = [0, 0, -1, 1, -1, -1, 1, 1]
```

## 그래프

### 1. 그래프에 대한 이해

- ```정점```과 이를 연결하는 ```간선```들의 집합으로 이루어진 비선형 자료구조
- 소셜 네트워크와 지하철 노선도 같이, 현실에 있는 개체 간의 관계를 나타내기 위해 사용함

[그래프 관련 용어]

- 정점 : 간선으로 연결되는 객체이며, ```노드```라고도 함
- 간선 : 정점 간의 관계를 표현하는 선을 의미함
- 경로 : 시작 정점부터 도착 정점까지 거치는 정점을 나열한 것을 의미함
- 인점 : 두 개의 정점이 하나의 간선으로 직접 연결된 상태를 의미함

### 2. 그래프의 종류

1. 무방향 그래프
   - 간선의 ```방향이 없는``` 가장 일반적인 그래프
   - 간선을 통해 양방향의 정점 이동 가능
   - ```차수 ``` : 하나의 정점에 연결된 간선의 개수
   - 모든 정점의 차수의 합 = 간선 수 * 2
2. 유방향 그래프
   - 간선의 ```방향이 있는``` 그래프
   - 간선의 방향이 가리키는 정점으로 이동 가능
   - ```차수``` : 진입 차수와 진출 차수로 나누어짐
     - 진입 차수 : 외부 정점에서 한 정점으로 들어오는 간선의 수
     - 진출 차수 : 한 정점에서 외부 정점으로 나가는 간선의 수 

### 3. 그래프의 표현

- 그림으로만 보았던 그래프를 실제 문제에서는 어떻게 코드로 표현할지 생각해 보자

- 문제에서는 그래프를 아래와 같이 ```간선이 연결하는 두 정점의 목록```으로 제공함

- 인접한 두 정점 == 서로 직접 연결된 정점

   따라서, 해당 입력을 통해 그래프를 인접 행렬 or 인접 리스트    방식으로 표현할 수 있음

1. 인접 행렬
   - 두 정점을 연결하는 간선이 없으면 0, 있으면 1을 가지는 행렬로 표현하는 방식

```python
# 입력  
0 1
0 2
1 3
1 4
2 4
2 5
4 6

# 인접 행렬 만들기
n = 7 # 정점 개수
m = 7 # 간선 개수
graph = [[0] * n for _ in range(n)]

for _ in range(m):
    v1, v2 = map(int, input().split())
    graph[v1][v2] = 1
    graph[v2][v1] = 1
```

2. 인접 리스트
   - 리스트를 통해 각 정점에 대한 인접 정점들을 ```순차적```으로 표현하는 방식

```python
# 입력
0 1
0 2
1 3
1 4
2 4
2 5
4 6

# 인접 리스트 만들기
n = 7 # 정점 개수
m = 7 # 간선 개수

graph [[] for _ in range(n)]

for _ in range(m):
    v1, v2 = map(int, input().split())
    graph[v1].append(v2)
    graph[v2].append(v1)
```

[인접 행렬 vs 인접 리스트]

: ```인접 행렬```은 직관적이고 만들기 편하지만, 불필요하게 공간이 낭비된다.

  ```인접 리스트```는 연결된 정점만 저장하여 효율적이므로 자주 사용된다.
