// 185	185_shuffle_array.js	Shuffle an array randomly using the Fisher-Yates algorithm.

let arr = [1, 2, 3, 4, 5, 6, 7, 8];
console.log("Original:", arr);
for (let i = arr.length - 1; i > 0; i--) {
    let j = Math.floor(Math.random() * (i + 1));
    [arr[i], arr[j]] = [arr[j], arr[i]];
}
console.log("Shuffled:", arr);
