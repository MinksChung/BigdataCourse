dic = {'apple' : '사과', 'banana' : '바나나'}
print(dic['apple'])
print(dic)

#딕셔너리에 키와 값을 넣고자 하는 경우
#딕셔너리이름[키] = 값
dic['melon'] = '메론'
print(dic)

del dic['apple']
print(dic)

dic['like'] = ['아이스크림', '케잌']
print(dic)
print('----------')


#값만 프린트
for x in dic.values():
    print(x)

#키만 프린트
for x in dic.keys():
    print(x)

dic_list = list(dic.keys())
print(dic_list)

print(dic.items())

# dic.clear()
# print(dic)

#값을 찾아 오는 것.
print(dic.get('banana'))
print(dic['like'])

print('like' in dic)

jumin_no = '881120-1068234'
print(jumin_no[7])