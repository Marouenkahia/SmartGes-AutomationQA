package com.tests.easyges.customtypes;

import com.tests.easyges.constants.Language;

import io.cucumber.java.ParameterType;

public class CustomParameterType {

	@ParameterType(".*")
	public Language language(String languageName) {
		return Language.valueOf(languageName);
	}
}
