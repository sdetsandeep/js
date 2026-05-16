// 104	104_language_option.js	Display a language name based on a number option using switch.

let option = 3;
console.log("Language option:", option);
switch (option) {
    case 1: console.log("Language: JavaScript"); break;
    case 2: console.log("Language: Python"); break;
    case 3: console.log("Language: Java"); break;
    case 4: console.log("Language: C++"); break;
    case 5: console.log("Language: Rust"); break;
    default: console.log("Invalid option. Choose 1 to 5.");
}
