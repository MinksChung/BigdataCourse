class Management:
    ## 멤버 변수 (아이디, 비밀번호, 등급, 마일리지)
    id = ""
    pw = ""
    grade = ""
    mileage = 0
    count = 0 # static 변수, 클래스 변수

    ## 생성자 함수
    def __init__(self, id, pw, grade, mileage):
        self.id = id
        self.pw = pw
        self.grade = grade
        self.mileage = mileage
        Management.count += 1 # 객체를 생성하여 생성자가 호출될 때 마다 1 증가

    ## 멤버 함수

    ## 출력용 함수
    def __str__(self):
        return self.id + ", " + self.pw + ", "  + self.grade + ", " + str(self.mileage)

## 객체 생성
print("===================================================================")
mg1 = Management("admin", "1234", "관리자", 1000)
print("관리자수 : ", Management.count, "명")
mg2 = Management("manager", "pass", "준관리자", 1500)
print("관리자수 : ", Management.count, "명")
mg3 = Management("sitemanager", "sitepass", "준관리자", 1800)
print("관리자수 : ", Management.count, "명")
print("------------------------------------------------------------------")

# 출력
print(mg1.id, "의 비밀번호는 ", mg1.pw, "입니다.", sep="")
print(mg2.id, "는 ", mg2.grade, "이고 마일리지는 ", mg2.mileage, "입니다.", sep="")

total_mlieage = mg1.mileage + mg2.mileage + mg3.mileage
print("총 마일리지는 ",total_mlieage,"입니다.", sep="")

average_mlieage = total_mlieage // Management.count
print("평균 마일리지는 ",average_mlieage,"입니다.", sep="")

print("===================================================================")
