// Compare two strings character by character without using built-in comparison operators.

/*  The algorithm to compare two strings is simple:

Compare the first character of both strings.
If the first character from the first string is greater (or less) than the other string’s, then the first string is greater (or less) than the second. We’re done.
Otherwise, if both strings’ first characters are the same, compare the second characters the same way.
Repeat until the end of either string.
If both strings end at the same length, then they are equal. Otherwise, the longer string is greater.
*/


let str1 = "apple";
let str2 = "apple";

let i = 0;
let result = "";

while (i < str1.length && i < str2.length) {
    if (str1[i] > str2[i]) {
        result = '"' + str1 + '" is greater than "' + str2 + '"';
        break;
    } 
    else if (str1[i] < str2[i]) {
        result = '"' + str1 + '" is less than "' + str2 + '"';
        break;
    }
    i++;
}

if (result === "") {
    if (str1.length === str2.length) {
        result = "Both strings are equal";
    } else if (str1.length > str2.length) {
        result = '"' + str1 + '" is greater than "' + str2 + '"';
    } else {
        result = '"' + str2 + '" is greater than "' + str1 + '"';
    }
}

console.log(result);