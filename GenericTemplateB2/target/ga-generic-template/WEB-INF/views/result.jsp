<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@taglib prefix="bbNG" uri="/bbNG"%>
<%@taglib uri="/bbData" prefix="bbData"%>
<%@taglib uri="/bbUI" prefix="bbUI"%>

<bbNG:learningSystemPage ctxId="ctx">
	<bbNG:pageHeader instructions="Página de testes...">
		<bbNG:breadcrumbBar>
			<bbNG:breadcrumb>Context Flow Manager Saraiva...</bbNG:breadcrumb>
		</bbNG:breadcrumbBar>
		<bbNG:pageTitleBar>Context Flow Manager</bbNG:pageTitleBar>
	</bbNG:pageHeader>
<h1>
	Página de teste!  
</h1>

O nome digitado foi: <h3>${showName}</h3>

</bbNG:learningSystemPage>
