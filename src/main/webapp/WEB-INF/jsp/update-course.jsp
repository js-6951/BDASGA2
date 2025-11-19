<%@ page contentType="text/html;charset=UTF-8" %>
    <html>

    <head>
        <title>Edit Course</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
    </head>

    <body>
        <jsp:include page="index.jsp" />
        <h2>Edit Course</h2>
        <form action="${pageContext.request.contextPath}/courses/edit/${course.id}" method="post">
            <label>Name:</label><br /><input type="text" name="name" value="${course.name}" required /><br />
            <label>Instructor:</label><br /><input type="text" name="instructor"
                value="${course.instructor}" /><br /><br />
            <button type="submit">Update</button>
        </form>
    </body>

    </html>