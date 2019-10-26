# 상속 = 재사용

class Car:
    ## 멤버 변수
    color = ""
    speed = 0
    seat = 0

    ## 생성자 함수

    ## 멤버 함수
    def speedUp(self):
        print("속도를 올리다")
    def speedDown(self):
        print("속도를 내리다")
    def infoSeat(self):
        return self.seat

    ## 출력용 함수
    def __str__(self):
        return self.color + ", "\
               + self.speed + ", "\
                + self.seat

# 상속 받기
class Truck(Car): # 상속 : class 자식클래스명(부모클래스명)
    # 트럭은 4개의 멤버변수와 4개의 멤버함수를 갖게됨
    ## 멤버 변수
    load = 0 # 추가한 멤버 변수

    ## 멤버 함수
    def move(self): # 추가한 멤버 함수
        print("물건을 나르다")

    ## 출력용 함수
    def __str__(self):
        return self.color + ", "\
               + str(self.speed) + ", "\
                + str(self.seat) + ", "\
                + str(self.load)

t1 = Truck()
t1.color = "파란색"
t1.speed = 100
t1.seat = 2
t1.load = 1000
print(t1)

print("시트 수 : ", t1.infoSeat())
t1.speedUp()
t1.speedDown()
t1.move()
