package sef.module8.activity;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Thsi class represents a simple representation of an account encapsulating a
 * name
 *
 * @author John Doe
 *
 */
public class Account {
	private String name;

	/**
	 * Creates an Account object with the specified name. If the accout name
	 * given violates the minimum requirements, then an AccountException is
	 * thrown
	 *
	 * @param accountName
	 * @throws AccountException
	 */
	public Account(String accountName) throws AccountException {
			if (accountName.length() > 4) {
				boolean containsLetter = false;
				boolean containsNumber = false;
				for (int i = 0; i < accountName.length(); i++) {
					if (Character.isLetter(accountName.charAt(i))) {
						containsLetter = true;
					}
					if (Character.isDigit(accountName.charAt(i))) {
						containsNumber = true;
					}
				}

				if (containsLetter == true && containsNumber == true) {
					name = accountName;
				} else {
					throw new AccountException("NAME_TOO_SIMPLE", accountName);
				}
			} else {
				throw new AccountException("NAME_TOO_SHORT", accountName);
			}
		// catch (AccountException e) {
		//	name = null;
		//	System.out.println(e.getMessage());
		//}
	}

	/**
	 * Returns the account name
	 *
	 * @return the account name
	 */
	public String getName() {
		return name;
	}
}
