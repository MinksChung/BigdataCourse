import pymysql as my

# insert 함수
def insert(id, pw, name, tel):
    # 1. connector를 통해 db연결
    # mysql과 연결
    con = my.connect(host = "localhost", user = "root", password = "1234", db = "phone")
    cursor = con.cursor() # 연결스트링을 만든다 # cursor 를 통해 sql문을 실행

    # 2. sql문을 결정
    sql = "insert into member2 values ('"+id+"','"+pw+"','"+name+"','"+tel+"')"
    cursor.execute(sql)
    print("sql문 실행 요청 완료!!!!!")

    # 3. sql문을 실행
    con.commit()
    con.close()

# select 함수
def select(id):
    # 1. connector를 통해 db연결
    # mysql과 연결
    con = my.connect(host = "localhost", user = "root", password = "1234", db = "phone")
    cursor = con.cursor() # 연결스트링을 만든다 # cursor 를 통해 sql문을 실행

    # 2. sql문을 결정
    sql = "select * from member2 where id = '"+ id +"'"
    print("sql문 실행 요청 완료!!!!!")
    result = cursor.execute(sql) # sql문 select 실행결과를 result에 할당
    print("실행결과 : ", result)

    # .fetchone DB에 가서 record '하나'를 가지고 옴
    # record '여러개'를 가서 가지고 올 때는 .fetchall()
    record = cursor.fetchone()
    # print(record)

    # 3. sql문을 실행
    return record # select 함수가 호출된 페이지로 record값을 return

    con.commit()
    con.close()

# selectAll 함수
def selectAll():
    # 1. connector를 통해 db연결
    # mysql과 연결
    con = my.connect(host = "localhost", user = "root", password = "1234", db = "phone")
    cursor = con.cursor() # 연결스트링을 만든다 # cursor 를 통해 sql문을 실행

    # 2. sql문을 결정
    sql = "select * from member2"
    print("sql문 실행 요청 완료!!!!!")
    result = cursor.execute(sql) # sql문 select 실행결과를 result에 할당
    print("실행결과 : ", result)

    # .fetchone DB에 가서 record '하나'를 가지고 옴
    # record '여러개'를 가서 가지고 올 때는 .fetchall()
    # 할당할 변수도 select와 구분을 위해 records로
    records = cursor.fetchall()
    # print(records)

    # 3. sql문을 실행
    return records # selectAll 함수가 호출된 페이지로 records값을 return

    con.commit()
    con.close()
