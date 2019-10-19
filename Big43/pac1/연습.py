from tkinter import *

#과일 = ["apple", "banana", "melon"]

# '저장' 버튼 누를 때 실행 되는 함수 생성
def write():
    i_list = list_text.get() # text로 입력받은 '리스트명' 가져오기
    i_food1 = food1_text.get() # text로 입력받은 '첫번째 과일명' 가져오기
    i_food2 = food2_text.get() # text로 입력받은 '두번째 과일명' 가져오기
    i_food3 = food3_text.get() # text로 입력받은 '세번째 과일명' 가져오기

    # 입력 받은 데이터를 txt파일로 저장하기
    file = open(i_list + ".txt", "w") # txt파일로 저장시킬 python과 txt파일 간의 통로(stream) 만들기
                                      # open("저장할 변수명.txt", "write함수 사용시에는 : w")
    file.write(i_list + "\n")
    file.write(i_food1 + "\n")
    file.write(i_food2 + "\n")
    file.write(i_food3 + "\n")
    file.close() # python과 txt파일 간의 통로(stream) 닫기

# '읽기(스캔)' 버튼 누를 때 실행 되는 함수 생성
def read():
    i_list = list_text.get() # text로 입력받은 '리스트명' 가져오기

    # 텍스트란에 입력되어 있는 내용 지우기
    # 검색 후 검색 버튼을 한번 더 누르면 텍스트란의 결과를 삭제. 재검색시 편의성을 위해
    list_text.delete(0, END) # 텍스트란의 맨앞(0) 부터 끝(END)까지 지우기
    food1_text.delete(0, END)
    food2_text.delete(0, END)
    food3_text.delete(0, END)

    # txt파일로 저장된 데이터를 읽어오기
    file = open(i_list + ".txt", "r") # txt파일을 읽기 위한 python과 txt파일 간의 통로(stream) 만들기
                                      # open("저장할 변수명.txt", "readline함수 사용시에는 : r")
    read_list = file.readline() # readline() 한줄 씩 읽어오기
    read_food1 = file.readline()
    read_food2 = file.readline()
    read_food3 = file.readline()
    file.close() # python과 txt파일 간의 통로(stream) 닫기

    # 읽어온 데이터를 텍스트란에 출력해주기
    list_text.insert(0, read_list) # 텍스트란의 맨앞(0) 부터 변수값을 넣어주기
    food1_text.insert(0, read_food1)
    food2_text.insert(0, read_food2)
    food3_text.insert(0, read_food3)

w = Tk()
w.geometry("600x600") # 크기 설정
w.config(bg = "white") # 배경색 설정

# 리스트명
list_label = Label(w, text = "리스트명 입력 :",
                    font = ("오이", 30),
                    bg = "white",
                    fg = "black")
list_label.pack() # flowLayout 과 동일

list_text = Entry(w,
                    font = ("오이", 30),
                    bg = "orange",
                    fg = "blue"
                   )
list_text.pack() # flowLayout 과 동일

# 첫번째 과일
food1_label = Label(w, text = "첫번째 과일 입력 :",
                    font = ("오이", 30),
                    bg = "white",
                    fg = "black")
food1_label.pack() # flowLayout 과 동일

food1_text = Entry(w,
                    font = ("오이", 30),
                    bg = "pink",
                    fg = "blue"
                   )
food1_text.pack() # flowLayout 과 동일

# 두번째 과일
food2_label = Label(w, text = "두번째 과일 입력 :",
                    font = ("오이", 30),
                    bg = "white",
                    fg = "black")
food2_label.pack() # flowLayout 과 동일

food2_text = Entry(w,
                    font = ("오이", 30),
                    bg = "pink",
                    fg = "blue"
                   )
food2_text.pack() # flowLayout 과 동일

# 세번째 과일
food3_label = Label(w, text = "세번째 과일 입력 :",
                    font = ("오이", 30),
                    bg = "white",
                    fg = "black")
food3_label.pack() # flowLayout 과 동일

food3_text = Entry(w,
                    font = ("오이", 30),
                    bg = "pink",
                    fg = "blue"
                   )
food3_text.pack() # flowLayout 과 동일

# 저장 버튼
save_button = Button(w, text = "내 마음속에 저~어~장",
                     command = write,
                     font=("오이", 30),
                     bg="lime",
                     fg="black"
                     )
save_button.pack() # flowLayout 과 동일

# 읽기 버튼
read_button = Button(w, text = "니 마음속을 스~으~캔",
                     command = read,
                     font=("오이", 30),
                     bg="lime",
                     fg="black"
                     )
read_button.pack() # flowLayout 과 동일


w.mainloop() # setVisible

