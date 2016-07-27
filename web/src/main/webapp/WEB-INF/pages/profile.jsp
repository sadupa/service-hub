<%--
  Created by IntelliJ IDEA.
  User: yasitha
  Date: 7/27/16
  Time: 2:15 PM
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

        <div style="background-color: #e6e6e6;">
          <div class="container">
            <div class="row">
              <div class="col-md-10" style="padding: 10px 0 50px 0">

                <c:if test="${msg != null || user == null}">
                  <div class="alert alert-${css} alert-dismissible" role="alert">
                    <button type="button" class="close" data-dismiss="alert">
                      <span aria-hidden="true">&times;</span>
                      <span class="sr-only">Close</span>
                    </button>
                    <strong> ${msg} </strong>
                  </div>
                </c:if>

                <h2 style="color: #00AEEF">Profile</h2>
                <form role="form" action="<c:url value="/profile/save"/>" method="post">
                  <div class="form-group">
                    <label for="txtName">Profle Name</label>
                    <input type="text" class="form-control" id="txtName" name="name"/>
                  </div>

                  <div class="form-group">
                    <label for="txtName">Summery</label>
                    <textarea class="form-control" id="txtEmail" name="summary" rows="5" id="summary"></textarea>
                  </div>

                  <div class="form-group">
                    <label for="mobileNo">Mobile No</label>
                    <input type="tel" class="form-control" id="mobileNo" name="mobileNo"/>
                  </div>

                  <input type="hidden" name="user" value="${user.id}"/>

                  <button type="submit" class="btn btn-sign-up">Save</button>
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

