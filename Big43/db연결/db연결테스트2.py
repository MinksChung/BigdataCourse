import pymysql as my

def selectAll():
    #1. connector를 통해 db연결
    con = my.connect(host='localhost', user='root', password='1234', db='phone')
    cursor = con.cursor() #연결스트림을 만든다.!

    #2. sql문을 결정
    sql = "select * from member2"
    print('sql문 실행 요청됨.!!!')
    result = cursor.execute(sql)
    print('실행결과; ', result)

    #스트림에서 데이터를 꺼내온다.
    records = cursor.fetchall()
    print(records)

    con.commit()
    con.close()

    #3. sql문을 실행
    return records

def select(id):
    #1. connector를 통해 db연결
    con = my.connect(host='localhost', user='root', password='1234', db='phone')
    cursor = con.cursor() #연결스트림을 만든다.!

    #2. sql문을 결정
    sql = "select * from member2 where id = '" + id + "'"
    print('sql문 실행 요청됨.!!!')
    result = cursor.execute(sql)
    print('실행결과; ', result)

    #스트림에서 데이터를 꺼내온다.
    record = cursor.fetchone()
    print(record)

    con.commit()
    con.close()

    #3. sql문을 실행
    return record

def insert(id, pw, name, tel):
    #1. connector를 통해 db연결
    con = my.connect(host='localhost', user='root', password='1234', db='phone')
    cursor = con.cursor() #연결스트림을 만든다.!

    #2. sql문을 결정

    sql = "insert into member2 values ('"+id+"','python','python','python')"
    cursor.execute(sql)
    print('sql문 실행 요청됨.!!!')

    con.commit()
    con.close()

    #3. sql문을 실행