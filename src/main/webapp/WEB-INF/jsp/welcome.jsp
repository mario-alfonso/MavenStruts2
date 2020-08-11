<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>Insert Title</title>
	<s:head />
</head>
<body>
 <s:form  action="welcome.action">
   <s:textfield name="firstName" label="Your First Name:"></s:textfield>
   <s:submit value="Submit"></s:submit>
</s:form>
</body>
</html>