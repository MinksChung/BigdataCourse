# from DB연결 import db연결테스트3
import  DB연결.db연결테스트3 as db3

from tkinter import *

# '게시물 입력' 버튼 누를 때 실행 되는 함수 생성
def save():
    i_id = id_text.get()  # text로 입력받은 'id' 가져오기
    i_title = title_text.get()  # text로 입력받은 'title' 가져오기
    i_content = content_text.get()  # text로 입력받은 'content' 가져오기
    i_writer = writer_text.get()  # text로 입력받은 'writer' 가져오기

    # db연결테스트3.py에서 정의한 insert함수 호출
    db3.insert(i_id, i_title, i_content, i_writer)

# '게시물 검색' 버튼 누를 때 실행 되는 함수 생성
def readone():
    i_id = id_text.get() # text로 입력받은 'id' 가져오기

    # db연결테스트3.py에서 정의한 select함수 호출
    # db연결테스트3.py에서 return 해준 record값을 변수 record에 할당
    record = db3.select(i_id)

    # select함수 실행 결과 출력
    print("----------------------------------------------")
    print("입력하신", id, "로 검색한 결과입니다 !!")
    print("----------------------------------------------")
    print("검색한 ID : ", record[0])
    print("검색한 TITLE : ", record[1])
    print("검색한 CONTENT : ", record[2])
    print("검색한 WRITER : ", record[3])
    print("----------------------------------------------")

# '게시물 전체 검색' 버튼 누를 때 실행 되는 함수 생성
def readall():
    # db연결테스트3.py에서 정의한 selectAll함수 호출
    # db연결테스트3.py 에서 return 해준 records값을 변수 records에 할당
    records = db3.selectAll()

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

w = Tk()
w.geometry("500x900") # 크기 설정
w.config(bg = "white") # 배경색 설정

# id 라벨 생성
id_label = Label(w, text = "아이디 :",
                 font = ("오이", 30),
                 bg = "white",
                 fg = "black")
id_label.pack() # flowLayout 과 동일

# id 텍스트(입력란) 생성
id_text = Entry(w,
                 font = ("오이", 30),
                 bg = "yellow",
                 fg = "blue")
id_text.pack() # flowLayout 과 동일

# title 라벨 생성
title_label = Label(w, text = "글제목 :",
                 font = ("오이", 30),
                 bg = "white",
                 fg = "black")
title_label.pack() # flowLayout 과 동일

# title 텍스트(입력란) 생성
title_text = Entry(w,
                 font = ("오이", 30),
                 bg = "yellow",
                 fg = "blue")
title_text.pack() # flowLayout 과 동일

# content 라벨 생성
content_label = Label(w, text = "글내용 :",
                 font = ("오이", 30),
                 bg = "white",
                 fg = "black")
content_label.pack() # flowLayout 과 동일

# content 텍스트(입력란) 생성
content_text = Entry(w,
                 font = ("오이", 30),
                 bg = "yellow",
                 fg = "blue")
content_text.pack() # flowLayout 과 동일

# writer 라벨 생성
writer_label = Label(w, text = "작성자 :",
                 font = ("오이", 30),
                 bg = "white",
                 fg = "black")
writer_label.pack() # flowLayout 과 동일

# writer 텍스트(입력란) 생성
writer_text = Entry(w,
                 font = ("오이", 30),
                 bg = "yellow",
                 fg = "blue")
writer_text.pack() # flowLayout 과 동일


# '입력' 버튼 생성
save_button = Button(w, text = "게시물 입력",
                     font = ("오이", 30),
                     bg = "green",
                     command = save)
save_button.pack() # flowLayout 과 동일

# '검색' 버튼 생성
read_button = Button(w, text = "게시물 검색",
                     font = ("오이", 30),
                     bg = "green",
                     command = readone)
read_button.pack() # flowLayout 과 동일

# '전체 검색' 버튼 생성
read_button = Button(w, text = "게시물 전체 검색",
                     font = ("오이", 30),
                     bg = "green",
                     command = readall)
read_button.pack() # flowLayout 과 동일

w.mainloop() # setVisible

