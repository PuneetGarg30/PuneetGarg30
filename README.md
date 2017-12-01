# PuneetGarg30

<!DOCTYPE html>
<html>
<head>
<style>
body  {
    background-image: url("https://i.imgur.com/Q6urjQ8.jpg");
   
}

body {
    font-family: "Lato", sans-serif;
    transition: background-color .5s;
}

.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: #111;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
}

.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 25px;
    color: green;
    display: block;
    transition: 0.3s;
}

.sidenav a:hover {
    color: blue;
}

.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}

#main {
    transition: margin-left .5s;
    padding: 12px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}

ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: grey;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
	font-family: "Lato", sans-serif;
}

li a:hover:not(.active) {
    background-color: #111;
}

.active {
    background-color: green;
}
#right {
    float: right;
}
.footer {
    background-color: grey;
    height: 50px;
	text-align: center;
}
RightFloatAds{
right: 0px;
position: fixed;
text-align: center;
top: 0px;
}
.fa-facebook {
  background: #3B5998;
  color: white;
}
.fa-linkedin {
  background: #007bb5;
  color: white;
}

.fa-youtube {
  background: #bb0000;
  color: white;
}

.fa-instagram {
  background: #125688;
  color: white;
}

.fa-pinterest {
  background: #cb2027;
  color: white;
}

.fa-snapchat-ghost {
  background: #fffc00;
  color: white;
  text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;
}

.fa-skype {
  background: #00aff0;
  color: white;
}
.fa {
  padding: 20px;
  font-size: 30px;
  width: 50px;
  text-align: center;
  text-decoration: none;
  margin: 5px 2px;
  
}

.fa:hover {
    opacity: 0.7;
}
</style>
</head>
<body>

<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="hyderabad.html">Hyderabad</a>
  <a href="vijayawada.html">Vijayawada</a>
  <a href="vijag.html">Vijag</a>
  
</div>
<script>
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
    document.body.style.backgroundColor = "rgba(0,0,0,0.4)";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft= "0";
    document.body.style.backgroundColor = "white";
}
</script>
<div id="main">
   <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; </span>



<div id="right" class="input-group">
<form action="http://www.google.com/search" class="navbar-form navbar-left" method="get" name="searchform" target="_blank">
<input name="sitesearch" type="hidden" value="">
<input autocomplete="on" class="form-controls search" name="q" placeholder="" required="required" type="text">

<button class="class-button" type="submit">Search</button>
 </form></div>
      </div>





<ul>
  <li><a href="NEW.html">Home</a></li>
  <li><a href="maps.html">Maps</a></li>
  <li><a href="contact.html">Contact</a></li>
  
  <li style="float:right">
  
</li>

<li style="float:right"><a class="active" href="#about">Login/Sign up</a></li>
</ul>

<img src="https://i.imgur.com/WGkmwTh.jpg" alt="Smiley face" height="80" width="80">
<h><font size="10" color="royalgreen"><b>ACE PIPELINES</b></font></h>
 <div id="RightFloatAds" style="right: 0px; position: fixed; text-align: center; top: 0px;"> <div class="w3-content w3-section"  >
 <a href="#" class="fa fa-facebook"></a><br>
 <a href="#" class="fa fa-linkedin"></a><br>
<a href="#" class="fa fa-youtube"></a><br>
<a href="#" class="fa fa-instagram"></a><br>
<a href="#" class="fa fa-pinterest"></a><br>
<a href="#" class="fa fa-snapchat-ghost"></a><br>
<a href="#" class="fa fa-skype"></a>
</div>
</div>

<div class="container">
<br>
<br>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
.mySlides {display:none;}
</style>
<body>

<div class="w3-content w3-section"  >
  <img class="mySlides" src="https://i.imgur.com/OMflz8o.png" height="320" width="500" border="0" align="right">
  <img class="mySlides" src="https://i.imgur.com/Re0GUxe.jpg" height="320" width="500" border="0" align="right">
  <img class="mySlides" src="https://i.imgur.com/sRAf6eP.jpg" height="320" width="500" border="0" align="right">
</div>

<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>
 
</div>

<h><font size="10" color="green"><b>Introduction</b></font></h>
<p><font size="4" color="black"> An integrated oil and gas company is a buisness entity that engages in the exploration, production, refinement and distribution of oil and gas. Given the high entry costs relating to many oil and gas industry operations, many of the world's largest oil and gas companies, like chevron cooperation and Exxon Mobile, are integrated. Typically, integrated companies divide their various operation into categories: upstream, which includes all exploration and production endeavors, and downstream, which is confined to refinement and marketing activities.</font></p>
 <h><font size="6" color="green">What we are going to describe?</font></h>
<p><font size="4" color="black"> We have some new robot technology that can check oil and gas pipes for damage and decay from the inside. We've been testing this technology for a while, and it looks feasible. The robots crawl inside the pipes at about one-tenth Km/hr, and the robots have a Mean Time Between Failure (MTBF) rate of about 1000 km. Assume thta robots can enter an ground pipeline for 1000kms.</p>
<h><font size="6" color="green">What is the basic purpose?</font></h>
<p><font size="4" color="black"> The advanced, remotely operated robotic crawler is tethered by a high-strength, fiber optic cable. The modular-based transporter is completely open ended, and can be equipped with any tool or sensor required to carry out an inspection, providing a wide variety of high quality data.</p>
<br>
<br>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {margin:0;}

.icon-bar {
      width: 100%;
      background-color: #555;
      overflow: auto;
}

.icon-bar a {
      float: left;
      width: 20%;
      text-align: center;
      padding: 12px 0;
      transition: all 0.3s ease;
      color: white;
      font-size: 36px;
}

.icon-bar a:hover {
      background-color:#000;
}

@media screen and (max-height: 450px) {
 .sidenav {padding-top: 15px;}
 .sidenav a {font-size: 18px;}
}
</style>
</head>
<body>


</div>



</body>


<body>


<center>
<iframe src="https://www.google.com/maps/embed?pb=!1m28!1m12!1m3!1d3906761.1031598556!2d78.60865149241961!3d17.014034320708543!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!4m13!3e0!4m5!1s0x3bcb99daeaebd2c7%3A0xae93b78392bafbc2!2sHyderabad%2C+Telangana%2C+India!3m2!1d17.385044!2d78.486671!4m5!1s0x3a39431389e6973f%3A0x92d9c20395498468!2sVisakhapatnam%2C+Andhra+Pradesh%2C+India!3m2!1d17.6868159!2d83.2184815!5e0!3m2!1sen!2sin!4v1507615817766" width="800" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
</center>
</body>
<br>
<br>
</div>
<div class="footer">
Copyright &copy; 2017 Oilcooperations.LTD
</div>
</body>
</html>
