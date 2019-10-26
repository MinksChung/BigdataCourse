# 파이썬은 '함수' 중심의 언어(모듈 중심). 모듈과 클래스는 별개

## 클래스 생성
class Dog: # 클래스명은 대문자로 사용. ( ) 없이 :만 사용
    ## 멤버 변수
    # 변수선언
    color = ""  # 색
    field = ""  # 견종

    ## 생성자 함수(init) (생성자는 함수? (o), 객체를 생성할 때 자동으로 호출되는 함수를 생성자라고 한다)
    def __init__(self): # 클래스안에 있는 생성자라는 표시로 변수명이 self 로 자동완성 됨
        print("내가 마 생성자다 마. 내가 마 느그 객체 생성도 하고 마 그 때 호출도 하고 마 다했어 마.")

    ## 멤버 함수
    def jump(self):
        print("강아지가 뛰고 있다.")
    def sleep(self):
        print("강아지가 자고 있다.")

    ## 출력용 함수(str) (자바의 toString() 역할)
    def __str__(self):
        # 이 클래스 내의 변수를 사용하기 위해 self.변수명 으로 사용
        return self.color + ", " + self.field

## 객체 생성
dog1 = Dog()

dog1.color = "빨간색"
dog1.field = "토이푸들"
print(dog1)

dog1.jump()

print("------------------------------------------------------")

## 객체 생성
dog2 = Dog()
dog2.color = "까만색"
dog2.field = "닥스훈트"
print(dog2)

dog2.sleep()