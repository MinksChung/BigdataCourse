import tkinter as tk

w = tk.Tk()
text = tk.Text()
text.insert(tk.CURRENT, '안녕하세요.\n')
text.insert(tk.CURRENT, '안녕하세요.\n')
text.insert(tk.CURRENT, '안녕하세요.\n')
text.pack()

text2 = tk.Text()
text2.insert(tk.CURRENT, '안녕하세요.\n')
text2.insert(tk.CURRENT, '안녕하세요.\n')
text2.insert(tk.CURRENT, '안녕하세요.\n')
text2.pack()
w.mainloop()