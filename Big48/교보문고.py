# 크롤링 하고자 하는 사이트와 연결 시키기 위한 request
from urllib import request
# 크롤링 사이트의 모든 정보(html)을 가져오기 위한 BeautifulSoup
from bs4 import BeautifulSoup
# 크롤링 하고자 하는 사이트와 연결 시키기 위한 requests
import requests
# 데이터 프레임을 사용하기 위한 pandas
import pandas as pd
# 그래프를 그리기 위한 matplotlib.pypolt
import matplotlib.pyplot as plt
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

################################ 데이터 수집(크롤링) ################################

#   1. 네트워크를 교보문고로 접속
url = "http://www.kyobobook.co.kr/bestseller/bestSeller.laf?mallGb=KOR&range=0&kind=0&orderClick=s11"
result = requests.get(url) # 크롤링 하고자하는 url을 연결 시켜줌
print("인터넷 연결 성공>> ", result)

#   2. 접속한 네이버 문서 분석. 태그/클래스/id로 크롤링 가능
content = BeautifulSoup(result.content, "html.parser") # html형식의 정보를 가져옴
# print(content)

titles = content.select("div.title>a>strong")  # '책제목'크롤링 결과를 할당
# print(titles)
price = content.select("div.price>strong.book_price")  # '책가격' 크롤링 결과를 할당
# print(price)
review = content.select("div.review>a")  # '리뷰수' 크롤링 결과를 할당
# print(review)

# '책제목' 크롤링 결과를 리스트에 할당
titles_list = []
for t in titles:
    # print(t.string) # 자바의 .get().text()와 동일
    titles_list.append(t.text)
# print(titles_list)

# '책가격' 크롤링 결과를 리스트에 할당
price_list = []
for p in price:
    # print(p.string) # 자바의 .get().text()와 동일
    price_list.append(int(p.text.replace(",", "").replace("원", "")))
    # price1_list.append(int(p1.text[:len(p1.string)-1].replace(",","")))
    # 숫자만 추출하기 위해 replace()사용
# print(price_list)

# '리뷰수' 크롤링 결과를 리스트에 할당
review_list = []
for r in review:
    # print(d.string) # 자바의 .get().text()와 동일
    review_list.append(int(r.text.replace("(", "").replace(")", "")[:len(r.string)-13]))
    # 숫자만 추출하기 위해 replace()와 슬라이싱[:] 사용.
# print(review_list)

# 크롤링으로 가져온 스트링 중 숫자만 추출하는 정규식
# import re
#  re_list.append(int(re.findall('\d+',b_re[i].text)[0]))

################################ 데이터 전처리(데이터프레임) ################################

df = pd.DataFrame({"책제목": titles_list, "책가격": price_list, "리뷰수": review_list})
print("=========================================================================================")
print("데이터 프레임 출력")
print("-----------------------------------------------------------------------------------------")
print(df)
print("=========================================================================================")

################################ 데이터 처리 및 분석 ################################
print("데이터프레임 상세정보")
print("-----------------------------------")
print(df.describe())

##################################### 데이터 저장 ###################################
# import pymysql
################################### 데이터 시각화 ###################################

# 스캐터플롯

# 책제목과 책가격
def scatter_price():
    plt.figure(figsize=(20, 15)) # 그래프 크기 설정
    plt.plot(titles_list, price_list, color="blue", marker="^", label="책가격")
    # plt.plot(df["책제목"], df["책가격"], color="red", marker="o", label="line")
    plt.xlabel("책제목")
    plt.ylabel("책가격(원)")
    plt.legend()
    plt.grid()
    plt.show()

# 책제목과 리뷰수
def scatter_review():
    plt.figure(figsize=(20, 15))  # 그래프 크기 설정
    plt.plot(titles_list, review_list, color="red", marker="o", label="리뷰수")
    # plt.plot(df["책제목"], df["리뷰수"], color="red", marker="o", label="line")

    plt.xlabel("책제목")
    plt.ylabel("리뷰수(개)")
    plt.legend()
    plt.grid()
    plt.show()

# 박스플롯

# 책가격
def box_price():
    plt.figure(figsize=(10, 6)) # 그래프 크기 설정
    plt.boxplot(price_list)
    plt.ylabel("책가격(원)")

    plt.show()

# 리뷰수
def box_review():
    plt.figure(figsize=(10, 6))  # 그래프 크기 설정
    plt.boxplot(review_list)
    plt.ylabel("리뷰수(개)")

    plt.show()

# 메인
if __name__ == '__main__':

    scatter_price() # 책제목과 책가격 스캐터플롯 보기
    scatter_review() # 책제목과 리뷰수 스캐터플롯 보기
    box_price() # 책가격 박스플롯 보기
    box_review() # 리뷰수 박스플롯 보기


