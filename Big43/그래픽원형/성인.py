def aa():
    exit = True
    while exit:
        age = int(input("당신의 만 나이는?     "))
        if (age > 19):
            print("당신은 '성인'입니다")
        else:
            print("당신은 '미성년자'입니다")
        if (age > 100):
            exit = False