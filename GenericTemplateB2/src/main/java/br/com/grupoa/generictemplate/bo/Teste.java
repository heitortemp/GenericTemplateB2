package br.com.grupoa.generictemplate.bo;


import blackboard.data.content.Content;
import blackboard.platform.cx.component.CopyControl;
import blackboard.platform.cx.component.CxComponent;
import blackboard.platform.cx.component.ExportControl;
import blackboard.platform.cx.component.GenericPackageEntry;
import blackboard.platform.cx.component.ImportControl;

public class Teste implements CxComponent {
	
    private static final String APP_HANDLE = "generic-template";
    private static final String HOOK_NAME = "Teste";
    private static final String COMPONENT_HANDLE = "generic-template-cx-hook";
    private static final Usage USAGE_SETTING = Usage.ALWAYS;

    public Teste() {
          System.out.println("Teste is standing up....");
    }

	@Override
	public void afterImportContent(Content arg0, ImportControl arg1) {
		// TODO Auto-generated method stub
		//logger.debug("afterImportContent");
          System.out.println("afterImportContent");
	}

	@Override
	public void doCopy(CopyControl arg0) {
		// TODO Auto-generated method stub
		//logger.debug("Course copied " + arg0.getDestinationCourseId());
          System.out.println("doCopy");
		
	}

	@Override
	public void doExport(ExportControl arg0) {
		// TODO Auto-generated method stub
		//logger.debug("doExport");
          System.out.println("doExport");
		
	}

	@Override
	public void doImport(GenericPackageEntry arg0, ImportControl arg1) {
		// TODO Auto-generated method stub
		//logger.debug("doImport");
          System.out.println("doImport");
	}

    @Override
    public String getName() {
        return HOOK_NAME;
    }

    @Override
    public String getComponentHandle() {
        return COMPONENT_HANDLE;
    }

    @Override
    public Usage getUsage() {
        return USAGE_SETTING;
    }

    @Override
    public String getApplicationHandle() {
        return APP_HANDLE;
    }
}
