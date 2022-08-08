# 블랙잭
def blackjack(n, m, cards):
    max_total = 0 
    
    # 완전탐색(Brute-force)
    for i in range(n - 2):
        for j in range(i + 1, n -1):
            for k in range(j + 1, n):
                total = cards[i] + cards[j] + cards[k]
                
                if max_total < total <= m:
                    max_total = total
                
                
                if total == m:
                    return total
    return max_total

# 델타탐색
# 1) 행을 x, 열을 y로 표현
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# 2) 행을 r, 열을 c로 표현
dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]

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
for i in range(4):
    nx = x + dx[i]
    ny = y + dy[i]
    
    # 2. 범위를 벗어나지 않으면 갱신
    if 0 <= nx < 3 and 0 <= ny <3:
        x = nx
        y = ny

# 이차원 리스트의 상하좌우 탐색 정리
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

# 상, 하, 좌, 우, 좌상, 좌하, 우상, 우하

dx = [-1, 1, 0, 0, -1, 1, -1, 1]
dy = [0, 0, -1, 1, -1, -1, 1, 1]

