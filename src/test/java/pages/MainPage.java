package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class MainPage extends BasePageClass {


    private String url = "https://stage.4frag.ru/";

    private String maxPriceValue = "16000";

    private String DPIAndCPIResolutionValue = "23000";

    private By buyProductLocator = By.xpath("//a[text()='Купить']");

    private By closeButtonWindowLocator = By.xpath("//div[@id='notification-type']//button[contains(@class,'close')]");

    private By cardButtonLocator = By.xpath("//span[text() = 'Корзина']");

    private By loginPageLocator = By.xpath("//a[text() = 'Вход/регистрация']");

    private By addToComparasionListIconLocator = By.xpath("//div[contains(@class,'item-buttons center-block')]//a[contains(@class,'item-compare-btn')]");

    private By comparasionListPageLocator = By.xpath("//span[text() = 'Сравнение товаров']");

    private By deliveryPageLocator = By.xpath("//span[text() = 'Сравнение товаров']");

    private By paymentPageLocator = By.xpath("//a[text() = 'Оплата']");

    private By discountSystemPageLocator = By.xpath("//a[text() = 'Система скидок']");

    private By warrantyPageLocator = By.xpath("//a[text() = 'Система скидок']");

    private By bookmarksPageLocator = By.xpath("//span[text() = 'Закладки']");

    private By basketPageLocator = By.xpath("//span[text() = 'Корзина']");

    private By categorySectionLocator = By.xpath("//span[contains(text(), 'Игровые мыши')]");

    private By checkboxBrandOfChosenProductLocator = By.xpath("//div[contains(@class, 'checkbox checkbox-success')]//input[1]");

    private By inputPriceMaxLocator = By.xpath("//input[contains(@id, 'price-max')]");

    private By productTypeDropdownLocator = By.xpath("//select[contains(@name, 'filter[arrtibutes][51][value][]')]");

    private By optionFromProductTypeLocator = By.xpath("//select[contains(@name, 'filter[arrtibutes][51][value][]')]//option[contains(text(), 'Лазерный')]");

    private By inputDPIAndCPIResolutionLocator = By.xpath("//input[contains(@id, 'at52-max')]");

    private By productButtonsAmountDropdownLocator = By.xpath("//select[contains(@name, 'filter[arrtibutes][55][value][]')]");

    private By optionFromButtonsAmountDropdownLocator = By.xpath("//select[contains(@name, 'filter[arrtibutes][55][value][]')]//option[contains(text(), '20')]");



   private By subcategoryOptionLocator = By.xpath("//div[contains(@class, 'brands-list')]//div//a[1]");

   private By addToWishListButtonLocator = By.xpath("//div[contains(@class, 'item-buttons center-block')]//a[2]");

   private By wishListPageLocator = By.xpath("//span[contains(text(), 'Закладки')]");


    public MainPage openHomePage() {
        open(url);
        return this;
    }


    public MainPage addProductToCard() {
        WebElement buyButton = setUpWaiterForWebElement(buyProductLocator);
        buyButton.click();
        return this;
    }

    public MainPage closePopUpWindow() {
        WebElement closeButton = setUpWaiterForWebElement(closeButtonWindowLocator);
        closeButton.click();
        return this;
    }


    public CardPage goToTheCardPage() {
        maximizeWindow();
        WebElement closeButton = setUpWaiterForWebElement(cardButtonLocator);
        closeButton.click();
        return new CardPage();
    }


    public LoginPage openLoginPage() {

        WebElement loginPage = setUpWaiterForWebElement(loginPageLocator);
        loginPage.click();
        maximizeWindow();
        return new LoginPage();
    }


    public MainPage addItemToComparasionList() {
        maximizeWindow();
        WebElement comparasionButton = setUpWaiterForWebElement(addToComparasionListIconLocator);
        comparasionButton.click();
        return this;
    }

    public ComparasionListPage openComparasionListPage() {
        maximizeWindow();
        WebElement comparasionlist = setUpWaiterForWebElement(comparasionListPageLocator);
        comparasionlist.click();
        return new ComparasionListPage();
    }

    public DeliveryPage openDeliveryPage() {
        maximizeWindow();
        WebElement deliveryPageButton = setUpWaiterForWebElement(deliveryPageLocator);
        deliveryPageButton.click();
        return new DeliveryPage();
    }

    public PaymentPage openPaymentPage() {
        maximizeWindow();
        WebElement paymentPageButton = setUpWaiterForWebElement(paymentPageLocator);
        paymentPageButton.click();
        return new PaymentPage();
    }

    public DiscountSystemPage openDiscountSystemPage() {
        maximizeWindow();
        WebElement discountSystemPageButton = setUpWaiterForWebElement(discountSystemPageLocator);
        discountSystemPageButton.click();
        return new DiscountSystemPage();
    }

    public WarrantyPage openWarrantyPage() {
        maximizeWindow();
        WebElement warrantyPageButton = setUpWaiterForWebElement(warrantyPageLocator);
        warrantyPageButton.click();
        return new WarrantyPage();
    }

    public BookmarksPage openBookmarksPage() {
        maximizeWindow();
        WebElement bookmarksPageButton = setUpWaiterForWebElement(bookmarksPageLocator);
        bookmarksPageButton.click();
        return new BookmarksPage();
    }

    public BasketPage openBasketPage() {
        maximizeWindow();
        WebElement basketPageButton = setUpWaiterForWebElement(basketPageLocator);
        basketPageButton.click();
        return new BasketPage();
    }

    public MainPage chooseProductCategory() {
        maximizeWindow();
        WebElement sectionProductButton = setUpWaiterForWebElement(categorySectionLocator);
        sectionProductButton.click();
        return this;
    }


    public MainPage checkBrandOfChosenProduct() {
        maximizeWindow();
        WebElement chooseBrandCheckbox = setUpWaiterForWebElement(checkboxBrandOfChosenProductLocator);
        chooseBrandCheckbox.click();
        return this;
    }

    public MainPage filloutInputFormaxPrice() {
        maximizeWindow();
        WebElement fillOutMaxPrice = setUpWaiterForWebElement(inputPriceMaxLocator);
        fillOutMaxPrice.sendKeys(maxPriceValue, Keys.ENTER);
        return this;
    }

    public MainPage clickOnTheProductTypeDropDown() {
        maximizeWindow();
        WebElement productTypeDropDown = setUpWaiterForWebElement(productTypeDropdownLocator);
        productTypeDropDown.click();
        return this;
    }

    public MainPage chooseProductFromProductTypeDropDown() {
        maximizeWindow();
        WebElement productFromProductTypeDropDown = setUpWaiterForWebElement(optionFromProductTypeLocator);
        productFromProductTypeDropDown.click();
        return this;
    }

    public MainPage filloutInputDPIAndCPIResolutionValue() {
        maximizeWindow();
        WebElement fillOutDPIAndCPIResolutionValue = setUpWaiterForWebElement(inputDPIAndCPIResolutionLocator);
        fillOutDPIAndCPIResolutionValue.sendKeys(DPIAndCPIResolutionValue, Keys.ENTER);
        return this;

    }

    public MainPage clickOnTheButtonsAmountDropDown() {
        maximizeWindow();
        WebElement buttonsAmountDropDown = setUpWaiterForWebElement(productButtonsAmountDropdownLocator);
        buttonsAmountDropDown.click();
        return this;
    }

    public MainPage chooseValueFromButtonsAmountDropDown() {
        maximizeWindow();
        WebElement buttonsAmountFromButtonsAmountDropDown = setUpWaiterForWebElement(optionFromButtonsAmountDropdownLocator);
       buttonsAmountFromButtonsAmountDropDown.click();
        return this;
    }


  public MainPage chooseProductSubCategoryFromResultList() {
      maximizeWindow();
      WebElement subcategoryOption = setUpWaiterForWebElement(subcategoryOptionLocator);
      subcategoryOption.click();
      return this;
  }

    public MainPage addProductToWishListFromResultList() {
        maximizeWindow();
        WebElement wishListButton = setUpWaiterForWebElement(addToWishListButtonLocator);
        wishListButton.click();
        return this;
    }

    public WishListPage openProductInTheWishListPage() {
        maximizeWindow();
        WebElement wishListPage = setUpWaiterForWebElement(wishListPageLocator);
        wishListPage.click();
        return new WishListPage();
    }






}

