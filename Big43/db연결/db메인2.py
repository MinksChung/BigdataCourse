import db연결.db연결테스트2 as db2

id = input('검색할 아이디 입력>> ')

record = db2.select(id)
print('검색할 결과입니다.')
print('-------------------------')
print('검색한 id: ', record[0])
print('검색한 pw: ', record[1])
print('검색한 name: ', record[2])
print('검색한 tel: ', record[3])
