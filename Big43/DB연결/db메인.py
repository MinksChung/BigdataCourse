# from DB연결 import db연결테스트2
import  DB연결.db연결테스트2 as db2

from tkinter import *

# 파일로 '저장' 버튼 누를 때 실행 되는 함수 생성
def save():
    i_id = id_text.get()  # text로 입력받은 'id' 가져오기
    i_pw = pw_text.get()  # text로 입력받은 'pw' 가져오기
    i_name = name_text.get()  # text로 입력받은 'name' 가져오기
    i_tel = tel_text.get()  # text로 입력받은 'tel' 가져오기

    # # 입력 받은 데이터를 txt파일로 저장하기
    # file = open(i_id + ".txt", "w") # txt파일로 저장시킬 python과 txt파일 간의 통로(stream) 만들기
    # # open("저장할 변수명.txt", "write함수 사용시에는 : w")
    # file.write(i_id + "\n")
    # file.write(i_pw + "\n" )
    # file.write(i_name + "\n")
    # file.write(i_tel + "\n")
    # file.close() # python과 txt파일 간의 통로(stream) 닫기

    db2.insert(i_id, i_pw, i_name, i_tel)

# # 파일로 '읽기' 버튼 누를 때 실행 되는 함수 생성
# def read():
#     i_id = id_text.get() # text로 입력받은 '날짜' 가져오기
#
#     # 텍스트란에 입력되어 있는 내용 지우기
#     # 검색 후 검색 버튼을 한번 더 누르면 텍스트란의 결과를 삭제. 재검색시 편의성을 위해
#     id_text.delete(0, END) # 텍스트란의 맨앞(0) 부터 끝(END)까지 지우기
#     pw_text.delete(0, END)
#     name_text.delete(0, END)
#     tel_text.delete(0, END)
#
#     # txt파일로 저장된 데이터를 읽어오기
#     file = open(i_id + ".txt", "r") # txt파일을 읽기 위한 python과 txt파일 간의 통로(stream) 만들기
#                                       # open("저장할 변수명.txt", "readline함수 사용시에는 : r")
#     id_line = file.readline() # readline() 한줄 씩 읽어오기
#     pw_line = file.readline()
#     name_line = file.readline()
#     tel_line = file.readline()
#     file.close() # python과 txt파일 간의 통로(stream) 닫기
#
#     # 읽어온 데이터를 텍스트란에 출력해주기
#     id_text.insert(0, id_line) # 텍스트란의 맨앞(0) 부터 변수값을 넣어주기
#     pw_text.insert(0, pw_line)
#     name_text.insert(0 , name_line)
#     tel_text.insert(0 , tel_line)

w = Tk()
w.geometry("500x900") # 크기 설정
w.config(bg = "white") # 배경색 설정

# 이미지 넣기
# icon = PhotoImage(file = "dacun.png")
# img_label = Label(w, image = icon)
# img_label.pack()

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

# pw 라벨 생성
pw_label = Label(w, text = "비밀번호 :",
                 font = ("오이", 30),
                 bg = "white",
                 fg = "black")
pw_label.pack() # flowLayout 과 동일

# pw 텍스트(입력란) 생성
pw_text = Entry(w,
                 font = ("오이", 30),
                 bg = "yellow",
                 fg = "blue")
pw_text.pack() # flowLayout 과 동일

# name 라벨 생성
name_label = Label(w, text = "이름 :",
                 font = ("오이", 30),
                 bg = "white",
                 fg = "black")
name_label.pack() # flowLayout 과 동일

# name 텍스트(입력란) 생성
name_text = Entry(w,
                 font = ("오이", 30),
                 bg = "yellow",
                 fg = "blue")
name_text.pack() # flowLayout 과 동일

# tel 라벨 생성
tel_label = Label(w, text = "전화번호 :",
                 font = ("오이", 30),
                 bg = "white",
                 fg = "black")
tel_label.pack() # flowLayout 과 동일

# tel 텍스트(입력란) 생성
tel_text = Entry(w,
                 font = ("오이", 30),
                 bg = "yellow",
                 fg = "blue")
tel_text.pack() # flowLayout 과 동일

# 버튼 생성

save_button = Button(w, text = "파일로 저장",
                     font = ("오이", 30),
                     bg = "green",
                     command = save)
save_button.pack() # flowLayout 과 동일
read_button = Button(w, text = "파일로 읽기",
                     font = ("오이", 30),
                     bg = "green",
                     command = "")
read_button.pack() # flowLayout 과 동일

w.mainloop() # setVisible

