package com.aayu.pkg;

public class TextEditor {
	
	private SpellCheker spellcheker;

	public SpellCheker getSpellcheker() {
		return spellcheker;
	}

	public void setSpellcheker(SpellCheker spellcheker) {
		System.out.println("inside setSpellCheker");
		this.spellcheker = spellcheker;
	}
	
	public void spellCheck()
	{
	spellcheker.checkSpelling();	
	}
}
