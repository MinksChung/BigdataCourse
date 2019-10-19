#값을 이미 알고 있는 경우
names = ['홍길동','김길동','박길동']

#리스트를 출력하는 방법-1: 반복문을 사용
# for x in names:
#     print(x, end=" ")

#리스트를 출력하는 방법-1: 리스트 이름을 사용
print(names)

#인덱싱: 인덱스를 이용해서 값에 접근하여 추출
print(names[0])

#슬라이싱: 인덱스의 범위를 이용해서 값들에 접근하여 추출
print(names[0:2]) #0부터 1까지 슬라이싱
print(names[:]) #맨앞부터 맨끝까지
print(names[1:]) #1부터 맨끝까지
print(names[:2]) #맨앞부터 1까지



