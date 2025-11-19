<%@ page contentType="text/html;charset=UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html>

        <head>
            <title>School App</title>
            <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
        </head>

        <body>
            <h1>SchoolApp</h1>
            <nav>
                <a href="${pageContext.request.contextPath}/students">Students</a> |
                <a href="${pageContext.request.contextPath}/courses">Courses</a>
            </nav>
            <hr />
            <p>Welcome — use the navigation to manage students and courses.</p>
        </body>

        </html>