<%-- 
    Document   : NavbarHome
    Created on : May 25, 2022, 8:45:26 AM
    Author     : KhacBao
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container px-4 px-lg-5 d-flex justify-content-center">
        <a class="navbar-brand" href="#!">Foodie</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                <li class="nav-item"><a class="nav-link active" aria-current="page" href="index.html">Blog List</a></li>
                <li class="nav-item"><a class="nav-link" href="#!">Menu</a></li>
                <li class="nav-item"><a class="nav-link" href="#!">About</a></li>
                <li class="nav-item"><a class="nav-link" href="#!">Contact</a></li>
            </ul>
            <form class="d-flex">
                <button class="btn btn-outline-dark" type="submit">
                    <i class="bi-cart-fill me-1"></i>
                    Cart
                    <span class="badge bg-dark text-white ms-1 rounded-pill">0</span>
                </button>
            </form>

        </div>
        <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
            <li class="nav-item dropdown">
<<<<<<< HEAD
<<<<<<< HEAD
                <c:if test="${sessionScope.Account ==null}">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button"
                       data-bs-toggle="dropdown" aria-expanded="false"> <img src="https://cdn.iconscout.com/icon/free/png-256/account-avatar-profile-human-man-user-30448.png" height="40px" width="70%"/>  
                    </a>
                </c:if>
                <c:if test="${sessionScope.Account !=null}">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button"
                       data-bs-toggle="dropdown" aria-expanded="false"> <img src="${sessionScope.Account.imageURL}" class="rounded-circle" alt="A girl" width="50"/>  
                    </a> ${sessionScope.Account.displayname}  
                </c:if>
                <c:if test="${sessionScope.Account ==null}">
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="login">Login</a></li>
                        <li><a class="dropdown-item" href="register">Regsiter</a></li>  
                    </ul>   
                </c:if>
                <c:if test="${sessionScope.Account !=null}">
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="login?do=logout">Logout</a></li>
                        <li><a class="dropdown-item" href="login?do=updateprofile">Update Profile</a></li>  
                    </ul>   
                </c:if>

=======
=======
>>>>>>> f98b872601d39a5ecdca7de7bce7dde0505df997
                <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button"
                   data-bs-toggle="dropdown" aria-expanded="false"> <img src="https://cdn.iconscout.com/icon/free/png-256/account-avatar-profile-human-man-user-30448.png" height="40px" width="70%"/>  
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <li><a class="dropdown-item" href="LoginController?do=login">Login</a></li>
                    <li><a class="dropdown-item" href="RegisterController">Regsiter</a></li>  
                </ul>  
<<<<<<< HEAD
>>>>>>> f98b872601d39a5ecdca7de7bce7dde0505df997
=======
>>>>>>> f98b872601d39a5ecdca7de7bce7dde0505df997
            </li>
        </ul>
    </div>
</nav>
