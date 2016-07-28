<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:wrapper>

    <jsp:attribute name="page_heading">

    </jsp:attribute>

    <jsp:attribute name="page_body">
  <div class="container">

           <div class="row">
               <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1 col-sm-12">
                   <div class="search-form wow pulse" data-wow-delay="0.8s">
                       <form action="<c:url value='/postRequest/view'/>" class=" form-inline"  method="GET" >
                           <div class="form-group">
                               <input type="text" class="form-control" placeholder="Job Key Word" name="keyword">
                           </div>
                           <div class="form-group">
                               <select name="area" id="citySelect" class="form-control">
                                   <c:forEach items="${area}" var="area" varStatus="status">
                                       <option value="${area.id}">${area.name}</option>
                                   </c:forEach>
                               </select>
                           </div>
                           <div class="form-group">
                               <select name="category" id="categorySelect" class="form-control">
                                   <c:forEach items="${category}" var="category" varStatus="status">
                                       <option value="${category.id}">${category.name}</option>
                                   </c:forEach>
                               </select>
                           </div>
                           <input type="submit" class="btn" value="Search">
                       </form>
                   </div>
               </div>
           </div>


      <div class="row page-title text-center wow bounce" data-wow-delay="1s">
          <h5>Recent Service Requests</h5>

          <h2><span>54716</span> Available Service Requests</h2>
      </div>
      <div class="row jobs">
          <div class="col-md-12">
              <div class="job-posts table-responsive">
                  <table class="table">
                      <c:forEach items="${service}" var="service" varStatus="status">
                      <tr class="odd wow fadeInUp" data-wow-delay="1s">
                          <td class="tbl-logo"><img src="<c:url value="/images/job-logo${service.random}.png"/>" alt=""></td>
                          <td class="tbl-title"><h4>${service.title}
                              <br><span class="job-type">${service.createdOn}</span>
                          </h4></td>
                          <td><p>${service.description}...</p></td>
                          <td><p><i class="icon-location"></i>${service.area}</p></td>
                          <td class="tbl-apply"><a href="${pageContext.request.contextPath}/postRequest/bid-service?id=${service.id}">Bid now</a></td>
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