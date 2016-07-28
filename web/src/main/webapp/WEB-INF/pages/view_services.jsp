<%--
  Created by IntelliJ IDEA.
  User: parinda
  Date: 7/27/16
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<t:wrapper>

    <jsp:attribute name="js_file_includes">
        <script type="text/javascript" src="<c:url value="/js/bootstrap-table.js" />"></script>
    </jsp:attribute>

    <jsp:attribute name="css_file_includes">
        <link rel="stylesheet" type="text/css" href="<c:url value="/css/bootstrap-table.css" />"/>
    </jsp:attribute>


    <jsp:attribute name="page_heading">

    </jsp:attribute>

    <jsp:attribute name="page_body">


     <div class="container">
         <h3 class="text-primary"> Services</h3>

             <%--<table id="table"--%>
             <%--data-toggle="table"--%>
             <%--&lt;%&ndash;data-filter-control="true"&ndash;%&gt;--%>
             <%--&lt;%&ndash;data-filter-show-clear="true"&ndash;%&gt;--%>
             <%--data-search="true"--%>
             <%--data-side-pagination="client"--%>
             <%--data-pagination="true">--%>
             <%--<thead>--%>
             <%--<tr>--%>
             <%--<th data-field="id">ID</th>--%>
             <%--<th data-field="title" data-filter-control="input">Title</th>--%>
             <%--<th data-field="category" data-filter-control="select">Category</th>--%>
             <%--<th data-field="area" data-filter-control="select">Area</th>--%>
             <%--</tr>--%>
             <%--</thead>--%>

             <%--<tbody>--%>
             <%--<c:forEach items="${services}" var="services" varStatus="q1">--%>
             <%--<tr>--%>
             <%--<td class="table-td2">${services.id}</td>--%>
             <%--<td class="table-td2">${services.title}</td>--%>
             <%--<td class="table-td2">${services.category.name}</td>--%>
             <%--<td class="table-td2">${services.area.name}</td>--%>
             <%--</tr>--%>
             <%--</c:forEach>--%>
             <%--</tbody>--%>

             <%--</table>--%>

         <div class="row how-it-work text-center">

             <c:forEach items="${services}" var="services" varStatus="q1">

                 <div class="col-md-4">
                     <div class="single-work wow fadeInUp" data-wow-delay="0.8s">
                         <img src="<c:url value="/images/job-logo${services.id}.png"/>" alt="">

                         <h3>${services.title}</h3>
                         <h4>${services.category.name}</h4>
                         <p><i class="icon-location"></i>${services.area.name}</p>
                         <p>${services.description}</p>
                     </div>
                 </div>

             </c:forEach>
         </div>

     </div>

     </jsp:attribute>

    <jsp:attribute name="after_page_body">

    </jsp:attribute>

    <jsp:attribute name="js_inline">

    </jsp:attribute>
</t:wrapper>

