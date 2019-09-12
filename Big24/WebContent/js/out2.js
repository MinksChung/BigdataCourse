function addcal() {
    // 1. 입력값을 2개 받아서
    var n1 = document.getElementById("n1").value;
    var n2 = document.getElementById("n2").value;

    var n11 = Number(n1); // = parseInt
    var n22 = Number(n2);

    var add = n11 + n22;

    return add;
}

function add(n1, n2) {
    var add = addcal();
    document.getElementById("result").value = add;
    document.getElementById("h1").textContent = add;
}

function minuscal() {
    // 1. 입력값을 2개 받아서
    var n1 = document.getElementById("n1").value;
    var n2 = document.getElementById("n2").value;

    var n11 = Number(n1); // = parseInt
    var n22 = Number(n2);

    var minus = n11 - n22;

    return minus;
}

function minus(n1, n2) {
    var minus = minuscal();
    document.getElementById("result").value = minus;
    document.getElementById("h1").textContent = minus;
}

function mulcal() {
    // 1. 입력값을 2개 받아서
    var n1 = document.getElementById("n1").value;
    var n2 = document.getElementById("n2").value;

    var n11 = Number(n1); // = parseInt
    var n22 = Number(n2);

    var mul = n11 * n22;

    return mul;
}

function mul(n1, n2) {
    var mul = mulcal();
    document.getElementById("result").value = mul;
    document.getElementById("h1").textContent = mul;
}

function divcal() {
    // 1. 입력값을 2개 받아서
    var n1 = document.getElementById("n1").value;
    var n2 = document.getElementById("n2").value;

    var n11 = Number(n1); // = parseInt
    var n22 = Number(n2);

    var div = n11 / n22;

    return div;
}

function div(n1, n2) {
    var div = divcal();
    document.getElementById("result").value = div;
    document.getElementById("h1").textContent = div;
}