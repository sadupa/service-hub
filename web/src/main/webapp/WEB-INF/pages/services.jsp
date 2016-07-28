<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:wrapper>

    <jsp:attribute name="page_heading">

    </jsp:attribute>

    <jsp:attribute name="page_body">
  <div class="container">
      <div class="row page-title text-center wow bounce" data-wow-delay="1s">
          <h5>Recent Jobs</h5>

          <h2><span>54716</span> Available jobs for you</h2>
      </div>
      <div class="row jobs">
          <div class="col-md-9">
              <div class="job-posts table-responsive">
                  <table class="table">
                      <c:forEach items="${service}" var="service" varStatus="status">
                      <tr class="odd wow fadeInUp" data-wow-delay="1s">
                          <td class="tbl-logo"><img src="<c:url value="images/job-logo1.png"/>" alt=""></td>
                          <td class="tbl-title"><h4>"${service.title}"
                              <br><span class="job-type">"${service.createdOn}"</span>
                          </h4></td>
                          <td><p>"${service.description}"...</p></td>
                          <td><p><i class="icon-location"></i>"${service.area}"</p></td>
                          <td><p>&dollar; 14000</p></td>
                          <td class="tbl-apply"><a href="#">Apply now</a></td>
                      </tr>
                      </c:forEach>
                  </table>
              </div>
              <div class="more-jobs">
                  <a href=""> <i class="fa fa-refresh"></i>View more jobs</a>
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