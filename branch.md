### Branch basic commands
1. 브랜치 생성

```bash
(master) $ git branch <브랜치 이름>
```

2. 브랜치 이동

```bash
(master) $ git checkout <브랜치 이름>
```

3. 브랜치 생성 및 이동

``` bash
(master) $ git checkout -b <브랜치 이름>
```

4. 브랜치 목록

```bash
(master) $ git branch
```

5. 브랜치 삭제

```bash
(master) $ git branch -d <브랜치 이름>
```



### Branch merge

- 각 branch에서 작업을 한 후, 커밋을 합치기 위해서는 merge를 사용한다. 합칠 때, 만약 서로 다른 커밋에서 동일한 파일을 수정하면 충돌이 발생할 수 있기 때문에 반드시 직접 수정을 진행 해야 한다.



### Shared vs Fork & Pull model

1. Feature Branch Workflow

   : 저장소의 소유권이 ```있는``` 경우

2. Fork & Pull model

   : 저장소의 소유권이 ```없는``` 경우

   



