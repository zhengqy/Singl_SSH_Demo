<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <form id="useForm" action="user.do" method="post">
            <table>
                <tr>
                    <td>用户名:</td>
                    <td><input type="text" name="username" id="username"></td>
                </tr>
                <tr>
                    <td>密码：</td>
                    <td><input type="password" name="password" id="password"></td>
                </tr>
                <tr>
                    <td>电子邮箱：</td>
                    <td><input type="text" name="email" id="email"></td>
                </tr>
                <tr>
                    <td>手机号：</td>
                    <td><input type="text" name="mobile" id="mobile"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="提交"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
