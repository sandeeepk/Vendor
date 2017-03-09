<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<img src="../images/banner.jpg" width="600" height="120"/>
<html>
<head>
<style>
body {margin: 0;}

ul.sidenav {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 25%;
    background-color: #f1f1f1;
    position: fixed;
    height: 100%;
    overflow: auto;
}

ul.sidenav li a {
    display: block;
    color: #000;
    padding: 8px 16px;
    text-decoration: none;
}
 
ul.sidenav li a.active {
    background-color: #4CAF50;
    color: white;
}

ul.sidenav li a:hover:not(.active) {
    background-color: #555;
    color: white;
}

div.content {
    margin-left: 25%;
    padding: 1px 16px;
    height: 1000px;
}

@media screen and (max-width: 1050px){
    ul.sidenav {
        width:100%;
        height:auto;
        position:relative;
    }
    ul.sidenav li a {
        float: left;
        padding: 15px;
    }
    div.content {margin-left:0;}
}

@media screen and (max-width: 400px){
    ul.sidenav li a {
        text-align: center;
        float: none;
    }
}
</style>
</head>
<body>

<ul class="sidenav">
  <li><a href="regLoc">Location</a></li>
  <li><a href="regFile">Document</a></li>
  <li><a href="regVen">Vendor</a></li>
  <li><a href="#about">About</a></li>
</ul>
</html>