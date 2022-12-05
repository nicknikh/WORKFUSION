function submitted()
        {
            var flag = true;
            var name = document.getElementById("name").value;
            var age = document.getElementById("age").value;
            var phoneNumber = document.getElementById("phoneNumber").value;
            var city = document.getElementById("city").value;
            if(age < 18)
            {
                alert("age cant be less than 18");
                flag = false;
            }
            if(phoneNumber.toString().length != 10)
            {
                alert("phone number should have 10 digits")
                flag = false;
            }
            if(name.length == 0 || city.length == 0)
            {
                alert("Cant register");
                flag=false;
            }
            if(flag)
            {
                alert(`hello ${name}, welcome to front end`);
            }
        }