def add(x, y):
    result = x + y
    print('더해요.>> ', result)

def minus(x, y):
    result = x - y
    print('빼요.>> ', result)

if __name__ == '__main__':
    print('환영합니다. 계산기를 사용중입니다.')
    add(200, 100)
    minus(200, 100)