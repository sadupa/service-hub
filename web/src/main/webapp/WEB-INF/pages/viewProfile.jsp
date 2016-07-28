<%--
  Created by IntelliJ IDEA.
  User: yasitha
  Date: 7/28/16
  Time: 3:22 PM
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
        <style>
            .page-title {
                padding-top: 15px;
                padding-bottom: 15px;
            }
            .page-content h5 {
                text-transform: none;
                text-decoration: none;
            }
            .page-content {
                padding-top: 15px;
                padding-bottom: 15px;
            }
            .container {
                padding-top: 15px;
                padding-bottom: 30px;
            }
            .page-content:hover {
                background-color: #f3f6f5;
            }
        </style>
          <div class="container">
              <div class="row page-title wow bounce animated" data-wow-delay="1s"
                   style="visibility: visible; animation-delay: 1s; animation-name: bounce;">
                  <div class="col-md-8"><h2 style="color: #00AEEF">Profile<a href=""><span class="glyphicon glyphicon-edit"></span></a></h2></div>
              </div>

              <div class="row">

                  <div class="col-md-6">

                      <div class="row page-content wow bounce animated" data-wow-delay="1s"
                           style="visibility: visible; animation-delay: 1s; animation-name: bounce;">
                          <div class="col-md-5"><h5>Name</h5></div>

                          <div class="col-md-7"><h5><span>${profile.name}</span></h5></div>
                      </div>

                      <div class="row page-content wow bounce animated" data-wow-delay="1s"
                           style="visibility: visible; animation-delay: 1s; animation-name: bounce;">
                          <div class="col-md-5"><h5>UserName</h5></div>


                          <div class="col-md-7"><h5><span>${user.name}</span></h5></div>
                      </div>

                      <div class="row page-content wow bounce animated" data-wow-delay="1s"
                           style="visibility: visible; animation-delay: 1s; animation-name: bounce;">
                          <div class="col-md-5"><h5>Mobile No</h5></div>

                          <div class="col-md-7"><h5><span>${profile.mobileNo}</span></h5></div>
                      </div>

                      <div class="row page-content wow bounce animated" data-wow-delay="1s"
                           style="visibility: visible; animation-delay: 1s; animation-name: bounce;">
                          <div class="col-md-5"><h5>Summary</h5></div>

                          <div class="col-md-7"><h5><span>${profile.summary}</span></h5></div>
                      </div>

                  </div>

                  <div class="col-md-6">
                      <div class="pull-right">
                          <img src="<c:url value="/images/team-small-2.jpg"/>" class="img-responsive"/>
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

