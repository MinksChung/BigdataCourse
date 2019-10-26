## 클래스 생성
class Phone:
    ## 멤버 변수 선언
    color = ""
    company = ""

    ## 생성자 함수 생성
    def __init__(self, color, company):
        print("파라메터 생성자 호출 완료")
        print("-----------------------------------")
        self.color = color
        self.company = company

    ## 멤버 함수 선언
    def search(self):
        print("인터넷검색하다")
    def photo(self):
        print("사진을찍다")

    ## 출력용 함수
    def __str__(self):
        return self.color + ", " + self.company

## 객체생성
phone1 = Phone("하얀색", "애플")
print(phone1)
phone1.search() # 객체생성하여 할당한 변수명.멤버함수명

print("==================================================")

phone2 = Phone("까만색", "삼성")
print(phone2)
phone2.photo()
