<%--
  Created by IntelliJ IDEA.
  User: parinda
  Date: 7/27/16
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<t:wrapper>

    <jsp:attribute name="page_heading">

    </jsp:attribute>

    <jsp:attribute name="page_body">


     <div class="container">
         <div class="row">
             <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1 col-sm-12">

                     <%--<div class="login-box">--%>
                     <%--<form name='loginForm' action="<c:url value='/j_spring_security_check' />" method='POST'>--%>
                     <%--<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">--%>
                     <%--<label class="text-danger">--%>
                     <%--Your login attempt was not successful due to--%>
                     <%--<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>--%>
                     <%--</label>--%>
                     <%--</c:if>--%>
                     <%--<input id="user_username" class="textbox-login" type="text" name="username"--%>
                     <%--placeholder="User Name"/>--%>
                     <%--<input id="user_password" class="textbox-login" type="password" name="password"--%>
                     <%--placeholder="Password"/><br>--%>
                     <%--<input id="btn" class="button-login" type="submit" name="submit" value="Submit"/>--%>
                     <%--</form>--%>
                     <%--</div>--%>

                 <div class="container">
                     <div class="row">
                         <div class="col-sm-6 form-box">
                             <div class="form-top">
                                 <div class="form-top-left">
                                     <h3 class="text-primary">Login</h3>
                                 </div>
                             </div>
                             <div class="form-bottom">
                                 <form name='loginForm' action="<c:url value='/j_spring_security_check' />"
                                       method='POST'>
                                     <c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
                                         <label class="text-danger">
                                             our login attempt was not successful due to
                                             <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>
                                         </label>
                                     </c:if>

                                     <div class="form-group">
                                         <label for="user_username" class="text-primary">Username</label>
                                         <input type="text" class="form-control" id="user_username" name="username"
                                                placeholder="Enter username">
                                     </div>

                                     <div class="form-group">
                                         <label for="user_password" class="text-primary">Password</label>
                                         <input type="password" class="form-control" id="user_password" name="password"
                                                placeholder="Enter password">
                                     </div>

                                     <div class="checkbox">
                                         <label class="text-primary"><input type="checkbox"> Remember me</label>
                                     </div>

                                     <button type="submit" class="btn btn-default">Submit</button>

                                 </form>
                             </div>
                         </div>
                     </div>
                     <div class="row">
                         <div class="col-sm-6">
                             <h3 class="text-primary">or login with</h3>

                             <div class="social-login-buttons">
                                 <a class="btn btn-link-2" href="#">
                                     <i class="fa fa-facebook"></i> Facebook

                                 </a>
                                 <a class="btn btn-link-2" href="#">
                                     <i class="fa fa-twitter"></i> Twitter
                                 </a>
                                 <a class="btn btn-link-2" href="#">
                                     <i class="fa fa-google-plus"></i> Google Plus
                                 </a>
                             </div>
                         </div>
                     </div>
                 </div>

             </div>
         </div>
     </div>

     </jsp:attribute>

    <jsp:attribute name="after_page_body">

    </jsp:attribute>

    <jsp:attribute name="js_inline">

    </jsp:attribute>
</t:wrapper>
