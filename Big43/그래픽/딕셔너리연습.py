dic = {'아이유':0, '유재석':0}

dic['아이유'] = dic['아이유']+1
print(dic['아이유'])

file = open('result.txt', 'w')
file.write('아이유: ' + str(dic['아이유']) + '\n')
file.write('유재석: ' + str(dic['유재석']) + '\n')
file.close()

keys = dic.keys()
print(keys)

keys_list = list(keys)
print(keys_list)

