/*
    TeXtidote, a linter for LaTeX documents
    Copyright (C) 2018  Sylvain Hallé

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package ca.uqac.lif.textidote.rules;

import org.languagetool.Language;
import org.languagetool.language.AmericanEnglish;
import org.languagetool.language.BritishEnglish;
import org.languagetool.language.CanadianEnglish;

/**
 * Factory class whose sole purpose is to provide instances of {@code Language}
 * objects.
 * @author Sylvain Hallé
 */
public class LanguageFactory
{
	/**
	 * Instantiates a Language object based on a string
	 * @param s The string
	 * @return A Language object, or {@code null} if no language could be
	 * instantiated from the string
	 */
	/*@ nullable @*/ public static Language getLanguageFromString(String s)
	{
		if (s.compareToIgnoreCase("en") == 0 || s.compareToIgnoreCase("en_US") == 0)
		{
			return new AmericanEnglish();
		}
		if (s.compareToIgnoreCase("en_CA") == 0)
		{
			return new CanadianEnglish();
		}
		if (s.compareToIgnoreCase("en_UK") == 0)
		{
			return new BritishEnglish();
		}
		return null;
	}
}
