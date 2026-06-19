/* Recognizing a JavaScript Array
There are two methods by which we can recognize a JavaScript array:

By using Array.isArray() method
By using instanceof method 
Below is an example showing both approaches */

const courses = ["HTML", "CSS", "Javascript"];
console.log("Using Array.isArray() method: ", Array.isArray(courses))
console.log("Using instanceof method: ", courses instanceof Array)