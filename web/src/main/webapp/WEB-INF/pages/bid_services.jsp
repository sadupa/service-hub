<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:wrapper>

    <jsp:attribute name="page_heading">

    </jsp:attribute>

    <jsp:attribute name="page_body">
 <div class="container">
   <c:forEach items="${service}" var="service" varStatus="status">
   <div class="row jobs">
     <div class="col-md-12">
       <div class="job-posts table-responsive">
           <div class="col-md-1 tbl-logo">
             <img src="<c:url value="/images/job-logo${service.random}.png"/>" alt="">
           </div>
           <div class="col-md-9 pull-left">
             <h4>${service.title}
               <br>
               <p><i class="icon-location"></i>${service.area}</p>
               <span style="font-weight: normal;color: #c2c2c2; ">${service.createdOn}</span>
             </h4>
           </div>
           <div class="col-md-2 pull-right btn">
             <button type="button" class="btn btn-custom">Bid Now</button>
             <%--<a href="${pageContext.request.contextPath}/postRequest/bid-service?id=${service.id}">Bid now</a>--%>
           </div>
       </div>
     </div>
   </div>
     <div class="row jobs">
       <div class="col-md-12">
         <div class="job-posts table-responsive">
           <div class="col-md-12">
             <p>${service.description}</p>
           </div>
         </div>
       </div>
     </div>


     <div class="row testimonial">
       <div class="col-md-10">
           <table class="table">
             <c:forEach items="${bid}" var="bid" varStatus="status">
                 <tr>
                     <div class="item">
                         <td>
                             <div class="client-face">
                                 <img src="<c:url value="/images/client-face${bid.random}.png"/>" alt="">
                             </div>
                         </td>
                         <td>
                             <div class="client-text">
                                 <h4><strong>${bid.user}, </strong><i>Rs: ${bid.amount}</i></h4>

                                 <p>${bid.description}</p>
                             </div>
                         </td>
                     </div>
                 </tr>
             </c:forEach>
           </table>
       </div>
     </div>


   </c:forEach>
 </div>
     </jsp:attribute>

    <jsp:attribute name="after_page_body">

    </jsp:attribute>

    <jsp:attribute name="js_inline">

    </jsp:attribute>
</t:wrapper>