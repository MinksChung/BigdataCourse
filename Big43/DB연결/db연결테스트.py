import pymysql as my

# 1. connector를 통해 db연결
# mysql과 연결
con = my.connect(host = "localhost", user = "root", password = "1234", db = "phone")
cursor = con.cursor() # 연결스트링을 만든다 # cursor 를 통해 sql문을 실행

# 2. sql문을 결정
sql = "insert into member2 values ('python', 'python', 'python', 'python')"
cursor.execute(sql)
print("sql문 실행 요청 완료!!!!!")

con.commit()
con.close()

# 3. sql문을 실행