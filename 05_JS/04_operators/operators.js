'use strict';

// 1. 대입 연산 : 오른쪽 값을 왼쪽 변수에 대입
const strawberry = 200;
const kiwi = 800;
const banana = 500;

// 2. 문자열 덧셈 : 문자열을 연결
console.log("🍓딸기 개당 가격: " + strawberry + "원");
console.log("🥝키위 개당 가격: " + kiwi + "원");
console.log(`🍌바나나 개당 가격: ${banana}원`);

// 3. 산술 연산, 기초 산수!
// 🍓 + 🥝 - 🍌 = ?
const result1 = strawberry + kiwi - banana;
console.log(result1); 

// 5 x 🍓 ÷ 🍌 = ?
const result2 = 5 * strawberry / banana;
console.log(result2);

// 🍌 - 🍓 x 5 + 🥝 = ?
const result3 = banana - strawberry * 5 + kiwi;
console.log(result3);

// 나머지 연산, 7 % 3 = ?
const result4 = 7 % 3;
console.log(result4);

// 제곱 연산, 2 ** 3 = ?
const result5 = 2 ** 3;
console.log(result5);

// 4. 연산자 우선순위, 뭐를 먼저 연산?
console.log(100 + 200 / 50);
console.log(500 / (200 - 150));
console.log(500 + 2 + "3"); // string
console.log("3" + 500 + 2); // string