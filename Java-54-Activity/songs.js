let songs, info;

async function init(){
  // Ensure Lesson_51_DBserver replit is running!
  let link = "https://cautious-telegram-q7j6jjgr97rhxw7j-8500.app.github.dev"; //replace with your Dev URL
  let route= "songs";

  info = await fetch(link+route);
  songs = await info.json();

  generateCards(songs);
  console.log(songs);
}

function generateCards(songs){
  let centerpanel = document.getElementById("mainpanel");
  let build ="";

  for(let i=0; i<songs.length; i++){
    let song = songs[i];
    build += `<div class="card" >`
    build +=   `<h3> Song Name: ${song.Name}</h3>`;
    build +=   `<div> ${song.Title}</div>`;
    build +=   `<p> Album </p>`; 
    build +=   `<h5> ${song.Title}</h5>`
    build +=   `<p> Composer </p>`
    build +=   `<h5> ${song.Composer}</h5>`
    build +=   `<hr>`;
    build += `</div>`;
  }
  console.log(`# of customers found: ${songs.length}`);
  centerpanel.innerHTML = build; 
}

function filterByCity(){
  let country = document.getElementById("Name").value;
  console.log(songs);

  let newSongs = []; //create empty array

  for(let i=0; i<songs.length;i++){
    let song= songs[i] //get each employee

    if( song.Name == Name) {
          //append to list
          newSongs.push(song);
       }
  }
  console.log(`# of employees found: ${newSongs.length}`);
  // Task 4: Generate the cards with your new array.
  generateCards(newSongs);  
}