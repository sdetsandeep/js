let userName = 'John';

function showMessage() 
{
  userName = "Bob"; // outer variable change

  let message = 'Hello, ' + userName;
  console.log(message);
}

console.log(userName);

showMessage();

console.log(userName);