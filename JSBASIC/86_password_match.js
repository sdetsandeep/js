// 86	86_password_match.js	Check if a entered password matches the stored password.

let storedPassword = "secure123";
let enteredPassword = "secure123";
console.log("Entered Password:", enteredPassword);
if (enteredPassword === storedPassword) {
    console.log("Password Match! Access Granted.");
} else {
    console.log("Password Mismatch! Access Denied.");
}
