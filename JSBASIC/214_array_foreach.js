/* JavaScript forEach() Method

forEach() का उपयोग Array के प्रत्येक element पर एक-एक करके काम करने के लिए किया जाता है।

Syntax
array.forEach(function(element, index, array) {
    // Code
}); */

let fruits = ["Apple", "Banana", "Mango", "Orange"];

fruits.forEach(function(fruit,index) {
    console.log("fruit["+index + "] : "+ fruit);
});

console.log ("\n\n\n=========================================");
//Example : Numbers का Square निकालना

let number= [1,2,3,4,5,6,7,8,9,10];

number.forEach(function(num)
{
    console.log("square of "+num+ " is  : "+(num*num));
        
});
