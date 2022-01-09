출처: https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B8%B0%EB%B3%B8%ED%8E%B8/dashboard
김영한님의 스프링 핵심 원리 - 기본편

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

## 좋은 객체지향 프로그램이란?

### 객체 지향 특징

- 추상화
- 캡슐화
- 상속
- 다형성



### 객체 지향 프로그래밍

- 객체 지향 프로그래밍은 컴퓨터 프로그램을 명령어의 목록으로 보는 시각에서 벗어나 여러개의 독립된 단위, 즉 "**객체**"들의 **모임**으로 파악하고자 하는 것이다. 각각의 **객체**는 **메시지**를 주고 받고, 데이터를 처리할 수 있다. **(협력)**
- 객체 지향 프로그래밍은 프로그램을 **유연**하고 **변경이 용이**하게 만들기 때문에 대규모 소프트웨어 개발에 많이 사용된다.



### 다형성의 실세계 비유

- 실세계와 객체 지향을 1:1로 매칭 X
- **역할**과 **구현**으로 세상을 구분

~~~
운전자(client) ----> 자동차 역할
										 / | \
									K3 아반떼 테슬라 모델3 자동차 구현
~~~

- 예시
  - 운전자 - 자동차
  - 공연 무대
  - 키보드, 마우스, 세상의 표준 인터페이스
  - 할인 정책 등등



### 역할과 구현을 분리

- **역할**과 **구현**으로 구분하면 세상이 **단순**해지고, **유연**해지며 **변경**도 편리해진다.
- 장점
  - **클라이언트**는 대상의 역할(인터페이스)만 알면 된다.
  - **클라이언트**는 구현 대상의 **내부 구조를 몰라도** 된다.
  - **클라이언트**는 구현 대상의 **내부 구조가 변경**되어도 영향을 받지 않는다.
  - **클라이언트**는 구현 **대상 자체를 변경**해도 영향을 받지 않는다.

- 자바 언어의 다형성 활용
  - 역할 = 인터페이스
  - 구현 = 인터페이스를 구현한 클래스, 구현 객체
- 객체를 설계할 때 **역할**과 **구현**을 명확히 분리
- 객체 설계시 역할(인터페이스)을 먼저 부여하고, 그 역할을 수행하는 구현 객체 만들기



#### 객체의 협력이라는 관계부터 생각

- 혼자 있는 객체는 없다.
- 클라이언트: **요청**, 서버: **응답**
- 수 많은 객체 클라이언트와 객체 서버는 서로 협력 관계를 가진다.



### 자바 언어의 다형성

#### 오버라이딩

- 오버라이딩은 자바 기본 문법
- 오버라이딩 된 메서드가 실행
- 다형성으로 인터페이스를 구현한 객체를 실행 시점에 유연하게 변경할 수 있다.
- 클래스 상속 관계도 다형성, 오버라이딩 적용 가능



### 다형성의 본질

- 하나의 객체(인터페이스)가 여러개의 타입(구현 객체)을 가질 수 있다.

- 인터페이스를 구현한 객체 인스턴스를 **실행 시점**에 **유연**하게 **변경**할 수 있다.
- 다형성의 본질을 이해하려면 **협력**이라는 객체사이의 관계에서 시작해야 함
- **클라이언트를 변경하지 않고, 서버의 구현 기능을 유연하게 변경할 수 있다.**



#### 정리

- 실세계의 역할과 구현이라는 편리한 컨셉을 다형성을 통해 객체 세상으로 가져올 수 있음
- 유연하고, 변경이 용이
- 확장 가능한 설계
- 클라이언트에 영향을 주지 않는 변경 가능
- 인터페이스를 안정적으로 잘 설계하는 것이 중요



#### 한계

- 역할(인터페이스) 자체가 변하면, 클라이언트, 서버 모두에 큰 변경이 발생한다.
- Ex)
  - 자동차를 비행기로 변경해야 한다면?
  - 대본자체가 변경된다면?
  - USB 인터페이스가 변경된다면?
- **인터페이스를 안정적으로 잘 설계하는 것이 중요하다.**



### 스프링과 객체 지향

- 다형성이 가장 중요하다!
- 스프링은 다형성을 극대화해서 이용할 수 있게 도와준다.
- 스프링에서 이야기하는 제어의 역전(IoC), 의존관계 주입(DI)은 다형성을 활용해서 역할과 구현을 편리하게 다룰 수 있도록 지원한다.
- 스프링을 사용하면 마치 레고 블럭 조립하듯이, 공연 무대의 배우를 선택하듯이, 구현을 편리하게 변경할 수 있다.



## 좋은 객체 지향 설계의 5가지 원칙(SOLID)

### SOLID

- SRP: 단일 책임 원칙 (single responsibility principle)
- OCP: 개방-폐쇄 원칙 (Open/closed principle)
- LSP: 리스코프 치환 원칙 (Liskov substituion principle)
- ISP: 인터페이스 분리 원칙 (Interface segregation principle)
- DIP: 의존관계 역전 원칙 (Dependency inversion principle)



### SRP: 단일 책임 원칙 (single responsibility principle)

- 한 클래스는 하나의 책임만 가져야 한다.
- 하나의 책임이라는 것은 모호하다.
  - 클 수 있고, 작을 수 있다.
  - 문맥과 상황에 따라 다른다.
- **중요한 기준은 변경**이다. 변경이 있을 때 파급 효과가 적으면 단일 책임 원칙을 잘 따른 것
- 예) UI 변경, 객체의 생성과 사용을 분리



### OCP: 개방-폐쇄 원칙 (Open/closed principle)

- 소프트웨어 요소는 **확장에는 열려**있으나 **변경에는 닫혀**있어야 한다.
- **다형성**을 할용하면 가능하다.
- 인터페이스를 구현한 새로운 클래스를 하나 만들어서 새로운 기능을 구현

##### 문제점

- **구현 객체를 변경하려면 클라이언트 코드를 변경해야 한다.**
- **분명 다형성을 사용했지만 OCP원칙을 지킬 수 없다.**
- 해당 문제를 해결하기위해, **객체를 생성하고 연관관계를 맺어주는 별도의 조립, 설정자가 필요하다.**



### LSP: 리스코프 치환 원칙 (Liskov substituion principle)

- 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야한다.
- 다형성에서 하위 클래스는 인터페이스 규약을 다 지켜야 한다는 것, 다형성을 지원하기 위한 원칙, 인터페이스를 구현한 구현체를 믿고 사용하려면, 이 원칙이 필요하다.
- 단순히 컴파일에 성공하는 것을 넘어서는 이야기 이다.
- ex) 자동차 인터페이스의 엑셀은 앞으로 가라는 기능이다. 허나 엑세을 뒤로 가게 구현하면 LSP를 위반하는 것이다. 그러니 느리더라도 앞으로 가게 구현해야 한다.



### ISP: 인터페이스 분리 원칙 (Interface segregation principle)

- 특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다
- 자동차 인터페이스 -> 운전 인터페이스, 정비 인터페이스로 분리
- 사용자 클라이언트 -> 운전자 클라이언트, 정비사 클라이언트로 분리
- 인터페이스를 분리하면 정비 인터페이스 자체가 변해도 운전자 클라이언트에 영향을 주지 않는다.
- 인터페이스가 명확해지고, 대체 가능성이 높아진다.



### DIP: 의존관계 역전 원칙 (Dependency inversion principle)

- 프로그래머는 "추상화에 의존해야지, 구체화에 의존하면 안된다." 의존성 주입은 이 원칙을 따르는 방법 중 하나다.
- 쉽게 이야기해서 구현 클래스에 의존하지 말고, 인터페이스에 의존하라는 뜻
- **역할(Role)에 의존하게 해야 한다는 것과 같다.** 객체 세상도 클라이언트가 인터페이스에 의존해야 유연하게 구현체를 변경할 수 있다! 구현체에 의존하게 되면 변경이 아주 어려워진다.

#### 정리

- 객체 지향의 핵심은 다형성
- 다형성 만으로는 쉽게 부품을 갈아 끼우듯이 개발할 수 없다.
- 다형성 만으로는 구현 객체를 변경할 때 클라이언트 코드도 함께 변경된다.
- **다형성 만으로는 OCP, DIP를 지킬 수 없다.**
- 다른 뭔가가 더 필요하다.

## 객체 지향 설계와 스프링

- **스프링은 다음 기술로 다형성 + OCP, DIP를 가능하게 지원한다.**
  - DI(Dependency Injection): 의존관계, 의존성 주입
  - DI 컨테이너 제공
- **클라이언트 코드의 변경 없이 기능 확장**
- 쉽게 부품을 교체하듯이 개발



### 정리

- 모든 설계에 **역할**과 **구현**을 분리하자.
- 애플리케이션 설계도 공연을 설계 하듯이 배역만 만들어두고, 배우는 언제든지 **유연**하게 **변경**할 수 있도록 만드는 것이 좋은 객체지향 설계다.
- 이상적으로는 모든 설계에 인터페이스를 부여하자

#### 실무 고민

- 인터페이스를 도입하면 추상화라는 비용이 발생한다.
- 기능을 확장할 가능성이 없다면, 구체 클래스를 직접 사용하고, 향후 꼭 필요할 때 리팩토링해서 인터페이스를 도입하는 것도 방법이다.



## Code안에서의 문제점들

### 새로운 할인 정책 적용과 문제점

할인 정책을 변경하려면 클라이언트인 `OrderServiceImpl`코드를 변경해야 한다.

~~~java
//    private DiscountPolicy discountPolicy = new FixDiscountPolicy();
    private DiscountPolicy discountPolicy = new RateDiscountPolicy();
~~~

**문제점**

- OCP, DIP 같은 객체지향 설계 원칙을 준수하지 못했다.
  - DIP: 주문서비스 클라이언트(`OrderServiceImpl`)는  `DiscountPolicy`인터페이스에 의존하면서 DIP를 지킨것 같아보인다.
  - 하지만 Code를 보면 인터페이스 뿐만 아니라 **구체(구현) 클래스에도 의존**하고 있다.
    - 추상(인터페이스) 의존: `DiscountPolicy`
    - 구체(구현) 클래스 의존: `FixDiscountPolicy`, `RateDiscountPolicy`
  - OCP: **의존관계를 변경하는순간 클라이언트 코드도 변경된다. OCP 위반**



### 관심사의 분리

### 관심사를 분리하자

ex) 연극

- 배우는 본인의 역할인 배역을 수행하는 것에만 집중해야 한다.
- 디카프리오는 어떤 여자 주인공이 선택되더라도 똑같이 공연을 할 수 있어야한다.
- 공연을 구성하고, 담당 배우를 섭외하고, 역할에 맞는 배우를 지정하는 책임을 담당하는 별도의 **공연 기획자**가 필요하다.
- 공연 기획자를 만들고 배우와 공연 기획자의 책임을 확실히 분리해야 한다.



### Appconfig의 등장

애플리케이션의 전체 동작 방식을 구성(config)하기 위해, **구현 객체를 생성**하고, **연결**하는 책임을 가지는 별도의 설정 클래스 생성

~~~java
public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
~~~

- AppConfig는 애플리케이션의 실제 동작에 필요한 **구현 객체를 생성**한다

  - `MemberServiceImpl`
  - `MemoryMemberRepository`
  - `OrderServiceImpl`
  - `FixDiscountPolicy`

- AppConfig는 생성한 객체 인스턴스의 참조(레퍼런스)를 **생성자를 통해서 주입(연결)**해준다.

  - `MemberServiceImpl` -> `MemoryMemberRepository`

  - `OrderServiceImpl` -> `MemoryMemberRepository`, `FixDiscountPolicy`



**MembServiceImpl - 생성자 주입**

~~~java
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
~~~

- 설계 변경으로 `MemberServiceImpl`은 `MemoryMemberRepository`를 의존하지 않는다.
- 단지 `MemberRepository`인터페이스에만 의존한다.
- `MemberServiceImpl`입장에서 생성자를 통해 어떤 구현 객체가 들어올지(주입될지)는 알 수 없다.
- `MemberServiceImpl`의 생성자를 통해서 어떤 구현 객체를 주입할지는 오직 외부(`AppConfig`)에서 결정된다.
- `MemberServiceImpl`은 이제부터 **의존관계에 대한 고민은 **외부에 맡기고, **실행에만 집중**하면 된다.



~~~
memoryMemberRepository(x001)
        ↑
			  |
			  |
  	  1. 생성
        |
     AppConfig ----- 2. 생성 주입(MemoryMemberRepository(x001)) --→ MemberServiceImpl
~~~

- `AppConfig`객체는 `memoryMemberRepository`객체를 생성하고 그 참조값을 `memberServiceImpl`을 생성하면서 생성자로 전달한다.
- 클라이언트인 `memberServiceImpl`입장에서 보면 의존관계를 마치 외부에서 주입해주는 것 같다고 해서 DI(Dependency Injection)우리말로 의존관계 주입 또는 의존성 주입이라고 한다.

##### 정리

- AppConfig를 통해서 관심사를 확실하게 분리했다.
- 배역, 배우를 생각해보자
- AppConfig는 공연 기획자다.
- AppConfig는 구체 클래스를 선택한다. 애플리케이션이 어떻게 동작해야 할지 전체 구성을 책임진다.
- 이제 각 배우들은 담당 기능을 실행하는 책임만 지면된다.
- `MemberServiceImpl`, `OrderServiceImpl`은 기능을 실행하는 책임만 지면 된다.
