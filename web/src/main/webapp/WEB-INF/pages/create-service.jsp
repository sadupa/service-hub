<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:wrapper>
    <jsp:attribute name="page_heading">
        <h2>Create Service</h2>
    </jsp:attribute>

    <jsp:attribute name="page_body">
        <style type="text/css">
            i.icon.delete:before {
                content: "\f00d";
                font-family: FontAwesome;
            }
        </style>
            <form class="form-horizontal" action="/services/post">
                <div class="form-group">
                    <label for="title" class="col-sm-2 control-label">Title</label>

                    <div class="col-md-4">
                        <input id="title" name="title" type="text" class="form-control" placeholder="I will do..."/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="area" class="col-sm-2 control-label">Category</label>

                    <div class="col-md-4">
                        <select id="category" name="category" class="form-control">
                            <c:forEach var="category" items="${categories}">
                                <option value="${category.id}">${category.name}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="area" class="col-sm-2 control-label">Area</label>

                    <div class="col-md-4">
                        <select id="area" name="area" class="form-control">
                            <c:forEach var="area" items="${areas}">
                                <option value="${area.id}">${area.name}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="description" class="col-sm-2 control-label">Description</label>

                    <div class="col-md-4">
                        <textarea id="description" name="description" class="form-control" rows="4"></textarea>
                    </div>
                </div>
                <div class="form-group">
                    <label for="tags" class="col-sm-2 control-label">Tags</label>
                    <div class="col-md-4">
                        <select id="tags" name="tags" class="ui fluid normal dropdown" multiple="">
                            <c:forEach var="tag" items="${tags}">
                                <option value="${tag.id}">${tag.name}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Sign in</button>
                    </div>
                </div>
            </form>
        <script type="text/javascript">
            $('.ui.dropdown').dropdown();
        </script>
     </jsp:attribute>

    <jsp:attribute name="after_page_body">

    </jsp:attribute>

    <jsp:attribute name="js_inline">

    </jsp:attribute>
</t:wrapper>