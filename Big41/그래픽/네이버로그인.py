from tkinter import *
from tkinter.messagebox import *

def login():
    g_id = id_text.get()
    g_pw = pw_text.get()
    showinfo('입력한 id ', g_id)
    showinfo('입력한 pw ', g_pw)

w = Tk()
w.geometry('500x400')
w.configure(bg='lime')

id_label = Label(w, text='사용자 ID입력',
                 font=('맑은 고딕', 30),
                 bg = 'lime', #배경색
                 fg = 'blue' #글자색
                )
id_label.pack()

id_text = Entry(w,
                 font=('맑은 고딕', 30),
                 bg = 'yellow', #배경색
                 fg = 'red' #글자색
                )
id_text.pack()


pw_label = Label(w, text='사용자 Pw입력',
                 font=('맑은 고딕', 30),
                 bg = 'lime', #배경색
                 fg = 'blue' #글자색
                )
pw_label.pack()

pw_text = Entry(w,
                 font=('맑은 고딕', 30),
                 bg = 'yellow', #배경색
                 fg = 'red' #글자색
                )
pw_text.pack()

icon = PhotoImage(file='naver.png')
button = Button(w, image=icon, command=login)
button.pack()


w.mainloop()

