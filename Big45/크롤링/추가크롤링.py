from urllib import request
from bs4 import BeautifulSoup
import 크롤링.naver_db as db

def file_save(titles):
    saveFile = open("naver3.txt", "w") # txt파일로 저장하기 위해 스트림 생성
    for x in titles:
        # file_save함수 호출시 입력값으로 넣어준 main_titles에 할당된 리스트값들을
        # titles로 받아서 하나씩 txt파일에 입력
        saveFile.write(x + "\n")

    saveFile.close()# 스트림 닫기

def naver():
    print("네이버 크롤링을 시작합니다.") # 크롤링 하고자 하는 url로 연결
    #   1. 네트워크를 네이버로 접속
    target = request.urlopen("http://naver.com") # 크롤링 하고자 하는 url로 연결
    print("인터넷 연결 성공>> ", target)
    print("------------------------------------------------------")
    print()

    #   2. 접속한 네이버 문서 분석. 태그/클래스/id로 크롤링 가능
    document = BeautifulSoup(target, "html.parser")  # 생성자 호출 # 돔트리 정보를 가진 객체의 일부분을 할당
    titles = document.select(".ah_k")  # 크롤링 결과를 할당
    # print(titles)
    main_titles = []  # titles에 할당된 크롤링 결과를 넣어주기 위해 리스트 main_titles 생성

    for x in titles:
        print(x.string)  # 자바의 .get().text()와 동일
        main_titles.append(x.string) # 크롤링한 값을 main_titles에 넣어주기

    # file_save함수 호출
    file_save(main_titles) # 입력값으로 크롤링한 값들을 리스트로 넣어준 main_titles 입력

    # naver_db.py에 정의한 insert함수 호출
    db.insert2(main_titles) # 입력값으로 크롤링한 값들을 리스트로 넣어준 main_titles 입력

    return main_titles # main titles를 naver함수 호출시 값을 넘겨주기 위해

# main 부터 시작
if __name__ == '__main__':
    return_list = naver() # 함수 naver()의 return값(크롤링결과를 리스트에 넣은)을 변수 return_list에 할당
    for x in range(0, len(return_list)): # 리스트 return_list 전체를 프린트
        print(x, ">> ", return_list[x]) # 인덱스값에 해당하는 리스트값 하나씩을 프린트
