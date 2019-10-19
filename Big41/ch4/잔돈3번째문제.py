물건값 = int(input('물건값>> '))
받은돈 = int(input('받은돈>> '))
잔돈 = 받은돈 - 물건값

print('잔돈 전체금액은 >> ', 잔돈)

count10000 = int(잔돈 / 10000)
count5000 = int(잔돈 / 5000)
count1000 = int(잔돈 / 1000)

rest5000 = 잔돈 - count10000 * 10000
count50002 = int(rest5000 / 5000)
rest1000 = rest5000 - count50002 * 5000
count10002 = int(rest1000 / 1000)


print('잔돈 내역')
print('---------------------')
if 잔돈 >= 10000:
    print('만원짜리 ', int(count10000), '장')
    print('오천원짜리 ', int(count50002), '장')
    print('천원짜리 ', int(count10002), '장')
elif 5000 <= 잔돈 < 10000:
    print('오천원짜리 ', int(count5000), '장')
    print('천원짜리 ', int(count10002), '장')
else:
    print('천원짜리 ', int(count1000), '장')
