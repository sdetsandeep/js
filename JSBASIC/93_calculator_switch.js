// 93	93_calculator_switch.js	Create a simple calculator (+, -, *, /) using switch case.

let a = 10, b = 4;
let operator = "+";
console.log("a =", a, "| b =", b, "| Operator:", operator);
switch (operator) {
    case "+": console.log("Result:", a + b); break;
    case "-": console.log("Result:", a - b); break;
    case "*": console.log("Result:", a * b); break;
    case "/":
        if (b !== 0) console.log("Result:", a / b);
        else console.log("Error: Division by zero.");
        break;
    default: console.log("Invalid operator.");
}
