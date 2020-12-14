package PageBeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizationGrillPageFactory {

	WebDriver driver;
	
	
	//step 1 : identify elements
		@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/app-home-page[1]/div[1]/div[4]/app-menu-popup[1]/div[1]/div[1]/div[1]/div[2]/app-menu-items[1]/div[1]/app-menu-item[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-price-section[1]/div[1]/div[1]/button[1]")
		@CacheLookup
		WebElement pfAddMcVeggieBurger;
	
		@FindBy(xpath="//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p[2]")
		@CacheLookup
		WebElement pfDoubleCheese;
		
		@FindBy(xpath="//body/ngb-modal-window[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/p[1]")
		@CacheLookup
		WebElement pfTomMayoSingle;
		
		@FindBy(xpath="//body/ngb-modal-window[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/p[2]")
		@CacheLookup
		WebElement pfVegSauceDouble;
		
		@FindBy(xpath="//body/ngb-modal-window[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/p[1]")
		@CacheLookup
		WebElement pfOnionAddonSingle;
		
		@FindBy(xpath="//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/label[1]")
		@CacheLookup
		WebElement pfMangoSmoothie;
		
		@FindBy(xpath="//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/label[1]")
		@CacheLookup
		WebElement pfLargeFries;
		
		@FindBy(xpath="//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/label[1]")
		@CacheLookup
		WebElement pfHotFudge;
		
		@FindBy(xpath="//button[contains(text(),'Add to Cart')]")
		@CacheLookup
		WebElement pfAddToCart;
		
		@FindBy(xpath="//button[contains(text(),'View Cart')]")
		@CacheLookup
		WebElement pfViewCart;
		
		@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/app-cart-page[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]")
		@CacheLookup
		WebElement pfCartItemDivHead;
		
		@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/app-cart-page[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]")
		@CacheLookup
		WebElement pfCartItemDivCustomizations;

		
	//step 2 -- generate getters

		public WebElement getPfCartItemDivHead() {
			return pfCartItemDivHead;
		}

		public WebElement getPfCartItemDivCustomizations() {
			return pfCartItemDivCustomizations;
		}
		
	//step-3 -- generate setters

		public void setPfAddMcVeggieBurger() {
			pfAddMcVeggieBurger.click();
		}

		public void setPfDoubleCheese() {
			pfDoubleCheese.click();
		}

		public void setPfTomMayoSingle() {
			pfTomMayoSingle.click();
		}

		public void setPfVegSauceDouble() {
			pfVegSauceDouble.click();
		}

		public void setPfOnionAddonSingle() {
			pfOnionAddonSingle.click();
		}

		public void setPfMangoSmoothie() {
			pfMangoSmoothie.click();
		}

		public void setPfLargeFries() {
			pfLargeFries.click();
		}

		public void setPfHotFudge() {
			pfHotFudge.click();
		}

		public void setPfAddToCart() {
			pfAddToCart.click();
		}

		public void setPfViewCart() {
			pfViewCart.click();
		}
		
	//step-4 -- generate clears
		
		public void clearPfDoubleCheese() {
			pfDoubleCheese.clear();
		}
		
		public void clearPfHotFudge() {
			pfHotFudge.clear();
		}
		
	//initialization
		
		public CustomizationGrillPageFactory(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
}
