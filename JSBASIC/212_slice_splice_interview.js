let arr = [10, 20, 30, 40, 50];

console.log("\n=========Slice ..===========\n");

console.log("Before slice:", arr);


let slicedArr = arr.slice(1, 4);

console.log("Slice Result:", slicedArr);

console.log("After slice:", arr);

console.log("\n==========Splice... ==========\n");

console.log("Before splice:", arr);

let deletedArr = arr.splice(1, 2);

console.log("Deleted Elements:", deletedArr);

console.log("After splice:", arr);