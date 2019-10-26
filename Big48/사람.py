# 상속 = 재사용

class Person:
    ## 멤버 변수
    name = ""
    age = 0

    ## 생성자 함수

    ## 멤버 함수
    def sleep(self):
        print("잠을 자다")
    def eat(self):
        print("밥을 먹다")

    ## 출력용 함수
    def __str__(self):
        return self.name + ", "\
               + str(self.age)

# 상속 받기
class Man(Person): # 상속 : class 자식클래스명(부모클래스명)
    ## 멤버 변수
    power_size = 0 # 추가한 멤버 변수

    ## 멤버 함수
    def fast_run(self): # 추가한 멤버 함수
        print("빠르게 달리다")

    ## 출력용 함수
    def __str__(self):
        return self.name + ", "\
               + str(self.age) + ", "\
                + str(self.power_size)

## 객체 생성

man1 = Man()
# 변수값 할당
man1.name = "알론소"
man1.age = 39
man1.power_size = 25
# 입력값 출력
print(man1)
# 함수 호출
man1.sleep()
man1.fast_run()

man2 = Man()
# 변수값 할당
man2.name = "가투소"
man2.age = 45
man2.power_size = 27
# 입력값 출력
print(man2)
# 함수 호출
man2.eat()
man2.fast_run()
