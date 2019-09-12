// call 함수 정의
function call() {
    // 1. 입력값을 2개 받아서
    var n1 = prompt("커피값 입력", "0");
    var n2 = prompt("주문수량 입력", "0");

    var n11 = Number(n1); // = parseInt
    var n22 = Number(n2);

    var mul = n11 * n22;

    // 2. 두 개의 곱이 25000을 넘는지 체크
    if (mul >= 25000) {
        // 3. 넘으면, 네이버 쇼핑 사이트로 링크
        location.href = "http://www.naver.com";
    } else {
        // 4. 넘지 않으면, 다음 쇼핑 사이트로 링크
        location.href = "http://www.daum.net";
    }
}

function call2() {
    // 1. 입력값을 2개 받아서
    var n1 = document.getElementById("n1").value;
    var n2 = document.getElementById("n2").value;

    var n11 = Number(n1); // = parseInt
    var n22 = Number(n2);

    var mul = n11 * n22;

    // 2. 두 개의 곱이 25000을 넘는지 체크
    if (mul >= 25000) {
        // 3. 넘으면, 네이버 쇼핑 사이트로 링크
        location.href = "http://www.naver.com";
    } else {
        // 4. 넘지 않으면, 다음 쇼핑 사이트로 링크
        location.href = "http://www.daum.net";
    }
}

function call3() {
    // 1. 입력값을 2개 받아서
    var n1 = document.getElementById("n1").value;
    var n2 = document.getElementById("n2").value;

    var n11 = Number(n1); // = parseInt
    var n22 = Number(n2);

    var mul = n11 * n22;

    // 2. 두 개의 곱이 25000을 넘는지 체크
    if (mul >= 25000) {
        document.getElementById("result").value = mul - 5000;
    } else {
        document.getElementById("result").value = mul;
    }
}

function cal() {
    // 1. 입력값을 2개 받아서
    var n1 = document.getElementById("n1").value;
    var n2 = document.getElementById("n2").value;

    var n11 = Number(n1); // = parseInt
    var n22 = Number(n2);

    var mul = n11 * n22;

    return mul;
}

function call4() {
    mul = cal();
    // 2. 두 개의 곱이 25000을 넘는지 체크
    if (mul >= 25000) {
        document.getElementById("result").value = mul - 5000;
    } else {
        document.getElementById("result").value = mul;
    }
}

function call5() {
    mul = cal();
    // 2. 두 개의 곱이 25000을 넘는지 체크
    if (mul >= 25000) {
        document.getElementById("h2").textContent = mul - 5000;
    } else {
        document.getElementById("p").textContent = mul;
    }
}