// 1. DOM이란
// 브라우저가 웹페이즈를 JS 객체화 하는 방식
// 이를 위해 제공되는 대표 객체가 document
// document : 웹페이지 문서 정보를 모두 지니는 객체

// document 객체 둘러보기
console.log(document);
console.log(document.title);
console.log(document.URL);

// 웹페이지 제목 변경
document.title = "동적 웹페이지 만들기";

// 2. DOM 객체 가져오기
// 크게 두 가지 방식이 있으나, 쿼리셀렉터를 권장
// document.getElement
// document.querySelector

// h1 태그 제목을 변경
const h1 = document.querySelector("#heading");
h1.innerText = "DOM Object & Event Handling";

// 3. 이벤트 처리
// 이벤트 : 선택, 클릭, 전송등의 특정 사건임
// 이벤트의 처리는 크게 3단계로 동작함
// targeting => 감시할 대상을 지정한 뒤,
// listening => 특정 이벤트를 지속적으로 감시
// handling => 이벤트 발생하면 동작을 수행!

// [연습1] 주문할게요(버튼 클릭 => 메세지 띄우기)
// 1) 대상 DOM 객체 가져오기
const orderBtn = document.querySelector("#order-bell");

// 2) 감시를 시작
orderBtn.addEventListener("click", function(event) {
    // 3) 처리를 수행
    alert("띵동~");
});

// [연습2] 뭐 먹을까?(정답 체크 시 => CSS 적용)
// 1) 대상 DOM 객체 가져오기
const correctInput = document.querySelector("#answer-c");

// 2) 감시를 시작
correctInput.addEventListener("change", function(event) {
    // 3) 처리를 수행 => 이벤트 발생 객체를 가져옴
    const checkbox = event.target;
    const listItem = checkbox.parentNode;
    // 체크여부에 따라 동작을 수행
    if(checkbox.checked) {
        // 클래스 부여 => CSS 스타일링 적용
        listItem.classList.add("text-primary");
    } else {
        // 클래스 제거 => CSS 스타일링 제거
        listItem.classList.remove("text-primary");
    }
});

// [연습3] 장바구니 담기(버튼이 눌리면 => 장바구니에 담기)
// 0) 필요 데이터 생성
const menuCart = [];
const resultDiv = document.querySelector("#order-list");

// 1) 대상 DOM 객체 가져오기
const menuButtons = document.querySelectorAll("#practice-3 button");
// [짜장버튼,짬뽕버튼,볶음밥버튼,탕수육버튼]

// 모든 메뉴버튼을 순회
for(let i=0; i<menuButtons.length; i++) {
    // 2) 감시를 시작
    menuButtons[i].addEventListener("click", function(event) {
        // 3) 처리를 수행 => 클릭된 버튼을 가져옴
        const btn = event.target;

        // 버튼 속 텍스트를 추출
        const menuName = btn.innerText;

        // 장바구니 배열에 담기
        menuCart.push(menuName);

        // 장바구니 배열을 문서에 반영
        resultDiv.innerText = `>> [${menuCart}]이 주문되었습니다.`;
    })
}