# spring
Spring 공부

## **스프링이란?**

- 스프링 생태계는 여러가지 기술의 모음이다.
    - 필수: spring framework, spring boot
    - 선택: spring data, spring session, spring security, spring rest docs, spring batch, spring cloud... 외 매우 많음
- **spring framework**
    - 핵심 기술: 스프링 DI 컨테이너, AOP, 이벤트, 기타..
    - 웹 기술: 스프링 MVC, 스프링 WebFlux
    - 데이터 접근 기술: 트랜잭션, JDBC, ORM 지원, XML 지원
    - 기술 통합: 캐시, 이메일, 원격접근, 스케줄링
    - 테스트: 스프링 기반 테스트 지원
    - 언어: 코틀린, 그루비
    - 최근에는 스프링 부트를 통해서 스프링 프레임워크의 기술들을 편리하게 사용
- **Spring boot**
    - 스프링을 편리하게 사용할 수 있도록 지원, 최근에는 기본으로 사용
    - 단독으로 실행할 수 있는 스프링 애플리케이션을 쉽게 생성
    - Tomcat같은 웹 서버를 내장해서 별도의 웹 서버를 설치하지 않아도 됨
    - 손쉬운 빌드 구성을 위한 starter 종속성 제공
    - 스프링과 3rd path(외부)라이브러리 자동 구성
    - 메트릭, 상태 확인, 외부 구성 같은 프로덕션 준비 기능 제공
    - 관례에 의한 간결한 설정

### **스프링 단어?**

- 스프링이라는 단어는 문맥에 따라 다르게 사용된다.
    - 스프링 DI 컨테이너 기술
    - 스프링 프레임워크
    - 스프링 부트, 스프링 프레임워크 등을 모두 포함한 생태계

### **스프링의 핵심 개념**

- 스프링은 자바 언어 기반의 프레임워크
- 자바 언어의 가장 큰 특징 - 객체 지향 언어
- 스프링은 객체지향 언어가 가진 강력한 특징을 살려내는 프레임워크
- 스프링은 **좋은 객체 지향** 애플리케이션을 개발할 수 있게 도와주는 프레임워크
