// 190	190_mode_array.js	Find the mode (most frequently occurring element) of an array.

let arr = [1, 2, 3, 2, 4, 2, 5, 3];
let freq = {};
let maxFreq = 0, mode;
for (let i = 0; i < arr.length; i++) {
    freq[arr[i]] = (freq[arr[i]] || 0) + 1;
    if (freq[arr[i]] > maxFreq) { maxFreq = freq[arr[i]]; mode = arr[i]; }
}
console.log("Array:", arr);
console.log("Mode:", mode, "(appears", maxFreq, "times)");
