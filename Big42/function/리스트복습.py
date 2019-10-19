#리스트
food = ['라면', '초코파이', '오예스', '김밥']

#값 수정
# food[0] = '우동'
# print(food)
# print(food[:2])
# print(food[2:])

drink = ['커피', '물', '주스']
print(food)
print(drink)
print(food + drink)

drink2 = drink * 2 #반복
print(drink2)

del drink[2]
print(drink)

drink.append('사과주스')
print(drink)

drink.append(['오렌지주스', '키위주스'])
print(drink)

drink.reverse()
print(drink)









