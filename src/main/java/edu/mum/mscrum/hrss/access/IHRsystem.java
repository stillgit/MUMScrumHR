package edu.mum.mscrum.hrss.access;

import java.util.List;

import edu.mum.mscrum.hrss.model.Developer;
import edu.mum.mscrum.model.Product;
import edu.mum.mscrum.model.Release;
import edu.mum.mscrum.hrss.model.*;
import edu.mum.mscrum.model.UserStory;

public interface IHRsystem {
	void assignScrumMasterToRelease(ScrumMaster sm,Release rel);
	void assignDeveloperToUS(Developer dev,UserStory us);
	void assignTesterToUS(Tester tes, UserStory us);
	List<Developer> getDeveloperByReleas(Release rel);
	List<Developer> getDeveloperByProduct(Product pr);

}
