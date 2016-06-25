<jsp:useBean id="daystogo" class="com.bfountain.global.DateUtils"/>
<jsp:useBean id="bfdomain" class="com.bfountain.apputils.DomainUtils"/>
<html>
<p><%=daystogo.daysToNewYear()%> days to go this year. Learn Gradle now!</p>
<p><%=daystogo.getMessage() %> </p>
<p><%=bfdomain.getMessage() %> </p>
</html>
