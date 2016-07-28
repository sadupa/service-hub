<%--
  Created by IntelliJ IDEA.
  User: yasitha
  Date: 7/27/16
  Time: 9:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:wrapper>

    <jsp:attribute name="page_heading">

    </jsp:attribute>

    <jsp:attribute name="page_body">

        <div>
            <div class="container">
                <div class="row">
                    <div class="col-md-9">
                        <img src="<c:url value="/images/reg_page_banner.png"/>" class="img-responsive">
                    </div>

                    <div class="col-md-3" style="padding: 10px 0 50px 0; color: #92A1AE!important;">

                        <c:if test="${msg != null}">
                            <div class="alert alert-${css} alert-dismissible" role="alert">
                                <button type="button" class="close" data-dismiss="alert">
                                    <span aria-hidden="true">&times;</span>
                                    <span class="sr-only">Close</span>
                                </button>
                                <strong> ${msg} </strong>
                            </div>
                        </c:if>

                        <h2>Sign Up</h2>
                        <form role="form" action="<c:url value="/register/user/save"/>" method="post">
                            <div class="form-group">
                                <label for="txtName">Name</label>
                                <input type="text" class="form-control" id="txtName" name="name" required="required">
                            </div>

                            <div class="form-group">
                                <label for="txtName">Email</label>
                                <input type="email" class="form-control" id="txtEmail" name="email" required="required">
                            </div>

                            <div class="form-group">
                                <label for="password">Password</label>
                                <input type="password" class="form-control" id="password" name="password" required="required">
                            </div>

                            <div class="form-group">
                                <label for="pwd-re">Password re-Type</label>
                                <input type="password" class="form-control" name="pwd-re" id="pwd-re">
                            </div>

                            <button type="submit" class="btn btn-sign-up">Sign Up</button>
                        </form>

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
