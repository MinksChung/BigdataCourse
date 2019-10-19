from tkinter import *
from tkinter.messagebox import *

def read():
    g_day = day_input.get()
    # g_title = title_input.get()
    # g_content = content_input.get()
    # result = g_day + " " + g_title + " " + g_content
    # showinfo("결과 화면", result)

    day_input.delete(0, END)
    title_input.delete(0, END)
    content_input.delete(0, END)

    file = open(g_day + ".txt", 'r')
    day_line= file.readline()
    title_line= file.readline()
    content_line= file.readline()
    file.close()

    day_input.insert(0, day_line)
    title_input.insert(0, title_line)
    content_input.insert(0, content_line)


def save():
    g_day = day_input.get()
    g_title = title_input.get()
    g_content = content_input.get()

    file = open(g_day+'.txt', 'w')
    file.write(g_day + '\n')
    file.write(g_title + '\n')
    file.write(g_content + '\n')
    file.close()


def diary():
    w = Tk()
    #라벨 4개

    img = PhotoImage(file='001.png')
    top = Label(w, image=img)
    top.pack()

    day = Label(w, text = '날짜:',
                font = ('궁서', 30)
                )
    title = Label(w, text = '제목:',
                font = ('궁서', 30)
                )
    content = Label(w, text = '내용:',
                font = ('궁서', 30)
                )
    #입력 3개
    day_input = Entry(w,
                      font=('궁서', 30),
                      bg='yellow'
                      )
    title_input = Entry(w,
                      font=('궁서', 30),
                      bg='yellow'
                      )
    content_input = Entry(w,
                      font=('궁서', 30),
                      bg='yellow'
                      )

    #버튼 2개
    save = Button(w, text='파일로 저장',
                     font=('궁서', 30),
                     bg='lime',
                     command=save
                )
    read = Button(w, text='파일로 읽기',
                     font=('궁서', 30),
                     bg='lime',
                     command=read
                )

    day.pack()
    day_input.pack()
    title.pack()
    title_input.pack()
    content.pack()
    content_input.pack()
    save.pack()
    read.pack()

    w.mainloop()