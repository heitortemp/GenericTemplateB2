<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
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
<h1>
	Hello World!
</h1>

The received value was: <h3>${showName}</h3>

</bbNG:learningSystemPage>
