<%--
  Created by IntelliJ IDEA.
  User: yasitha
  Date: 7/28/16
  Time: 9:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: yasitha
  Date: 7/27/16
  Time: 9:18 AM
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
            .description {
                color: #6c6c6c;
                /*font-weight: 600;*/
            }

            .box {
                padding: 40px 20px 40px 40px;
                margin: 10px 0px;
                background-color: #fbfbfb;
            }

            }
        </style>

          <div class="container">
              <h2>Rate Service</h2>

              <c:choose>
                  <c:when test="${saveSuccess == true}">
                      <div class="alert alert-success alert-dismissible" role="alert">
                          <button type="button" class="close" data-dismiss="alert">
                              <span aria-hidden="true">&times;</span>
                              <span class="sr-only">Close</span>
                          </button>
                          <strong>Successfully rated</strong>
                      </div>
                  </c:when>
                  <c:otherwise>
                      <div class="box">
                          <div class="row description">
                              <div class="col-md-6"><h5>quality of Work</h5></div>
                              <div class="col-md-6">
                                  <div class="pull-right" style="padding-right: 50px;">
                                      <div class="ui star rating" data-rating="3" id="q"></div>
                                  </div>
                              </div>

                              <div class="col-md-8">
                                  <p>Job standards determine the expected quality of work and quantity of tasks performed,
                                      related
                                      to a specific position. Small businesses monitor an employee's job performance by
                                      comparing it
                                      to accepted work measurements, often at various intervals. Besides evaluation of
                                      production,
                                      these demonstrations provide employers with opportunities to refresh a worker's job skills
                                      or
                                      address behavioral factors.</p>
                              </div>
                          </div>
                      </div>


                      <div class="box">
                          <div class="row description">
                              <div class="col-md-6"><h5>Communication</h5></div>
                              <div class="col-md-6">
                                  <div class="pull-right" style="padding-right: 50px;">
                                      <div class="ui star rating" data-rating="3" id="c"></div>
                                  </div>
                              </div>

                              <div class="col-md-8">
                                  <p>Two-way process of reaching mutual understanding, in which participants not only exchange
                                      (encode-decode) information, news, ideas and feelings but also create and share meaning.
                                      In general, communication is a means of connecting people or places. In business, it is a
                                      key function of management--an organization cannot operate without communication between
                                      levels, departments and employees. See also communications.</p>
                              </div>
                          </div>
                      </div>

                      <div class="box">
                          <div class="row description">
                              <div class="col-md-6"><h5>Expertise</h5></div>
                              <div class="col-md-6">
                                  <div class="pull-right" style="padding-right: 50px;">
                                      <div class="ui star rating" data-rating="3" id="e"></div>
                                  </div>
                              </div>

                              <div class="col-md-8">
                                  <p>Basis of credibility of a person who is perceived to be knowledgeable in an area or topic
                                      due to his or her study, training, or experience in the subject matter. The chef
                                      demonstrated his expertise in cooking to the group by showing them step by step methods of
                                      preparing various food dishes and allowing them to taste the finished products.
                                  </p>
                              </div>
                          </div>
                      </div>

                      <div class="box">
                          <div class="row description">
                              <div class="col-md-6"><h5>Would Hire Again</h5></div>
                              <div class="col-md-6">
                                  <div class="pull-right" style="padding-right: 50px;">
                                      <div class="ui star rating" data-rating="3" id="a"></div>
                                  </div>
                              </div>

                              <div class="col-md-8">
                                  <p>If you’re assuming that a tight job market means that an employer doesn’t have to exert
                                      much effort to fill its open positions, think again.Knowing how to “hire smart” is a must
                                      for any employer, no matter what the economy looks like.</p>
                              </div>
                          </div>
                      </div>

                      <div class="box">
                          <div class="row description">
                              <div class="col-md-6"><h5>Professionalism</h5></div>
                              <div class="col-md-6">
                                  <div class="pull-right" style="padding-right: 50px;">
                                      <div class="ui star rating" data-rating="3" id="p"></div>
                                  </div>
                              </div>

                              <div class="col-md-8">
                                  <p>For writers such as Alexander Pope and Samuel Johnson, struggling in the transition from
                                      the age of patronage to that of Grub Street professionalism, Shakespeare offered not only
                                      a body of poetic invention but also an inspirational career trajectory. —Jonathan Bate,
                                      Harper's, April 2007</p>
                              </div>
                          </div>
                      </div>

                      <form action="<c:url value="/rating/save"/>" method="post">

                          <input type="hidden" id="quality" name="quality" value="3"/>
                          <input type="hidden" id="communication" name="communication" value="3"/>
                          <input type="hidden" id="expertise" name="expertise" value="3"/>
                          <input type="hidden" id="hireAgain" name="hireAgain" value="3"/>
                          <input type="hidden" id="professionalism" name="professionalism" value="3"/>

                          <input type="hidden" id="serviceId" name="serviceId" value="${serviceId}"/>

                          <div class="box">
                              <div class="row description">
                                  <div class="col-md-2"><h5>Comment</h5></div>
                                  <div class="col-md-10">
                                      <textarea class="form-control" name="comment"></textarea>
                                  </div>
                              </div>
                          </div>

                          <button type="submit" class="btn btn-custom">Rate</button>

                      </form>
                  </c:otherwise>
              </c:choose>


          </div>
     </jsp:attribute>

    <jsp:attribute name="after_page_body">

    </jsp:attribute>

    <jsp:attribute name="js_inline">

        <script>
            $('.ui.rating')
                    .rating({
                        initialRating: 3,
                        maxRating: 5
                    });
            $('#q').click(function () {
                $('#quality').val($($(this)).rating('get rating'));
            });
            $('#c').click(function () {
                $('#communication').val($($(this)).rating('get rating'));
            });
            $('#e').click(function () {
                $('#expertise').val($($(this)).rating('get rating'));
            });
            $('#a').click(function () {
                $('#hireAgain').val($($(this)).rating('get rating'));
            });
            $('#p').click(function () {
                $('#professionalism').val($($(this)).rating('get rating'));
            });
        </script>
    </jsp:attribute>
</t:wrapper>