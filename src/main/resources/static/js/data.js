function changeName(){
    //선택 데이터 value를 저장
    var nameValue = document.getElementById("member_select").value;

    //thatMemberName이란 id를 가진 곳에 저장된 값 텍스트출력 주기
    document.getElementById("nameToNum").innerText = nameValue;

    //class_select의 value값(강의 비용) 저장
    var costValue = document.getElementById("class_select").value;

    //memberId가 20000이상이면 강의비용 절반으로 텍스트출력주고
    //아니라면 그냥 받은대로 주기
    if(costValue != "none"){
        if(nameValue >= 20000){
        document.getElementById("classCost").innerText = costValue/2
            }else{
        document.getElementById("classCost").innerText = costValue
        }
    }

}
