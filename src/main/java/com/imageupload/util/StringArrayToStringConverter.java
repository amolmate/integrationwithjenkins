package com.imageupload.util;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeConverter;

public class StringArrayToStringConverter implements AttributeConverter<List<String>,String> {

	@Override
	public String convertToDatabaseColumn(List<String> attribute) {
		// TODO Auto-generated method stub
		
		String listEmails = "";
		StringBuilder builder = new StringBuilder();
		for(String email : attribute){
			builder.append(email);
			builder.append(",");
		}
		
		builder.deleteCharAt(builder.length() - 1);
		
		return builder.toString();
	}

	@Override
	public List<String> convertToEntityAttribute(String dbData) {

		String emails[] = dbData.split(",");
		
		List<String> listEmails = new ArrayList<>();
		
		if(emails != null && emails.length > 0){
			for(int i = 0; i < emails.length; i++){
				listEmails.add(emails[i]);
			}
		}
		
		return listEmails;
	}

}
