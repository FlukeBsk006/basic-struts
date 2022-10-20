<!DOCTYPE html PUBLIC
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Profile</title>
	<s:head />
</head>
<body>
    <s:form action="helloProfile">
    		<s:textfield label="What is your name?" name="fn" />
    		<s:textfield label="What is the date?" name="fd" />
    		<s:submit />
    	</s:form>
</body>
</html>