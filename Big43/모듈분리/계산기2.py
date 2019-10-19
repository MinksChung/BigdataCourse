def add(x, y):
    result = x + y
    print("더해요>>    ", result)

def minus(x, y):
    result = x - y
    print("빼요>>      ", result)

# main 부분은 현재 파일에서만 실행됨
# main 선언이 없고 함수를 호출할 시 다른 파일에서 import하여 모듈로 호출시 같이 실행됨. 주의!!
if __name__ == '__main__':
    print("환영합니다. 계산기를 사용중입니다.")
    add(200, 100)
    minus(200, 100)

