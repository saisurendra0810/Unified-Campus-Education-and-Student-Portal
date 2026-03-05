function showSignup(){
    document.getElementById("signup").style.display="block";
    document.getElementById("login").style.display="none";
}

function showLogin(){
    document.getElementById("signup").style.display="none";
    document.getElementById("login").style.display="block";
}

function signup(){

    let user=document.getElementById("signupUser").value;
    let pass=document.getElementById("signupPass").value;

    if(user=="" || pass==""){
        alert("Please fill all fields");
        return;
    }

    localStorage.setItem("studentUser",user);
    localStorage.setItem("studentPass",pass);

    alert("Signup successful! Please login.");
    showLogin();
}

function login(){

    let user=document.getElementById("loginUser").value;
    let pass=document.getElementById("loginPass").value;

    let savedUser=localStorage.getItem("studentUser");
    let savedPass=localStorage.getItem("studentPass");

    if(user==savedUser && pass==savedPass){

        document.getElementById("login").style.display="none";
        document.getElementById("dashboard").style.display="block";

    }else{
        alert("Invalid Login");
    }
}

function logout(){
    location.reload();
}

function showSection(section){

    let content=document.getElementById("contentArea");

    if(section=="classes"){
        content.innerHTML=`
        <h2>Classes</h2>
        <div class="card">Mathematics</div>
        <div class="card">Computer Science</div>
        <div class="card">Physics</div>`;
    }

    if(section=="assignments"){
        content.innerHTML=`
        <h2>Assignments</h2>
        <div class="card">Java Programming Assignment</div>
        <div class="card">Math Integration Problems</div>`;
    }

    if(section=="exams"){
        content.innerHTML=`
        <h2>Exams</h2>
        <div class="card">Mid Exam - 20 Feb</div>
        <div class="card">Final Exam - 30 March</div>`;
    }

    if(section=="courses"){
        content.innerHTML=`
        <h2>Courses</h2>
        <div class="card">B.Tech CSE</div>
        <div class="card">Data Structures</div>`;
    }

    if(section=="results"){
        content.innerHTML=`
        <h2>Results</h2>
        <div class="card">Math: 85 Marks</div>
        <div class="card">Java: 90 Marks</div>`;
    }

    if(section=="timetable"){
        content.innerHTML=`
        <h2>Timetable</h2>
        <div class="card">Mon: Math</div>
        <div class="card">Tue: Java</div>
        <div class="card">Wed: Physics</div>`;
    }

    if(section=="attendance"){
        content.innerHTML=`
        <h2>Attendance</h2>
        <div class="card">Math: 90%</div>
        <div class="card">Java: 95%</div>`;
    }

    if(section=="notifications"){
        content.innerHTML=`
        <h2>Notifications</h2>
        <div class="card">New Assignment Uploaded</div>
        <div class="card">Exam Schedule Released</div>`;
    }

}