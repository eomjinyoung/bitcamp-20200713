# 비트캠프 디지털 컨버전스 기반 UI/UX 프론트 전문 개발자 양성 과정

## 교육 기간

2020-07-13 ~ 2020-12-21

## 교육 내용

### 1일차(2020-07-13,월)

- 개발 입문자 오리엔테이션
  - 개발자가 하는 일
  - 애플리케이션 유형
  - C/S 애플리케이션과 웹 애플리케이션의 개념
- 애플리케이션 개발에 필요한 도구
- 애플리케이션 개발 도구 설치

### 2일차(2020-07-14,화)

- 서버 애플리케이션 개발 도구 설치
  - 톰캣 서버 설치
  - MariaDB 설치 및 설정
- 예제 프로젝트 다운로드 및 빌드
- 톰캣 서버에 배치 후 테스트 수행
  - MariaDB에 예제 테이블 생성 및 예제 데이터 입력
  - 예제 프로젝트 실행 테스트
- 애플리케이션 실행 방법
  - 인터프리트 방식
  - 컴파일 방식
  - 자바 하이브리드 방식

### 3일차(2020-07-15,수)

- 비트, 바이트와 메모리의 관계
  - 메모리에 데이터를 저장하는 원리
- 자바 바이트코드 제작
  - 직접 바이트코드 작성하고 프로파일링 하기
- 작업 폴더를 GIT 저장소로 전환
  - github.com에 개인 저장소(bitcamp-workspace) 생성
  - github.com에 로컬 저장소를 업로드(push)
- 수업 관련 자료 준비
  - github.com 저장소에서 교육 자료 가져오기(clone)
- 자바 프로그래밍 학습 프로젝트 생성
  - bitcamp-java-basic 폴더 생성
  - > gradle init 실행하여 프로젝트 폴더를 초기화시킨다.
- 실습
  - src/main/java/Hello2.java
  - src/main/java/com/eomcs/Hello2 생성
  - src/main/java/com/eomcs/basic/Hello2.java 생성

### 4일차(2020-07-16,목)

- 소스 파일과 클래스 블록, 클래스 파일의 관계
  -  com.eomcs.basic.ex01 패키지의 예제
- 주석의 종류와 사용법
  - com.eomcs.basic.ex02 패키지 예제
- 자바 언어로 값을 표현하는 문법(Literal)
  - com.eomcs.basic.ex03 패키지 예제

### 5일차(2020-07-17,금)

- 값을 메모리에 저장하는 방식
  - com.eomcs.basic.ex03 패키지 예제
  - 정수(양수와 음수)의 저장

#### 과제 - 프로젝트 관리 시스템 만들기

##### 저장소 및 프로젝트 폴더 준비하기

- 1) 저장소로 사용할 폴더 생성
  - c:\Users\bitcamp\bitcamp-java-project
- 2) 폴더를 git 저장소로 만든다.
- 3) github.com에 "bitcamp-java-project" 저장소를 생성한다.
- 4) 로컬 저장소를 원격 저장소에 연결하기
- 5) gradle 을 이용하여 저장소를 프로젝트 폴더로 만든다.
- 6) .gitignore 파일 준비하기
  - bitcamp-workspace에서 사용하는 파일을 그대로 복사한다.
- 7) 로컬 저장소에 백업 한 후 원격 저장소에 업로드

##### 구현 요구사항

- 한 명의 회원 정보를 콘솔로 출력한다.
- 한 개의 프로젝트 정보를 콘솔로 출력한다.
- 한 개의 작업 정보를 콜솔로 출력한다.

##### 실습


###### 1단계 - 한 명의 회원 정보를 출력한다

Mini-PMS를 이용하는 회원 정보를 출력한다. 일단 한 명의 정보만 출력한다.

```console
[회원]
번호: 101
이름: 홍길동
이메일: hong@test.com
암호: 1111
사진: hong.png
전화: 1111-2222
가입일: 2020-01-01
```

[작업 파일]

- com.eomcs.pms.App  클래스 변경
- src/test/java/com/eomcs/pms/AppTest.java 삭제
  - 당장 JUnit 관련 코딩은 하지 않기 때문에 제거한다.

###### 2단계 - 한 개의 프로젝트 정보를 출력한다

회원이 진행할 프로젝트 정보를 출력한다. 일단 한 개의 프로젝트 정보만 출력한다.

```console
[프로젝트]
번호: 1201
프로젝트명: 미니 프로젝트 관리 시스템 개발
내용: 소규모 팀을 위한 프로젝트 관리 시스템을 개발한다.
시작일: 2020-01-01
종료일: 2020-12-31
만든이: 홍길동
팀원: 홍길동,김구,유관순,안중근,윤봉길
```

[작업 파일]

- com.eomcs.pms.App2  클래스 추가
  
###### 3단계 - 한 개의 작업 정보를 출력한다

프로젝트에서 수행할 작업 정보를 출력한다. 일단 한 개의 작업 정보만 출력한다.

```console
[작업]
프로젝트: 미니 프로젝트 관리 시스템 개발
번호: 1
내용: 요구사항 수집
완료일: 2020-01-20
상태: 진행중
담당자: 홍길동
```

[작업 파일]

- com.eomcs.pms.App3  클래스 추가


[실습 결과]

- src/main/java/com/eomcs/pms/App.java 변경
- src/main/java/com/eomcs/pms/App2.java 추가
- src/main/java/com/eomcs/pms/App3.java 추가
- src/test/java/com/eomcs/pms/AppTest.java 삭제

### 6일차(2020-07-20,월)

교육 환경을 Windows에서 Linux로 전환한다.

- 리눅스 설치하기
- 개발 도구 설치하기
- 프로젝트 폴더 준비

### 7일차(2020-07-21,화)

macOS 개발 환경 구축하기

- macOS 개발 도구 설치하기
- bash 쉘을 zsh 쉘로 변경하기
- oh-my-zsh 플러그인을 추가하기
- 5일차 과제 풀이
- 연습 
  - 자바 프로젝트(bitcamp-java-project) 만들기
  - 자바 프로젝트 실행하기 
    - > gradle run
  - 자바 프로젝트 빌드하기
    - > gradle build

### 8일차(2020-07-22,수)

- Gradle로 자바 프로젝트를 eclipse 프로젝트로 설정하기
  - 'build.gradle' 빌드 스크립트 파일에 'eclipse' 플러그인 추가
  - 이클립스 설정 파일 생성
    - > gradle eclipse 
- Eclipse IDE로 프로젝트 가져오기
  - bitcamp-java-project 임포트 
  - bitcamp-java-basic 임포트
- 값을 메모리에 저장하는 방식
  - com.eomcs.basic.ex03 패키지 예제
  - 부동소수점을 저장하는 방법
  - 문자를 저장하는 방법
  - 논리 값을 저장하는 방법

### 9일차(2020-07-23,목)

- 변수를 다루는 방법
  - com.eomcs.basic.ex04 패키지 예제
  - Exam0110 ~ Exam0441 클래스
  - 정수, 부동소수점, 문자, 논리 변수 정의 및 사용법

### 10일차(2020-07-24,금)

- 예제 프로젝트 수행(bitcamp-java-project)
  - 02 버전 수행: 리터럴과 콘솔 출력 다루기
  - 03 버전 수행: 변수와 키보드 입력 다루기
  - 04 버전 수행: 배열과 흐름 제어문 활용하기
    - 배열과 흐름제어문의 활용처 확인하기

### 11일차(2020-07-27,월)

- 변수를 다루는 방법 II
  - com.eomcs.basic.ex04 패키지 예제
  - Exam0510 ~ Exam0950 클래스
  - 포인터의 개념(hello.c), 배열과 레퍼런스, 상수, 
  - 클래스 변수와 인스턴스 변수, 로컬 변수
  - 변수와 블록, 형변환

### 12일차(2020-07-28,화)

- 연산자 사용법
  - com.eomcs.basic.ex05 패키지 예제
  - 산술연산자, 연산자 우선순위, 연산의 결과 타입, 명시적 형변환과 암시적 형변환
  - 관계 연산자, 부동소수점의 비교에서 주의할 점
  - 비트 연산자 
  - Exam0110 ~ Exam0355 클래스

### 13일차(2020-07-29,수)

- 연산자 사용법
  - com.eomcs.basic.ex05 패키지 예제
  - 비트 이동 연산자, 증감 연산자, 할당 연산자
  - Exam0360 ~ Exam0710 클래스

### 14일차(2020-07-30,목)

- 흐름 제어문 사용법
  - com.eomcs.basic.ex06 패키지 예제
  - Exam0110 ~ Exam0421 클래스

### 15일차(2020-07-31,금)

- 흐름 제어문 사용법
  - com.eomcs.basic.ex06 패키지 예제
  - Exam0430 ~ Exam0471 클래스
- 예제 프로젝트 수행(bitcamp-java-project)
  - 04 버전 수행: 배열과 흐름 제어문 활용하기
    - 배열과 흐름제어문의 활용처 확인하기
    - App2, App3 다시 연습
  - 05 버전 수행: 클래스를 이용하여 새 데이터 타입 정의하기
    - App, App2, App3 변경

### 16일차(2020-08-03,월)

- 예제 프로젝트 수행(bitcamp-java-project)
  - 05 버전 다시 수행: 프로그램의 시작점, `main()`
    - App 변경
    - App2, App3 삭제
  -06 버전 수행: 메서드의 존재 이유
    - App 변경
- 메서드 사용법
  - com.eomcs.basic.ex07 패키지 예제
  - Exam0110 ~ Exam0271 클래스

### 17일차(2020-08-04,화)

- 메서드 사용법
  - com.eomcs.basic.ex07 패키지 예제
  - Exam0280 ~ Exam0630 클래스

### 18일차(2020-08-05,수)

- 콘솔 출력 및 키보드 입력 다루기
  - com.eomcs.basic.ex99 패키지 예제
  - Exam0110 ~ Exam0260 클래스
- 클래스 문법의 용도 I
  - com.eomcs.oop.ex02 패키지 예제
  - Exam0210 ~ Exam0280 클래스

### 19일차(2020-08-06,목)

- 클래스 문법의 용도 II
  - com.eomcs.oop.ex02 패키지 예제
  - Exam0110 ~ Exam0130 클래스

- 클래스 사용법
  - com.eomcs.oop.ex03 패키지 예제
  - Exam0110 ~ Exam0430 클래스

### 20일차(2020-08-07,금)

- 클래스 사용법
  - com.eomcs.oop.ex03 패키지 예제
  - Exam0440 ~ Exam0970 클래스

### 21일차(2020-08-10,월)

- 인스턴스 메서드와 클래스 메서드의 활용 연습
  - com.eomcs.oop.ex04 패키지 예제
  - Exam0110 ~ Exam0250 클래스
- 예제 프로젝트 수행(bitcamp-java-project)
  - 07 버전 수행: 클래스를 이용하여 새 데이터 타입 정의하기
    - App 변경
  - 08 버전 수행: 클래스로 메서드를 분류하기
    - Prompt, MemberHandler, ProjectHandler, TaskHandler 추가
    - App 변경
  - 09 버전 수행: 패키지로 클래스를 분류하기
    - com.eomcs.util 패키지 추가
      - Prompt 클래스 이동
    - com.eomcs.pms.handler 패키지 추가
      - MemberHandler, ProjectHandler, TaskHandler 클래스 이동
    - App 변경

### 22일차(2020-08-11,화)

- 상속 문법
  - com.eomcs.oop.ex05 패키지 예제
- 다형성 문법: 다형적 변수
  - com.eomcs.oop.ex06.a 패키지 예제

### 23일차(2020-08-12,수)

- 다형성 문법: 오버로딩, 오버라이딩
  - com.eomcs.oop.ex06.b ~ e 패키지 예제
- 캡슐화 문법
  - com.eomcs.oop.ex07 패키지 예제

### 24일차(2020-08-13,목)

- 주요 클래스 사용법: Object 클래스
  - com.eomcs.corelib.ex01 패키지 예제

### 25일차(2020-08-14,금)

- 주요 클래스 사용법
  - String 클래스: com.eomcs.corelib.ex02 패키지 예제
  - ArrayList 클래스: com.eomcs.corelib.ex03 패키지 예제
  - ArrayList 클래스 만들기: com.eomcs.algorithm.data_structure.array 패키지 예제

### 26일차(2020-08-17,월)

- 주요 클래스 사용법
  - LinkedList 클래스: com.eomcs.corelib.ex04 패키지 예제
  - LinkedList 클래스 만들기: com.eomcs.algorithm.data_structure.linkedlist 패키지 예제

### 27일차(2020-08-18,화)

- 주요 클래스 사용법
  - Stack 클래스: com.eomcs.corelib.ex05 패키지 예제
  - Stack 클래스 만들기: com.eomcs.algorithm.data_structure.stack 패키지 예제
  - Queue 클래스: com.eomcs.corelib.ex06 패키지 예제
  - Queue 클래스 만들기: com.eomcs.algorithm.data_structure.queue 패키지 예제
- 예제 프로젝트 수행(bitcamp-java-project)
  - 10 버전 수행: 다른 클래스와 관계 맺기 : 의존 관계

### 28일차(2020-08-19,수)

- 예제 프로젝트 수행(bitcamp-java-project)
  - 11 버전 수행: 클래스 필드와 클래스 메서드의 한계
  - 12 버전 수행: 인스턴스 필드와 인스턴스 메서드가 필요한 이유
  - 13 버전 수행: 생성자가 필요한 이유 : 의존 객체 주입
  - 14 버전 수행: 데이터를 처리하는 코드를 별도의 클래스로 분리하기 : 캡슐화

## 29일차(2020-08-31,월)

- 예제 프로젝트 수행(bitcamp-java-project)
  - 15 버전 수행: 캡슐화와 접근 제어 : 세터(setter) / 게터(getter)
  - 16 버전 수행: 다형성과 형변환 응용
  - 17 버전 수행: 제네릭이 필요한 이유와 사용법
  - 18 버전 수행: CRUD

## 30일차(2020-09-01,화)

- 예제 프로젝트 수행(bitcamp-java-project)
  - 18 버전 수행: CRUD (계속)
- 제네릭 사용법
  - com.eomcs.generic 패키지 예제

## 31일차(2020-09-02,수)

- 예제 프로젝트 수행(bitcamp-java-project)
  - 19 버전 수행: 배열 대신 연결 리스트 자료구조 사용하기
  - 20 버전 수행: 스택 자료구조 구현과 활용
  - 21 버전 수행: 큐 자료구조 구현과 활용

## 32일차(2020-09-03,목)

- 예제 프로젝트 수행(bitcamp-java-project)
  - 22 버전 수행: 상속 : 일반화(generalization)를 이용한 공통점 분리
  - 23 버전 수행: 추상 클래스와 추상 메서드

- 추상 클래스 사용법
  - com.eomcs.oop.ex08 패키지 예제
  - com.eomcs.oop.ex10 패키지 예제
- 인터페이스 사용법
  - com.eomcs.oop.ex09 패키지 예제

## 33일차(2020-09-04,금)

- 인터페이스 사용법
  - com.eomcs.oop.ex09 패키지 예제(계속)
- 추상 클래스 사용법
  - com.eomcs.oop.ex10 패키지 예제(계속)

- 예제 프로젝트 수행(bitcamp-java-project)
  - 24 버전 수행: 인터페이스를 활용한 객체 사용 규칙 정의

## 34일차(2020-09-07,월)

- 예제 프로젝트 수행(bitcamp-java-project)
  - 25 버전 수행: `Iterator` 디자인 패턴
  - 26-a 버전 수행: 중첩 클래스 : 스태틱 중첩 클래스(static nested class)
- 중첩 클래스
  - com.eomcs.oop.ex11 패키지 예제

## 35일차(2020-09-08,화)

- 중첩 클래스
  - com.eomcs.oop.ex11 패키지 예제(계속)
- 예제 프로젝트 수행(bitcamp-java-project)
  - 26-b 버전 수행: 논스태틱 중첩 클래스(inner class)
  - 26-c 버전 수행: 로컬 클래스(local class)
- 해커톤 명단 선정
  - 김성태/박민섭 : 학생 성적 조회 시스템
  - 최희진/김하연 : 영화 추천 사이트 
  - 이종엽/이승혁 : 주소록 관리 시스템
  - 조은채/김태희 : 음식점 포스 시스템
  - 김유아/오세준 : 도서 관리 시스템
  - 이성권/권구현 : 도서 대출/반납 시스템
  - 김찬구/유지연 : 포켓몬 도감 서비스
  - 유아람/신소미 : 타자 연습 프로그램
  - 조아진/이재현 : 배달 음식 주문 관리 시스템 
  - 류승희/정지은/최진영 : 도서 관리 시스템
  - 이건목/이용민 : 도서 대여 관리 시스템
- git repository 준비
  - 팀원 중 한 명이 생성
  - 다른 팀원을 협력자로 초대
  - 로컬에 repository 복제
- repository 폴더를 자바 프로젝트 폴더로 만들기
  - `gradle init` 로 프로젝트 폴더 준비하기
  - `.gitignore` 파일 추가하기
- 초기 프로젝트 파일을 서버에 올리기
  - `git add .` : 백업할 목록 작성
  - `git commit -m "초기 프로젝트"` : 작업 내용 백업
  - `git push` : 서버에 업로드
  - `git pull` : 나머지 팀원들은 서버에 업로드 한 내용으로 로컬 저장소를 갱신한다.
- gradle build script 파일 변경
  - eclipse 설정 파일을 생성할 수 있도록 gradle 플러그인 설정
- eclispe IDE로 프로젝트를 임포트 하기 
  - `gradle eclipse` : 이클립스 용 설정 파일 생성

## 36일차(2020-09-09,수)

- git 이용하여 협업하는 방법
  - git 충돌 해결법
- 비트캠프 24시간 해커톤: 1차
  - 24시간 동안 미니 프로젝트를 개발하는 집중 역량 강화 수업  
  - 1) 주제 선정
    - 예) 명함관리, 영단어 암기, 독서 카드, 쇼핑몰 등
  - 2) UI 프로토타입 정의
  - 3) 구현 및 테스트
  - 4) 발표

## 37일차(2020-09-10,목)

- 비트캠프 24시간 해커톤: 1차 (계속)
  - 24시간 동안 미니 프로젝트를 개발하는 집중 역량 강화 수업  
  - 1) 주제 선정
    - 예) 명함관리, 영단어 암기, 독서 카드, 쇼핑몰 등
  - 2) UI 프로토타입 정의
  - 3) 구현 및 테스트
  - 4) 발표
    - 프로젝트 소개
    - 기능 시연
    - 소감

## 38일차(2020-09-11,금)

- 중첩 클래스
  - com.eomcs.oop.ex11 패키지 예제(계속)
- 예제 프로젝트 수행(bitcamp-java-project)
  - 26-d 버전 수행: 익명 클래스(anonymous class)
  - 27 버전 수행: 자바 컬렉션 API 사용하기
  - 28-a 버전 수행: 커맨드 디자인 패턴을 적용하기 : 메서드를 객체로 분리하기
  - 28-b 버전 수행: 커맨드 디자인 패턴을 적용하기 : Map을 이용한 커맨드 객체 관리

## 39일차(2020-09-14,월)

- 예외 처리
  - com.eomcs.exception.* 패키지 예제
- 예제 프로젝트 수행(bitcamp-java-project)
  - 29 버전 수행: 예외가 발생했을 때 시스템을 멈추지 않게 하는 방법
  - 30-a 버전 수행 : 파일 입출력 API를 활용하여 데이터를 읽고 쓰기 : CSV 파일 포맷

## 40일차(2020-09-15,화)

- 예제 프로젝트 수행(bitcamp-java-project)
  - 30-a 버전 수행 : 파일 입출력 API를 활용하여 데이터를 읽고 쓰기 : CSV 파일 포맷(계속)
  - 30-b 버전 수행 : 파일 입출력 API를 활용하여 데이터를 읽고 쓰기 : 리팩터링 I
- 파일 입출력
  - com.eomcs.io.* 패키지 예제