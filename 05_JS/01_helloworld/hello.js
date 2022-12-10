// 1. 버튼 가져오기
const btn = document.querySelector("button");

// 2. 버튼 클릭 시, 특정 동작 수행
btn.addEventListener("click", helloMbti);

// 3. 특정 동작 내용 
function helloMbti() {
    const heading = document.querySelector("h1");
    const mbti = prompt("당신의 MBTI는 무엇입니까?");
    heading.append(" Hello~ " + mbti);
}