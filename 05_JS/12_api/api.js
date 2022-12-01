// Web API란
// 웹 개발을 돕는, 잘 만들어진 도구들(제공되는 객체와 함수등의 코드)
// 예 : console.log(), document,querySelector(), Array.push(), ..

// 1. Date & String 클래스
// - Date: 특정 시간을 객체로 다루기 위한 틀
// - String: 문자열을 객체로 다루기 위한 틀
// - 구글링: 자바스크립트 Date 클래스, 자바스크립트 문자열 split
// - 참조: https://developer.mozilla.org/ko/ 에서 검색

// [연습1] 알게된지, 벌써 ???일(시간 간격 구하기)
// 1) 시간 객체를 생성
const firstMetDate = new Date("2022-02-12");
const the100thDate = new Date("2022-11-04"); // 100일
console.log(firstMetDate.toISOString().split("T")[0]);
console.log(the100thDate.toISOString().split("T")[0]);

// 2) 시간 간격을 계산
const ms = the100thDate.getTime() - firstMetDate.getTime();
console.log(ms);

// 3) 단위 변환(밀리초: 1/1000 => 초 => 분 => 시간 => 일)
const sec = ms / 1000; // 초
const min = sec / 60; // 분
const hour = min / 60; // 시간
const day = hour / 24; // 일
console.log(sec);
console.log(min);
console.log(hour);
console.log(day);
console.log(`${sec}초 => ${hour} 시간 => ${day} 일`);

// 4) 검증
const clone = new Date(the100thDate); // 2022-11-04
clone.setDate(clone.getDate() - 265); // 2022년 11월 04일 - 265일
console.log(clone.toISOString().split("T")[0]);

clone.setDate(clone.getDate() + 100) // 2022년 11월 04일 + 100일
console.log(clone.toISOString().split("T")[0]);

// 2. setTimeout() 메소드
// - 일정 시간이 지나고, 동작을 수행하는 메소드
// - 해당 메소드는 window 객체가 수행하지만, 보통 생략 됨
// - 실제 호출: window.setTimeout()

// [연습2] 기념 선물 고르기, 여러 선물들 중 택1(랜덤 박스)
// 1) 이벤트 감시 대상 가져오기
const pickBtn = document.querySelector("#practice-2 .card-body a.btn");
// 2) 이벤트 감지 시작 및 처리함수 연결
pickBtn.addEventListener("click", function(event) {
    // 3) 클릭 이벤트 처리
    setTimeout(function() { console.log(3); }, 0);
    setTimeout(function() { console.log(2); }, 1000);
    setTimeout(function() { console.log(1); }, 2000);
    setTimeout(function() { console.log("뿅"); }, 3000);
});