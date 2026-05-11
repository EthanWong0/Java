let books, info;

async function init(){
  // Ensure Lesson_51_DBserver replit is running!
  let link = "https://cautious-telegram-q7j6jjgr97rhxw7j-8400.app.github.dev"; //replace with your Dev URL
  let route= "/books";

  info = await fetch(link+route);
  books = await info.json();

  generateCards(books);
  console.log(books);
}

function generateCards(books){
  let centerpanel = document.getElementById("centerpanel");
  let build ="";

  for(let i=0; i<books.length; i++){
    let book = books[i];
    build += `<div class="card" >`
    build +=   `<h3> Book ID: ${book.ISBN}</h3>`;
    build +=   `<div> Title: ${book.Title}</div>`;
    build +=   `<div> Author: ${book.Author}</div>`;
    build +=   `<hr>`;
    build += `</div>`;
  }
  console.log(`# of books found: ${books.length}`);
  centerpanel.innerHTML = build; 
}

function filterByCity(){
  let country = document.getElementById("author").value;
  console.log(country);

  let newbooks = []; //create empty array

  for(let i=0; i<books.length;i++){
    let book= books[i] //get each employee

    if( book.author== country) {
          //append to list
          newEmployees.push(country);
       }
  }
  console.log(`# of employees found: ${newbooks.length}`);
  // Task 4: Generate the cards with your new array.
  generateCards(newbooks);  
}