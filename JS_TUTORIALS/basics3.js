var express = require('express');
const app = express();

var mysql = require('mysql');

var connection = mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"",
    database:'js_db'
});

connection.connect(function(err){
    if(err) throw err;
    console.log("Connection Successfully established!");

    var first_name = "Avneet";
    var last_name = "Kaur";
    var mobile_no = "+14382209648";
    var email_id = "avneetkaur0812@gmail.com";
    var password = "av2213$";

    var insert_query = "INSERT  INTO user_info (first_name,last_name,mobile_no,email_id,password) values (?,?,?,?,?)";
    var values = [first_name,last_name,mobile_no,email_id,password];

    connection.query(insert_query,values,function(err,result){
        if(err) throw err;
        console.log("Data Inserted successfully!");
    });
});

var server = app.listen(3000,()=>{
    console.log("Server is running at http://localhost:3000");
});