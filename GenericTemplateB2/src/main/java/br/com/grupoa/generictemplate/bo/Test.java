package br.com.grupoa.generictemplate.bo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import blackboard.admin.persist.course.CloneConfig;
import blackboard.admin.persist.course.CourseEventListener;
import blackboard.persist.Id;

public class Test implements CourseEventListener {
	
	private static final Logger logger = LoggerFactory.getLogger(Test.class);

	@Override
	public void courseCloned(Id arg0, Id arg1, CloneConfig arg2) throws Exception {
		logger.debug("courseCloned");
		
	}

	@Override
	public void courseCreated(Id arg0) {
		// TODO Auto-generated method stub
		logger.debug("courseCreated");
		
	}

}
