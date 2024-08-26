$(document).ready(function () {
    $('#loginForm').validate({
        rules: {
            username: {
                required: true,
                email: true,
            },
            password: {
                required: true,
                maxlength: 16,
                minlength: 8,
            }
        }
    });
});