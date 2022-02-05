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

# IOC, DI, 컨테이너

### 제어의 역전 IoC(Inversion of Control)

- 기존 프로그램은 클라이언트 구현 객체가 스스로 필요한 서버 구현객체를 생성하고, 연결하고, 실행했다. 한마디로 구현 객체가 프로그램의 제어 흐름을 스스로 조종했다. 개발자 입장에서는 자연스러운 흐름이다.
- 반면에 AppConfig가 등장한 이후에는 구현객체는 자신의 로직을 실행하는 역할만 담당한다. 프로그램의 제어 흐름은 이제 AppConfig가 가져간다. 예를 들어서 `OrderServiceImpl`은 필요한 인터페이스들을 호출하지만 어떤 구현 객체들이 실행될지 모른다.
- 프로그램에 대한 제어 흐름에 대한 권한은 모두 AppConfig가 가지고 있다. 심지어 `OrderServiceImp`도 AppConfig가 생성한다. 그리고 AppConfig는 `OrderServiceImp`이 아닌 OrderService인터페이스의 다른 구현 객체를 생성하고 실행할 수 도 있다. 그런 사실도 모른채 `OrderServiceImp`은 묵묵히 자신의 로직을 실행할 뿐이다.
- 이렇듯 프로그램의 제어 흐름을 직접 제어하는 것이 아니라 외부에서 관리하는 것을 제어의 역전(IoC)이라 한다.



#### 프레임워크 vs 라이브러리

- 프레임워크가 내가 작성한 코드를 제어하고, 대신 실행하면 그것은 프레임워크가 맞다. (JUnit)
- 반면에 내가 작성한 코드가 직접 제어의 흐름을 담당한다면 그것은 프레임워크가 아니라 라이브러리다.



### 의존관계 주입 DI(Dependency Injection)

- `OrderServiceImpl`은 `DiscountPolicy`인터페이스에 의존한다. 실제 어떤 구현 객체가 사용될지는 모른다.
- 의존관계는 **정적인 클래스 의존 관계와, 실행 시점에 결정되는 동적인 객체(인스턴스) 의존 관계** 둘을 분리해서 생각해야 한다.



#### 정적인 클래스 의존관계

클래스가 사용하는 import코드만 보고 의존관계를 쉽게 판단할 수 있다. 정적인 의존 관계는 애플리케이션을 실행하지 않아도 분석할수 있다.

허나, 이러한 정적인 의존관계만으로는 실제 어떤 객체가 `OrderServiceImpl`에 주입되는지는 판단할 수 없다.

~~~java
public class OrderServiceImpl implements OrderService{

  //프로그램을 실행하지 않아도 의존관계를 쉽게 판단할 수 있다.
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
~~~



#### 동적은 객체 인스턴스 의존 관계

애플리케이션 실행 시점에 실제 생성된 객체 인스턴스의 참조가 연결된 의존 관계다.

~~~java
public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
~~~



- 애플리케이션 **실행 시점(런타임)**에 외부에서 실제 구현 객체를 생성하고 클라이언트에 전달해서 클라이언트와 서버의 실제 의존관계가 연결되는 것을 **의존관계 주입**이라 한다.
- 객체 인스턴스를 생성하고, 그 참조값을 전달해서 연결된다.
- 의존관계 주입을 사용하면 클아이언트 코드를 변경하지 않고, 클라이언트가 호출하는 대상의 타입 인스턴스를 변경할 수 있다.
- 의존관계 주입을 사용하면 정적인 클래스 의존관계를 변경하지 않고, 동적인 객체 인스턴스 의존관계를 쉽게 변경할 수 있다.



### IoC 컨테이너, DI 컨테이너

- AppConfig처럼 객체를 생성하고 관리하면서 의존관계를 연결해 주는 것을 **IoC 컨테이너** 또는 **DI 컨테이너**라고 한다.
- 의존관계 주입에 초점을 맞추어 최근에는 주로 DI 컨테이너라 한다. 또는 어셈블러, 오브젝트 팩토리 등으로 불리기도 한다.



### 스프링 컨테이너

~~~java
@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
-----------------------------------------------------------------------
     public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        OrderService orderService = ac.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(memberA);

        Order order = orderService.createOrder(memberId, "itemA", 20000);

        System.out.println("order = " + order);
    } 
~~~

- `ApplicationContext`를 스프링 컨테이너라고 한다.
- 기존에는 개발자가 `AppConfig`를 사용해서 직접 객체를 생성하고 DI를 했지만, 이제부터는 스프링 컨테이너를 통해서 사용한다.
- 스프링 컨테이너는 `@Configuration`이 붙은 `AppConfig`를 설정(구성) 정보로 사용한다. 여기서 `@Bean`이라 적힌 메서드를 모두 호출해서 반환된 객체를 스프링 컨테이너에 등록한다. 이렇게 스프링 컨테이너에 등록된 객체를 스프링 빈이라고 한다.
- 스프링 빈은`@bean`이 붙은 메서드의 명을 스프링 빈의 이름으로 사용한다. (`memberService`, `orderService`)
- 이전에는 개발자가 필요한 객체를`AppConfig`를 사용해서 직접 조회 했지만, 이제부터는 스프링 컨테이너를 통해서 필요한 스프링 빈(객체)를 찾아야 한다. 스프링 빈은 `applicationContext.getBean()`메서드를 사용해서 찾을 수 있다.
- 기존에는 개발자가 직접 자바코드로 모든 것을 했다면 이제부터는 스프링 컨테이너에 객체를 스프링 빈으로 등록하고, 스프링 컨테이너에서 스프링 빈을 찾아서 사용하도록 변경되었다.
### 스프링 빈 조회 - 기본

스프링 컨테이너에서 스프링 빈을 찾는 가장 기본적인 조회 방법

- ac.getBean(빈이름, 타입)
- ac.getBean(타입)
- 조회 대상 스프링 빈이 없으면 예외 발생
  - `NoSuchBeanDefinitionException: No bean named 'xxxxx' available`

~~~java
AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    
    @Test
    @DisplayName("빈 이름으로 조회")
    void findBeanByName() {
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("이름 없이 타입으로만 조회")
    void findBeanByType() {
        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("구체 타입으로 조회")
    void findBeanByName2() {
        MemberService memberService = ac.getBean("memberService", MemberServiceImpl.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("빈 이름으로 조회 x")
    void findBeanByNameX() {
        //ac.getBean("xxxx", MemberService.class);
        assertThrows(NoSuchBeanDefinitionException.class, () -> ac.getBean("xxxx", MemberService.class));

    }
~~~



### 스프링 빈 조회 - 동일한 타입이 둘 이상

- 타입으로 조회시 같은 타입의 스프링 빈이 둘 이상이면 오류가 발생한다. 이때는 빈 이름을 지정하자
- `ac.getBeansOfType()`을 사용하면 해당 타입의 모든 빈을 조회할 수 있다.

~~~java
AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SameBeanConfig.class);

    @Test
    @DisplayName("타입으로 조회 시 같은 타입이 둘 이상 있으면, 중복 오류가 발생한다")
    void findBeanByTypeDuplicate() {
        assertThrows(NoUniqueBeanDefinitionException.class,
                () -> ac.getBean(MemberRepository.class));
    }

    @Test
    @DisplayName("타입으로 조회 시 같은 타입이 둘 이상 있으면, 빈 이름을 지정하면 된다.")
    void findBeanByName() {
        MemberRepository memberRepository = ac.getBean("memberRepository1", MemberRepository.class);
        assertThat(memberRepository).isInstanceOf(MemberRepository.class);
    }

    @Test
    @DisplayName("특정 타입을 모두 조회하기")
    void findAllBeanByType() {
        Map<String, MemberRepository> beansOfType = ac.getBeansOfType(MemberRepository.class);
        for (String key : beansOfType.keySet()) {
            System.out.println("key = " + key + " value = " + beansOfType.get(key));
        }
        System.out.println("beansOfType = " + beansOfType);
        assertThat(beansOfType.size()).isEqualTo(2);
    }

    @Configuration
    static class SameBeanConfig {

        @Bean
        public MemberRepository memberRepository1() {
            return new MemoryMemberRepository();
        }

        @Bean
        public MemberRepository memberRepository2() {
            return new MemoryMemberRepository();
        }
    }
~~~

### BeanFactory와 Application Context

#### BeanFactory

- 스프링 컨테이너의 최상위 인터페이스이다.
- 스프링 빈을 관리하고 조회하는 역할을 담당한다.
- `getBean()`을 제공한다.
- 지금까지 우리가 사용했던 대부분의 기능은 BeanFactory가 제공하는 기능이다.



#### ApplicationContext

- BeanFactory 기능을 모두 상속받아서 제공한다.
- 애플리케이션을 개발할 때는 빈을 관리하고, 조회하는 기능은 물론이고, 수 많은 부가기능이 필요하다.



**ApplicationContext가 제공하는 부가기능**

- 메시지소스를 활용한 국제화 기능
  - 예를 들어서 한국에서 들어오면 한국어로, 영어권에서 들어오면 영어로 출력
- 환경변수
  - 로컬, 개발, 운영등을 구분해서 처리
- 애플리케이션 이벤트
  - 이벤트를 발행하고 구독하는 모델을 편리하게 지원
- 편리한 리소스 조회
  - 파일, 클래스패스, 외부 등에서 리소스를 편리하게 조회



#### 정리

- ApplicationContext는 BeanFactory의 기능을 상속받는다.
- ApplicationContext는 빈 관리기능 + 편리한 부가 기능을 제공한다.
- BeanFactory를 직접 사용할 일은 거의 없다. 부가기능이 포함된 ApplicationContext를 사용한다.
- BeanFactory나 ApplicationContext를 스프링 컨테이너라 한다.



### 스프링 빈 설정 메타 정보 - BeanDefinition

- 스프링은 BeanDefinition이라는 인터페이스를 통해 다양한 설정 형식을 지원한다.
  - ex)
  - XML을 읽어서 BeanDefinition을 만들면 된다.
  - 자바 코드를 읽어서 BeanDefinition을 만들면 된다.
  - 스프링 컨테이너는 자바 코드인지, XML인지 몰라도 된다. 오직 BeanDefinition만 알면 된다.
- `BeanDefinition`을 빈 설정 메타정보라 한다.
  - `@Bean`, `<bean>`당 각각 하나씩 메타 정보가 생성된다.



#### BeanDefinitinon 정보

- BeanClassName: 생성할 빈의 클래스명(자바 설정 처럼 팩토리 열할의 빈을 사용하면 없음)
- factoryBeanName: 팩토리 역할의 빈을 사용할 경우 이름 , 예) appConfig
- factoryMehtodName: 빈을 생성할 팩토리 메서드 지정, 예) memberService
- Scope: 싱글톤(기본값)
- lazyInit: 스프링 컨테이너를 생성할 때 빈을 생성하는 것이 아니라, 실제 빈을 사용할 때 까지 최대한 생성을 지연처리 하는지 여부
- InitMethodName: 빈을 생성하고, 의존관계를 적용한 뒤에는 호출되는 초기화 메서드 명
- DestoryMethodName: 빈의 생명주기가 끝나서 제거하기 직전에 호출되는 메서드 명
- Constructor arguments, Properties: 의존관계 주입에서 사용한다. (자바 설정 처럼 팩토리 역할의 빈을 사용하면 없음)



## 싱글톤 컨테이너

### 싱글톤 패턴

- 클래스 인스턴스가 1개만 생성되는 것을 보장하는 디자인 패턴이다.
- 객체 인스턴스를 2개이상 생성하지 못하도록 막아야 한다.
  - private 생성자를 사용해서 외부에서 임의로 new 키워드를 사용하지 못하도록 막아야 한다.

~~~java
public class SingletonService {
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
~~~

1. static 영역에 객체 instance를 미리 하나 생성해서 올려둔다.
2. 이 객체 인스턴스가 필요하면 오직 `getInstance()`를 통해서만 조회할 수 있다. 이 메서드를 호출하면 항상 같은 인스턴스가 반환된다.
3. 딱 1개의 객체 인스턴스만 존재해야 하므로, 생성자를 private으로 막아서 혹시라도 외부에서 new 키워드로 객체 인스턴스가 생성되는 것을 막는다.



#### 싱글톤 패턴 문제점

- 싱글톤 패턴을 구현하는 코드 자체가 많이 들어간다.
- 의존관계상 클라이언트가 구체 클래스에 의존해야 한다. -> DIP를 위반한다.
- 클라이언트가 구체 클래스에 의존해서 OCP원칙을 위반할 가능성이 높다.
- 테스트하기 어렵다.
- 내부 속성을 변경하거나 초기화 하기 어렵다.
- private 생성자로 자식 클래스를 만들기 어렵다.
- 결론적으로 유연성이 떨어진다.
- 안티패턴으로 불리기도 한다.



### 싱글톤 컨테이너

스프링 컨테이너는 싱글톤 패턴의 문제점을 해결하면서, 객체 인스턴스를 싱글톤(1개만 생성)으로 관리한다.



**싱글톤 컨테이너**

- 스프링 컨테이너는 싱글톤 패턴을 적용하지 않아도, 객체 인스턴스를 싱글톤으로 관리한다.
- 스프링 컨테이너는 싱글톤 컨테이너 역할을 한다. 이렇게 싱글톤 객체를 생성하고 관리하는 기능을 싱글톤 레지스트리라 한다.
- 스프링 컨테이너의 이런 기능 덕분에 싱글톤 패턴의 모든 단점을 해결하면서, 객체를 싱글톤으로 유지할 수 있다.
  - 싱글톤 패턴을 위한 지저분한 코드가 들어가지 않아도 된다.
  - DIP, OCP, 테스트, private 생성자로부터 자유롭게 싱글톤을 사용할 수 있다.



**참고**

- 스프링의 기본 빈 등록 방식은 싱글톤이지만, 싱글톤 방식만 지원하는 것은 아니다. 요청할 때 마다 새로운 객체를 생성해서 반환하는 기능도 제공한다.



### 싱글톤 방식의 주의점

- 싱글톤 패턴이드, 스프링 같은 싱글톤 컨테이너를 사용하든, 객체 인스턴스를 하나만 생성해서 공유하는 싱글톤 방식은 여러 클라이언트가 하나의 같은 객체 인스턴스를 공유하기 때문에 싱글톤 객체는 상태를 유지(stateful)하게 설계하면 안된다.
- 무상태(statless)로 설계해야 한다!
  - 특정 클라이언트에 의존적인 필드가 있으면 안된다.
  - 특정 클라이언트가 값을 변경할 수 있는 필드가 있으면 안된다.
  - 가급적 읽기만 가능해야 한다.
  - 필드 대신에 자바에서 공유되지 않는, 지역변수, 파라미터, ThreadLocal등을 사용해야 한다.
- **스프링 빈의 필드에 공유 값을 설정하면 정말 큰 장애가 발생할 수 있다!!**

~~~java
public class StatefulServiceTest {

    @Test
    void statefulServiceSingleton() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //ThreadA: A사용자가 10000원 주문
        statefulService1.order("userA", 10000);
        //ThreadB: B사용자가 20000원 주문
        statefulService2.order("userB", 20000);

        //ThreadA: 사용자A 주문 금액 조회
        int price = statefulService1.getPrice();
        System.out.println("price = " + price);

        assertThat(statefulService1.getPrice()).isEqualTo(20000);
    }

    static class TestConfig{
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }
}
~~~

- ThreadA가 사용자A 코드를 호출하고, ThreadB가 사용자B 코드를 호출한다고 가정하자
- `StatefulService`의 `price`필드는 공유되는 필드인데, 특정 클라이언트 값을 변경한다.
- 사용자A의 주문금액은 10000원이여야 하는데, 20000원으로 결과가 나온다.
- **이러한 문제와 같이 공유필드는 조심해야 하며, 스프링 빈은 항상 무상태(stateless)로 설계해야 한다.**

#### @Configuration과 바이트코드 조작의 마법

~~~java
@Test
    void configurationDeep() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig bean = ac.getBean(AppConfig.class);

        System.out.println("bean.getClass() = " + bean.getClass());
				//bean.getClass() = class hello.core.AppConfig$$EnhancerBySpringCGLIB$$ad42d7f4
    }
~~~

- AppConfig도 스프링 빈으로 등록이 된다.
- AppConfig의 클래스 정보를 조회했을 때 `class hello.core.AppConfig`로 나올거라는 예상과 달리 `class hello.core.AppConfig$$EnhancerBySpringCGLIB...` 이렇게 나왔다.

이러한 이유는 스프링이 CGLIB이라는 바이트코드 조작 라이브러리를 사용해서 AppConfig클래스를 상속받은 임의의 다른 클래스를 만들고, 다른 클래스를 스프링 빈으로 등록한 것이다. 해당의 임의의 클래스가 싱글톤이 보장되도록 해준다.



##### `@Configuration`을 적용하지 않고 `@Bean`만 적용했을 시

~~~java
//@Configuration
public class AppConfig {
...
}
---------------------------
@Test
    void configurationDeep() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig bean = ac.getBean(AppConfig.class);

        System.out.println("bean.getClass() = " + bean.getClass());
    }
----------------------------
call AppConfig.memberService
call AppConfig.memberRepository
call AppConfig.orderService
call AppConfig.memberRepository
call AppConfig.memberRepository
bean.getClass() = class hello.core.AppConfig
~~~

**싱글톤이 깨져버린다!!**

##### 정리

- @Bean만 사용해도 스프링 빈으로 등록되지만, 싱글톤은 보장하지 않는다.
  - `memberRepository()`처럼 의존관계 주입이 필요해서 메서드를 직접 호출할 때 싱글톤을 보장하지 않는다.
- 그러니 스프링 설정 정보는 항상 `@Configuration`을 사용하자

## 컴포넌트 스캔

### 컴포넌트 스캔과 의존관계 자동 주입

- 스프링은 설정정보 없이, 자동으로 스프링 빈을 등록하는 컴포넌트 스캔이라는 기능을 제공한다.
- 의존관계도 자동으로 주입하는 `@Autowired`라는 기능도 제공한다.

~~~java
@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    
}
~~~

**참고**:컴포넌트 스캔을 사용하려면 `@Configuration`이 붙은 설정 정보도 자동으로 등록되기 때문에 AppConfig, TestConfig등 앞서 만들어두었던 설정 정보도 함께 등록되고, 실행되어 버린다. 그래서 `excluedFilter`를 이용해서 설정정보는 컴포넌트 스캔 대상에서 제외했다.



컴포넌트 스캔은 이름 그대로 `@Component`애노테이션이 붙은 클래스를 스캔해서 스프링 빈으로 등록한다.

~~~java
@Component
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Autowired
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

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
~~~

- 이전의 AppConfig에서는 `@Bean`으로 직접 설정 정보를 작성했고, 의존관계도 직접 명시했다. 이제는 이런 설정정보 자체가 없기 때문에, 의존관계 주입도 이 클래스 안에서 해결해야 한다.



**1. ComponentScan**

- `@ComponentScan`은 `@Coponent`가 붙은 모든 클래스를 스프링 빈으로 등록한다.
- 스프링 빈의 기본이름은 클래스명을 사용하되 맨 앞글자만 소문자를 사용한다.
  - **빈 이름 기본 전략:** MemberServiceImpl 클래스 -> memberServiceImpl
  - **빈 이름 직접 지정:** 만약 스프링 빈의 이름을 지정하고 싶으면 `@Component("memberServiceImpl")`와 같이 이름을 부여하면 된다.



**2. @Autowired 의존관계 자동 주입**

- 생성자에 `@Autowired`를 지정하면, 스프링 컨테이너가 자동으로 해당 스프링 빈을 찾아서 주입한다.
- 기본 조회 전략은 타입이 같은 빈을 찾아서 주입한다.
  - `getBean(MemberRepository.class)`와 동일하다고 이해하면 된다.



### 탐색 위치와 기본 스캔 대상

#### 탐색할 패키지의 시작 위치 지정

~~~java
@Configuration
@ComponentScan(
        basePackages = "hello.core",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    
}
~~~

- `basePackages`: 탐색할 패키지의 시작위치를 지정한다. 이 패키지를 포함해서 하위 패키지를 모두 탐색한다.
  - `basePackages = {"hello.core", "hello.service"}`와 같이 여러 시작 위치를 지정할 수 있다.
- `basePackageClasses`: 지정한 클래스의 패키지를 탐색 시작 위치로 지정한다.
- 만약 지정하지 않으면 `@ComponentScan`이 붙은 설정 정보 클래스의 패키지가 시작 위치가 된다.

**권장 방법**

패키지 위치를 지정하지 않고, 설정 정보 클래스의 위치를 프로젝트 최상단에 두는 것이다. 최근 스프링 부트도 이 방법을 기본으로 제공한다.



#### 컴포넌트 스캔 기본 대상

컴포넌트 스캔은 `@Component`뿐만 아라 다음과 같은 내용도 추가로 대상에 포함된다.

- `@Component`: 컴포넌트 스캔에서 사용
- `@Controller`: 스프링 MVC 컨트롤러에서 사용
- `@Service`: 스프링 비즈니스 로직에서 사용
- `@Repository`: 스프링 데이터 접근 계층에서 사용
- `@Configuration`: 스프링 설정 정보에서 사용



### 필터

`includeFilters`: 컴포넌트 스캔 대상을 추가한다.

`excludeFilter`: 컴포넌트 스캔 대상에서 제거한다.

~~~java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
~~~

```java
@Configuration
@ComponentScan(
        includeFilters = @Filter(type = FilterType.ANNOTATION, classes = MyIncludeComponent.class),
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = MyExcludeComponent.class)
)
static class ComponentFilterAppConfig{

}
```

- `MyIncludeComponet`는 `includeFilters`에 등록하여 해당 Bean들은 스프링 Bean에 등록됬다.
- `MyExcludeComponet`는 `excludeFilters`에 등록하여 해당 Bean들은 스프링 Bean에 등록되지 않았다.



#### Filtery Type 옵션

ANNOTATION: 기본값, 어노테이션을 인식해서 동작한다.

- ex) `org.example.SomeAnnotation`

ASSGINABLE_TYPE: 지정한 타입과 자식 타입을 인식해서 동작한다.

- ex) `org.example.SomeClass`

ASPECTJ: AspectJ 패턴 사용

- ex) `org.example..*Service+`

REGEX: 정규 표현식

- ex) `org\.example\.Default.*`

CUSTOM: `TypeFilter`이라는 이넡페이스를 구현해서 처리

- ex) `org.example.MyTypeFilter`



### 중복 등록과 충돌

충돌이 생기는 두가지 상황

1. 자동 빈 등록 vs 자동 빈 등록
2. 수동 빈 등록 vs 자동 빈 등록



#### 자동 빈 등록 vs 자동 빈 등록

- 컴포넌트 스캔에 의해 자동으로 스프링 빈이 등록되는데, 그 이름이 같은 경우 스프링은 오류를 발생시킨다.
  - `ConflictingBeanDefinitionException`예외 발생



#### 수동 빈 등록 vs 자동 빈 등록

~~~java
		//기존에 등록된 Bean 이름과 동일하게 Bean 등록
		@Bean(name = "memoryMemberRepository")
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
~~~

이 경우 수동 빈 등록이 우선권을 가진다.

(수동 빈이 자동 빈을 오버라이딩 해버린다.)

**수동 빈 등록시 남는 로그**

~~~tex
Overriding bean definition for bean 'memoryMemberRepository' with a different definition: replacing
~~~

보통 해당 충돌은 개발자가 의도해서 나타난게 아니라 설정들이 꼬여서 만들어지는 경우가 대부분이다. 

그래서 최근 스프링 부트는 수동 빈 등록과 자동 빈 등록이 충돌이나면 오류가 발생하도록 기본값을 바꾸었다.
## 의존관계 자동 주입

### 다양한 의존관계 주입 방법

의존관계 주입은 크게 4가지 방법이 있다.

- 생성자 주입
- 수정자 주입(setter 주입)
- 필드 주입
- 일반 메서드 주입



### 생성자 주입

- 이름 그대로 생성자를 통해서 의존 관계를 주입 받는 방법이다.
- 특징
  - 생성자 호출시점에 딱 1번만 호출되는 것이 보장된다.
  - **불변, 필수** 의존관계에 사용

~~~java
@Component
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }
}
~~~

**중요 생성자가 딱 1개만 있으면 @Autowired를 생략해도 자동 주입된다.** 물론 스프링 빈에만 적용된다.

~~~java
@Component
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }
}
~~~

생성자 주입은 빈을 등록하면서 의존관계도 함께 주입한다.



### 수정자 주입

- Setter라 불리는 필드의 값을 변경하는 수정자 메서드를 사용하여 주입 받는 방법이다.
- 특징
  - **선택, 변경** 가능성이 있는 의존관계에 사용
  - 자바빈 프로퍼티 규약의 수정자 메서드 방식을 사용하는 방법이다.

~~~java
@Component
public class OrderServiceImpl implements OrderService{

    private MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;

    @Autowired
    public void setMemberRepository(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Autowired
    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }
}
~~~

> 참고: `@Autowired`의 기본동작은 주입할 대상이 없으면 오류가 발생한다. 주입할 대상이 없어도 동작하게 하려면 `@Autowired(required = false)`로 지정하면 된다. 

> 참고: 자바빈 프로퍼티, 자바에서는 과거부터 필드의 값을 직접 변경하지 않고, setXxx, getXxx라는 메서드를 통해서 값을 읽거나 수정하는 규칙을 만들었다. 그것이 자바빈 프로퍼티 규약이다.



### 필드 주입

- 이름 그대로 필드에 바로 주입하는 방법이다.
- 특징
  - 코드가 간결해서 많은 개발자들을 유혹하지만 외부에서 변경이 불가능해서 테스트 하기가 어렵다.
  - DI 프레임 워크가 없으면 아무것도 할 수 없다.
    - 왜냐하면 순수한 Java 프로그램으로 Test할 시 에는 스프링이 없어 의존관계를 주입하지 못하기도 할 뿐더러 의존관계를 주입하려면 결국엔 setter를 만들어줘야 한다.
  - 사용하지말자!
    - 애플리케이션의 실제코드와 상관없는 테스트 코드
    - 스프링 설정을 목적으로 하는 @Configuration 같은 곳에서만 특별한 용도로 사용



### 일반 메서드 주입

- 일반 메서드를 통해서 주입받을 수 있다.
- 특징
  - 한번에 여러 필드를 주입 받을 수 있다.
  - 일반적으로 잘 사용하지 않는다.



### 옵션 처리

주입할 스프링 빈이 없어도 동작해야 할 때가 있다.

그런데 `@Autpwired`만 사용하면 `required`옵션의 기본값이 `true`로 되어있어서 자동 주입 대상이 없으면 오류가 발생한다.



자동 주입 대상을 옵션으로 처리하는 방법은 다음과 같다.

- `@Autowired(required=false)`: 자동 주입할 대상이 없으면 수정자 메소드 자체가 호출이 안됨
- `org.springframework.lang.@Nullable`: 자동 주입할 대상이 없으면 null이 입력된다.
- `Optional<>`: 자동 주입할 대상이 없으면 `Optional.empty`가 입력된다.

~~~java
public class AutowiredTest {

    @Test
    void AutoWiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{

        @Autowired(required = false)//spring bean 없는 객체를 주입
        public void setNoBean1(Member noBean1) {
            System.out.println("noBean1 = " + noBean1);
        }

        @Autowired
        public void setNoBean2(@Nullable Member noBean2) {
            System.out.println("noBean2 = " + noBean2);
        }

        @Autowired
        public void setNoBean3(Optional<Member> noBean3) {
            System.out.println("noBean3 = " + noBean3);
        }
    }
}
~~~

- **Member는 스프링빈이 아니다.**
- `setNoBean1()`은 `@Autowired(required=false)`이므로 호출 자체가 안된다.

> 참고: @Nullable, Optional은 스프링 전반에 걸쳐서 지원된다. 예를 들어서 생성자 자동주입에서 특정 필드에만 사용해도 된다.

### 조회 빈이 2개 이상 - 문제

`@Autowired`는 타입(Type)으로 조회한다.

~~~java
@Autowired
private DiscountPolicy discountPolicy
~~~

타입으로 조회하기 때문에, 마치 다음 코드와 유사하게 동작한다. (실제로는 더 많은 기능을 제공한다.)

`ac.getBean(DiscountPolicy.class)`



스프링 빈 조회에서 타입으로 조회하면 선택된 빈이 2개 이상일 때 문제가 발생한다.

`DiscountPolicy`의 하위 타입인 `FixDisocuntPolicy`,  `RateDisocuntPolicy` 둘 다 스프링 빈으로 선언해보자.

~~~java
@Component
public class FixDiscountPolicy implements DiscountPolicy{
  ...
}
~~~

~~~java
@Component
public class RateDiscountPolicy implements DiscountPolicy{
  ...
}
~~~



그리고 이렇게 의존관계 자동 주입을 실행하면

~~~java
@Autowired
private DiscountPolicy discountPolicy
~~~



`NoUniqueBeanDefinitionException` 오류가 발생한다.

~~~bash
org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'hello.core.discount.DiscountPolicy' available: expected single matching bean but found 2: fixDiscountPolicy,rateDiscountPolicy
~~~

이 때 하위타입으로 지정할 수 도 있지만 , 하위 타입으로 지정하는 것은 DIP를 위배하고 유연성이 떨어진다. 그리고 이름만 다르고, 완전히 똑같은 스프링 빈이 2개 있을 때 해결이 안된다.

스프링 빈을 수동 등록해서 문제를 해결해도 되지만, 의존 관계 자동 주입에서 해결하는 여러 방법이 있다.



### @Autowired 필드 명, @Qualifier, @Primary

조회 대상 빈이 2개 이상일 때 해결 방법

- @Autowired 필드명 매칭
- @Qualifier -> @Qualifier끼리 매칭 -> 빈이름 매칭
- @Primary 사용



#### @Autowired 필드 명 매칭

`@Autowired`는 타입 매칭을 시도하고, 이때 여러 빈이 있으면 필드 이름, 파라미터 이름으로 빈 이름을 추가 매칭한다.



기존 코드

~~~java
@Autowired
public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
  this.memberRepository = memberRepository;
  this.discountPolicy = discountPolicy;
}
~~~



필드 명을 빈이름으로 변경

~~~java
@Autowired
public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy rateDiscountPolicy) {
	this.memberRepository = memberRepository;
  this.discountPolicy = rateDiscountPolicy;
}
~~~

필드명이 `rateDiscountPolicy`이므로 정상 주입된다.

**필드명 매칭은 먼저 타입 매칭을 시도하고 그결과에 여러 빈이 있을 때 추가로 동작하는 기능이다.**



**@Autowired매칭 정리**

1. 타입 매칭
2. 타입 매칭의 결과가 2개 이상일 때 필드 명, 파라미터 명으로 빈이름 매칭



#### @Qualifier 사용

`@Qualifer`는 추가 구분자를 붙여주는 방법이다. 주입 시 추가적인 방법을 제공하는 것이지 빈 이름을 변경하는 것이 아니다.

~~~java
@Component
@Qualifier("mainDiscountPolicy")
public class RateDiscountPolicy implements DiscountPolicy{
}
~~~

**주입시에 @Qualifier를 붙여주고 등록한 이름을 적어준다.**



**생성자 자동주입 예시**

~~~java
@Autowired
public OrderServiceImpl(MemberRepository memberRepository, @Qualifier("mainDiscountPolicy") DiscountPolicy discountPolicy) {
	this.memberRepository = memberRepository;
  this.discountPolicy = discountPolicy;
}
~~~



**수정자 자동주입 예시**

`````java
@Autowired
public DiscountPolicy setDiscountPolicy(@Qualifier("mainDiscountPolicy") DiscountPolicy discountPolicy){
	return discountPolicy;
}
```

`Qualifier`로 주입할 때 `@Qualifier("mainDiscountPolicy")`를 못찾으면 어떻게 될까? 그러면 mainDiscountPolicy라는 이름의 스프링빈을 추가로 찾는다. 하지만 영한님의 경험상 `@Qualifer`는 `@Qualifer`를 찾는 용도로만 사용하는게 명확하고 좋다.



**@Qualifier 정리**

1. @Qualifier끼리 매칭
2. 빈 이름 매칭
3. `NoSuchBeanDefinition` 예외가 발생한다.



#### @Primary 사용

`@Primary`는 우선순위를 정하는 방법이다. @Autowired 시에 여러 빈이 매칭되면 `@Primary`가 우선권을 가진다.



`rateDiscountPolicy`가 우선권을 가지도록 하자

~~~java
@Component
@Primary
public class RateDiscountPolicy implements DiscountPolicy()

@Component
public class fixDiscountPolicy implements DiscountPolicy()
~~~



**@Primary, @Qualifier 활용**

코드에서 자주 사용하는 메인 데이터베이스의 커넥션을 획득하는 스프링 빈이 있고, 코드에서 특별한 기능으로 가끔 사용하는 서브 데이터베이스의 커넥션을 획득하는 스프링 빈이 있다고 생각해보자. 메인 데이터베이스의 커넥션을 획득하는 스프링빈은 `@Primary`를 적용해서 조회하는 곳에서 `@Qualifier`지정 없이 편리하게 조회하고, 서브 데이터베이스 커넥션 빈을 획득할 때는 `@Qualifier`를 지정해서 명시적으로 획득하는 방식으로 사용하면 코드를 깔끔하게 유지할 수 있다. 물론 이때 메인 데이터베이스의 스프링 빈을 등록할 때 `@Qualifier`를 지정해주는 것은 상관없다.



**우선순위**

`@Primary`는 기본값 처럼 동작하는 것이고 `@Qualifier`는 매우 상세하게 동작한다. 이런 경우 스프링은 자동보다는 수동이, 넓은 범위의 선택권보다는 좁은 범위의 선택권이 우선순위가 높다. 따라서 여기서도 `@Qualifier`가 우선권이 높다.

`````



### 애노테이션 직접 만들기

`Qualifier("maiunDiscountPolicy")`이렇게 문자를 적으면 컴파일시 타입 체크가 안된다. 다음과 같은 애노테이션을 만들어서 문제를 해결할 수 있다.

~~~java
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Qualifier("mainDiscountPolicy")
public @interface MainDiscountPolicy {
}
~~~



~~~java
@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy{
}
~~~



~~~java
    @Autowired
public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy discountPolicy) {
  this.memberRepository = memberRepository;
  this.discountPolicy = discountPolicy;
}


~~~

애노테이션에는 상속이라는 개념이 없다. 

이렇게 여러 애노테이션을 모아서 사용하는 기능은 스프링이 지원해주는 기능이다. @Qualifier뿐만 아니라 다른 애노테이션 들도 함께 조합해서 사용할 수 있다. 단적으로 @Autowired도 재정의 할 수 있다. 물론 스프링이 제공하는 기능을 뚜렷한 목접없이 무분별하게 재정의 하는 것은 유지보수에 더 혼란만 가중할 수 있다.



### 조회한 빈이 모두 필요할 때, List, Map

의도적으로 정말 해당 타입의 스프링 빈이 다 필요한 경우도 있다.

예를 들어서 할인 서비스를 제공하는데, 클라이언트가 할인의 종류(rate, fix)를 선택할 수 있으면, 스프링을 사용하면 전략 패턴을 매우 간단하게 구현할 수 있다.

~~~java
@Test
    void findAllBean() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class, DiscountService.class);

        DiscountService discountService = ac.getBean(DiscountService.class);
        Member member = new Member(1L, "userA", Grade.VIP);
        int discountPrice = discountService.discount(member, 10000, "fixDiscountPolicy");

        assertThat(discountService).isInstanceOf(DiscountService.class);
        assertThat(discountPrice).isEqualTo(1000);

        int rateDiscountPrice = discountService.discount(member, 20000, "rateDiscountPolicy");
        assertThat(rateDiscountPrice).isEqualTo(2000);
    }

    static class DiscountService {
        private final Map<String, DiscountPolicy> policyMap;
        private final List<DiscountPolicy> policies;

        @Autowired
        public DiscountService(Map<String, DiscountPolicy> policyMap, List<DiscountPolicy> policies) {
            this.policyMap = policyMap;
            this.policies = policies;
            System.out.println("policyMap = " + policyMap);
            System.out.println("policies = " + policies);
        }

        public int discount(Member member, int price, String discountCode) {
            DiscountPolicy discountPolicy = policyMap.get(discountCode);
            return discountPolicy.discount(member, price);
        }
    }
~~~

**로직 분석**

- DiscountService는 Map으로 모든 `DiscountPolicy`를 주입받는다. 이때 `fixDiscountPolicy` , `rateDiscountPolicy`가 주입된다.
- `discount()` 메서드는 discountCode로 "fixDiscountPolicy"가 넘어오면 map에서 `fixDiscountPolicy` 스프링 빈을 찾아서 실행한다. 물론 "rateDiscountPolicy"가 넘어오면 `rateDiscountPolicy` 스프링 빈을 찾아서 실행한다.



**주입 분석**

- `Map<String, DiscountPolicy>`: map의 키에 스프링 빈의 이름을 넣어주고, 그값으로 `DiscountPolicy`타입으로 조회한 모든 스프링 빈을 담아준다.
- `List<DiscountPolicy>`: `DiscountPolicy`타입으로 조회한 모든 스프링 빈을 담아준다.
- 만약 해당하는 타입의 스프링 빈이 없으면, 빈 컬렉션이나 Map을 주입한다.



### 자동, 수동의 올바른 실무 운영 기준

**편리한 자동 기능을 기본으로 사용하자**

어떤 경우에 컴포넌트 스캔과 자동 주입을 사용하고, 어떤 경우에 설정 정보를 통해서 수동으로 빈을 등록하고, 의존관계도 수동으로 주입해야 할까?



결론부터 이야기하면, 스프링이 나오고 시간이 갈 수록 점점 자동을 선호하는 추세다. 스프링은`@Component`뿐만 아니라 `@Controller`, `@Service`, `@Repository`처럼 계층에 맞추어 일반적인 애플리케이션 로직을 자동으로 스캔할 수 있도록 지원한다. 거기에 더해서 최근 스프링 부트는 컴포넌트 스캔을 기본적으로 사용하고, 스프링 부트의 다양한 스프링 빈들도 조건이 맞으면 자동으로 등록하도록 설계했다.



설정 정보를 기반으로 애플리케이션을 구성하는 부분과, 실제 동작하는 부분을 명확하게 나누는 것이 이상적이지만, 개발자 입장에서 스프링 빈을 하나 등록할 때 `@Component`만 넣어주면 끝나는 일ㅇ르 `@Configuration`설정 정보에 가서 `@Bean`을 넣고, 객체를 생성하고, 주입할 대상을 일일이 적어주는 과정은 상당히 번거롭다.<br>또 관리할 빈이 많아서 설정 정보가 커지면 설정 정보를 관리하는 것 자체가 부담이 된다.<br>그리고 자동 빈 등록을 사용해도 OCP, DIP를 지킬 수 있다.



**그러면 수동 빈 등록은 언제 사용하면 좋을까?** 

애플리케이션은 크게 업무 로직과 기술 지원 로직으로 나눌 수 있다.

- **업무 로직 빈**: 웹을 지원하는 컨트롤러, 핵심 비즈니스 로직이 있는 서비스, 데이터 계층의 로직을 처리하는 레포지토리등이 모두 업무로직이다. 보통 비즈니스 요구사항을 개발할 때 추가되거나 변경된다.
- **기술 지원 빈**: 기술적인 문제나 공통 관심사(AOP)를 처리할 때 주로 사용된다. 데이터베이스 연결이나, 공통 로그처리처럼 업무 로직을 지원하기 위한 하부 기술이나 공통 기술들이다.



- 업무 로직은 숫자도 매우 많고, 한번 개발해야 하면 컨트롤러, 서비스, 레포지토리처럼 어느정도 유사한 패턴이 있다. 이런 경우 자동 기능을 적극 사용하는 것이 좋다. 보통 문제가 발생해도 어떤 곳에서 문제가 발생했는지 명확하게 파악하기 쉽다.
- 기술 지원 로직은 업무 로직과 비교해서 그 수가 매우 적고, 보통 애플리케이션 전반에 걸쳐서 광범위하게 영향을 미친다. 그리고 업무 로직은 발생했을 때 어디가 문제인지 명확하게 잘 들어나지만, 기술 지원 로직은 적용이 잘 되고 있는지 아니지 조차 파악하기 어려운 경우가 많다. 그래서 이런 기술지원 로직들은 가급적 수동 빈등록을 사용해서 명확하게 들어내는 것이 좋다.



​	**애플리케이션에 광범위하게 영향을 미치는 기술 지원 객채는 수동 빈으로 등록해서 설정 정보에 바로 나타나게 하는것이 유지보수하기 좋다.**



**비즈니스 로직 중에서 다형성을 적극 활용할 때**

의존관계 자동 주입 - 조회한 빈이 모두 필요할 때, List, Map을 다시보자.

`DiscountService`가 의존관계 자동 주입으로 `Map<String, DiscountPolicy>`에 주입을 받는 상황을 생각해보자. 여기에 어떤 빈들이 주입될 지, 각 빈들의 이름은 무엇일지 코드만 보고 한번에 쉽게 파악할 수 있을까? 내가 개발했으니 크게 관계가 없지만, 만약 이코드를 다른 개발자가 개발해서 나에게 준 것이라면 어떨까?<br>자동등록을 사용하고 있기 때문에 파악하려면 어려 코드를 찾아봐야 한다.

이런경우 수동빈으로 등록하거나 또는 자동으로하면 **특정 패키지에 같이 묶어**두는게 좋다. 

~~~java
@Configurationi
public class DiscountPolicyConfig{
	
	@Bean
	public DiscountPolicy rateDiscountPolicy(){
		return new RateDiscountPolicy();
	}
	
	@Bean
	public DiscountPolicy fixDiscountPolicy(){
		return new FixDiscountPolicy();
	}
}
~~~

이 설정 정보만 봐도 한눈에 빈의 이름은 물론이고, 어떤 빈들이 주입될지 파악할 수 있다. 그래도 빈 자동등록을 사용하고 싶으면 파악하기 좋게 `DiscountPolicy`의 구현 빈들만 따로 모아서 특정 패키지에 모아두자.



**정리**

편리한 자동 기능을 기본으로 사용하자

직접 등록하는 기술 지원 객체는 수동으로 등록하자

다형성을 적극 활용하는 비즈니스 로직은 수동 등록을 고민해보자



## 빈 생명주기 콜백

### 빈 생명주기 콜백 시작

데이터베이스 커넥션 풀이나, 네트워크 소켓처럼 애플리케이션 시작 시점에 필요한 연결을 미리 해두고, 애플리케이션 종료 시점에 연결을 모두 종료하는 작업을 진행하려면, 객체의 초기화 와 종료 작업이 필요하다. 

```java
public class NetworkClient {
    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
        connect();
        call("초기화 연결 메시지");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //서비스 시작 시 호출
    public void connect() {
        System.out.println("connect: " + url);
    }

    public void call(String message) {
        System.out.println("call: " + url + " message = " + message);
    }

    //서비스 종료 시 호출
    public void disconnect() {
        System.out.println("close: " + url);
    }
}
```

~~~java
public class BeanLifeCycleTest {

    @Test
    public void lifeCycleTest() {
        ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        NetworkClient client = ac.getBean(NetworkClient.class);
        ac.close();
    }

    @Configuration
    static class LifeCycleConfig{
        @Bean
        public NetworkClient networkClient() {
            NetworkClient networkClient = new NetworkClient();
            networkClient.setUrl("http://hello-spring.dev");
            return networkClient;
        }
    }
}

=================================================================

생성자 호출, url = null
connect: null
call: null message = 초기화 연결 메시지
~~~

생성자 부분을 보면 url 정보없이 connect가 호출되는 것을 확인할 수 있다. 객체를 생성ㅇ하는 단계에는 url이 없고, 객체를 생성한 다음에 외부에서 수정자 주입을 통해서 `setUrl()`이 호출되어야 url이 존재하게 된다.



스프링 빈은 간단하게 다음과 같은 라이프사이클을 가진다.

**객체 생성** -> **의존관계 주입**



스프링 비은 객체를 생성하고, 의존관계 주입이 다 끝난 다음에야 필요한 데이터를 사용할 수 있는 준비가 완료된다. 따라서 초기화 작업은 의존관계 주입이 모두 완료되고 난 다음에 호출해야 한다. 그런데 개발자가 의존관계 주입이 모두 완료된 시점을 어떻게 알 수 있을까?

**스프링은 의존관계 주입이 완료되면 스프링 빈에게 콜백 메서드를 통해서 초기화 시점을 알려주는 다양한 기능을 제공**한다. 또한 **스프링은 스프링 컨테이너가 종료되기 직전에 소멸 콜백**을 준다. 따라서 안전하게 종료 작업을 진행할 수 있다.



**스프링 빈의 이벤트 라이프사이클**

**스프링 컨테이너 생성** -> **스프링 빈 생성(생성자 인젝션)** -> **의존관계 주입** -> **초기화 콜백** -> **사용** -> **소멸전 콜백** -> **스프링 종료**

- **초기화 콜백**: 빈이 생성되고, 빈의 의존관계 주입이 완료된 후 호출
- **소멸전 콜백**: 빈이 소멸되기 직전에 호출



스프링은 다양한 방식으로 생명주기 콜백을 지원한다.

> **참고: 객체의 생성과 초기화를 분리하자**
>
> 생성자는 필수 정보(파라미터)를 받고, 메모리를 할당해서 객체를 생성하는 책임을 가진다. 반면에 초기화는 이렇게 생성된 값들을 활용해서 외부 커넥션을 연결하는 등 무거운 동작을 수행한다.
>
> 따라서 생성자 안에서 무거운 초기화 작업을 함께 하는 것 보다는 객체를 생성하는 부분과 초기화 하는 부분을 명확하게 나누는 것이 유지보수 관점에서 좋다. 물론 초기화 작업이 내부 값들만 약간 변경하는 정도로 단순한 경우에는 생성자에서 한번에 다처리하는게 더 나을 수 있다.



**스프링은 크게 3가지 방법으로 빈 생명주기 콜백을 지원한다.**

- 인터페이스(InitializingBean, DisposableBean)
- 설정 정보에 초기화 메서드, 종료 메서드 지정
- @PostConstruct, @PreDestroy 애노테이션 지원



### 인터페이스(InitializingBean, DisposableBean)

~~~java
public class NetworkClient implements InitializingBean, DisposableBean {
 		@Override
    public void afterPropertiesSet() throws Exception {
        connect();
        call("초기화 연결 메시지");
    }

    @Override
    public void destroy() throws Exception {
        disconnect();
    }
}
~~~

- `InitializingBean`은 `afterPropertiesSet()`메서드로 초기화를 지원한다.
- `DisposableBean`은 `destroy()`메서드로 소멸을 지원한다.



**출력 결과**

~~~java
생성자 호출, url = null
NetworkClient.afterPropertiesSet
connect: http://hello-spring.dev
call: http://hello-spring.dev message = 초기화 연결 메시지
23:05:02.745 [main] DEBUG org.springframework.context.annotation.AnnotationConfigApplicationContext - Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@5ba3f27a, started on Thu Feb 03 23:05:02 KST 2022
NetworkClient.destroy
close: http://hello-spring.dev
~~~

- 초기화 메서드가 스프링 빈에 등록할 때 적절하게 호출 된것을 확인할 수 있다.
- 그리고 스프링 컨테이너의 종료가 호출되자 소멸 메서드가 호출 된 것도 확인할 수 있다.



**초기화, 소멸 인터페이스 단점**

- 이 인터페이스는 스프링 전용 인터페이스이다. 해당 코드가 스프링 전용 인터페이스에 의존한다.
- 초기화, 소멸 메서드의 이름을 변경할 수 없다.
- 내가 코드를 고칠 수 없는 외부 라이브러리에 적용할 수 없다.



> 참고: 인터페이스를 사용하는 초기화, 종료 방법은 스프링 초창기에 나온 방법들이고, 지금은 더 나은 방법들이 있어서, 거의 사용하지 않는다.



### 빈 등록 초기화, 소멸 메소드

설정 정보에 `@Bean(initMethod = "init", destroyMethod = "close")`처럼 초기화, 소멸 메서드를 지정할 수 있다.



**설정 정보를 사용하도록 변경**

~~~java
		public void init() {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }

    public void close() {
        System.out.println("NetworkClient.close");
        disconnect();
    }


@Configuration
    static class LifeCycleConfig{
        @Bean(initMethod = "init", destroyMethod = "close")
        public NetworkClient networkClient() {
            NetworkClient networkClient = new NetworkClient();
            networkClient.setUrl("http://hello-spring.dev");
            return networkClient;
        }
    }
==================================================================
생성자 호출, url = null
NetworkClient.init
connect: http://hello-spring.dev
call: http://hello-spring.dev message = 초기화 연결 메시지
debug...
23:16:35.912 [main] DEBUG org.springframework.context.annotation.AnnotationConfigApplicationContext - Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@5ba3f27a, started on Thu Feb 03 23:16:35 KST 2022
NetworkClient.close
close: http://hello-spring.dev
~~~

**설정 정보 사용 특징**

- 메서드 이름을 자유롭게 줄 수 있다.
- 스프링 빈이 스프링 코드에 의존하지 않는다.
- 코드가 아니라 설정 정보를 사용하기 때문에 코드를 고칠 수 없는 외부 라이브러리에도 초기화, 종료 메서드를 적용할 수 있다.



**종료 메서드 추론**

- `@Bean의 destroyMethod`속성에는 아주 특별한 기능이있다.
- 라이브러리 대부분 `close`, `shutdown`이라는 이름의 종료 메서드를 사용한다.
- @Bean의 `destroyMethod`는 기본값이 `(inferred)`(추론)으로 등록되어 있다.
- 이 추론 기능은 `close`, `shutdown`이라는 이름의 매서드를 자동으로 호출해준다. 이름 그대로 종료 메서드를 추론해서 호출해준다.
- 따라서 직접 스프링 빈으로 등록하면 종료 메서드는 따로 적어주지 않아도 잘 동작한다.
- 추론 기능을 사용하기 싫으면 `destroyMethod=""`처럼 빈 공백을 지정하면 된다.



### 애노테이션 @PostConstruct, @PreDestroy

~~~java
		@PostConstruct
    public void init() {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }

    @PreDestroy
    public void close() {
        System.out.println("NetworkClient.close");
        disconnect();
    }
~~~

`@PostConstruct`, `@PreDestroy`이 두 애노테이션을 사용하면 가장 편리하게 초기화와 종료를 실행할 수 있다.



**@PostConstruct, @PreDestroy 애노테이션 특징**

- 최신 스프링에서 가장 권하는 방법이다.
- 애노테이션 하나만 붙이면 되므로 매우 편리하다.
- 패키지를 잘보면 `javax.annotation.PostConstruct`이다. 스프링에 종속적인 기술이 아니라 JSR-250이라는 자바 표준이다. 따라서 스프링이아닌 다른 컨테이너에서도 동작한다.
- 컴포넌트 스캔과 잘 어울린다.
- 유일한 단점은 외부 라이브러리에는 적용하지 못한다는 것이다. 외부 라이브러리를 초기화, 종료해야하면 @Bean의 기능을 사용하자.



**정리**

- **@PostConstruct, @PreDestroy 애노테이션을 사용하자**
- 코드를 고칠 수 없는 외부라이브러리를 초기화, 종료해야하면 `@Bean`의 `initMethod`, `destroyMethod`를 사용하자


## 빈 스코프

### 빈 스코프란

스코프는 번역 그대로 빈이 존재할 수 있는 범위를 뜻한다. 스프링 빈은 기본적으로 싱글톤 스코프로 생성된다.



**스프링은 다음과 같은 다양한 스코프를 지원한다.**

- **싱글톤**: 기본 스코프, 스프링 컨테이너의 시작과 종료까지 유지되는 가장 넓은 범위의 스코프이다.
- **프로토타입**: 스프링 컨테이너는 프로토타입 빈의 생성과 의존관계 주입까지만 관여하고 더는 관리하지 않는 매우 짧은 범위의 스코프이다.
- **웹 관련 스코프**
  - **request**: 웹 요청이 들어오고 나갈 때까지 유지되는 스코프이다.
  - **session**: 웹 세션이 생성되고 종료될 때까지 유지되는 스코프이다.
  - **application**: 웹의 서블릿 컨텍스와 같은 범위로 유지되는 스코프이다.



### 프로토타입 스코프

싱글톤 스코프의 빈을 조회하면 스프링 컨테이너는 항상 같은 인스턴스의 스프링 빈을 반환한다. 반면에 프로토타입 스코프를 스프링 컨테이너에 조회하면 스프링 컨테이너는 항상 새로운 인스턴스를 생성해서 반환한다.



**싱글톤 빈 요청**

1. 싱글톤 스코프의 빈을 스프링 컨테이너에 요청한다.
2. 스프링 컨테이너는 본인이 관리하는 스프링 빈을 반환한다.
3. 이후에 스프링 컨테이너에 같은 요청이 와도 같은 객체 인스턴스의 스프링 빈을 반환한다.



**프로토타입 빈 요청**

1. 프로토타입 스코프의 빈을 스프링 컨테이너에 요청한다.
2. 스프링 컨테이너는 이 시점에 프로토타입 빈을 생성하고, 필요한 의존관계를 주입한다.
3. 스프링 컨테이너는 생성한 프로토타입 빈을 클라이언트에 반환한다.
4. 이후에 스프링 컨테이너에 같은 요청이 오면 항상 새로운 프로토타입 빈을 생성해서 반환한다.



**정리**

여기서 **핵심은 스프링 컨테이너는 프로토타입 빈을 생성하고, 의존관계 주입, 초기화까지만 처리한다는 것이다.** <br>클라이언트에 빈을 반환하고, 이후 스프링 컨테이너는 생성된 프로토타입 빈을 관리하지 않는다. 프로토타입 빈을 관리할 책임은 프로토타입 빈을 받은 클라이언트에 있다. <br>**그래서 @PreDestory 같은 종료 메서드가 호출되지 않는다.'**'



**프로토타입 빈 테스트**

```java
@Test
void prototypeBeanFind() {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrototypeBean.class);

    System.out.println("find prototypeBean1");
    PrototypeBean prototypeBean1 = ac.getBean(PrototypeBean.class);
    System.out.println("find prototypeBean2");
    PrototypeBean prototypeBean2 = ac.getBean(PrototypeBean.class);
    System.out.println("prototypeBean1 = " + prototypeBean1);
    System.out.println("prototypeBean2 = " + prototypeBean2);
    assertThat(prototypeBean1).isNotSameAs(prototypeBean2);

    ac.close();
}

@Scope("prototype")
static class PrototypeBean {
    @PostConstruct
    public void init() {
        System.out.println("SingletonBean.init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("SingletonBean.destroy");
    }
}
```

~~~bash
find prototypeBean1
SingletonBean.init
find prototypeBean2
SingletonBean.init
prototypeBean1 = hello.core.scope.PrototypeTest$PrototypeBean@3daf7722
prototypeBean2 = hello.core.scope.PrototypeTest$PrototypeBean@78641d23
23:35:03.975 [main] DEBUG org.springframework.context.annotation.AnnotationConfigApplicationContext - Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@c88a337, started on Sat Feb 05 23:35:03 KST 2022
~~~

- 싱글톤 빈은 스프링 컨테이너 생성 시점에 빈이 생성되고, 초기화 메서드가 실행 되지만, 프로토타입 스코프의 빈은 스프링 컨테이너에서 빈을 조회할 때 생성되고, 초기화 메서드도 실행된다.
- 프로토타입 빈을 2번 조회했으므로 완전히 다른 스플이 빈이 생성되고, 초기화도 2번 실행된 것을 확인할 수 있다.
- 싱글톤 빈은 스프링 컨테이너가 관리하기때문에 스프링 컨테이너가 종료될 때 빈의 종료 메서드가 실행되지만, 프로토타입 빈은 스프링 컨테이너가 생성과 의존관계 주입 그리고 초기화까지만 관여하고, 더는 관리하지 않는다. 따라서 프로토타입 빈은 스프링 컨테이너가 종료될 때 `@PreDestory`같은 종료 메서드가 전혀 실행되지 않는다.



**프로토타입 빈의 특징 정리**

- 스프링 컨테이너에 요청할 때 마다 새로 생성된다.
- 스프링 컨테이너는 프로토타입 빈의 생성과 의존관계 주입 그리고 초기화까지만 관영한다.
- 종료 메서드가 호출되지 않는다.
- 그래서 프로토타입 빈은 프로토타입 빈을 조회한 클라이언트가 관리해야 한다. 종료 메서드에대한 호출도 클라이언트가 직접해야한다.
