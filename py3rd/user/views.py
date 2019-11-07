from django.shortcuts import render


def index(request):
    return render(request, 'style_head.html')


def login_test(request):

    return render(request, 'login_test.html')
