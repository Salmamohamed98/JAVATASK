/**
 * 
 */
 function validateForm() {
      var name = document.forms["registration"]["name"].value;
      var email = document.forms["registration"]["email"].value;
      var password = document.forms["registration"]["password"].value;

      // Validate name
      if (name == "") {
       var ename=document.getElementById("nerr");
       ename.style.visibility=true;
        }

      // Validate email
      if (email == "") {
         var emrr=document.getElementById("merr");
       emrr.style.visibility=true;
      }

      // Validate password
      if (password == "") {
		   var epass=document.getElementById("perr");
       epass.style.visibility=true;
        
      }}