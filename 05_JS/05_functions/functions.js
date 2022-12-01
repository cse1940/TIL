// 1. 함수는 무엇인가?

// 선언부(function declation) : 함수를 정의한 영역
function sayHi(username) {
    console.log(`안녕하세요, ${username}입니다.`);
    return undefined;
}

// 호출부(function call) : 함수를 사용(실행)하는 영역
sayHi("최승은");
sayHi("이리아");
sayHi("박홍식");

// 선언부 : 입력값의 세제곱을 반환하도록 함수를 정의
function cube(num) {
    return num ** 3;
}

const a = cube(2); // 2 * 2 * 2 = 8
const b = cube(3); // 3 * 3 * 3 = 27
console.log(`a = ${a}, b = ${b}`);

// 2. 파라미터, 입력값을 저장하는 변수!
// => 필요에 따라 개수 조절 가능

// 라면 생성 자판기(함수) : 선택 불가(파라미터 : 0개)
function createRamen() {
    return "라면";
}
const ramen = createRamen();
console.log(ramen);

// 만두 생성 자판기(함수) : 재료 1개 선택 가능(파라미터 : 1개)
function createMandoo(ingredient) {
    return `${ingredient}만두`;
}
const mandoo1 = createMandoo("고기");
const mandoo2 = createMandoo("김치");
console.log(mandoo1);
console.log(mandoo2);

// 김밥 생성 자판기(함수) : 재료 2개 선택 가능(파라미터 : 2개)
function createKimbob(a, b) {
    return `${a}, ${b}김밥`
}
const kimbob1 = createKimbob("참치", "김치");
console.log(kimbob1);

// 3. return, 함수 종료와 동시에 값을 반환!
// return => 우측 값을 반환
// if, return을 생략하면? => undefined를 자동 반환
function test() {
    console.log("나는 값을 반환하지 않아요!");
}
const result = test();
console.log(result); // undefined

// 4. 스코프(scope), 변수의 활동 범위
// 프로그램은 실행 흐름에 따라 변수를 관리함
// > 함수 호출 => 파라미터와 지역변수를 만듦
// > 함수 종료 => 파라미터와 지역변수를 제거
function changeParameterX(x) {
    x = x + 3;
    console.log(`x = ${x}`);
}
changeParameterX(30);
// console.log(x); => ERROR, 변수 x를 찾을 수 없음

function changeLocalVariableY(n) {
    let y = n + 1; // 지역변수 y
    console.log(`y = ${y}`);
}
changeLocalVariableY(20);
// console.log(y); => ERROR, 변수 y를 찾을 수 없음

function changeLocalVariableZ(n) {
    let z = n;
    console.log(`local z = ${z}`); // 3
}

let z = 7;
console.log(`global z = ${z}`); // 7
changeLocalVariableZ(3);
console.log(`global z = ${z}`); // 7