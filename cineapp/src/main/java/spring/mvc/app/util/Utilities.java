package spring.mvc.app.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class Utilities {
	
	public static List<String> getNextDays (SimpleDateFormat sdf, int count) {
		List<String> nextDays = new ArrayList<String>();
		Calendar cal = Calendar.getInstance();
		GregorianCalendar gc = new GregorianCalendar();
		
		cal.add(Calendar.DAY_OF_MONTH, count);		
		gc.setTime(new Date());
		nextDays.add(sdf.format(new Date()));
		while (!gc.getTime().after(cal.getTime())) {
			gc.add(Calendar.DATE, 1);
			nextDays.add(sdf.format(gc.getTime()));
		}		
		return nextDays;
	}
	
	public static String savebillboardImage(MultipartFile multipartFile, HttpServletRequest request) {
		String originalFilename = multipartFile.getOriginalFilename();
		originalFilename.toLowerCase();
		originalFilename.replace(' ', '_');
		String realPath = request.getServletContext().getRealPath("/resources/images/movies/");
		try {
			File file = new File(realPath + originalFilename);
			System.out.println(file.getAbsolutePath());
			multipartFile.transferTo(file);
			return originalFilename;
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}
}
