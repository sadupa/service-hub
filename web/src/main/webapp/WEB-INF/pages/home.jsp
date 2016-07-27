<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:wrapper>

    <jsp:attribute name="page_heading">

    </jsp:attribute>

    <jsp:attribute name="page_body">
 <div class="slider-area">
     <div class="slider">
         <div id="bg-slider" class="owl-carousel owl-theme">

             <%--<link rel="icon" type="image/ico" href="<c:url value="/images/favicon.ico" />"/>--%>

             <div class="item"><img src="<c:url value="/images/slider-image-3.jpg" />" alt="Mirror Edge"></div>
             <div class="item"><img src="<c:url value="/images/slider-image-2.jpg" />" alt="The Last of us"></div>
             <div class="item"><img src="<c:url value="/images/slider-image-1.jpg" />" alt="GTA V"></div>

         </div>
     </div>
     <div class="container slider-content">
         <div class="row">
             <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1 col-sm-12">
                 <h2>Job Searching Just Got So Easy</h2>
                 <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eligendi deserunt deleniti, ullam commodi sit ipsam laboriosam velit adipisci quibusdam aliquam teneturo!</p>
                 <div class="search-form wow pulse" data-wow-delay="0.8s">
                     <form action="" class=" form-inline">
                         <div class="form-group">
                             <input type="text" class="form-control" placeholder="Job Key Word">
                         </div>
                         <div class="form-group">
                             <select name="" id="citySelect" class="form-control">
                                 <option>Select Your City</option>
                                 <option selected>New york, CA</option>
                                 <option>New york, CA</option>
                                 <option>New york, CA</option>
                                 <option>New york, CA</option>
                             </select>
                         </div>
                         <div class="form-group">
                             <select name="" id="categorySelect" class="form-control">
                                 <option>Select Your Category</option>
                                 <option selected>Graphic Design</option>
                                 <option>Web Design</option>
                                 <option>App Design</option>
                             </select>
                         </div>
                         <input type="submit" class="btn" value="Search">


                     </form>
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