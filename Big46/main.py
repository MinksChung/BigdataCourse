from urllib import request
from bs4 import BeautifulSoup
import 네이버뮤직.file_save as file
import 네이버뮤직.db_save as insert
import 네이버뮤직.select as select

###########################################################################################

# file_save함수, insert함수 호출
file.naverMusic()

###########################################################################################

# select 함수
print("=============================================")
print("TOP50 음악 '순위'로 검색하기")
print("=============================================")
rank = input("음악 '순위' 입력하기 : ")

# CRUD.py에서 정의한 selectAll함수 호출
# CRUD.py에서 return 해준 records값을 변수 records에 할당
record = select.select(rank)
print("입력하신", rank, "로 검색한 결과입니다 !!")
print("--------------------------------------------")
print("검색한 음악 순위 : ", record[0])
print("검색한 음악 제목 : ", record[1])
print("검색한 음악 가수 : ", record[2])
print("검색한 앨범 이미지 : ", record[3])
print("============================================")

###########################################################################################

# selectAll 함수
print("=============================================")
print("TOP50 음악 순위 전체 검색하기")
print("=============================================")
answer = input("음악 '순위' 전체를 보려면 'y'를 입력 : ")
if (answer == "y"):
    records = select.selectAll()
    # # selectAll로 검색한 결과의 return값인 records에서 record 하나씩을 꺼내고
    # # record 하나에서 4개 항목을 인덱스로 가져옴
    for record in records:
        # print(record)
        print("****************************************")
        print("검색한 음악 순위 : ", record[0])
        print("검색한 음악 제목 : ", record[1])
        print("검색한 음악 가수 : ", record[2])
        print("검색한 앨범 이미지 : ", record[3])
        print("****************************************")
    print("============================================")

###########################################################################################


