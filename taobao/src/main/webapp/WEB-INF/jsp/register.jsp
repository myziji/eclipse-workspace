<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Register</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

    <div class="container">

        <div class="card o-hidden border-0 shadow-lg my-5">
            <div class="card-body p-0">
                <!-- Nested Row within Card Body -->
                <div class="row">
                    <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                    <div class="col-lg-7">
                        <div class="p-5">
                            <div class="text-center">
                                <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
                            </div>
                            <form id="register" action="register" method="post">
                                <label>Username: </label>
                                <input type="text" name="username">
                                <br/>
                                <label>Password: </label>
                                <input type="text" name="password">
                                <br/>
                                <label>role: </label>
                                <input type="text" name="role">
                                <br/>
                                <label>firstname: </label>
                                <input type="text" name="firstname">
                                <br/>
                                <label>lastname: </label>
                                <input type="text" name="lastname">
                                <br/>
                                <label>city: </label>
                                <input type="text" name="city">
                                <br/>
                                <label>state: </label>
                                <input type="text" name="state">
                                <br/>
                                <label>zipcode: </label>
                                <input type="text" name="zipcode">
                                <br/>
                                <label>email: </label>
                                <input type="text" name="email">
                                <br/>
                                <label>address: </label>
                                <input type="text" name="address">
                                <br/>
                                <label>id: </label>
                                <input type="text" name="id">
                                <br/>
                                <button>Submit</button>
                            </form>
                            <hr>
                            <div class="text-center">
                                <a class="small" href="forgot-password">Forgot Password?</a>
                            </div>
                            <div class="text-center">
                                <a class="small" href="login">Already have an account? Login!</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

</body>

</html>