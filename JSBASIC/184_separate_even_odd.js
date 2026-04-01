// 184	184_separate_even_odd.js	Separate even and odd elements of an array into two different arrays.

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let evens = [], odds = [];
for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 === 0) evens.push(arr[i]);
    else odds.push(arr[i]);
}
console.log("Original:", arr);
console.log("Even numbers:", evens);
console.log("Odd numbers:", odds);
