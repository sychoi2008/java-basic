### 객체와 인스턴스


### 참조형
- 배열, 사용자가 직접 정의한 클래스의 인스턴스
- 참조값(주소값)이 들어간다

### null
- 참조형에서만 사용가능
- 값이 없다는 뜻
- NullPointException : null값에 .(dot)을 찍은 것 

### 절차 지향 프로그래밍 VS 객체지향 프로그래밍
- 객체지향 프로그래밍 : 세상에 있는 모든 사물(객체)를 프로그래밍 언어로 표현한 것 -> **객체는 기능과 속성이 하나의 클래스에 묶여있다** -> 캡슐화!
  -> **OOP의 가장 중요한 특징 1번** : 캡슐화(1) - 데이터와 그 데이터를 사용하는 메소드를 한 클래스에 넣는다!
  
### 생성자 
- 왜 사용하는가?
  1) 중복 호출 제거 : 이전에는 인스턴스 생성 후 메소드를 따로 호출해서 멤버 변수 값을 할당 함 -> 생성자 호출로 인스턴스 생성하면서 자동으로 값을 넣어줌
  2) 제약 : 객체에 무조건 값을 넣어줘야 하는 제약을 걸어 실수로 null 값을 품은 객체를 생성하지 않게 함
 

### 패키지
- 많은 클래스들을 관련된 것끼리 묶음 -> 패키지
- 다른 패키지의 클래스를 사용할 시, import
- ide 상에서는 계층구조이지만 사실은 **패키지들끼리는 완전히 다른 패키지**


### 자바의 메모리 영역
- 메소드(method) 영역 : 클래스 정보와 바이트 코드(실행 코드 : 메소드, 생성자 등) + static 변수 
- 스택 영역 : 자바 실행 시, 하나의 스택이 만들어짐 -> 지역변수, 함수 호출 정보, 중간 연산 결과 저장 => 메소드가 호출하면서 스택 프레임이 쌓이고 그 안에서 지역변수가 관리되는 곳
- 힙 영역 : 인스턴스, 배열이 들어감
  -> 주의 : 객체 내 메소드는 메소드 영역에 저장된다 
### 접근 제어자
- public : 다른 패키지에서도 접근 가능
- default : 같은 패키지 내에서만 접근 가능
- private : 현재 클래스에서만 접근 가능 
  -> **캡슐화 (2) : 데이터(속성)는 private으로 숨기고 기능(메소드)는 필요한 것만 외부에 열어두자**
  -> 생성자의 public의 유무 : public이 있어야 다른 패키지에서 해당 클래스를 사용할 수 있음을 나타낸다! 없으면 default라서 다른 패키지에서 사용할 수 없음


### static 변수
- 다른 이름으로도 불린다 : 정적 변수, 클래스 변수
- 접근하는 방법 : 클래스명 .(dot) 변수명
- **메서드 영역(그 중 static 영역)에서 생성 및 관리됨**
- 의미 : 여러 인스턴스들에서 공용으로 쓸 변수다!
- **클래스는 로딩될 때 하나만 존재**하므로 클래스 변수(static 변수)도 하나만 존재한다 -> 공용으로 사용가능


### static 메소드
- 인스턴스 생성 없이 편리하게 메소드 사용
- 클래스 메소드, 정적 메소드라고도 불린다
- 클래스 내에 단순 로직만 구현되어 있을 때 사용하면 좋다
- **static 메소드는 static이 붙은 메소드나 멤버 변수만 호출할 수 있다** -> 클래스(static) 메소드는 인스턴스의 참조값을 알 수 없기 때문이다.(객체가 생성되더라도 어떤 인스턴스인지 주소를 모르는 데 어떻게 가요!!)  
- 반대로, 접근 제어자만 허락한다면 다른 곳에서는 static 메소드를 호출할 수 있다 -> 클래스 이름만 알면 접근할 수 있으므로!
- **메소드는 static이던 인스턴스 메소드던간에 자바 메모리 영역 中 메소드 영역에 들어간다** -> 인스턴스 메소드가 실행되면은 메소드 영역에 있는 메소드 코드를 인스턴스가 불러와서 실행하는 것임 
- 왜 사용하는가? 정적 메서드는 객체 생성이 필요 없이 메서드의 호출만으로 필요한 기능을 수행할 때 주로 사용한다.
예를 들어 간단한 메서드 하나로 끝나는 유틸리티성 메서드에 자주 사용한다. 수학의 여러가지 기능을 담은 클래스를 만
들 수 있는데, 이 경우 인스턴스 변수 없이 입력한 값을 계산하고 반환하는 것이 대부분이다. 이럴 때 정적 메서드를 사
용해서 유틸리티성 메서드를 만들면 좋다.

### static 변수가 필요한 이유 
여러 인스턴스가 공용으로 접근할 수 있는 변수가 필요할 때 사용
멤버 필드 값은 인스턴스마다 다르기 때문에 공용으로 접근할 수 있는 변수가 필요 

### static 메소드가 필요한 이유
멤버 필드값이 필요없이 기능만 제공하는 클래스인 경우에는 static 메소드가 필요 -> 유틸리티 클래스 


### final
- 한번 초기화 되면 변경할 수 없음
- 멤버 필드로 final 사용 시, 생성자를 통해 초기화
- **static final** : 공용 변수인데(static) + 바뀌지 않음(final)


### 상속
- **OOP의 가장 중요한 특징 2번**
- 자식은 부모를 알지만(extends가 자식 클래스에서 이루어짐), 부모는 자식을 모른다(상속받는 대상의 정보를 알 수 없음) -> 따라서, 화살표가 자식에서 부모 방향으로!
- 단일 상속 : 하나의 자식은 하나의 부모만을 가진다 -> 부모들이 같은 메소드들을 가진다면 자식 입장에서는 어떤 부모의 메소드를 호출해야하는지 알 수 없음
- 메서드 오버라이딩 : 상속에서 사용되는 개념 (!= 메서드 오버로딩 : 같은 이름의 메소드들을 여러 개 정의하는 것)
- 상속관계에서는 반드시 자식 생성자에서 부모 생성자를 호출해야 한다. -> 만약 부모 생성자가 기본 생성자라면 자식 생성자에서는 super()를 쓰지 않아도 됨 


### 다형성
- **OOP의 가장 중요한 특징 3번**
- 다형적 참조 : 부모는 자식 인스턴스의 참조값을 가질 수 있다. (그 반대는 안됨)
- 오버라이딩이 된 메서드는 항상 우선권을 가진다 

### 캐스팅
- 참조값을 바라보는 방법을 바꾸는 것
  - 참조값을 바라보는 방법은 호출한 참조형 타입에 맞춰짐
  - ex) Child child = (Child) poly; // poly는 현재 부모형 타입으로 참조값을 바라보고 있는데, 그것을 자식타입으로 바라볼 수 있게 방법을 바꿈
  - 
