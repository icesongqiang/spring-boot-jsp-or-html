<html>

<!-- 引入js -->
<script>
  var LocalModel=[];
  LocalModel.host="${model.host}";
  LocalModel.name="${model.name}";
</script>

<title>${model.host }</title>
<body>

<h2>
	Hello JSP! Ch3.2
</h2>
<p>
  <hr/>
  <%-- jsp 插入代码段 --%>
	<% 
		out.println("Your IP address is " + request.getRemoteAddr());
	%> 
</p>
</body>
</html>
