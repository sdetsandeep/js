// 177	177_pairs_sum.js	Find all pairs of elements in an array that add up to a given sum.

let arr = [1, 5, 3, 7, 4, 2];
let target = 8;
console.log("Array:", arr, "| Target sum:", target);
console.log("Pairs:");
for (let i = 0; i < arr.length; i++) {
    for (let j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] === target) {
            console.log("(" + arr[i] + ", " + arr[j] + ")");
        }
    }
}
