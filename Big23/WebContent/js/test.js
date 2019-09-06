function sum() {
    var num1 = parseInt(document.getElementById("num1").value);
    var num2 = parseInt(document.getElementById("num2").value);
    alert(num1 + num2);
}

function sub() {
    var num1 = parseInt(document.getElementById("num1").value);
    var num2 = parseInt(document.getElementById("num2").value);
    alert(num1 - num2);
}

function mul() {
    var num1 = parseInt(document.getElementById("num1").value);
    var num2 = parseInt(document.getElementById("num2").value);
    alert(num1 * num2);
}

function div() {
    var num1 = parseInt(document.getElementById("num1").value);
    var num2 = parseInt(document.getElementById("num2").value);
    alert(num1 / num2);
}

function plus() {
    var cnt = parseInt(document.getElementById("cnt").value);
    cnt = cnt + 1;
    document.getElementById("cnt").value = cnt;
}

function minus() {
    var cnt = parseInt(document.getElementById("cnt").value);
    cnt = cnt - 1;
    document.getElementById("cnt").value = cnt;
}

function naver() {
    location.href = "http://www.naver.com";
}

function daum() {
    location.href = "http://www.daum.net";
}

function google() {
    location.href = "http://www.google.com";
}