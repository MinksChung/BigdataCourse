import db연결.db연결테스트2 as db2


records = db2.selectAll()
print('검색할 결과입니다.')
print('-------------------------')
for record in records:
    # print(record)
    print('검색한 id: ', record[0])
    print('검색한 pw: ', record[1])
    print('검색한 name: ', record[2])
    print('검색한 tel: ', record[3])
    print('------------------------')
