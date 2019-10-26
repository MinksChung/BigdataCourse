# 크롤링 하고자 하는 사이트와 연결 시키기 위한 request
from urllib import request
# 크롤링 사이트의 모든 정보(html)을 가져오기 위한 BeautifulSoup
from bs4 import BeautifulSoup
# 크롤링 하고자 하는 사이트와 연결 시키기 위한 requests
import requests
# 데이터 프레임을 사용하기 위한 pandas
import pandas as pd

# def naverBook():
print("네이버'책' 크롤링을 시작합니다.")
#   1. 네트워크를 네이버'책'으로 접속
url = "https://book.naver.com/bestsell/bestseller_list.nhn?cp=yes24&cate=001001010&bestWeek=2019-10-3&indexCount=9&type=list"
result = requests.get(url)
print("인터넷 연결 성공>> ", result)
print("------------------------------------------------------")

#   2. 접속한 네이버 문서 분석. 태그/클래스/id로 크롤링 가능
content = BeautifulSoup(result.content, "html.parser")
# print(content)

titles = content.select("li>dl>dt>a")  # '책 제목'크롤링 결과를 할당
# print(titles)
price1 = content.select("dd.txt_desc del.price_off")  # '할인 전 책 가격' 크롤링 결과를 할당
# print(price1)
price2 = content.select("dd.txt_desc em.price")  # '할인 후 책 가격' 크롤링 결과를 할당
# print(price2)

# '책 제목'크롤링 결과를 리스트에 할당
titles_list = []
for t in titles:
    # print(x.string) # 자바의 .get().text()와 동일
    titles_list.append(t.text)
# print(titles_list)

# '할인 전 책 가격'크롤링 결과를 리스트에 할당
price1_list = []
for p1 in price1:
    # print(x.string) # 자바의 .get().text()와 동일
    price1_list.append(p1.text)
# print(price1_list)

# '할인 후 책 가격'크롤링 결과를 리스트에 할당
price2_list = []
for p2 in price2:
    # print(x.string) # 자바의 .get().text()와 동일
    price2_list.append(p2.text)
# print(price2_list)

df = pd.DataFrame({"책제목": titles_list, "할인전가격": price1_list, "할인후가격": price2_list})
print("=========================================================================================")
print("데이터 프레임 출력")
print("-----------------------------------------------------------------------------------------")
print(df)
print("=========================================================================================")

# 데이터 정렬(할인 후 책가격이 낮은 순으로) 후 출력
print("=========================================================================================")
print("'할인후가격'이 낮은 순으로 출력 ")
print("-----------------------------------------------------------------------------------------")
print(df.sort_values(by="할인후가격", ascending=True))
print("=========================================================================================")

# 타입파악을 위해 테이블 정보 출력
print("=========================================================================================")
print("타입을 알아보기 위해 테이블 정보 출력")
print("-----------------------------------------------------------------------------------------")
print(df.info())
print("=========================================================================================")

# 상세설명 파악을 위해 테이블 정보 출력
print("=========================================================================================")
print("상세정보 파악을 위해 테이블 정보 출력")
print("-----------------------------------------------------------------------------------------")
print(df.describe())
print("=========================================================================================")

# 각 컬럼  출력
print("=========================================================================================")
print("컬럼명 출력")
print("-----------------------------------------------------------------------------------------")
print(df.columns) # 컬럼명 출력
print("-----------------------------------------------------------------------------------------")
print("각 칼럼 출력")
print("-----------------------------------------------------------------------------------------")
print(df["책제목"])
print(df["할인전가격"])
print(df["할인후가격"])
print("=========================================================================================")

# 몇 행 출력
print("=========================================================================================")
print("6위부터 15위까지 출력")
print("-----------------------------------------------------------------------------------------")
print(df[6:16])

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

# plt.figure(figsize=(15, 5))
# plt.plot(df["책제목"][6:13], df["할인전가격"][6:13])
# plt.plot(df["책제목"][6:13], df["할인후가격"][6:13])
# plt.plot(titles_list[6:13], price2_list[6:13])
# plt.show()

#########################################################

import matplotlib
import matplotlib.pyplot as plt
import numpy as np


# labels = ['G1', 'G2', 'G3', 'G4', 'G5']
# men_means = [20, 34, 30, 35, 27]
# women_means = [25, 32, 34, 20, 25]

x = np.arange(len(titles_list))  # the label locations
width = 0.35  # the width of the bars

fig, ax = plt.subplots()
rects1 = ax.bar(x - width/2, price1_list, width, label='할인"전"가격')
rects2 = ax.bar(x + width/2, price2_list, width, label='할인"후"가격')

# Add some text for labels, title and custom x-axis tick labels, etc.
ax.set_ylabel('Scores')
ax.set_title('Scores by group and gender')
ax.set_xticks(x)
ax.set_xticklabels(titles_list)
ax.legend()


def autolabel(rects):
    """Attach a text label above each bar in *rects*, displaying its height."""
    for rect in rects:
        height = rect.get_height()
        ax.annotate('{}'.format(height),
                    xy=(rect.get_x() + rect.get_width() / 2, height),
                    xytext=(0, 3),  # 3 points vertical offset
                    textcoords="offset points",
                    ha='center', va='bottom')


autolabel(rects1)
autolabel(rects2)

fig.tight_layout()

plt.show()
##########################################################################

# import matplotlib.pyplot as plt
# import numpy as np
#
# # Fixing random state for reproducibility
# # np.random.seed(19680801)
#
#
# x = df["할인전가격"].sort_values(ascending=True)
# y = df["할인후가격"].sort_values(ascending=True)
# # y = x ** 1.3 + np.random.rand(*x.shape) * 30.0
# # s = np.random.rand(*x.shape) * 800 + 500
#
#
# plt.scatter(x, y, c="g", alpha=0.5, marker=r'$\clubsuit$',
#             label="Price")
# plt.xlabel("할인'전'가격")
# plt.ylabel("할인'후'가격")
# plt.legend(loc='upper left')
# plt.show()