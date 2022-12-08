// 1. 객체란?
// 사용자가 직접 만드는 데이터로서, 프로퍼티의 집합입
// 프로퍼티는 키(key)와 값(value)로 구성됨

// 객체 생성
const ramen = {
    // 이름
    name : "뽀글이",
    // 가격
    price : 3000
};

const chicken = {
    name : "슈넬치킨",
    price : 5000
};

const coke = {
    name : "코카콜라",
    price : 2000
};

const americano = {
    name : "아메리카노",
    price : 1500
}

// 객체 출력
console.log(ramen);
console.log(chicken);
console.log(coke);
console.log(americano);

// 2. 프로퍼티 다루기(읽기, 쓰기)
// 닷 연산 : 객체의 키를 통해 값을 가져옴
// 대괄호 연산 : 객체의 키를 조작하여 값을 가져올 수 있음

// 객체 값 변경(쓰기)
ramen.price += 500;
chicken.price += 500;
coke.price += 500;
americano.price += 500;

// 객체 정보 출력
console.log("== 메뉴판(가격인상) ==");
console.log(`${ramen.name}(${ramen.price}원)`);
console.log(`${chicken.name}(${chicken.price}원)`);
console.log(`${coke.name}(${coke.price}원)`);
console.log(`${americano.name}(${americano.price}원)`);

// 3. 객체 프로퍼티(key : value) 확인하기
// for..in 루프 : 객체의 모든 프로퍼티를 순회하는 반복문
// in 연산자 : 프로퍼티 존재 여부를 확인

// 캐릭터 객체 생성
const eun = {
    name : "최승은",
    level : 40,
    hp : 1200,
    mp : 800,
    skills : ["에너지볼트", "파이어볼", "토네이도"]
};

// 객체 상태 출력
console.log(eun);

// for..in 루프로 프로퍼티 순회
for(let key in eun) { // eun 안에 있는 객체의 값을 순회할래!
    console.log(`${key} : ${eun[key]}`);
}

// in 연산자로 프로퍼티 존재 여부 확인
console.log("name" in eun); // true
console.log("age" in eun); // false
console.log("skills" in eun); // true

// 4. 객체 배열 생성 및 순회
// 객체 또한 배열에 담길 수 있음
// 대표 배열 순회법 : for, for..of, forEach, ..

// 이용내역 객체 배열 만들기
const arr = [
    {name : "겜방 3시간", price : 3000}, // 0
    {name: "슈넬치킨", price: 5500},     // 1
    {name: "코카콜라", price: 1500},     // 2
    {name: "아메리카노", price: 2000}    // 3
];

// 내역 출력
console.log("== 이용내역 ==");

// 고전 for 루프
for(let i=0; i<arr.length; i++) {
    console.log(`${arr[i].name}(${arr[i].price}원)`);
}

// for..of
for(let item of arr) {
    console.log(item);
}

// 총합 계산
console.log("== 총합 ==");
let sum = 0;
for(let i=0; i<arr.length; i++) {
    sum += arr[i].price;
}

console.log(`${sum}원`);
