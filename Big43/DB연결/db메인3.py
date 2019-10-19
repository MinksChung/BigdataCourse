import DB연결.db연결테스트2 as db2

records = db2.selectAll() # db연결테스트2.py 에서 return 해준 records값을 변수 records에 할당

print("----------------------------------------------")
print("모든 정보를 검색한 결과입니다 !!")
print("----------------------------------------------")
for record in records:
    # print(record)
    print("검색한 ID : ", record[0])
    print("검색한 PW : ", record[1])
    print("검색한 NAME : ", record[2])
    print("검색한 TEL : ", record[3])
    print("***************************")
print("----------------------------------------------")
