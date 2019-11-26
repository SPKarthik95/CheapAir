package com.screens;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class DepFlights extends BaseClass {

	public DepFlights() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='fltrt-opt-fares-amount']")
	private List<WebElement> depFlights;
	
	@FindBy(xpath="//span[@class='fltrt-sort active']")
	private List<WebElement> price;
	
	public List<WebElement> getPrice() {
		return price;
	}

	@FindBy(xpath="//div[@class='btnfare btn withsub']")
	private List<WebElement> retFlishts;
	
	@FindBy(xpath="ButtonStyled-primary__ButtonPrimary-v60pr9-0 cmUzDO")
	private List<WebElement> searchBtn;

	@FindBy(xpath="//span[@class='ButtonTextStyled-sc-1fmumcb-0 hNdQjL']")
	private List<WebElement> contBtn;
	
	public List<WebElement> getDepFlights() {
		return depFlights;
	}

	public List<WebElement> getRetFlishts() {
		return retFlishts;
	}

	public List<WebElement> getSearchBtn() {
		return searchBtn;
	}
	
	

}
