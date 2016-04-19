package com.spring.core;

public class TextEditor {
	private SpellChecker spellChecker;

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker method");
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
