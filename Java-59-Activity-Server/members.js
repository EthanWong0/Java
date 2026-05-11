let members, info;

async function init(){
  let link = "https://cautious-telegram-q7j6jjgr97rhxw7j-8400.app.github.dev"; //replace with your Dev URL
  let route= "/members";

  info = await fetch(link+route);
  members = await info.json();

  generateCards(members);
}

function generateCards(members){  
  let output = document.getElementById("centerpanel");
  let build ="";
  
  for(let i=0; i<members.length; i++){
    let member = members[i];
    build += `<div class="card" >`
    build += `<h3> ID </h3>`;
    build += `<p> ${member.MemberID}</p>`;
    build += `<div> First Name </div>`;
    build += `<div2> ${member.FirstName} </div2>`;
    build += `<div> Last Name </div>`;
    build += `<div2> ${member.LastName}</div2>`;
    build += `<hr>`;
    build += `</div>`;
  }
  // Now inject the build content into the output container
  output.innerHTML = build;
}

function filter(){
  let member_id = document.getElementById("member_id").value;

  let newMembers = []; //create a list of songs searched for
  
  for(let i=0; i<members.length;i++){
    let member = members[i] //get each sog
    //make sure the list is no
    if( member.MemberID == member_id){
          //add to the new list
          newMembers.push(member);
       }
  }
  generateCards(newMembers);  
}