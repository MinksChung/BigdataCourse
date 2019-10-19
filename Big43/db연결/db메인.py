import db연결.db연결테스트2 as db2

id = input('아이디 입력>> ')
pw = input('패스 입력>> ')
name = input('이름 입력>> ')
tel = input('전화 입력>> ')

db2.insert(id, pw, name, tel)
