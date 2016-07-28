<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:wrapper>

    <jsp:attribute name="page_heading">

    </jsp:attribute>

    <jsp:attribute name="page_body">
 <div class="slider-area" style="margin-top: -30px;">
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
                 <h2>Service Searching Just Got So Easy</h2>

                 <p>Users create a request for a service, detailing their specific requirements.
                     Service-Hub then generates the request and sends it out to the closest service-providers in your vicinity.</p>

                 <div class="search-form wow pulse" data-wow-delay="0.8s">
                     <form action="<c:url value='/view'/>" class=" form-inline"  method="GET" >
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
     </div>
 </div>


     <div class="content-area">
         <div class="container">
             <div class="row page-title text-center wow zoomInDown" data-wow-delay="1s">
                 <h5>Our Process</h5>

                 <h2>How we work for you?</h2>
                 <p>Users create a request for a service, detailing their specific requirements.
                     Service-Hub then generates the request and sends it out to the closest service-providers in your vicinity via SMS.</p>
             </div>
             <div class="row how-it-work text-center">
                 <div class="col-md-4">
                     <div class="single-work wow fadeInUp" data-wow-delay="0.8s">
                         <img src="<c:url value="images/how-work1.png"/>" alt="">

                         <h3>Searching for the best job</h3>

                         <p>Using the outcomes from the job, we will put together a plan for the most effective
                             marketing strategy to get the best results.</p>
                     </div>
                 </div>
                 <div class="col-md-4">
                     <div class="single-work  wow fadeInUp" data-wow-delay="0.9s">
                         <img src="<c:url value="images/how-work2.png"/>" alt="">

                         <h3>Searching for the best job</h3>

                         <p>Using the outcomes from the job, we will put together a plan for the most effective
                             marketing strategy to get the best results.</p>
                     </div>
                 </div>
                 <div class="col-md-4">
                     <div class="single-work wow fadeInUp" data-wow-delay="1s">
                         <img src="<c:url value="images/how-work3.png"/> " alt="">

                         <h3>Searching for the best job</h3>

                         <p>Using the outcomes from the job, we will put together a plan for the most effective
                             marketing strategy to get the best results.</p>
                     </div>
                 </div>
             </div>
         </div>
         <hr>

         <div class="container">
             <div class="row job-posting wow fadeInUp" data-wow-delay="1s">
                 <div role="tabpanel">
                     <!-- Nav tabs -->
                     <ul class="nav nav-tabs" role="tablist">
                         <li role="presentation" class="active"><a href="#job-seekers" aria-controls="home" role="tab"
                                                                   data-toggle="tab">Job Seekers</a></li>
                         <li role="presentation"><a href="#employeers" aria-controls="profile" role="tab"
                                                    data-toggle="tab">Employeers</a></li>
                     </ul>

                     <!-- Tab panes -->
                     <div class="tab-content">
                         <div role="tabpanel" class="tab-pane fade in active" id="job-seekers">
                             <ul class="list-inline job-seeker">
                                 <li>
                                     <a href="">
                                         <img src="<c:url value="images/team-small-5.jpg"/>" alt="">

                                         <div class="overlay"><h3>Ohidul Islam</h3>

                                             <p>Web Designer</p></div>
                                     </a>
                                 </li>
                                 <li>
                                     <a href="">
                                         <img src="<c:url value="images/team-small-6.jpg"/>" alt="">

                                         <div class="overlay"><h3>Mohidul Islam</h3>

                                             <p>CEO</p></div>
                                     </a>
                                 </li>
                                 <li>
                                     <a href="">
                                         <img src="<c:url value="images/team-small-3.jpg"/> " alt="">

                                         <div class="overlay"><h3>Unknown girl</h3>

                                             <p>Graphic Designer</p></div>
                                     </a>
                                 </li>
                                 <li>
                                     <a href="">
                                         <img src="<c:url value="images/team-small-4.jpg"/>" alt="">

                                         <div class="overlay"><h3>Eftakher Alam</h3>

                                             <p>Graphic Designer</p></div>
                                     </a>
                                 </li>
                                 <li>
                                     <a href="">
                                         <img src="<c:url value="images/team-small-2.jpg"/>" alt="">

                                         <div class="overlay"><h3>Mark Otto</h3>

                                             <p>Founder</p></div>
                                     </a>
                                 </li>
                                 <li>
                                     <a href="">
                                         <img src="<c:url value="images/team-small-1.jpg"/>" alt="">

                                         <div class="overlay"><h3>Rasel Ahmed</h3>

                                             <p>Web Developer</p></div>
                                     </a>
                                 </li>
                             </ul>
                         </div>
                         <div role="tabpanel" class="tab-pane fade" id="employeers">
                             <ul class="list-inline">
                                 <li>
                                     <a href="">
                                         <img src="<c:url value="images/employee4.png"/>" alt="">

                                         <div class="overlay"><h3>Instagram</h3></div>
                                     </a>
                                 </li>
                                 <li>
                                     <a href="">
                                         <img src="<c:url value="images/employee5.png"/>" alt="">

                                         <div class="overlay"><h3>Microsoft</h3></div>
                                     </a>
                                 </li>
                                 <li>
                                     <a href="">
                                         <img src="<c:url value="images/employee6.png"/>" alt="">

                                         <div class="overlay"><h3>Dribbble</h3></div>
                                     </a>
                                 </li>
                                 <li>
                                     <a href="">
                                         <img src="<c:url value="images/employee1.png"/>" alt="">

                                         <div class="overlay"><h3>Beats Music</h3></div>
                                     </a>
                                 </li>
                                 <li>
                                     <a href="">
                                         <img src="<c:url value="images/employee2.png"/>" alt="">

                                         <div class="overlay"><h3>Facebook</h3></div>
                                     </a>
                                 </li>
                                 <li>
                                     <a href="">
                                         <img src="<c:url value="images/employee3.png"/>" alt="">

                                         <div class="overlay"><h3>Twitter</h3></div>
                                     </a>
                                 </li>
                             </ul>
                         </div>
                     </div>

                 </div>
             </div>
         </div>
         <hr>

         <div class="container">
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
                                     <td class="tbl-logo"><img src="<c:url value="images/job-logo${service.id}.png"/>" alt=""></td>
                                     <td class="tbl-title"><h4>${service.title}
                                         <br><span class="job-type">${service.createdOn}</span>
                                     </h4></td>
                                     <td><p>${service.description}...</p></td>
                                     <td><p><i class="icon-location"></i>${service.area}</p></td>
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
         <hr>

         <div class="container">
             <div class="row page-title text-center  wow bounce" data-wow-delay=".7s">
                 <h5>TESTIMONIALS</h5>

                 <h2>WHAT PEOPLES ARE SAYING</h2>
             </div>
             <div class="row testimonial">
                 <div class="col-md-12">
                     <div id="testimonial-slider">
                         <div class="item">
                             <div class="client-text">
                                 <p>Jobify offer an amazing service and I couldn’t be happier! They
                                     are dedicated to helping recruiters find great candidates, wonderful service!</p>
                                 <h4><strong>Ohidul Islam, </strong><i>Web Designer</i></h4>
                             </div>
                             <div class="client-face wow fadeInRight" data-wow-delay=".9s">
                                 <img src="<c:url value="images/client-face1.png"/>" alt="">
                             </div>
                         </div>
                         <div class="item">
                             <div class="client-text">
                                 <p>Jobify offer an amazing service and I couldn’t be happier! They
                                     are dedicated to helping recruiters find great candidates, wonderful service!</p>
                                 <h4><strong>Ohidul Islam, </strong><i>Web Designer</i></h4>
                             </div>
                             <div class="client-face">
                                 <img src="<c:url value="images/client-face2.png"/>" alt="">
                             </div>
                         </div>
                         <div class="item">
                             <div class="client-text">
                                 <p>Jobify offer an amazing service and I couldn’t be happier! They
                                     are dedicated to helping recruiters find great candidates, wonderful service!</p>
                                 <h4><strong>Ohidul Islam, </strong><i>Web Designer</i></h4>
                             </div>
                             <div class="client-face">
                                 <img src="<c:url value="images/client-face1.png"/>" alt="">
                             </div>
                         </div>
                         <div class="item">
                             <div class="client-text">
                                 <p>Jobify offer an amazing service and I couldn’t be happier! They
                                     are dedicated to helping recruiters find great candidates, wonderful service!</p>
                                 <h4><strong>Ohidul Islam, </strong><i>Web Designer</i></h4>
                             </div>
                             <div class="client-face">
                                 <img src="<c:url value="images/client-face2.png"/>" alt="">
                             </div>
                         </div>
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