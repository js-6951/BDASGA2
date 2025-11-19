<%@ page contentType="text/html;charset=UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html>

        <head>
            <title>Students</title>
            <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
        </head>

        <body>
            <jsp:include page="index.jsp" />
            <h2>Students</h2>
            <a href="${pageContext.request.contextPath}/students/add">Add Student</a>
            <table class="table">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Course</th>
                    <th>Actions</th>
                </tr>
                <c:forEach var="s" items="${students}">
                    <tr>
                        <td>${s.id}</td>
                        <td>${s.fullName}</td>
                        <td>${s.age}</td>
                        <td>
                            <c:out value="${s.course != null ? s.course.name : '—'}" />
                        </td>
                        <td><a href="${pageContext.request.contextPath}/students/edit/${s.id}">Edit</a></td>
                    </tr>
                </c:forEach>
            </table>
        </body>

        </html>