<%@ page contentType="text/html;charset=UTF-8" %>
    <html>

    <head>
        <title>Add Course</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
    </head>

    <body>
        <jsp:include page="index.jsp" />
        <h2>Add Course</h2>
        <form action="${pageContext.request.contextPath}/courses/add" method="post">
            <label>Name:</label><br /><input type="text" name="name" required /><br />
            <label>Instructor:</label><br /><input type="text" name="instructor" /><br /><br />
            <button type="submit">Save</button>
        </form>
    </body>

    </html>