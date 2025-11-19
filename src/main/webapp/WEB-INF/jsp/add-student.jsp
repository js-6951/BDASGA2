<%@ page contentType="text/html;charset=UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html>

        <head>
            <title>Add Student</title>
            <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
        </head>

        <body>
            <jsp:include page="index.jsp" />
            <h2>Add Student</h2>
            <form action="${pageContext.request.contextPath}/students/add" method="post">
                <label>Full Name:</label><br /><input type="text" name="fullName" required /><br />
                <label>Age:</label><br /><input type="number" name="age" min="1" required /><br />
                <label>Course:</label><br />
                <select name="courseId">
                    <option value="">-- none --</option>
                    <c:forEach var="c" items="${courses}">
                        <option value="${c.id}">${c.name} — ${c.instructor}</option>
                    </c:forEach>
                </select><br /><br />
                <button type="submit">Save</button>
            </form>
        </body>

        </html>