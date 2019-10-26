# -*- coding: utf-8 -*-
"""영화평점.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1DW4r811xF6LeosWnyBY14EKGUt7mLRsp
"""

import urllib
import pandas as pd
import requests
from bs4 import BeautifulSoup

url = "https://movie.naver.com/movie/running/current.nhn"
result = requests.get(url)
# print(result)

content = BeautifulSoup(result.content, "html.parser")
# print(content)

dt_list = content.findAll("dt", {"class":"tit"}) # find : 돔트리 형태로 가져옴. 단계별로 find를 계속 써줘야 함
# print(dt_list)

# print(dt_list[0].find("a").text)

title = []
for dt in dt_list:
  title.append(dt.find("a").text)
# print(title)

# print(len(title))

# select : find와 달리 엑스패스(돔트리를 타고 내려오는 경로)를 사용하여 바로 접근 가능
# " " 자손으로 바로 접근 가능, > 바로 밑의 자식만 접근 가능
score_list = content.select("dl.info_star dd div.star_t1 a span.num")
# print(score_list)

# print(len(score_list))

scores = []
for score in score_list:
  scores.append(float(score.text))
# print(scores)


df = pd.DataFrame({"영화이름" : title, "영화평점" : scores})
# print(df)

# print("================================================================================")
#
# # 앞에서 3개 프린트
# print("앞에서 3개 프린트")
# print("--------------------------------------------------------------------------------")
# print(df.head(3))
# print("================================================================================")
#
# # 컬럼명 프린트
# print("칼럼명 프린트")
# print("--------------------------------------------------------------------------------")
# print(df.columns)
# print("================================================================================")
#
# # 값들 프린트
# print("값들 프린트")
# print("--------------------------------------------------------------------------------")
# print(df.values)
# print("================================================================================")
#
# # 자세한 설명 프린트
# print("자세한 설명 프린트")
# print("--------------------------------------------------------------------------------")
# print(df.describe())
# print("================================================================================")
#
# # 데이터 타입 프린트
# print("데이터 타입 프린트")
# print("--------------------------------------------------------------------------------")
# print(df.info())
# print("================================================================================")
#
# # 영화명 추출 프린트
# print("영화명 추출 프린트")
# print("--------------------------------------------------------------------------------")
# print(df["영화이름"])
# print("================================================================================")
#
# # 평점 추출 프린트
# print("평점 추출 프린트")
# print("--------------------------------------------------------------------------------")
# print(df["영화평점"])
# print("================================================================================")
#
# # 평점이 높은 순서로 정렬
# print("평점이 높은 순서로 정렬")
# print("--------------------------------------------------------------------------------")
# print(df.sort_values(by="영화평점", ascending=False))  # 인스턴스 정렬(by="컬럼명", 오름내림차순설정)
# print("================================================================================")
#
# # 10번부터 10개의 행 추출
# print("10번부터 10개의 행 추출")
# print("--------------------------------------------------------------------------------")
# print(df[10:21])
# print("================================================================================")

import matplotlib.pyplot as plt
# %matplotlib inline


#########################################################

## 한글 깨짐 관련
import platform
from matplotlib import font_manager, rc

plt.rcParams['axes.unicode_minus'] = False

if platform.system() == 'Darwin':
    rc('font', family='AppleGothic')
elif platform.system() == 'Windows':
    path = "c:/Windows/Fonts/malgun.ttf"
    font_name = font_manager.FontProperties(fname=path).get_name()
    rc('font', family=font_name)
else:
    print('Unknown system... sorry~~~~')

#########################################################

plt.figure(figsize=(15, 6))
plt.plot(df["영화이름"][0:8], df["영화평점"][0:8])
# plt.plot(title[:8], scores[:8])
plt.show()