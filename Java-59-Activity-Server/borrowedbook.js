let borrowedbook, info;

async function init(){
  // Ensure Lesson_51_DBserver replit is running!
  let link = "https://cautious-telegram-q7j6jjgr97rhxw7j-8400.app.github.dev"; //replace with your Dev URL
  let route= "/borrowedbook";

  info = await fetch(link+route);
  borrowedbook = await info.json();

  generateCards(borrowedbook);
  console.log(borrowedbook);
}

function generateCards(borrowedbook){
  let centerpanel = document.getElementById("centerpanel");
  let build ="";

  for(let i=0; i<borrowedbook.length; i++){
    let bb = borrowedbook[i];
    build += `<div class="card" >`
    build +=   `<h3> ISBN: ${bb.ISBN}</h3>`;
    build +=   `<div> MemberID: ${bb.MemberID}</div>`;
    build +=   `<div> Due: ${bb.DueDate}</div>`;
    build +=   `<hr>`;
    build += `</div>`;
  }
  console.log(`# of borrowedbook found: ${borrowedbook.length}`);
  centerpanel.innerHTML = build; 
}

function filterByCity(){
  let Date = document.getElementById("date").value;
  console.log(Date);

  let newborrowedbook = []; //create empty array

  for(let i=0; i<borrowedbook.length;i++){
    let bb= borrowedbook[i] //get each employee

    if( bb.DueDate == dueDate) {
          //append to list
          newborrowedbook.push(bb);
       }
  }
  console.log(`# of borrowedbook found: ${newborrowedbook.length}`);
  // Task 4: Generate the cards with your new array.
  generateCards(newborrowedbook);  
}