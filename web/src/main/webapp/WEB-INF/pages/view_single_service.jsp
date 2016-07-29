<%--
  Created by IntelliJ IDEA.
  User: interview
  Date: 7/28/16
  Time: 8:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>

<t:wrapper>

    <jsp:attribute name="js_file_includes">
        <script type="text/javascript" src="<c:url value="/js/lightbox.js" />"></script>
    </jsp:attribute>

    <jsp:attribute name="css_file_includes">
        <link rel="stylesheet" type="text/css" href="<c:url value="/css/lightbox.css" />"/>
    </jsp:attribute>


    <jsp:attribute name="page_heading">

    </jsp:attribute>

    <jsp:attribute name="page_body">

     <div class="container">


         <div class="row">

             <div class="col-lg-8">

                 <div class="row">
                     <div class="col-sm-2">
                         <img src="<c:url value="/images/job-logo${service.imageId}.png"/>" alt="">
                     </div>
                     <div class="col-sm-8">
                         <h3>${service.title}</h3>
                         <h5>${service.category.name}</h5>
                     </div>
                 </div>
                 <hr/>
                 <p style="font-size: 16px;">${service.description}</p>

                 <p><i class="icon-location"></i>${service.area.name}</p>
                 <hr/>
                 <c:forEach items="${service.tags}" var="tag">
                     <span class="label label-info">${tag.name}</span>
                 </c:forEach>
                 <hr/>

             </div>

             <div class="col-lg-4">
                 <a class="example-image-link" href="<c:url value="/images/wedding1.jpg"/>" data-lightbox="example-set"><img class="example-image" style="width: 170px;height: 220px" src="<c:url value="/images/wedding1.jpg"/>" alt=""/></a>
                 <a class="example-image-link" href="<c:url value="/images/wedding2.jpg"/>" data-lightbox="example-set"><img class="example-image" style="width: 170px;height: 220px" src="<c:url value="/images/wedding2.jpg"/>" alt=""/></a>
                 <a class="example-image-link" href="<c:url value="/images/wedding3.jpg"/>" data-lightbox="example-set"><img class="example-image" style="width: 170px;height: 220px" src="<c:url value="/images/wedding3.jpg"/>" alt="" /></a>
                 <a class="example-image-link" href="<c:url value="/images/wedding4.jpg"/>" data-lightbox="example-set"><img class="example-image" style="width: 170px;height: 220px" src="<c:url value="/images/wedding4.jpg"/>" alt="" /></a>
             </div>

         </div>

     </div>

     </jsp:attribute>

    <jsp:attribute name="after_page_body">

    </jsp:attribute>

    <jsp:attribute name="js_inline">

    </jsp:attribute>
</t:wrapper>


