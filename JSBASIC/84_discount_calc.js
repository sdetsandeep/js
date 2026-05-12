// 84	84_discount_calc.js	Calculate discount percentage based on total purchase amount.

let amount = 1500;
let discount = 0;
console.log("Purchase Amount: ₹" + amount);
if (amount >= 2000) {
    discount = 20;
} else if (amount >= 1000) {
    discount = 10;
} else if (amount >= 500) {
    discount = 5;
} else {
    discount = 0;
}
let discountAmt = (amount * discount) / 100;
let finalAmt = amount - discountAmt;
console.log("Discount:", discount + "%");
console.log("Discount Amount: ₹" + discountAmt);
console.log("Final Amount: ₹" + finalAmt);
