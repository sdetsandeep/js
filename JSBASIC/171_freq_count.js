// 171	171_freq_count.js	Count the frequency of each element in an array using an object.

let arr = [1, 2, 3, 2, 1, 3, 3, 4];
let freq = {};
for (let i = 0; i < arr.length; i++) {
    freq[arr[i]] = (freq[arr[i]] || 0) + 1;
}
console.log("Array:", arr);
console.log("Frequency:");
for (let key in freq) {
    console.log(key + " => " + freq[key] + " times");
}
