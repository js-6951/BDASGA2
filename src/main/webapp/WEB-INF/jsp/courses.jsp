<%@ page contentType="text/html;charset=UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html>

        <head>
            <title>Courses</title>
            <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
        </head>

        <body>
            <jsp:include page="index.jsp" />
            <h2>Courses</h2>
            <a href="${pageContext.request.contextPath}/courses/add">Add Course</a>
            <table class="table">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Instructor</th>
                    <th>Students</th>
                    <th>Actions</th>
                </tr>
                <c:forEach var="c" items="${courses}">
                    <tr>
                        <td>${c.id}</td>
                        <td>${c.name}</td>
                        <td>${c.instructor}</td>
                        <td>
                            <c:forEach var="s" items="${c.students}">
                                <div>${s.fullName}</div>
                            </c:forEach>
                        </td>
                        <td><a href="${pageContext.request.contextPath}/courses/edit/${c.id}">Edit</a></td>
                    </tr>
                </c:forEach>
            </table>
        </body>

        </html>