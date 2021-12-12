//// 변수 선언 /////////////////////////

var fmPoint = document.forms['cal'];
var input = fmPoint.getElementsByTagName('input');
var cls_btn = document.getElementsByClassName('cls_btn')[0];
var result_btn = document.getElementsByClassName('result_btn')[0];



//// 함수 선언 /////////////////////////
// 초기화: clear 

function clr() {
    fmPoint['result'].value = 0;
}

// 계산 입력 
function inCalc(v) {
    if (fmPoint['result'].value == 0) {
        fmPoint['result'].value = '';
    }
    fmPoint['result'].value += v;
}

// 계산 결과
function resCalc() {
    fmPoint['result'].value = eval(fmPoint['result'].value);
}
//// 버튼 처리 /////////////////////////

// 연산처리 버튼
for (var i = 0; i < input.length; i++) {
    if (input[i].value != '=' && input[i].value != 'clear') {
        input[i].onclick = function() { inCalc(this.value); }
    }
}

// 초기화 버튼
cls_btn.onclick = function() { clr(); }
    // 결과 버튼 
result_btn.onclick = function() {
    try {
        resCalc();
    } catch (err) {
        fmPoint['result'].value = '입력오류';
    }
}