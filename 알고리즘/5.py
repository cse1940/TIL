# DFS의 동작 과정
visited = [False] * n # n은 정점의 개수

# 반복문을 이용한 DFS
visited = [False] * n # 방문 처리 리스트 만들기

def dfs(stars):
    stack = [start] # 돌아갈 곳을 기록
    visited[start] = True # 시작 정점 방문 처리
    
    while stack: # 스택이 빌 때까지(돌아갈 곳이 없을때까지) 반복
        cur = stack.pop() # 현재 방문 정점(후입선출)
        
        for adj in graph[cur]: # 인접한 모든 정점에 대해
            if not visited[adj]: # 아직 방문하지 않았다면
                visited[adj] = True # 방문 처리
                stack.append(adj) # 스택에 넣기
dfs(0) # 0번 정점에서 시작

# BOJ 2606 - 바이러스
# 1. 입력 값을 받아 인접 리스트를 생성
n = int(input()) # 정점 개수(컴퓨터)
m = int(input()) # 간선 개수(네트워크)
graph = [[]for _ in range(n + 1)]
visited = [Flase] * (n + 1)
total = 0

# 인접 리스트 만들기
for _ in range(m):
    v1, v2 = map(int, input().split())
    graph[v1].append(v2)
    graph[v2].append(v1)

# 2. 1번 컴퓨터를 시작 정점으로 DFS 진행
visited = [Flase] * n

def dfs(start):
    stack = [start]
    visited[start] = True
    
    while stack:
        cur = stack.pop()
        
        for adj in graph[cur]:
            if not visited[adj]:
                visited[adj] = True
                stack.append(adj)
dfs(1) # 1번 정점에서 시작