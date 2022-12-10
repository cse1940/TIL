'use strict';

// 1. number, 숫자 타입
const birthYear = 1986; // 정수(integer)
console.log(birthYear);

const weight = 75.24; // 실수(float)
console.log(weight);
 
// 2. string, 여러개의 문자들
const nickname = "최승은";
const starSign = '천징자리';
const bloodType = `B형`;
console.log(nickname);
console.log(starSign);
console.log(bloodType);

// 3. typeof, 값 또는 변수의 타입을 확인하는 법!
console.log(typeof 1234);
console.log(typeof "1234");
console.log(typeof starSign);

// 4. boolean, 참과 거짓!
console.log(typeof true); // 참
console.log(typeof false); // 거짓
const hungry = true;
console.log(hungry);

// 5. 미지정 vs 값이 없음
let dinner; // 이름표만 만든 변수! (미지정)
console.log(typeof dinner); // undefined

dinner = "피자"; // 피자를 먹기로 함! (문자열 지정)
console.log(typeof dinner); // string

dinner = null; // null, 값이 없음을 지정!
console.log(typeof dinner); // object