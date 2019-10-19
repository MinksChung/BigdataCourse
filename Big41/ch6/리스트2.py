items = ['신발', '블라우스', '바지', '모자']

# 1.바지를 프린트
print(items[2]) #2

# 2.바지, 모자를 프린트
print(items[2:]) #2~끝

# 3.전체를 프린트
print(items)

# 4.블라우스, 바지, 모자를 프린트
print(items[1:]) #1~끝

# 5.신발, 블라우스를 프린트
print(items[:2]) #0~1

# 리스트의 개수
print('리스트의 개수 ', len(items)) #리스트의 개수
print('리스트내 항목의 개수 ', items.count('신발')) #리스트내 항목의 개수

print('항목이 들어간 위치값 ', items.index('모자')) #3

# 삭제
items.remove('신발')
print(items)
del items[0]
print(items)
