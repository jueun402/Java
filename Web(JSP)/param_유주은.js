function check(){
	
	if(frm.id.value==""){
		alert("아이디를 입력해주세요.");
		frm.id.focus();
		return false;
	}   
	else if(frm.age.value ==""){
		alert("나이를 입력해주세요");
		frm.age.focus();
		return false;
	}
	else if (frm.age.value.match(/[^0-9]/)){
		alert("숫자로 입력해주세요.");
		frm.age.focus();
		return false;
	}

}