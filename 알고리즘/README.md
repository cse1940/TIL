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

