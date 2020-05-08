<%@page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="Form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/css/upload.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
    <a class="btn-upload" href="#"><button><i class="fa fa-upload" aria-hidden="true"></i></button></a>
    <a class="btn-login" href="login.html"><button>LOGIN</button></a>
        </span>
</div>
<div class="upload">
    <form:form action="/saveBook" modelAttribute="books" method="POST" enctype="multipart/form-data">
        <form:hidden path="id"/>
        <ul class="form_upload">
            <li>
                <div class="name">
                    <p>Title</p>
                    <form:input path="title" type="text" name="title"></form:input>
                </div>
            </li>
            <li>
                <div class="author">
                    <p><label>Author</label></p>
                    <form:input path="author"></form:input>
</div>
            </li>
            <li>
                <div class="cover_book">
                    <p>Book Cover</p>
                    <input type="file" id="file_photo" name="photo_file">
                    <label for="file_photo">
                        <i class="fa fa-picture-o"></i>
                        Choose Book Cover
                    </label>
                </div>
            </li>
            <li>
                <div class="cover_book">
                    <p>File Content</p>
                    <input type="file" id="file_content" name="content_file">
                    <label for="file_content">
                        <i class="fa fa-file" ></i>
                        Choose Content File
                    </label>
                </div>
            </li>
            <li>
                <div class="description">
                    <p>Description</p>
                    <Form:textarea  path="describe"></Form:textarea>
                </div>
            </li>
            <li>
                <div class="submit">
                    <button type="submit"><i class="fa fa-upload" > UPLOAD</i></button>
                </div>
            </li>


        </ul>
    </form:form>




</div>


</body>
</html>
