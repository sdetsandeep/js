// 99	99_browser_name.js	Display the browser name based on a code input using switch.

let code = "CH";
console.log("Browser Code:", code);
switch (code.toUpperCase()) {
    case "CH": console.log("Browser: Google Chrome"); break;
    case "FF": console.log("Browser: Mozilla Firefox"); break;
    case "IE": console.log("Browser: Internet Explorer"); break;
    case "SF": console.log("Browser: Safari"); break;
    case "ED": console.log("Browser: Microsoft Edge"); break;
    case "OP": console.log("Browser: Opera"); break;
    default:   console.log("Unknown Browser Code.");
}
