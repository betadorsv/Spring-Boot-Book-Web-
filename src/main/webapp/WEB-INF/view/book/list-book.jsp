<%@page pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="f"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/index.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="css/list-book.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        .container {
            margin-top: 20px;
            background-color: #0d0d0d;
        }
    </style>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <title>Storri</title>
</head>
<body>
<div class="nav-bar">
    <a class="logo" href="${pageContext.request.contextPath}/list-book"><img src="img/header_logo.png" alt="Stori" style="width:200px;height:40px"></a>
    <nav>
        <ul class="box-search">
            <li><input class="input-search" type="text" placeholder="Search..."></li>
            <li><a class="btn-search" href="#"><i class="fa fa-search"></i></a></li>
        </ul>
    </nav>
    <span>
    <a class="btn-upload" href="${pageContext.request.contextPath}/upload"><button><i class="fa fa-upload" aria-hidden="true"></i></button></a>
    <a class="btn-login" href="login.html"><button>LOGIN</button></a>
        </span>
</div>

<div class="container">
    <h4 class="text-center" style="color: #c4c4c4">New Books</h4>
    <div class="row row-cols-6">
        <c:forEach var="bk" items="${books}">
        <div class="col">
            <div class="colu">
            <div class="image">
                <img src="/FileUpload/image/${bk.book_cover}" class="w-100" alt="${bk.book_cover}">
            </div>
            <div class="detail">

                <a href="">
                    <h2>${bk.title}</h2>

                </a>
                <h4>${bk.author}</h4>
                <span class="badge badge-warning">SELF-HELP</span>
                <p></p>
                <p>${bk.describe}</p>
            </div>
            </div>
        </div>
        </c:forEach>
    </div>
</div>



</body>
</html>