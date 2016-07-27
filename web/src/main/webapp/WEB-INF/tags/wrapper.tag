<%@ tag description="Wrapper tag to use in pages after login" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="page_heading" fragment="true" required="true" %>
<%@ attribute name="page_body" fragment="true" required="true" %>
<%@ attribute name="after_page_body" fragment="true" %>
<%@ attribute name="css_file_includes" fragment="true" %>
<%@ attribute name="css_inline" fragment="true" %>
<%@ attribute name="js_file_includes" fragment="true" %>
<%@ attribute name="js_inline" fragment="true" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Services Hub</title>
    <meta name="description" content="hSenid Services Hub">
    <meta name="author" content="hSenid">
    <meta name="keyword" content="html, css, bootstrap, job-board">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800' rel='stylesheet' type='text/css'>

    <link rel="stylesheet" href="<c:url value="/css/normalize.css"/>" >
    <link rel="stylesheet" href="<c:url value="/css/font-awesome.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/fontello.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/animate.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/owl.carousel.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/owl.theme.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/owl.transitions.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/style.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/responsive.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/custom.css"/> ">
    <script type="text/javascript" src="<c:url value="/js/vendor/modernizr-2.6.2.min.js"/>"></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript" src="<c:url value="/js/vendor/jquery-1.10.2.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/js/bootstrap.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/js/owl.carousel.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/js/wow.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/js/main.js"/>"></script>



    <jsp:invoke fragment="css_file_includes"/>
    <!-- for style tags -->
    <jsp:invoke fragment="css_inline"/>

</head>
<body>
<t:header/>
<t:menu/>
<div class="container-fluid">
    <div class="row">
        <jsp:invoke fragment="page_body"/>
        <jsp:invoke fragment="after_page_body"/>
    </div>
</div>
<!-- for js file includes -->
<jsp:invoke fragment="js_file_includes"/>
<!-- for script tags -->
<jsp:invoke fragment="js_inline"/>
<t:footer/>
</body>
</html>
