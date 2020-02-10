package spring.mvc.app.service;

import java.util.List;

import spring.mvc.app.model.Classification;

public interface ClassificationService {
	
	public List<Classification> getClassificationList();

	public Classification getClassification(int id);

	public boolean saveClassification(Classification classification);
}
