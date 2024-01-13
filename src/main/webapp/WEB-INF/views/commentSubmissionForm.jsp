<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <h2>Form submitted by: ${msg.name}</h2>
    <h2>Comment is: ${msg.comment}</h2>
    <h2>Using @ModelAttribute: ${msg2}</h2>
</body>
</html>