package edu.mum.mscrum.hrss.access;

import java.util.List;

import edu.mum.mscrum.hrss.model.Developer;
import edu.mum.mscrum.model.ProductBacklog;
import edu.mum.mscrum.model.Release;
import edu.mum.mscrum.model.ScrumMaster;
import edu.mum.mscrum.model.Tester;
import edu.mum.mscrum.model.UserStory;

public interface IHRsystem {
	void assignScrumMasterToRelease(ScrumMaster sm,Release rel);
	void assignDeveloperToUS(Developer dev,UserStory us);
	void assignTesterToUS(Tester tes, UserStory us);
	List<Developer> getDeveloperByReleas(Release rel);
	List<Developer> getDeveloperByProduct(ProductBacklog pr);

}
