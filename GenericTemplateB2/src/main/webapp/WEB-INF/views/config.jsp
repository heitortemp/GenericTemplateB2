<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@taglib prefix="bbNG" uri="/bbNG"%>
<%@taglib uri="/bbData" prefix="bbData"%>
<%@taglib uri="/bbUI" prefix="bbUI"%>

<bbNG:learningSystemPage ctxId="ctx">
	<bbNG:pageHeader instructions="Test Page">
		<bbNG:breadcrumbBar>
			<bbNG:breadcrumb>Generic Template</bbNG:breadcrumb>
		</bbNG:breadcrumbBar>
		<bbNG:pageTitleBar>Generic Template</bbNG:pageTitleBar>
	</bbNG:pageHeader>

	<form action="result" method="post">

		<bbUI:step title="Settings Page" number="1">
			<bbUI:instructions>Sending test</bbUI:instructions>
			<bbUI:dataElement label="Test Field">
				<input type="text" name="testeName" required="required"/>
			</bbUI:dataElement>
		</bbUI:step>
		
		<bbUI:stepSubmit title="Submit" />
		
	</form>
	
	
</bbNG:learningSystemPage>