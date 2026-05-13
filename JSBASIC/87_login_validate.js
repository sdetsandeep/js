// 87	87_login_validate.js	Validate both username and password and print login status.

let storedUser = "admin";
let storedPass = "admin@123";
let inputUser = "admin";
let inputPass = "admin@123";
console.log("Username:", inputUser, "| Password:", inputPass);
if (inputUser === storedUser && inputPass === storedPass) {
    console.log("Login Successful!");
} else if (inputUser !== storedUser) {
    console.log("Invalid Username.");
} else {
    console.log("Invalid Password.");
}
