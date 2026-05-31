// 178	178_palindrome_arr.js	Check whether a given array reads the same forwards and backwards.

let arr = [1, 2, 3, 2, 1];
let isPalindrome = true;
for (let i = 0; i < Math.floor(arr.length / 2); i++) {
    if (arr[i] !== arr[arr.length - 1 - i]) { isPalindrome = false; break; }
}
console.log("Array:", arr);
console.log("Is palindrome:", isPalindrome);
