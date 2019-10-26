class Account:
    ## 멤버 변수 (상품명, 예금주, 예금액)
    product = ""
    name = ""
    money = 0

    ## 생성자 함수
    def __init__(self, product, name, money):
        self.product = product
        self.name = name
        self.money = money

    ## 멤버 함수

    ## 출력용 함수
    def __str__(self):
        return self.product + ", " + self.name + ", "  + str(self.money)

## 객체 생성
acc1 = Account("청약저축","김아무개", 500)
acc2 = Account("내비상금","김아무개딸", 30)
acc3 = Account("자유적금", "박아무개", 100)

# 출력
print("===================================================================")
print(acc2.product, " 통장에는 ", acc2.money, "만원이 들어있어요.", sep="")
print(acc3.name, "의 통장에는 ", acc3.money, "만원이 들어있어요.", sep="")
print()
total = acc1.money + acc2.money + acc3.money
print("우리 집 전체 예금액은 ",total,"만원 이에요!", sep="")
print("===================================================================")
