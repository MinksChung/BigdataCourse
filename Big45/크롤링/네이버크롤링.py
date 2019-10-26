from urllib import request
from bs4 import BeautifulSoup

def naver():
    print("네이버 크롤링을 시작합니다.")
#   1. 네트워크를 네이버로 접속
    target = request.urlopen("http://naver.com") # 크롤링 하고자 하는 url로 연결
    print("인터넷 연결 성공>> ", target)
    print("------------------------------------------------------")
    print()

#   2. 접속한 네이버 문서 분석. 태그/클래스/id로 크롤링 가능
    document = BeautifulSoup(target, "html.parser") # 생성자 호출 # 돔트리 정보를 가진 객체의 일부분을 할당
    titles = document.select(".an_txt") # 크롤링 결과를 할당
    # print(titles)

    for x in titles:
        print(x.string) # 자바의 .get().text()와 동일

# main 부터 시작
if __name__ == '__main__':
    naver()