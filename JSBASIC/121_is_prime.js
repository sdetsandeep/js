// 121	121_is_prime.js	Check whether a given number is prime or not.

let num = 29;
let isPrime = true;
if (num < 2) {
    isPrime = false;
} else {
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) { isPrime = false; break; }
    }
}
console.log("Number:", num);
console.log(num, isPrime ? "is a Prime number." : "is NOT a Prime number.");
