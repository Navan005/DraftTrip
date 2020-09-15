var express = require('express');
const app = express();
var mysql = require('mysql');
var bodyparser = require('body-parser');

var connection = mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"",
    database:'js_db'
});

app.use(bodyparser.json());
app.use(bodyparser.urlencoded({extended:true}));

app.post('/login/',(req,res,next)=>{
    var data = req.body;
    var email = data.email;
    var pass = data.password;

    connection.query("SELECT * FROM user_info WHERE email_id = ?",[email],function(err,result,fields){
        connection.on('error',(err)=>{
            console.log("[MYSQL ERROR]",err);
        });

        if(result && result.length)
        {
            console.log(result);

            if(pass == result[0].password)
            {
                res.json("Login Successfully!");
                res.end;
            }
            else{
                res.json("Password is incorrect!");
                res.end;
            }
            
        }
        else{
            console.log(result);
            res.json("Email is not registered!");
            res.end;
        }
    });
});

var server = app.listen(3000,()=>{
    console.log("Server is running at http://localhost:3000");
});


