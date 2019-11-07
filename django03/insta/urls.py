from django.contrib import admin
from django.urls import path

import insta.views

urlpatterns = [
    path('start', insta.views.start),
    path('home', insta.views.home),
    path('home2', insta.views.home2, name='home2'),
    path('home3', insta.views.home3),
    path('login', insta.views.login, name='login'),
    path('process', insta.views.process, name='process'),
    path('food', insta.views.food, name='food'),
    path('sessionOff', insta.views.sessionOff, name='sessionOff'),
    path('base', insta.views.base, name='base'),
    path('base1', insta.views.base1, name='base1'),
    path('base2', insta.views.base2, name='base2'),
    path('base3', insta.views.base3, name='base3'),
]