package edu.mum.mscrum.hrss.access;

import java.util.List;

import edu.mum.mscrum.hrss.model.Developer;
import edu.mum.mscrum.model.Product;
import edu.mum.mscrum.model.Release;
import edu.mum.mscrum.model.ScrumMaster;
import edu.mum.mscrum.model.Tester;
import edu.mum.mscrum.model.UserStory;

// this HR facade class need to autowier HR services and it will delegate to the HR services 

public class HRssFacade implements IHRsystem{
	
	// @Autowired
	//private IEmployeeService employeeService;

	public void assignScrumMasterToRelease(ScrumMaster sm, Release rel) {
		// TODO Auto-generated method stub
		
	}

	public void assignDeveloperToUS(Developer dev, UserStory us) {
		// TODO Auto-generated method stub
		
	}

	public void assignTesterToUS(Tester tes, UserStory us) {
		// TODO Auto-generated method stub
		
	}

	public List<Developer> getDeveloperByReleas(Release rel) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Developer> getDeveloperByProduct(Product pr) {
		// TODO Auto-generated method stub
		return null;
	}

}
