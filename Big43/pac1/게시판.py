from tkinter import *
from tkinter.messagebox import *

# 파일로 '저장' 버튼 누를 때 실행 되는 함수 생성
def save():
    i_date = date_text.get()  # text로 입력받은 '날짜' 가져오기
    i_title = title_text.get()  # text로 입력받은 '제목' 가져오기
    i_content = content_text.get()  # text로 입력받은 '내용' 가져오기

    # 입력 받은 데이터를 txt파일로 저장하기
    file = open(i_date + ".txt", "w") # txt파일로 저장시킬 python과 txt파일 간의 통로(stream) 만들기
                                      # open("저장할 변수명.txt", "write함수 사용시에는 : w")
    file.write(i_date + "\n")
    file.write(i_title + "\n" )
    file.write(i_content + "\n")
    file.close() # python과 txt파일 간의 통로(stream) 닫기


# 파일로 '읽기' 버튼 누를 때 실행 되는 함수 생성
def read():
    i_date = date_text.get() # text로 입력받은 '날짜' 가져오기
    # i_title = title_text.get() # text로 입력받은 '제목' 가져오기
    # i_content = content_text.get() # text로 입력받은 '내용' 가져오기

    # showinfo : tkinter.massagebox에 존재. 자바의 showInputDialog 기능과 동일
    # showinfo("입력한 날짜", i_date)
    # showinfo("입력한 제목", i_title)
    # showinfo("입력한 내용", i_content)

    # 텍스트란에 입력되어 있는 내용 지우기
    # 검색 후 검색 버튼을 한번 더 누르면 텍스트란의 결과를 삭제. 재검색시 편의성을 위해
    date_text.delete(0, END) # 텍스트란의 맨앞(0) 부터 끝(END)까지 지우기
    title_text.delete(0, END)
    content_text.delete(0, END)

    # txt파일로 저장된 데이터를 읽어오기
    file = open(i_date + ".txt", "r") # txt파일을 읽기 위한 python과 txt파일 간의 통로(stream) 만들기
                                      # open("저장할 변수명.txt", "readline함수 사용시에는 : r")
    date_line = file.readline() # readline() 한줄 씩 읽어오기
    title_line = file.readline()
    content_line = file.readline()
    file.close() # python과 txt파일 간의 통로(stream) 닫기

    # 읽어온 데이터를 텍스트란에 출력해주기
    date_text.insert(0, date_line) # 텍스트란의 맨앞(0) 부터 변수값을 넣어주기
    title_text.insert(0, title_line)
    content_text.insert(0 ,content_line)

    # print("입력한 날짜 : ", i_date)
    # print("입력한 제목 : ", i_title)
    # print("입력한 내용 : ", i_content)

w = Tk()
w.geometry("500x900") # 크기 설정
w.config(bg = "white") # 배경색 설정

# 이미지 넣기
icon = PhotoImage(file = "dacun.png")
img_label = Label(w, image = icon)
img_label.pack()

# date 라벨 생성
date_label = Label(w, text = "날짜 :",
                 font = ("오이", 30),
                 bg = "white",
                 fg = "black")
date_label.pack() # flowLayout 과 동일

# date 텍스트(입력란) 생성
date_text = Entry(w,
                 font = ("오이", 30),
                 bg = "yellow",
                 fg = "blue")
date_text.pack() # flowLayout 과 동일

# title 라벨 생성
title_label = Label(w, text = "제목 :",
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
content_label = Label(w, text = "내용 :",
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

# 버튼 생성

save_button = Button(w, text = "파일로 저장",
                     font = ("오이", 30),
                     bg = "green",
                     command = save)
save_button.pack() # flowLayout 과 동일
read_button = Button(w, text = "파일로 읽기",
                     font = ("오이", 30),
                     bg = "green",
                     command = read)
read_button.pack() # flowLayout 과 동일







w.mainloop() # setVisible