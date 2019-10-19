import turtle
import random

t = turtle.Turtle('turtle')
colors = ['red', 'blue', 'pink', 'yellow']

while True:
    selection = random.randint(0, 3)
    t.pencolor(colors[selection])


    direction = input('왼쪽: l, 오른쪽: r >> ')
    if direction == 'l':
        t.left(45)
        t.forward(45)
    if direction == 'r':
        t.right(45)
        t.forward(45)


