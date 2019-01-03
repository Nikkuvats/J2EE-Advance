package com.aayu.pkg;

public class TextEditor {
	
		private SpellCheker spellcheker;

		public TextEditor(SpellCheker spellChecker) {
		      System.out.println("Inside TextEditor constructor." );
		      this.spellcheker = spellChecker;
		   }
		   public void spellCheck() {
		      spellcheker.checkSpelling();
		   }
	}