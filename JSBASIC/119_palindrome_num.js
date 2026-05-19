// 119	119_palindrome_num.js	Check whether a given number is a palindrome (e.g. 121, 1331).

let num = 1331;
let original = num;
let reversed = 0;
let temp = num;
while (temp > 0) {
    reversed = reversed * 10 + (temp % 10);
    temp = Math.floor(temp / 10);
}
console.log("Number:", original);
if (original === reversed) {
    console.log(original, "is a Palindrome.");
} else {
    console.log(original, "is NOT a Palindrome.");
}
