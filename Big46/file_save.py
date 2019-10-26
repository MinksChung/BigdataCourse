from urllib import request
from bs4 import BeautifulSoup
import 네이버뮤직.db_save as insert

###########################################################################################

def file_save(main_titles1, main_titles2, main_titles3):
    saveFile = open("navermusic.txt", "w") # txt파일로 저장하기 위해 스트림 생성
    for x in range(0, 50): # 리스트 개수(top50) 만큼 돌려주기 위해 range 설정.
        # file_save함수 호출시 입력값들을 하나씩 txt파일에 입력
        saveFile.write(main_titles1[x] + main_titles2[x] + main_titles3[x]+ "\n")

    saveFile.close()# 스트림 닫기

###########################################################################################

def naverMusic():
    print("네이버 크롤링을 시작합니다.")
    #   1. 네트워크를 '네이버뮤직 TOP100 국내'로 접속
    target = request.urlopen("https://music.naver.com/listen/top100.nhn?domain=DOMESTIC_V2") # 크롤링 하고자 하는 url로 연결
    print("인터넷 연결 성공>> ", target)
    print("------------------------------------------------------")
    print()

    #   2. 접속한 네이버 문서 분석. 태그/클래스/id로 크롤링 가능
    document = BeautifulSoup(target, "html.parser") # 생성자 호출 # 돔트리 정보를 가진 객체의 일부분을 할당
    titles1 = document.select("td.name span.ellipsis") # '음악제목'크롤링 결과를 할당
    titles2 = document.select("td._artist>a")  # '음악가수'크롤링 결과를 할당
    titles3 = document.select(".thumb img[src]") # '앨범이미지' 크롤링 결과를 할당
    # print("-----------------------------------------------------------------------")

    # '음악제목' 리스트에 넣기
    main_titles1 = []  # titles1에 할당된 크롤링 결과를 넣어주기 위해 리스트 main_titles1 생성
    for x in titles1:
        # print(x.string) # print(x.string) # 자바의 .get().text()와 동일
        main_titles1.append(x.string) # 크롤링한 값을 main_titles1에 넣어주기

    # print(main_titles1)
    # print("-----------------------------------------------------------------------")

    # '음악가수' 리스트에 넣기
    main_titles2 = []  # titles2에 할당된 크롤링 결과를 넣어주기 위해 리스트 main_titles2 생성
    for x in titles2:
        if (x.string == None): # 크롤링한 텍스트 값이 None이면 "title"에 접근하여 값을 가져오기
            # print(x.get("title"))
            main_titles2.append(x.get("title")) # 크롤링한 값을 main_titles2에 넣어주기
        else:
            # print(x.string) # print(x.string) # 자바의 .get().text()와 동일
            main_titles2.append(x.string) # 크롤링한 값을 main_titles2에 넣어주기
    # print(main_titles2)

    # '앨범이미지' 리스트에 넣기
    main_titles3 = []  # titles3에 할당된 크롤링 결과를 넣어주기 위해 리스트 main_titles3 생성
    for x in titles3:
        # print(x.string)  # print(x.string) # 자바의 .get().text()와 동일
        main_titles3.append(x["src"])  # 크롤링한 값을 main_title3s에 넣어주기

    # print(main_titles3)
    # print("-----------------------------------------------------------------------")

    # file_save함수 호출
    file_save(main_titles1, main_titles2, main_titles3)
    # 입력값으로 크롤링한 값들을 리스트로 넣어준 main_titles1,2,3 입력

    # db_save.py에 정의한 insert함수 호출
    insert.insert(main_titles1, main_titles2, main_titles3)
    # 입력값으로 크롤링한 값들을 리스트로 넣어준 main_titles1,2,3 입력

    return main_titles1, main_titles2, main_titles3
    # main titles를 naverMusic함수 호출시 값을 넘겨주기 위해. 파이썬은 다중 return이 가능.

def crawl():
    return_list = naverMusic() # 함수 naverMusic()의 return값(크롤링결과를 리스트에 넣은)을 변수 return_list에 할당
    # for x in range(0, len(return_list)): # 리스트 return_list 전체를 프린트
    #     print(x, ">> ", return_list[x]) # 인덱스값에 해당하는 리스트값 하나씩을 프린트

# main 부터 시작
# if __name__ == '__main__':
#     naverMusic()
