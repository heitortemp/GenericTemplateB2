<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
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

	<form action="result" method="post">

		<bbUI:step title="Página de configuração" number="1">
			<bbUI:instructions>Teste de envio.</bbUI:instructions>
			<bbUI:dataElement label="Campo teste">
				<input type="text" name="testeName" required="required"/>
			</bbUI:dataElement>
		</bbUI:step>
		
		<bbUI:stepSubmit title="Submit" />
		
	</form>
	
	
</bbNG:learningSystemPage>