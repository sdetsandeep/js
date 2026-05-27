// 161	161_count_even_arr.js	Count how many even numbers are present in an array.

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let count = 0;
for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 === 0) count++;
}
console.log("Array:", arr);
console.log("Count of even numbers:", count);
