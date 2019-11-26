package com.screens;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class HomeScreen extends BaseClass {
	public HomeScreen() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="from1")
	private List<WebElement> from;
	
	@FindBy(id="to1")
	private List<WebElement> to;
	
	@FindBy(xpath="//a[text()='3']")
	private List<WebElement> dDte;
	
	public List<WebElement> getdDte() {
		return dDte;
	}

	public List<WebElement> getrDte() {
		return rDte;
	}

	@FindBy(xpath="//a[text()='17']")
	private List<WebElement> rDte;
	
	public List<WebElement> getFrom() {
		return from;
	}

	public List<WebElement> getTo() {
		return to;
	}

	public List<WebElement> getDepart() {
		return depart;
	}

	public List<WebElement> getRtn() {
		return rtn;
	}

	public List<WebElement> getEcnmy() {
		return ecnmy;
	}

	public List<WebElement> getBtn() {
		return btn;
	}

	@FindBy(xpath="//span[text()='Depart']")
	private List<WebElement> depart;
	
	@FindBy(xpath="//span[text()='Return']")
	private List<WebElement> rtn;
	
	@FindBy(id="options")
	private List<WebElement> ecnmy;
	
	@FindBy(xpath="//button[text()='Search Flights']")
	private List<WebElement> btn;
	
	
	
 	
	

}
