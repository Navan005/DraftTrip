var express = require('express');
const app = express();

app.get('/',function(req,res){
    res.write("<h1> Welcome to home page.</h1>");
});

app.get('/p1',function(req,res){
    res.write("<h1>This is Page 1. </h1>");
});

app.get('/p2',function(req,res){
    res.write("<h1>Worm welcome on Page 2.</h1>");
});

app.get('/p3',function(req,res){
    res.write("<h1>bienvenue à la page 3. (WELCOME TO PAGE 3).</h1>");
});

var server = app.listen(8080,function(){
    var port = server.address().port;
    console.log("Server is running at http://localhost:%s",port);
});