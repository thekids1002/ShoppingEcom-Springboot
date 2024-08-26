$(document).ready(function () {
    $('#userRegister').validate({
        rules: {
            name: {
                required: true,
            },
            mobileNumber :{
                required: true,
            },
            email :{
                required: true,
            },
            address :{
                required: true,
            },
            city :{
                required: true,
            },
            state :{
                required: true,
            },
            pincode :{
                required: true,
            },
            password :{
                required: true,
            },
            confirmpassword :{
                required: true,
            },
            img :{
                required: true,
            },  
        },

    });
});