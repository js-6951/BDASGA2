<%@ page contentType="text/html;charset=UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html>

        <head>
            <title>Edit Student</title>
            <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
        </head>

        <body>
            <jsp:include page="index.jsp" />
            <h2>Edit Student</h2>
            <form action="${pageContext.request.contextPath}/students/edit/${student.id}" method="post">
                <label>Full Name:</label><br /><input type="text" name="fullName" value="${student.fullName}"
                    required /><br />
                <label>Age:</label><br /><input type="number" name="age" min="1" value="${student.age}"
                    required /><br />
                <label>Course:</label><br />
                <select name="courseId">
                    <option value="">-- none --</option>
                    <c:forEach var="c" items="${courses}">
                        <option value="${c.id}" <c:if test="${student.course != null and c.id == student.course.id}">
                            selected="selected"
                            </c:if>
                            >
                            ${c.name}
                        </option>
                    </c:forEach>
                </select><br /><br />
                <button type="submit">Update</button>
            </form>
        </body>

        </html>