<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create Task</title>
</head>
<body>
    <h1>Create a New Task</h1>
    <form action="CreateTaskServlet" method="post" onsubmit="return validateForm()">
        <label for="title">Task Title:</label>
        <input type="text" id="title" name="title" required><br><br>

        <label for="description">Task Description:</label>
        <textarea id="description" name="description" required></textarea><br><br>

        <label for="dueDate">Due Date:</label>
        <input type="date" id="dueDate" name="dueDate" required><br><br>

        <label for="priority">Priority:</label>
        <select id="priority" name="priority" required>
            <option value="High">High</option>
            <option value="Medium">Medium</option>
            <option value="Low">Low</option>
        </select><br><br>

        <input type="submit" value="Create Task" id="createTask">
    </form>
    <script>
        function validateForm() {
            var title = document.getElementById("title").value;
            var description = document.getElementById("description").value;
            var dueDate = document.getElementById("dueDate").value;
            var priority = document.getElementById("priority").value;

            if (title == "" || description == "" || dueDate == "" || priority == "") {
                alert("All fields must be filled out");
                return false;
            }
            return true;
        }
    </script>
</body>
</html>