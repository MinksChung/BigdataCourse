count1 = 0
count2 = 0
count3 = 0

print("인기투표 시스템")
print("------------------------------")
print("1)최지수 2)BTS 3)아이유")
print("------------------------------")
exit = True
while exit:
    ip = input("입력>>    ")
    if (ip == "1"):
        count1 += 1
    if (ip == "2"):
        count2 += 1
    if (ip == "3"):
        count3 += 1
    if (ip == "4"):
        print()
        print("최지수 : ", count1 , "BTS : ", count2, "아이유 : ", count3)
        exit = False


