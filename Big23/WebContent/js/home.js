alert("test");

function call() {
    alert("call 함수");
}

function call2() {
    var id = document.getElementById("id").value;
    var pw = document.getElementById("pw").value;
    if (id == 'admin') {
        location.href = "manager.html";
    } else if (id == 'user') {
        location.href = "user.html";
    } else {
        location.href = "jsTest3.html"
    }
}