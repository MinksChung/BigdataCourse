# 상속 = 재사용

class Korean:
    ## 멤버 변수
    k_food = ""
    k_price = 0
    k_count = 0

    ## 생성자 함수

    ## 멤버 함수
    def k_order(self):
        print("한식을 주문하다")
        print("-----------------------------------")
        print("주문 음식 :", self.k_food)
        print("주문 가격 :", self.k_price)
        print("주문 수량 :", self.k_count)
        print("===================================")
        k_total = self.k_price * self.k_count
        return k_total

    ## 출력용 함수
    def __str__(self):
        return self.k_food + ", "\
               + str(self.k_price) + ", "\
                + str(self.k_count)

class Japan:
    ## 멤버 변수
    j_food = ""
    j_price = 0
    j_count = 0

    ## 생성자 함수

    ## 멤버 함수
    def j_order(self):
        print("일식을 주문하다")
        print("-----------------------------------")
        print("주문 음식 :", self.j_food)
        print("주문 가격 :", self.j_price)
        print("주문 수량 :", self.j_count)
        print("===================================")
        j_total = self.j_price * self.j_count
        return  j_total

    ## 출력용 함수
    def __str__(self):
        return self.j_food + ", "\
               + str(self.j_price) + ", "\
                + str(self.j_count)

# 상속 받기
class Fusion(Korean, Japan): # 상속 : class 자식클래스명(부모클래스명)
    ## 멤버 변수

    ## 멤버 함수
    def calcal(self): # 추가한 멤버 함수
        total = f1.k_order() + f2.j_order()
        return total



    ## 출력용 함수
    def __str__(self):
        return self.j_food + ", "\
               + str(self.j_price) + ", "\
                + str(self.j_count) + ", "\

## 객체 생성

f1 = Fusion()
# 변수값 할당
f1.k_food = "비빔밥"
f1.k_price = 9000
f1.k_count = 3

# 입력값 출력
# print(f1)

f2 = Fusion()
# 변수값 할당
f2.j_food = "초밥"
f2.j_price = 5000
f2.j_count = 2
# 입력값 출력
# print(f2)

# 함수 호출
f = Fusion()
print("===================================")
print("총 주문 금액은", f.calcal(),"원 입니다")
print("===================================")

