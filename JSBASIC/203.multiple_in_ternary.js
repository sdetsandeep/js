let age = "AaB";

let message =
    isNaN(age) ? "Please enter a valid number" :
    age < 3 ? "Hi Baby" :
    age < 18 ? "Abhi aap 18 se kam ho" :
    age == 18 ? "Aap exactly 18 ke ho" :
    "You are greater than 18";

console.log(message);