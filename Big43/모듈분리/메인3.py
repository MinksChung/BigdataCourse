# import 모듈분리.계산기

# 예전의 정석 방법. 번거로움
# 모듈분리.계산기.add()
# 모듈분리.계산기.minus()


import 모듈분리.계산기 as cal
# import 패키지명.파이썬파일명 as 간단하게 쓰고자 하는 함수명

cal.add()
cal.minus()