package spring.mvc.app.serviceImpl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.mvc.app.model.Classification;
import spring.mvc.app.service.ClassificationService;

@Service
public class ClassificationServiceImpl implements ClassificationService {

	List<Classification> classificationList = null;
	
	public ClassificationServiceImpl () {
		classificationList = new LinkedList<Classification>();
		classificationList.add(new Classification(1, "A", "A", true));
		classificationList.add(new Classification(2, "AA", "AA", true));
		classificationList.add(new Classification(3, "B", "B", true));
		classificationList.add(new Classification(4, "B15", "B15", true));
		classificationList.add(new Classification(5, "C", "C", true));
		classificationList.add(new Classification(6, "D", "D", true));
		classificationList.add(new Classification(7, "TBC: Por confirmar", "TBC: Por confirmar", true));
	}
	
	@Override
	public List<Classification> getClassificationList() {
		return classificationList;
	}

	@Override
	public Classification getClassification(int id) {
		for (Classification c : classificationList) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}

	@Override
	public boolean saveClassification(Classification classification) {
		// TODO Auto-generated method stub
		return false;
	}

}
