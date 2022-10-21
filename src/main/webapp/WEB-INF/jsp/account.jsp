<!DOCTYPE html PUBLIC
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>
	</title>
	<s:head />
</head>
<body>
    <s:form action="userAccount">
    		<s:textfield label="What is your name?" name="kkname" />
    		<s:textfield label="What is your surname?" name="kksurname" />
    		<s:textfield label="What is your address?" name="address" />
            <s:textfield label="What is your email?" name="email" />
            <s:textfield label="What is your phone?" name="phone" />
    		<s:submit />
    	</s:form>
</body>
</html>