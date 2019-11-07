from django.shortcuts import render
from django.http import HttpResponse


# Create your views here.

def start(request):
    return render(request, 'insta/start.html')


def home(request):
    return render(request, 'insta/home.html')


def home2(request):
    return render(request, 'insta/home2.html')


def home3(request):
    return render(request, 'insta/home3.html')


def login(request):
    # request.session['mid']
    return render(request, 'insta/login.html')


def process(request):
    data = request.POST
    print('view에서 전송된 mid:', data['mid'])
    print('view에서 전송된 pw:', data['pw'])
    save_mid = 'root'
    save_pw = '1234'
    mid = data['mid']
    pw = data['pw']
    if (save_mid == mid and save_pw == pw):
        # 세션의 속성으로 등록
        request.session['mid'] = mid
        return render(request, 'insta/loginOK.html')
    else:
        return render(request, 'insta/loginNot.html')


def food(request):
    food = ['사과', '수박', '딸기', '바나나', '귤']
    foods = request.session['food']
    for i in range(len(food)):
        foods[i] = food[i]
    return render(request, 'insta/food.html')


def sessionOff(request):
    del request.session['mid']
    return render(request, 'insta/login.html')


def base(request):
    return render(request, 'base.html')
def base1(request):
    return render(request, 'insta/base1.html')
def base2(request):
    return render(request, 'insta/base2.html')
def base3(request):
    return render(request, 'insta/base3.html')


def main(request):
    return render(request, 'insta/main.html')
