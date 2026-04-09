# 2026-03-03-JavaStudy

# 📚 Java 학습 기록

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java)
![IDE](https://img.shields.io/badge/IDE-Eclipse%20%7C%20IntelliJ-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner_to_Intermediate-green?style=for-the-badge)

---

## 🚀 학습 내용

### 🔹 Chapter01. 자바 시작
- Java 개발 환경 및 실행 구조 이해 (JVM, JDK, JRE)
- 기본 문법 및 출력문 (System.out.println)
- 컴파일 및 실행 과정 학습
- 클래스와 main 메소드 구조 이해

---

### 🔹 Chapter02. 변수와 데이터형
- 기본 데이터형 (int, double, char, boolean 등)
- 변수 선언 및 초기화 방법
- 형변환 (자동 / 강제)
- 상수(final) 개념 이해

---

### 🔹 Chapter03. 연산자
- 산술, 비교, 논리 연산자 사용법
- 증감 연산자 및 대입 연산자
- 삼항 연산자 활용
- 연산자 우선순위 이해

---

### 🔹 Chapter04. 제어문
- 조건문 (if, if-else, switch)
- 반복문 (for, while, do-while)
- 중첩 반복문 및 흐름 제어
- break, continue 활용

---

### 🔹 Chapter05. 데이터 관리 📦
- 배열 개념 및 사용법
- 1차원/다차원 배열 활용
- 메소드 정의 및 호출
- 문자열 처리 및 배열과의 결합

---

### 🔹 Chapter06. 객체지향 프로그래밍 (기초) 🧱
- 클래스와 객체 개념 이해
- 변수 종류 (지역, 인스턴스, static)
- 생성자 및 메소드 구조
- 접근지정자 및 캡슐화

---

### 🔹 Chapter07. 객체지향 프로그래밍 (심화) 🔥
- 상속 개념 및 코드 재사용
- 메소드 오버라이딩
- 다형성 개념 및 활용
- 유지보수 중심 설계 이해

---

### 🔹 Chapter08. 인터페이스 & 추상클래스 ⚙️
- 인터페이스 정의 및 구현
- 추상 클래스 개념 및 사용
- 다중 구현 구조 이해
- 설계 중심 프로그래밍 기초

---

### 🔹 Chapter11. 예외처리 🚨
- 예외의 개념 및 종류
- try-catch-finally 구조
- throws 및 사용자 정의 예외
- 안정적인 프로그램 설계

---

### 🔹 Chapter12. 라이브러리 📚
- java.lang 주요 클래스 (String, Object 등)
- Wrapper 클래스 및 유틸리티
- 정규식 및 문자열 처리
- 리플렉션 및 어노테이션 기초

---

### 🔹 Chapter13~15. 컬렉션 프레임워크 🗂️
- List 인터페이스 구조 이해
- ArrayList, LinkedList 사용법
- 데이터 저장 및 관리 방식
- 컬렉션을 활용한 실전 데이터 처리

---

### 🔹 Chapter18. 입출력 (IO) 기초 📂
- 람다식 (Lambda) 기본 구조 및 스트림(Stream) 활용 (filter, map, forEach, collect)
- 메소드 참조 (::)를 통한 코드 간결화 (ex. System.out::println)
- 함수형 프로그래밍 개념 이해 (입력값 기반 결과, 가독성 및 유지보수 향상)
- Optional을 통한 Null 안전 처리 및 코드 안정성 확보
- 스트림을 이용한 데이터 필터링, 변환, 정렬 등 데이터 처리 방식 학습

---

### 🔹 Chapter18. 입출력 (IO) 응용 ⚙️
- Java IO 구조 이해 (Input/Output, 바이트 스트림 / 문자 스트림)
- File, FileReader/Writer, BufferedReader/Writer를 활용한 파일 입출력 구현
- 파일 데이터를 읽어 객체(List)로 변환하여 데이터 관리
- StringTokenizer, split 등을 이용한 데이터 파싱 처리
- File 클래스 기반 파일 생성, 삭제, 탐색 등 파일 제어 기능 활용

---

### 🔹 Chapter18. 입출력 (Buffered) 📂
- BufferedReader / BufferedWriter를 활용한 빠른 입출력 처리
- FileInputStream / FileOutputStream, FileReader / FileWriter 구조 이해
- ObjectInputStream / ObjectOutputStream을 이용한 객체 단위 저장 (직렬화/역직렬화)
- 파일 읽기/쓰기 및 외부 데이터 처리 방식 학습
- Scanner 대신 BufferedReader 사용 및 예외처리 기반 입력 처리

---

### 🔹 Chapter18. 입출력 (Stream) 🌊
- IO(Input/Output) 개념 및 데이터 흐름 구조 이해
- 표준 입출력 (System.in / System.out) 구조 학습
- 입력(키보드, 파일, 네트워크) → 출력(화면, 파일) 데이터 흐름 이해
- 프로그램과 외부 자원 간 데이터 교환 방식 학습
- 스트림(Stream)을 통한 데이터 전달 구조 및 기본 개념 정리

---

### 🔹 Chapter18. 입출력 (Files) 📁
- Files / Path를 활용한 파일 및 디렉토리 제어 (복사, 이동, 읽기, 쓰기)
- Path 객체를 통한 파일 경로 및 정보 관리 (절대경로 / 상대경로)
- Files API 기반 파일 처리 및 예외처리 (CheckedException)
- 파일 복사 시 덮어쓰기 옵션 (StandardCopyOption) 이해
- 파일명, 경로, 루트 등 파일 정보 추출 메소드 활용

---

### 🔹 Chapter19. 네트워크 (URL) 🌐
- URL / URI를 이용한 웹 데이터 연결 및 요청 처리
- URLEncoder를 활용한 한글 및 특수문자 인코딩 처리
- HttpURLConnection을 통한 서버 연결 및 데이터 수신
- BufferedReader를 활용한 웹 데이터 읽기
- 네트워크 기반 데이터 수집 구조 이해 (크롤링 기초)

---

### 🔹 Chapter19. 네트워크 (내부클래스) 🧩
- 내부 클래스 종류 (멤버, 익명, 지역 클래스) 및 구조 이해
- 외부 클래스와 밀접한 관계에서 코드 구성 및 캡슐화
- 익명 클래스를 활용한 이벤트 처리 및 일회성 구현
- 내부 클래스에서 외부 클래스의 변수/메소드 접근 가능
- GUI, 네트워크, 쓰레드에서의 활용 구조 이해

---

### 🔹 Chapter19. 네트워크 (쓰레드) ⚡
- 프로세스와 쓰레드 개념 및 동시성 처리 이해
- Thread 상속 및 Runnable 구현 방식 비교
- ExecutorService를 활용한 쓰레드 풀 관리
- 쓰레드 생명주기 (생성 → 실행 → 대기 → 종료) 이해
- 서버 및 게임 등 다중 작업 처리 구조 학습

---
