<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
             <img  src="<c:url value="/images/job-logo${service.random}.png"/>" alt="">
           </div>
           <div class="col-md-9 pull-left">
             <h4>${service.title}
               <br>
               <p><i class="icon-location"></i>${service.area}</p>
               <span style="font-weight: normal;color: #c2c2c2; ">${service.createdOn}</span>
             </h4>
           </div>
           <div class="col-md-2 pull-right btn">
               <c:if test="${service.accepted == false}">
             <button type="button" class="btn btn-custom"  data-toggle='modal' data-request-id="${service.id}"
                     data-target='.create-bid-modal'>Bid Now</button>
               </c:if>
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
                         <td style="width: 60px">
                             <div class="client-face">
                                 <img style="width: 98px;height: 98px;" src="<c:url value="/images/client-face${bid.random}.png"/>" alt="">
                             </div>
                         </td>
                         <td style="width: 700px">
                             <div class="client-text">
                                 <h4><strong>${bid.user}, </strong><i class="pull-right" style="font-size: 16px">Rs: ${bid.amount}</i></h4>

                                 <p>${bid.description}</p>
                             </div>
                         </td>
                         <td>
                            <h4>Reputation:<br><strong style="font-size: 25px">3.0</strong><strong style="font-size: 12px">/5</strong></h4>
                             <br> <div class="ui star rating" data-rating="3"></div>
                         </td>
                     <td>
                         <c:if test="${service.accepted == true}">
                             <c:if test="${service.bid == bid.id}">
                                 <i class="fa fa-check fa-5x"></i>
                                 <button type="button" class="btn btn-custom" onclick="location.href='<c:url value="/rating/rate?id=${service.id}"/>'">Rate Now</button>
                             </c:if>
                         </c:if>
                         <c:if test="${service.accepted == false}">
                             <button type="button" class="btn btn-custom" data-toggle='modal' data-bid-id="${bid.id}"
                                     data-request-id="${request}"
                                     data-target='.accept-bid-modal'>Accept
                             </button>
                         </c:if>
                     </td>
                 </tr>
             </c:forEach>
           </table>
       </div>
     </div>


   </c:forEach>
 </div>
     </jsp:attribute>

    <jsp:attribute name="after_page_body">
         <jsp:include page="bid.jsp"/>
        <jsp:include page="bid_accept.jsp"/>
    </jsp:attribute>

    <jsp:attribute name="js_inline">
        <script type="text/javascript">
            $('.ui.rating')
                    .rating({
                        initialRating: 3,
                        maxRating: 5
                    })
            ;
            $('.ui.rating')
                    .rating('disable')
            ;

            $('.create-bid-modal').on('show.bs.modal', function (event) {
                var button = $(event.relatedTarget);
                var requestId = button.data('requestId');

                var modal = $(this);
                modal.find('#request-id-input').val(requestId);
            });

            $('.accept-bid-modal').on('show.bs.modal', function (event) {
                var button = $(event.relatedTarget);
                var requestId = button.data('requestId');
                var bidId = button.data('bidId')

                var modal = $(this);
                modal.find('#request-id-accept').val(requestId);
                modal.find('#bid-id-accept').val(bidId);
            });


        </script>
    </jsp:attribute>
</t:wrapper>