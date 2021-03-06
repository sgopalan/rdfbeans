/**
 * Agent.java
 * 
 * RDFBeans Jan 26, 2011 3:51:29 PM alex
 *
 * $Id: Agent.java 21 2011-04-02 09:15:34Z alexeya $
 *  
 */
package org.cyberborean.rdfbeans.test.foafexample.entities.impl;

import java.util.Date;

import org.cyberborean.rdfbeans.test.foafexample.entities.IAgent;

/**
 * Agent.
 *
 * @author alex
 *
 */


public abstract class Agent extends Thing implements IAgent {
		
    Date birthday;
    String mbox;

	/* (non-Javadoc)
	 * @see org.cyberborean.rdfbeans.test.entities.foaf.IAgent#getBirthday()
	 */
	public Date getBirthday() {
		return birthday;
	}

	/* (non-Javadoc)
	 * @see org.cyberborean.rdfbeans.test.entities.foaf.IAgent#setBirthday(java.util.Date)
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/* (non-Javadoc)
	 * @see org.cyberborean.rdfbeans.test.entities.foaf.IAgent#getMbox()
	 */
	public String getMbox() {
		return mbox;
	}

	/* (non-Javadoc)
	 * @see org.cyberborean.rdfbeans.test.entities.foaf.IAgent#setMbox(java.lang.String)
	 */
	public void setMbox(String mbox) {
		this.mbox = mbox;
	}
	
}
