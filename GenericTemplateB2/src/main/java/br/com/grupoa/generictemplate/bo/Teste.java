package br.com.grupoa.generictemplate.bo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import blackboard.data.content.Content;
import blackboard.platform.cx.component.CopyControl;
import blackboard.platform.cx.component.CxComponent;
import blackboard.platform.cx.component.ExportControl;
import blackboard.platform.cx.component.GenericPackageEntry;
import blackboard.platform.cx.component.ImportControl;

public class Teste implements CxComponent {
	
	private static final Logger logger = LoggerFactory.getLogger(Teste.class);

	@Override
	public void afterImportContent(Content arg0, ImportControl arg1) {
		// TODO Auto-generated method stub
		logger.debug("afterImportContent");
		
	}

	@Override
	public void doCopy(CopyControl arg0) {
		// TODO Auto-generated method stub
		logger.debug("Course copied " + arg0.getDestinationCourseId());
		
	}

	@Override
	public void doExport(ExportControl arg0) {
		// TODO Auto-generated method stub
		logger.debug("doExport");
		
	}

	@Override
	public void doImport(GenericPackageEntry arg0, ImportControl arg1) {
		// TODO Auto-generated method stub
		logger.debug("doImport");
		
	}

	@Override
	public String getApplicationHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getComponentHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usage getUsage() {
		// TODO Auto-generated method stub
		return null;
	}

}
