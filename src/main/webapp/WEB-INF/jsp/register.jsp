<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head><title>Register</title>
	<s:head />
</head>
<body>
 <h2>Registration Form</h2>
 <s:form  action="welcome.action">
   <s:textfield name="firstName" label="Your First Name"/>
   <s:textfield name="lastName" label="Your Last Name"/>
   <s:radio name="gender" list="{'Male','Female'}" label="Gender" />
   <s:textfield name="age" label="Age"/>
   <s:textfield name="email" label="Email"/>
   <s:textarea name="address" cols="30" rows="7" label="Address"/>
   <s:select list="colors" name="selectedColor" headerKey="none" headerValue="Select a Color" label="Favorite Color"/>
   <s:checkbox name="subscription" value="true" label="Subscribe to our newsletter"/>
   <s:checkboxlist list="hobbies" name="selectedHobbies" label="Hobbies" />
   <s:submit value="Register"/>
   <s:reset value="Reset"/>
</s:form>
<table border="1" width="300">
  <tr>
    <th>Product ID</th>
    <th>Product Name</th>
    <th>Product Price</th>
  </tr>
  <s:iterator value="products" var="product">
    <tr>
      <td>
        <s:property value="#product.productId"/>
      </td>
      <td>
        <s:property value="#product.productName"/>
      </td>
      <td>
        <s:property value="#product.productPrice"/>
      </td>
    </tr>
  </s:iterator>
</table>
</body>
</html>