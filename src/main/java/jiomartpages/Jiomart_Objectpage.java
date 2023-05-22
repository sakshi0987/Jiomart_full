package jiomartpages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jiomart_Objectpage extends Jiomart_Basepage
{
	// Xpath for header buttons
	
	@FindBy(xpath="//div[@class='header-main-logo jm-mr-m']")
	WebElement logo ;
	
	@FindBy(xpath="//button[@class='jm-btn primary small jm-border-none']")
	WebElement Locationtext ;
	
	@FindBy(xpath="//input[@class='aa-Input search_input']")
	WebElement Searchbutton ;
	
	@FindBy(xpath="(//button[@class='jm-btn primary medium jm-icon jm-border-none'])[2]")
	WebElement Cartbutton ;
	
	@FindBy(xpath="//button[@class='jm-btn primary medium jm-border-none']")
	WebElement Signinbutton ;
	
	// Headermenu 
	@FindBy(xpath="(//a[@class='header-nav-l1-item-link'])[1]")
	WebElement Item1 ;
	
	@FindBy(xpath="(//a[@class='header-nav-l1-item-link'])[2]")
	WebElement Item2 ;
	
	@FindBy(xpath="(//a[@class='header-nav-l1-item-link'])[3]")
	WebElement Item3 ;
	
	@FindBy(xpath="(//a[@class='header-nav-l1-item-link'])[4]")
	WebElement Item4 ;
	
	@FindBy(xpath="(//a[@class='header-nav-l1-item-link'])[5]")
	WebElement Item5 ;
	
	@FindBy(xpath="(//a[@class='header-nav-l1-item-link'])[6]")
	WebElement Item6 ;
	
	@FindBy(xpath="(//a[@class='header-nav-l1-item-link'])[7]")
	WebElement Item7 ;
	
	@FindBy(xpath="(//a[@class='header-nav-l1-item-link'])[8]")
	WebElement Item8 ;
	
	@FindBy(xpath="//div[@class='swiper-button-next swiper-home-btn-next swiper-home-btn-next6313']")
	WebElement nextslide ;
	
	@FindBy(xpath="//div[@class='swiper-button-prev swiper-home-btn-prev swiper-home-btn-prev6313']")
	WebElement previousslide ;
	
	@FindBy(xpath="//div[@class='teaser-content']")
	WebElement timer ;
	
	// Footer menu xpath
	@FindBy(xpath="//div[@class='footer-top-main']/div[1]/div")
	List<WebElement> footermenu1 ;
	
	@FindBy(xpath="//div[@class='footer-top-main']/div[2]/div")
	List<WebElement> footermenu2 ;
	
	@FindBy(xpath="//div[@class='footer-top-main']/div[3]/div")
	List<WebElement> footermenu3 ;
	
	@FindBy(xpath="//div[@class='footer-top-main']/div[4]/div")
	List<WebElement> footermenu4 ;
	
	@FindBy(xpath="(//div[@class='add_banner ripple_effect'])[1]")
	WebElement link1 ;
	
	@FindBy(xpath="(//div[@class='add_banner ripple_effect'])[2]")
	WebElement link2 ;
	
	// Xpath for Signin functionality
	@FindBy(xpath="(//h1[@id='sign-heading'])[1]")
	WebElement text1 ;
	
	@FindBy(xpath="//input[@class='phone empty']")
	WebElement phonenum ;
	
	@FindBy(xpath="(//div[@class='ng-star-inserted'])[17]")
	WebElement Otp ;
	
	@FindBy(xpath="(//div[@class='ng-star-inserted'])[18]")
	WebElement Otp1 ;
	
	@FindBy(xpath="//button[@id='basic-button']")
	WebElement verify ;
	
	@FindBy(xpath="//h1[@id='signup-heading']")
	WebElement text2 ;
	
	@FindBy(xpath="//input[@name='regfname']")
	WebElement Firstname ;
	
	@FindBy(xpath="//input[@name='reglname']")
	WebElement Lastname ;
	
	@FindBy(xpath="//input[@name='regemail']")
	WebElement email ;
	
	@FindBy(xpath="//h2[@id='sign-heading']")
	WebElement text3 ;
	
	@FindBy(xpath="(//div[@class='ng-star-inserted'])[18]")
	WebElement Start ;
	
	// Add to cart Xpath
	@FindBy(xpath="//button[@class='jm-btn secondary small jm-fc-black']")
	WebElement Sort ;
	
	@FindBy(xpath="(//div[@class='label jm-ml-xs jm-body-s'])[3]")
	WebElement Sorting ;
	
	@FindBy(xpath="(//div[@class='plp-card-details-name line-clamp jm-body-xs jm-fc-primary-grey-80'])[1]")
	WebElement item ;
	
	@FindBy(xpath="(//div[@role='group'])[1]")
	WebElement show ;
	
	@FindBy(xpath="(//div[@role='group'])[2]")
	WebElement show1 ;
	
	@FindBy(xpath="(//div[@role='group'])[3]")
	WebElement show2 ;
	
	@FindBy(xpath="(//div[@role='group'])[4]")
	WebElement show3 ;
	
	@FindBy(xpath="//div[@class='product-price-offer-box']")
	WebElement pricetext ;
	
	@FindBy(xpath="//button[@class='jm-btn primary medium center full-width jm-fw-bold addtocartbtn']")
	WebElement cart ;
	
	@FindBy(xpath="(//div[@data-parentbtn-text='Add'])")
	List<WebElement> items ;
	
	@FindBy(xpath="(//div[@data-parentbtn-text='Add'])[1]")
	WebElement item1 ;
	
	@FindBy(xpath="(//div[@data-parentbtn-text='Add'])[2]")
	WebElement item2 ;
	
	@FindBy(xpath="(//div[@data-parentbtn-text='Add'])[3]")
	WebElement item3 ;
	
	@FindBy(xpath="(//div[@data-parentbtn-text='Add'])[4]")
	WebElement item4 ;

	@FindBy(xpath="//div[@class='header-main-user-cart mini-cart']")
	WebElement cartt ;
	
	@FindBy(xpath="(//div[@class='j-grid cart-grid']/jds-container)[1]")
	WebElement container1 ;
	
	@FindBy(xpath="(//div[@class='product-details'])[1]")
	WebElement item1info ;
	
	@FindBy(xpath="(//div[@class='product-details'])[2]")
	WebElement item2info ;
	
	@FindBy(xpath="(//div[@class='product-details'])[3]")
	WebElement item3info ;
	
	@FindBy(xpath="//div[@class='total-details sign yougetfdord']")
	WebElement container2 ;
	
	@FindBy(xpath="(//button[@name='plus'])[2]")
	WebElement plusitem ;
	
	@FindBy(xpath="(//button[@name='plus'])[4]")
	WebElement plusitemm ;
	
	@FindBy(xpath="//div[@class='total-details sign yougetfdord']")
	WebElement subtotal ;

	
	// Xpath for Navbar buttons 
	@FindBy(xpath="(//a[@class='header-nav-l1-item-link'])[1]")
	WebElement button1 ;
	
	@FindBy(xpath="(//button[@class='jm-btn tertiary small jm-icon'])[2]")
	WebElement scroll ;
	
	@FindBy(xpath="//a[@title='Go to Fresh Vegetables']")
	WebElement filter1 ;
		
	@FindBy(xpath="//section[@class='banner']")
	WebElement gimage ;
	
	@FindBy(xpath="//button[@class='jm-btn secondary small jm-fc-black']")
	WebElement sort ;
	
	@FindBy(xpath="(//div[@class='label jm-ml-xs jm-body-s'])[2]")
	WebElement sortprice ;
	
	@FindBy(xpath="(//div[@class='plp-card-cart'])[1]")
	WebElement bitem1 ;
	
	@FindBy(xpath="(//jds-button[@name='plus'])[2]")
	WebElement plus1;
	
	@FindBy(xpath="(//span[@aria-label='icon IcMinus'])[1]")
	WebElement minus1 ;
	
	@FindBy(xpath="(//div[@class='price-details'])[1]")
	WebElement bitem1info ;
	
	@FindBy(xpath="(//div[@class='plp-card-cart'])[3]")
	WebElement bitem2 ;
	
	@FindBy(xpath="(//jds-button[@name='plus'])[2]")
	WebElement addmorecount2 ;
	
	@FindBy(xpath="(//div[@class='price-details'])[2]")
	WebElement bitem2info ;
	
	@FindBy(xpath="(//div[@class='plp-card-cart'])[5]")
	WebElement bitem3 ;
	
	@FindBy(xpath="(//jds-button[@name='plus'])[6]")
	WebElement plus3;
	
	@FindBy(xpath="(//div[@class='price-details'])[3]")
	WebElement bitem3info ;
	
	@FindBy(xpath="(//div[@class='plp-card-cart'])[2]")
	WebElement bitem4 ;
	
	@FindBy(xpath="(//div[@class='price-details'])[4]")
	WebElement bitem4info ;
	
	@FindBy(xpath="(//div[@class='plp-card-cart'])[4]")
	WebElement bitem5 ;
	
	@FindBy(xpath="(//jds-button[@name='plus'])[10]")
	WebElement plus5;
	
	@FindBy(xpath="(//div[@class='price-details'])[5]")
	WebElement bitem5info ;
	
	@FindBy(xpath="(//button[@name='placeorder'])[1]")
	WebElement placeorder ;
	
	@FindBy(xpath="//button[@id='basic-button']")
	WebElement getotp ;
	
	@FindBy(xpath="(//div[@class='yougetfreedel ng-star-inserted'])[1]")
	WebElement offer ;
	
	// filter 2 (fresh fruits)
	@FindBy(xpath="(//a[@title='Go to Fresh Fruits'])[1]")
	WebElement filter2 ;
	
	@FindBy(xpath="(//div[@class='plp-card-cart'])[3]")
	WebElement fitem1 ;
	
	@FindBy(xpath="//label[@class='ais-refinement-list--label in_stock_check']")
	WebElement availability ;
	
	//@FindBy(xpath="(//label[@class='ais-RefinementList-label'])[4]")
	//WebElement categories ;
	
	@FindBy(xpath="(//label[@class='ais-RefinementList-label'])[1]")
	WebElement categories ;
	
	@FindBy(xpath="(//label[@class='ais-RefinementList-label'])[6]")
	WebElement Brand ;
	
	@FindBy(xpath="(//div[@class='rheostat-handle rheostat-handle-lower'])[1]")
	WebElement slider1 ;
	
	@FindBy(xpath="(//div[@class='rheostat-handle rheostat-handle-lower'])[2]")
	WebElement slider2 ;
	
	@FindBy(xpath="//jds-container[@classname='left-side-container']")
	WebElement cartsubtotal ;
	
	// Home & kitchen module xpath 
	
	@FindBy(xpath="(//li[@class='header-nav-l1-item'])[3]")
	WebElement Navbutton3 ;
	
	@FindBy(xpath="(//button[@class='jm-btn tertiary small jm-icon'])[3]")
	WebElement disposables ;
	
	@FindBy(xpath="(//div[@class='jm-list-content-title'])[9]")
	WebElement disposablesplate ;
	
	@FindBy(xpath="(//div[@class='product-card-cta jm-mt-xs'])[1]")
	WebElement disposablesitem1 ;
	
	@FindBy(xpath="(//div[@class='product-card-cta jm-mt-xs'])[3]")
	WebElement disposablesitem2 ;
	
	@FindBy(xpath="(//button[@class='jm-btn tertiary small jm-icon'])[5]")
	WebElement furniture ;
	
	@FindBy(xpath="(//div[@class='jm-list-content-title'])[29]")
	WebElement beds ;
	
	@FindBy(xpath="(//div[@class='product-card-cta jm-mt-xs'])[1]")
	WebElement beditem1 ;
	
	@FindBy(xpath="(//button[@class='jm-btn tertiary small jm-icon'])[8]")
	WebElement kitchenwear ;
	
	@FindBy(xpath="(//div[@class='jm-list-content-title'])[64]")
	WebElement cookwear ;
	
	@FindBy(xpath="(//div[@class='product-card-cta jm-mt-xs'])[1]")
	WebElement cookwearitem ;
	
	// Fashion module 
	@FindBy(xpath="(//li[@class='header-nav-l1-item'])[4]")
	WebElement fashionbutton ;
	
	@FindBy(xpath="//section[@class='banner']")
	WebElement fashionbanner ;
	
	@FindBy(xpath="(//div[@class='plp-card-wishlist'])[1]")
	WebElement likeitem1 ;
	
	@FindBy(xpath="(//div[@class='plp-card-wishlist'])[3]")
	WebElement likeitem3 ;
	
	@FindBy(xpath="(//div[@class='jm-list-prefix'])[2]")
	WebElement women ;
	
	@FindBy(xpath="(//a[@class='sub_cat_nav text-truncate'])[18]")
	WebElement clothtype ;
	
	@FindBy(xpath="(//label[@class='ais-RefinementList-label'])[1]")
	WebElement gender ;
	
	@FindBy(xpath="(//label[@class='ais-RefinementList-label'])[7]")
	WebElement size ;
	
	@FindBy(xpath="(//label[@class='ais-RefinementList-label'])[15]")
	WebElement brand ;
	
	@FindBy(xpath="(//label[@class='ais-RefinementList-label'])[18]")
	WebElement ocassion ;
	
	// xpath for Electronics module 

	@FindBy(xpath="(//li[@class='header-nav-l1-item'])[5]")
	WebElement electronic ;
	
	@FindBy(xpath="//div[@class='category-title jm-heading-xs']")
	WebElement categorytext ;
	
	@FindBy(xpath="(//ol[@class='ais-InfiniteHits-list jm-row jm-mb-massive']/li)[3]")
	WebElement eitem1 ;
	
	@FindBy(xpath="(//ol[@class='ais-InfiniteHits-list jm-row jm-mb-massive']/li)[1]")
	WebElement eitem2 ;
		
	@FindBy(xpath="(//div[@id='mstar_box']/div)[3]")
	WebElement Eitem3 ;
	
	@FindBy(xpath="(//ol[@class='ais-InfiniteHits-list jm-row jm-mb-massive']/li)[6]")
	WebElement Eitem4 ;
	
	@FindBy(xpath="//button[@class='jm-btn primary medium full-width center jm-fw-bold addtocartbtn']")
	WebElement cartclick ;
	
	@FindBy(xpath="")
	WebElement price ;
	
	@FindBy(xpath="//button[@type='button' and text()=' Skip & Continue ']")
	WebElement continuebutton ;
	
	@FindBy(xpath="(//div[@class='label jm-ml-xs jm-body-s'])[4]")
	WebElement priceall ;
	
	// xpath for beauty module 
	@FindBy(xpath="(//li[@class='header-nav-l1-item'])[6]")
	WebElement beautymodule ;
	
	@FindBy(xpath="//div[@class='jm-row jm-mb-massive']")
	WebElement sortsize ;
	
	// xpath for home improvement module 
	
	@FindBy(xpath="(//li[@class='header-nav-l1-item'])[7]")
	WebElement homeimprovementmodule ;
	
	@FindBy(xpath="(//button[@class='jm-btn tertiary small jm-icon'])[2]")
	WebElement autocarescroll ;
	
	@FindBy(xpath="(//div[@class='jm-list-content-title'])[5]/a")
	WebElement carfeshener ;
	
	@FindBy(xpath="(//ol[@class='ais-InfiniteHits-list jm-row jm-mb-massive']/li)[1]")
	WebElement Homeitem1 ;
	
	@FindBy(xpath="(//ol[@class='ais-InfiniteHits-list jm-row jm-mb-massive']/li)[2]")
	WebElement Homeitem2 ;
	
	@FindBy(xpath="//li[@class='ais-InfiniteHits-item jm-col-4 jm-mt-base']")
	List<WebElement> autocaretotalitem ;
	
	@FindBy(xpath="(//button[@class='jm-btn tertiary small jm-icon'])[5]")
	WebElement electricalscroll ;
	
	@FindBy(xpath="(//div[@class='jm-list-content-title'])[33]/a")
	WebElement electricaloutlet ;
	
	@FindBy(xpath="(//ol[@class='ais-InfiniteHits-list jm-row jm-mb-massive']/li)[1]")
	WebElement electricalitem1 ;
	
	@FindBy(xpath="(//ol[@class='ais-InfiniteHits-list jm-row jm-mb-massive']/li)[2]")
	WebElement electricalitem2 ;
	
	@FindBy(xpath="(//button[@class='jm-btn tertiary small jm-icon'])[4]")
	WebElement carpentryscroll ;
	
	@FindBy(xpath="(//div[@class='jm-list-content-title'])[20]/a")
	WebElement bracketnail ;
	
	
	
	
	public Jiomart_Objectpage()
	{
		PageFactory.initElements(driver,this);
	}
	
	// header button methods
	public WebElement logo()
	{
		return logo;
	}
	public WebElement Locationtext()
	{
		return Locationtext;
	}
	public WebElement Searchbutton()
	{
		return Searchbutton;
	}
	public WebElement Cartbutton()
	{
		return Cartbutton;
	}
	public WebElement Signinbutton()
	{
		return Signinbutton;
	}
	
	// Header menu methods 
	public WebElement clickitem1()
	{
		return Item1;
	}
	public WebElement clickitem2()
	{
		return Item2;
	}
	public WebElement clickitem3()
	{
		return Item3;
	}
	public WebElement clickitem4()
	{
		return Item4;
	}
	public WebElement clickitem5()
	{
		return Item5;
	}
	public WebElement clickitem6()
	{
		return Item6;
	}
	public WebElement clickitem7()
	{
		return Item7;
	}
	public WebElement clickitem8()
	{
		return Item8;
	}
	public WebElement clicknextslide()
	{
		return nextslide;
	}
	public WebElement clickpreviousslide()
	{
		return previousslide;
	}
	public WebElement gettimer()
	{
		return timer;
	}
	public List<WebElement> getfootermenu1()
	{
		return footermenu1 ;
	}
	public List<WebElement> getfootermenu2()
	{
		return footermenu2;
	}
	public List<WebElement> getfootermenu3()
	{
		return footermenu3;
	}
	public List<WebElement> getfootermenu4()
	{
		return footermenu4;
	}
	public WebElement clicklink1()
	{
		return link1;
	}
	public WebElement clicklink2()
	{
		return link2;
	}
	
	// Methods for Sign In button
	public WebElement gettext1()
	{
		return text1;
	}
	public WebElement enterphonenum()
	{
		return phonenum;
	}
	public WebElement getotp()
	{
		return Otp;
	}
	public WebElement getverify()
	{
		return verify;
	}	
	public WebElement gettext2()
	{
		return text2;
	}
	public WebElement enterfirstname()
	{
		return Firstname;
	}
	public WebElement enterlastname()
	{
		return Lastname;
	}
	
	public WebElement enteremail()
	{
		return email;
	}
	public WebElement gettext3()
	{
		return text3;
	}
	public WebElement clickstart()
	{
		return Start;
	}
	// Add to cart methods
	public WebElement clicksort()
	{
		return Sort;
	}
	public WebElement clicksorting()
	{
		return Sorting ;
	}
	public WebElement selectitem()
	{
		return item;
	}
	public WebElement clickshow()
	{
		return show;
	}
	public WebElement clickshow1()
	{
		return show1;
	}
	public WebElement clickshow2()
	{
		return show2;
	}
	public WebElement clickshow3()
	{
		return show3;
	}
	public WebElement getprice()
	{
		return pricetext;
	}
	
	//Add to cart methods
	public WebElement clickcart()
	{
		return cart;
	}
	public List<WebElement> clickitems()
	{
		return items;
	}
	public WebElement clickitemm1()
	{
		return item1;
	}
	public WebElement clickitemm2()
	{
		return item2;
	}
	public WebElement clickitemm3()
	{
		return item3;
	}
	public WebElement clickitemm4()
	{
		return item4;
	}
	public WebElement gotoCart()
	{
		return cartt;
	}
	public WebElement clickContainer()
	{
		return container1;
	}
	public WebElement getItem1info()
	{
		return item1info;
	}
	public WebElement getItem2info()
	{
		return item2info;
	}
	public WebElement getItem3info()
	{
		return item3info;
	}
	public WebElement clickContainer2()
	{
		return container2 ;
	}
	public WebElement plusItem()
	{
		return plusitem;
	}
	public WebElement plusItem2()
	{
		return plusitemm;
	}
	public WebElement printSubtotal()
	{
		return subtotal;
	}
	
	// Methods for Navbar buttons
	public WebElement clickButton1()
	{
		return button1 ;
	}	
	public WebElement clickScroll()
	{
		return scroll;
	}
	public WebElement clickFilter()
	{
		return filter1;
	}
	public WebElement verifyImage()
	{
		return gimage;
	}
	public WebElement clickSortt()
	{
		return sort;
	}
	public WebElement clickPrice()
	{
		return sortprice;
	}
	public WebElement clickItem1()
	{
		return bitem1;
	}
	public WebElement addMoreCount()
	{
		return plus1;
	}
	public WebElement lessCount()
	{
		return minus1;
	}
	public WebElement getItem1()
	{
		return bitem1info ;
	}
	public WebElement clickItem2()
	{
		return bitem2 ;
	}
	public WebElement getItem2()
	{
		return bitem2info;
	}
	public WebElement clickItem3()
	{
		return bitem3;
	}
	public WebElement plus3()
	{
		return plus3;
	}
	public WebElement getItem3()
	{
		return bitem3info;
	}
	public WebElement clickItem4()
	{
		return bitem4;
	}
	public WebElement getItem4()
	{
		return bitem4info;
	}
	public WebElement clickItem5()
	{
		return bitem5;
	}
	public WebElement plus5()
	{
		return plus5 ;
	}
	public WebElement getItem5()
	{
		return bitem5info;
	}
	public WebElement clickPlace()
	{
		return placeorder;
	}
	public WebElement clickotp()
	{
		return getotp;
	}
	public WebElement printoffer()
	{
		return offer;
	}
	public WebElement clickfilter2()
	{
		return filter2;
	}
	public WebElement clickfitem1()
	{
		return fitem1;
	}
	public WebElement clickavail()
	{
		return availability;
	}
	public WebElement clickcategory()
	{
		return categories;
	}
	public WebElement clickbrand()
	{
		return Brand;
	}
	public WebElement clickslider1()
	{
		return slider1;
	}
	public WebElement clickslider2()
	{
		return slider2;
	}
	public WebElement printcart()
	{
		return cartsubtotal ;
	}
	
	// Navbar button2
	public WebElement click_navbutton3()
	{
		return Navbutton3 ;
	}
	public WebElement click_disposal()
	{
		return disposables ;
	}
	public WebElement click_disposalplate()
	{
		return disposablesplate ;
	}
	public WebElement click_disposalitem1()
	{
		return disposablesitem1 ;
	}
	public WebElement click_disposalitem2()
	{
		return disposablesitem2 ;
	}
	public WebElement click_furniture()
	{
		return furniture ;
	}
	public WebElement click_beds()
	{
		return beds ;
	}
	public WebElement click_beditem()
	{
		return beditem1 ;
	}
	public WebElement click_kitchenwear()
	{
		return kitchenwear ;
	}
	public WebElement click_cookwear()
	{
		return cookwear ;
	}
	public WebElement click_cookwearitem()
	{
		return cookwearitem ;
	}
	
	// Fashion module method 
	public WebElement click_fashion()
	{
		return fashionbutton ;
	}
	public WebElement fashion_banner()
	{
		return fashionbanner ;
	}
	public WebElement like_item1()
	{
		return likeitem1 ;
	}
	public WebElement like_item3()
	{
		return likeitem3 ;
	}
	public WebElement click_women()
	{
		return women ;
	}
	public WebElement click_cloth()
	{
		return clothtype ;
	}
	public WebElement click_gender()
	{
		return gender ;
	}
	public WebElement click_size()
	{
		return size ;
	}
	public WebElement click_brand()
	{
		return brand ;
	}
	public WebElement click_ocassion()
	{
		return ocassion ;
	}
	public WebElement getotp1()
	{
		return Otp1 ;
	}
	
	// methods for electronics 
	public WebElement click_electronics()
	{
		return electronic ;
	}
	public WebElement click_cart()
	{
		return cartclick ;
	}
	public WebElement check_category()
	{
		return categorytext ;
	}
	public WebElement click_eitem1()
	{
		return eitem1 ;
	}
	public WebElement click_eitem2()
	{
		return eitem2 ;
	}
	public WebElement click_eitem3()
	{
		return Eitem3 ;
	}
	public WebElement click_eitem4()
	{
		return Eitem4 ;
	}
	public WebElement click_continue()
	{
		return continuebutton ;
	}
	public WebElement click_allproduct()
	{
		return priceall ;
	}
	
	// methods for beauty module 
	public WebElement click_beauty()
	{
		return beautymodule ;
	}
	public WebElement click_sortsize()
	{
		return sortsize ;
	}
	
	// methods for home improvement module
	public WebElement click_homeimprove()
	{
		return homeimprovementmodule ;
	}	
	public WebElement click_autoscroll()
	{
		return autocarescroll ;
	}
	public WebElement click_carfreshener()
	{
		return carfeshener ;
	}
	public WebElement click_Homeitem1()
	{
		return Homeitem1 ;
	}
	public WebElement click_Homeitem2()
	{
		return Homeitem2 ;
	}
	public List<WebElement> click_autocaretotal()
	{
		return autocaretotalitem ;
	}
	public WebElement click_electricalscroll()
	{
		return electricalscroll ;
	}
	public WebElement click_electricaloutlet()
	{
		return electricaloutlet ;
	}
	public WebElement click_electricalitem1()
	{
		return electricalitem1 ;
	}
	public WebElement click_electricalitem2()
	{
		return electricalitem2 ;
	}
	public WebElement click_carpentryscroll()
	{
		return carpentryscroll ;
	}
	public WebElement click_bracketnail()
	{
		return bracketnail ;
	}
	
}
