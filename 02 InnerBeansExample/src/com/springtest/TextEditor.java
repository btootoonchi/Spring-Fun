package com.springtest;

public class TextEditor {

	private SpellChecker spellchecker;
	
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker." );
		this.spellchecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
		return spellchecker;
	}
	
	public void spellCeck() {
		spellchecker.checkSpelling();
	}
}
