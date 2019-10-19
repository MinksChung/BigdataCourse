import DB연결.db연결테스트2 as db2

id = input("검색할 아이디 입력 : ")

record = db2.select(id) # db연결테스트2.py 에서 return 해준 record값을 변수 record에 할당

print("----------------------------------------------")
print("입력하신", id, "로 검색한 결과입니다 !!")
print("----------------------------------------------")
print("검색한 ID : ", record[0])
print("검색한 PW : ", record[1])
print("검색한 NAME : ", record[2])
print("검색한 TEL : ", record[3])
print("----------------------------------------------")
