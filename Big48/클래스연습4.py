class Day:
    ## 멤버 변수
    doing = ""
    time = 0
    location = ""
    count = 0 # static 변수, 클래스 변수

    ## 생성자 함수
    def __init__(self, doing, time, location):
        self.doing = doing
        self.time = time
        self.location = location
        Day.count = Day.count + 1 # 객체를 생성하여 생성자가 호출될 때 마다 1 증가

    ## 멤버 함수

    ## 출력용 함수
    def __str__(self):
        return self.doing + ", " + str(self.time) + ", "  + self.location

## 객체 생성
print("===================================================================")
day1 = Day("자바공부",10,"강남")
print("count : ", Day.count, "일")
day2 = Day("여행",15,"강원도")
print("count : ", Day.count, "일")
day3 = Day("운동",11,"피트니스")
print("count : ", Day.count, "일")
print("----------------------------------")

#매일 무엇을 얼마나 어디에서 했는지 프린트
print("1일차 : ", day1)
print("2일차 : ", day2)
print("3일차 : ", day3)
print("===================================================================")

# 전체 하는 일의 시간 출력
total_day = day1.time + day2.time + day3.time
print("전체 하는 일의 시간은 : ", total_day, "시간 입니다.")

# 평균 하는 일의 시간 출력
print("평균 하는 일의 시간은 : ", total_day/Day.count, "시간 입니다")
print("===================================================================")