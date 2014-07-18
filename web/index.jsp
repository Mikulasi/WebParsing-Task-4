<%--
  Created by IntelliJ IDEA.
  User: ultradux
  Date: 14-Jul-14
  Time: 01:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>DOM SAX StAX Parser</title>
  </head>
  <body>
    <h4>Выберите парсер</h4>
    <form action="controller" method="post">
        <div>
            <input type="hidden" name="command" value="DAO"/>
            <input type="submit" value="Parsing DOM"/>
        </div>
    </form>
     <form action="controller" method="post">
        <div>
            <input type="hidden" name="command" value="SAX"/>
            <input type="submit" value="Parsing SAX"/>
        </div>
    </form>
    <form action="controller" method="post">
        <div>
            <input type="hidden" name="command" value="StAX"/>
            <input type="submit" value="Parsing StAX"/>
        </div>
    </form>
  </body>
</html>
