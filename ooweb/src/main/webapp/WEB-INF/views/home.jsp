<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ page import="o2.biz.*"%>


<%     
String str = (String)request.getAttribute("spittles");     
Knight knight=(Knight)request.getAttribute("knight");
knight.embarkOnQuest();
%>    
      
    <h1><%=str%></h1> 