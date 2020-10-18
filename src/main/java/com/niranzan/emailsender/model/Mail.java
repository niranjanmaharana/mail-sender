/**
 * 
 */
package com.niranzan.emailsender.model;

import java.util.Map;

/**
 * @author Niranjan
 *
 */
public class Mail {
	private String from;
	private String mailTo;
	private String subject;
	private Map<String, Object> props;
	
	public Mail() {
		super();
	}

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the mailTo
	 */
	public String getMailTo() {
		return mailTo;
	}

	/**
	 * @param mailTo the mailTo to set
	 */
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the props
	 */
	public Map<String, Object> getProps() {
		return props;
	}

	/**
	 * @param props the props to set
	 */
	public void setProps(Map<String, Object> props) {
		this.props = props;
	}
}