secret = ('1234', 'pass', '비밀번호')
# secret[0] = '3456' 수정 불가, 읽기 전용
# 수정을 하고 싶은 경우에는 list로 변경해서 사용!
print(secret)
secret2 = list(secret)
secret2[0] = '3456'
print(secret2)

# 다시 읽기 전용으로 하고 싶은 경우에는 tuple로 변경
secret3 = tuple(secret2)

# 튜플의 개수
print(len(secret3))
print(secret3.count('3456'))

for x in secret3:
    print(x)

