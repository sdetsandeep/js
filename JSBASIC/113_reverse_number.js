// 113	113_reverse_number.js	Reverse a given number using a while loop (e.g. 1234 → 4321).

let num = 1234;
let original = num;
let reversed = 0;
while (num > 0) {
    let digit = num % 10;
    reversed = reversed * 10 + digit;
    num = Math.floor(num / 10);
}
console.log("Original:", original);
console.log("Reversed:", reversed);
