<%@ tag description="Menu tag to use in pages after login" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-default">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><img src="<c:url value="/images/logo.png"/>" alt=""></a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <div class="button navbar-right">
                <a class="navbar-btn nav-button wow bounceInRight login" data-wow-delay="0.8s"
                   href="<c:url value="/login"/>">Login
                </a>
                <c:if test="${!isSignUpPage}">
                    <a class="navbar-btn nav-button wow fadeInRight sign-up-button" data-wow-delay="0.6s"
                       href="<c:url value="/register/"/>">Sign up</a>
                </c:if>
            </div>
            <ul class="main-nav nav navbar-nav navbar-right">
                <li class="wow fadeInDown" data-wow-delay="0s"><a href="<c:url value="/"/>">Home</a></li>
                <li class="wow fadeInDown" data-wow-delay="0.3s"><a href="<c:url value="/services/add"/>">Create
                    Service</a></li>
                <li class="wow fadeInDown" data-wow-delay="0.3s"><a href="<c:url value="/services/all"/>">Services</a>
                </li>
                <li class="wow fadeInDown" data-wow-delay="0.5s"><a href="<c:url value="/profile/"/>">Profile</a>
                </li>
                <li class="wow fadeInDown" data-wow-delay="0.5s"><a href="<c:url value="/postRequest/"/>">Service Request</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container-fluid -->
</nav>