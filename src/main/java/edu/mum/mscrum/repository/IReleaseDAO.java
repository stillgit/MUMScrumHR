package edu.mum.mscrum.repository;

import java.util.List;

import edu.mum.mscrum.model.Release;

public interface IReleaseDAO {

	public abstract Release getReleaseByName(String releaseName);

	public abstract Release getReleaseById(long releaseId);

	public abstract List<Release> getAllReleases();

	public abstract void save(Release release);

	public abstract void update(Release release);

	public abstract void delete(long releaseId);

}