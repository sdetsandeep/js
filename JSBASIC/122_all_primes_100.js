// 122	122_all_primes_100.js	Print all prime numbers from 1 to 100.

console.log("Prime numbers from 1 to 100:");
for (let num = 2; num <= 100; num++) {
    let isPrime = true;
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) { isPrime = false; break; }
    }
    if (isPrime) process.stdout.write(num + " ");
}
console.log();
