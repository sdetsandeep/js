// Nullish Coalescing   ...

// Agar user ne kuch nahi likha to prompt "" return karega.
// Isliye empty string ko null bana rahe hain.



const prompt = require("prompt-sync")();

console.log("==================================");
console.log(" NULLISH COALESCING OPERATOR (??) ");
console.log("==================================");

let name = prompt("Apna naam enter karo (khali chhod sakte ho): ");

// Agar user ne kuch nahi likha to prompt "" return karega.
// Isliye empty string ko null bana rahe hain.

name = (name === "") ? null : name;

// ?? operator ka use
let finalName = name ?? "Guest User";

console.log("----------------------------------");
console.log("Original Name =", name);
console.log("Display Name  =", finalName);
console.log("----------------------------------");