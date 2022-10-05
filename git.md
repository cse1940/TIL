## CLI (Command List Interface)

- pwd : 현재 디렉토리 출력

- cd(change directory) 디렉토리 이름 : 디렉토리 이동

- cd .. : 현재 디렉토리 탈출, 상위 디렉토리 이동
- mkdir(make directory) : 디렉토리 생성
- touch : 파일 생성
- ls(list) : 목록
- rm 파일명 : 파일 삭제하기
- rm -r 폴더명 : 폴더 삭제하기
- rm -rf .git : .git 삭제



## GIT

- '분산버전관리시스템'
- 코드의 버전을 관리하는 도구
- 컴퓨터 파일의 변경사항을 추적
- 여러 명의 사용자들 간에 해당 파일들의 작업을 조정

1. 작업을 하고
2. 변경된 파일을 모아 (add)
3. 버전으로 남긴다. (commit)
   - commit : 의미있는 저장 (SW 반드시 작동가능한 상태)



- modified : 파일이 수정됐음
- staged : 수정한 파일을 곧 커밋할 것임
- committed : 커밋이 되었음



- 예시 )
  1. 보고서 파일 새로 만듦 => untracked
  2. 보고서 파일 add => staged
  3. commit => unmodified
  4. 보고서 수정 => modified



### GIT 기본 명령어

1. git log : 현재 저장소 기록된 커밋 조회, 버전 확인
   - git log -1
   - git log --oneline
   - git log -2 --oneline
2. git status : git 저장소에 있는 파일 상태 확인 (1통, 2통)
3. git init : 로컬 저장소 생성
4. git add 파일명 : 특정 파일/폴더 변경사항 추가
   - git add . (전체 파일 add)
   - git add 1.txt (1.txt 파일만 add)
5. git commit -m '커밋메세지' : 커밋 (버전 기록)



- GIT 사용자 정보 커밋 반드시 필요 (config)

  ``` bash
  $ git config -global user.name "username"
  $ git config -global user.email "my@email.com"
  ```



### DVCS (분산버전관리시스템)

- 중앙집중식버전관리시스템은 중앙에서 버전을 관리, 파일 받아 사용

- 원격 저장소를 통해 협업, 공유함



### 원격저장소

``` bash
$ git remote add origin https://github.com/cse1940/TIL
$ git push -u origin master
```

- 활용 명령어 :
  - git remote -v : 원격저장소 정보 확인
  - git push 원격저장소이름 브랜치이름 : 원격저장소로 로컬저장소 커밋 올림