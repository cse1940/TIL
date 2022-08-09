# 그래프
# 3. 그래프의 표현 
# 인접 행렬 만들기
n = 7 # 정점 개수
m = 7 # 간선 개수
graph = [[0] * n for _ in range(n)]

for _ in range(m):
    v1, v2 = map(int, input().split())
    graph[v1][v2] = 1
    graph[v2][v1] = 1

# 인접 리스트 만들기
n = 7 # 정점 개수
m = 7 # 간선 개수

graph [[] for _ in range(n)]

for _ in range(m):
    v1, v2 = map(int, input().split())
    graph[v1].append(v2)
    graph[v2].append(v1)
