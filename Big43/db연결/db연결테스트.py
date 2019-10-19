import pymysql as my

#1. connector를 통해 db연결
con = my.connect(host='localhost', user='root', password='1234', db='phone')
cursor = con.cursor() #연결스트림을 만든다.!

#2. sql문을 결정
sql = "insert into member2 values ('python','python','python','python')"
cursor.execute(sql)
print('sql문 실행 요청됨.!!!')

con.commit()
con.close()

#3. sql문을 실행