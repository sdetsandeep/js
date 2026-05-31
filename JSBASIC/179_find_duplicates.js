// 179	179_find_duplicates.js	Find and print all duplicate elements in an array.

let arr = [1, 2, 3, 2, 4, 1, 5, 3];
let seen = {}, duplicates = [];
for (let i = 0; i < arr.length; i++) {
    if (seen[arr[i]]) {
        if (!duplicates.includes(arr[i])) duplicates.push(arr[i]);
    } else {
        seen[arr[i]] = true;
    }
}
console.log("Array:", arr);
console.log("Duplicates:", duplicates);
