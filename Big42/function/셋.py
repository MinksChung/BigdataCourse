set1 = set([1, 2, 3, 3])
print(set1)

set2 = set([1, 2, 3, 4, 5])
set3 = set([6, 7, 8, 2, 3])
#합집합(union, |)을 구해보세요.
print(set2 | set3)
#교집합(intersection, &)을 구해보세요.
print(set2 & set3)
#차집합(difference, -)를 구해보세요. set2-set3
print(set2 - set3)

#한 개 추가 set2에 6을 추가(add)
set2.add(6)
print(set2)

#여러 개 추가 set2에 8, 9를 추가(update)
set2.update([8, 9])
print(set2)

#삭제하기 set2에서 6제거(remove)
set2.remove(6)
print(set2)

# set2.reverse()
# print(set2)