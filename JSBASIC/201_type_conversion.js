let value = true;
console.log(typeof value); // boolean

value = String(value); // now value is a string "true"
console.log(typeof value); // string

let str = "123";
console.log("str =", str);
console.log("Type of str =", typeof str);

let num = Number(str);

console.log("num =", num);
console.log("Type of num =", typeof num);

let age = Number("an arbitrary string instead of a number");

console.log(age); // NaN, conversion failed