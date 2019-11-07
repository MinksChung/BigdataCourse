from django.db.models import Q
from django.shortcuts import render
from django.views.decorators.csrf import csrf_exempt

from post.models import Post
from user.models import User


def index(request):
    return render(request, 'style_head.html')


def login_test(request):
    return render(request, 'login_test.html')


@csrf_exempt
def signin(request):
    id = request.POST['uid']
    dto = Post.objects.filter(user_id='test3')
    return render(request, 'mypage/mypost.html', {'dto': dto[0]})
