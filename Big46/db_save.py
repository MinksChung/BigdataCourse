import pymysql as my

# insert 함수
def insert(title, singer, img):
    # 1. connector를 통해 db연결
    # mysql과 연결
    con = my.connect(host="localhost", user="root", password="1234", db="phone")
    cursor = con.cursor()  # 연결스트링을 만든다 # cursor 를 통해 sql문을 실행

    # 2. sql문을 결정
    for x in range(0, 50): # 리스트들의 개수 만큼 반복하여 리스트 하나씩 sql실행하여 insert
        sql = "insert into navermusic values (null, '" + title[x] + "', '" + singer[x] + "', '" + img[x] + "')"
        cursor.execute(sql)
    print("sql문 실행 요청 완료!!!!!")

    # 3. sql문을 실행
    con.commit()
    con.close()
