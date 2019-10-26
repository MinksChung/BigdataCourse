import pymysql as my

# insert 함수
def insert(titles):
    # 1. connector를 통해 db연결
    # mysql과 연결
    con = my.connect(host = "localhost", user = "root", password = "1234", db = "phone")
    cursor = con.cursor() # 연결스트링을 만든다 # cursor 를 통해 sql문을 실행

    # 2. sql문을 결정
    for title in titles: # 리스트값들인 titles에서 title을 하나씩 넣어주기 위해
        sql = "insert into naver values ('"+title+"')"
        cursor.execute(sql)
    print("sql문 실행 요청 완료!!!!!")

    # 3. sql문을 실행
    con.commit()
    con.close()

# insert 함수
def insert2(titles):
    # 1. connector를 통해 db연결
    # mysql과 연결
    con = my.connect(host = "localhost", user = "root", password = "1234", db = "phone")
    cursor = con.cursor() # 연결스트링을 만든다 # cursor 를 통해 sql문을 실행

    # 2. sql문을 결정
    for title in titles: # 리스트값들인 titles에서 title을 하나씩 넣어주기 위해
        sql = "insert into naver2 values ('"+title+"')"
        cursor.execute(sql)
    print("sql문 실행 요청 완료!!!!!")

    # 3. sql문을 실행
    con.commit()
    con.close()