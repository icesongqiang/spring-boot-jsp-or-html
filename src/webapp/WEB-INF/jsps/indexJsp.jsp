<html>

<script>
  var model=[];
  model.host="${model.host}";
  alert(model.host);
</script>

<title>${model.host }</title>
<body>

<h2>
	Hello JSP! Ch3.2
</h2>
<p>
  <hr/>
	<% 
		out.println("Your IP address is " + request.getRemoteAddr());
	%> 
</p>
</body>
</html>
