# 어제 파티 참석자 '집합'
y = set(["홍길동", "박길동", "김길동"])

# 오늘 파티 참석자 '집합'
t = set(["홍길동", "정길동", "이길동"])

# 1. 어제/오늘 각각 파티에 참석한 명단 출력
print("1. 어제/오늘 각각 파티에 참석한 명단 출력")
print("--------------------------------------------------------")
print("어제 파티에 참석한 사람")
print(y)
print("--------------------------------------------------------")
print("오늘 파티에 참석한 사람")
print(t)
print("--------------------------------------------------------")
print()

# 2. 어제/오늘 모두 참석한 사람 출력
print("2. 어제/오늘 모두 참석한 사람 출력")
print("--------------------------------------------------------")
print(y.intersection(t)) # 교집합 (y & t)
print("--------------------------------------------------------")
print()

# 3. 어제/오늘 참석한 사람 출력
print("3. 어제/오늘 참석한 사람 출력")
print("--------------------------------------------------------")
print(y.union(t)) #합집합 (y | t)
print("--------------------------------------------------------")
print()

# 4. 3번의 인원수
print("3번의 인원수")
print("--------------------------------------------------------")
# len() : 리스트, 튜플, 딕셔너리, 집합의 요소수
print("어제/오늘 참석한 사람의 수 : ", len(y.union(t)))
print("--------------------------------------------------------")