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
                              <div class="col-md-10">
                                  <dl>
                                      <dt>quality of Work</dt>
                                      <dd>Job standards determine the expected quality of work and quantity of tasks performed,
                                          related
                                          to a specific position.
                                      </dd>
                                  </dl>
                              </div>
                              <div class="col-md-2">
                                  <div class="ui star rating" data-rating="3" id="q"></div>
                              </div>
                          </div>
                      </div>

                      <div class="box">
                          <div class="row description">
                              <div class="col-md-10">
                                  <dl>
                                      <dt>Communication</dt>
                                      <dd>Two-way process of reaching mutual understanding, in which participants not only exchange
                                          (encode-decode) information, news, ideas and feelings but also create and share meaning.
                                      </dd>
                                  </dl>
                              </div>
                              <div class="col-md-2">
                                  <div class="ui star rating" data-rating="3" id="c"></div>
                              </div>
                          </div>
                      </div>

                      <div class="box">
                          <div class="row description">
                              <div class="col-md-10">
                                  <dl>
                                      <dt>Expertise</dt>
                                      <dd>Basis of credibility of a person who is perceived to be knowledgeable in an area or topic
                                          due to his or her study, training, or experience in the subject matter.
                                      </dd>
                                  </dl>
                              </div>
                              <div class="col-md-2">
                                  <div class="ui star rating" data-rating="3" id="e"></div>
                              </div>
                          </div>
                      </div>

                      <div class="box">
                          <div class="row description">
                              <div class="col-md-10">
                                  <dl>
                                      <dt>Would Hire Again</dt>
                                      <dd>If you’re assuming that a tight job market means that an employer doesn’t have to exert
                                          much effort to fill its open positions
                                      </dd>
                                  </dl>
                              </div>
                              <div class="col-md-2">
                                  <div class="ui star rating" data-rating="3" id="a"></div>
                              </div>
                          </div>
                      </div>

                      <div class="box">
                          <div class="row description">
                              <div class="col-md-10">
                                  <dl>
                                      <dt>Professionalism</dt>
                                      <dd>For writers such as Alexander Pope and Samuel Johnson, struggling in the
                                          transition
                                      </dd>
                                  </dl>
                              </div>
                              <div class="col-md-2">
                                  <div class="ui star rating" data-rating="3" id="p"></div>
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