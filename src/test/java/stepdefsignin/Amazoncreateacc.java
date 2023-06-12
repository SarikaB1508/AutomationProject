package stepdefsignin;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomamazon.Createacc;
import pomamazon.POMaddaddress;
import pomamazon.POMhomepage;
import utility.Util;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pomamazon.POMsignin;
import pomamazon.POMyouracc;
import pomamazon.POMyourorders;
import pomamazon.POMyourpayments;

public class Amazoncreateacc {
	public WebDriver driver1;
	public POMhomepage homepage;
	public Createacc createeacc;
	public Util utility;
	public POMsignin signin;
	public POMyouracc youracc;
	public POMaddaddress addaddress;
	public POMyourorders yourorders;
	public POMyourpayments yourpayments;
	
	@Given("User should be on {string}")
	public void user_should_be_on(String string) {
		  utility = new Util();
		  driver1 = utility.initiatebrowser();
		  homepage= new POMhomepage(driver1);
		  createeacc= new Createacc(driver1);
		  signin = new POMsignin(driver1);
		  youracc= new POMyouracc(driver1);
		  addaddress= new POMaddaddress(driver1);
		  yourorders = new POMyourorders(driver1);
	}

	@Given("mouse hover on Hello Sign in")
	public void mouse_hover_on_hello_sign_in() {
	    homepage.hoveroverhellosignin();
	} 
	  
	@Given("Click on New Customer sign in")
	    public void click_on_new_customer_sign_in() {
	      homepage.clickstarthere();
	    }

	    @Given("Create Account page open")
	    public void create_account_page_open() {
	    	String text = createeacc.createacctext();
		    Assert.assertEquals("You are not on create account page","Create account" , text);
		    //System.out.println(text);
	    }
	    
	    @When("The user type valid firstname lastname in the Your name box")
	    public void the_user_type_valid_firstname_lastname_in_the_your_name_box() {
	    	createeacc.typeyourname("abc");
	    	
	    }

	    @When("Type valid email id")
	    public void type_valid_email_id() {
	    	createeacc.typeemailid("a@b.com");
	    	createeacc.clickpwdbox();
	    }
	    
	    @When("the user types valid password")
	    public void the_user_types_valid_password() {
	    	createeacc.typepassword("please");
	    }
	    
	    @When("Type valid password again")
	    public void type_valid_password_again() {
	    	createeacc.typepasswordagain("please");
	    }

	    @When("click on verify email button user receive OTP on email")
	    public void click_on_verify_email_button_and_user_receive_otp_on_email() {
	    	createeacc.clickcontinue();
	    }
	    
	    @Then("the account is created")
	    public void the_account_is_created() {
	        System.out.println("Your account is created");
	    }
	    
	   	    
	    @When("The user leaves Your name box blank")
	    public void the_user_leaves_your_name_box_blank() {
	    	createeacc.typeyourname("   ");
	    }
	    
	    @Then("the user must get an appropriate error message")
	    public void the_user_must_get_an_appropriate_error_message() {
	    	String error = createeacc.geterrormsg();
	    	Assert.assertEquals("Error message is not displayed","Enter your name" , error);
	    }
	    
	    @Given("clicks on Hello Sign in")
		public void clicks_on_hello_sign_in() {
		    homepage.clickhellosignin();
		}

	        
	    @When("user enters valid Email id or mobile phone no")
		public void user_enters_valid_email_id_or_mobile_phone_no() {
			signin.typeemailid("abc@def.com");
			}
		@When("clicks on Continue")
		public void clicks_on_continue() {
			//driver.findElement(By.id("continue")).click();
			signin.clickcontinuebtn();
			}
		@When("enter valid password on the password page")
		public void enter_valid_password_on_the_password_page() {
			//driver.findElement(By.id("ap_password")).sendKeys("lsdjflsdkfjlk");
			signin.typepassword("KJLKJLKJLJJ");
			}
		@When("click on sign in button")
		public void click_on_sign_in_button() throws InterruptedException {
			//driver.findElement(By.id("signInSubmit")).click();
			//signin.clicksigninbtn();
			Thread.sleep(15000);
			}
		@Then("user navigates to homepage")
		public void user_navigates_to_homepage() {
			String title = (String) signin.gethellotitle();
		    Assert.assertEquals("The Title is not matching","Hello, abc" , title);
		    System.out.println(title);
			}	
		@Given("click on search bar")
		public void click_on_search_bar() {
		   homepage.search();
		}
		@When("The user enter pokemon cards pack")
		public void the_user_enter_pokemon_cards_pack() {
		    homepage.search("pokemon cards pack");
		}

		@When("clicks on search icon")
		public void clicks_on_search_icon() {
		    homepage.clicksearchicon();
		}
		@Then("Result page must open")
		public void result_page_must_open() {
			String text = homepage.displayresult();
			Assert.assertEquals("text message is not result", "Results", text);
		    System.out.println(text);
		}
		
		@When("The user clicks on Sort By button on the top right of the page")
		public void the_user_clicks_on_sort_by_button_on_the_top_right_of_the_page() {
		   homepage.clicksortby();
		}
		
		@Then("The user is able to select one option from sort by button")
		public void the_user_is_able_to_select_one_option_from_sort_by_button() {
		    homepage.clickhightolow();
		}
		
		@When("The user clicks on customer review on the left side of page")
		public void the_user_clicks_on_customer_review_on_the_left_side_of_page() {
		    homepage.clickcustrev();
		}

		@Then("The page must display result as per filtering option selected")
		public void the_page_must_display_result_as_per_filtering_option_selected() {
		    homepage.displayresult();
		    System.out.println("The items with 4+ stars rating is displayed");
		}
		
		@When ("The user clicks on Pokemon Card Game: Sword & Shield Expansion Pack - Time Gazer Box")
		public void the_user_clicks_on_Pokemon_card_Game_Sword_Shield_Expansion_Pack() {
			homepage.clickcards();
		}
		
		@When("click on Add to cart from the searched item page")
		public void click_on_add_to_cart_from_the_searched_item_page() {
		    homepage.clickaddtocartbtn();
		}

		@Then("The item should get added to the cart")
		public void the_item_should_get_added_to_the_cart() {
			String text = homepage.itemaddedtocart();
		    Assert.assertEquals("The Title is not matching","Added to Cart" , text);
		    System.out.println(text);
		}
		
		@Given("The user clicks on Pokemon Cyclizar ex Box")
		public void the_user_clicks_on_pokemon_Cylizar_ex_box() throws InterruptedException {
		    homepage.clickpokemoncard();
		    Thread.sleep(10000);
		}
		
		@Given("the user type Amazon.ca Card in a Birthday Reveal in search box")
		public void the_user_type_amazon_ca_card_in_a_birthday_reveal_in_search_box() {
		    homepage.typeamazoncard("Amazon.ca Card in a Birthday Reveal");
		}
		
		@Given("The user clicks on Amazon.ca Card in a Birthday Reveal")
		public void the_user_clicks_on_amazon_ca_card__in_a_birthday_reveal() throws InterruptedException {
		    homepage.clickamazoncard();
		    Thread.sleep(10000);
		}

		@When("the user click on proceed to checkout")
		public void the_user_click_on_proceed_to_checkout() {
		   homepage.clickproceedtocheckout();
		}

		@Then("order summary must show two items to checkout")
		public void order_summary_must_show_two_items_to_checkout() {
		   String number = homepage.getitems();
		   Assert.assertEquals("Total items are not two","Items (2):" , number);
		    System.out.println(number);
		}
		
		@Given("Subtotal must show two items to checkout")
		public void subtotal_must_show_two_items_to_checkout() throws InterruptedException {
			String getsubtotalnumber = homepage.getsubtotal();
			   Assert.assertEquals("The subtotal items are not two","Subtotal (2 items):" , getsubtotalnumber);
			    System.out.println(getsubtotalnumber);
			    Thread.sleep(10000);
		}
		
		@Given("click on go to cart button")
		public void click_on_go_to_cart_button() {
			homepage.clickgotocartbtn();
		}
		
		@When("the user deletes one item from the cart")
		public void the_user_deletes_one_item_from_the_cart() {
		    homepage.clickdelete();
		}

		@Then("order summary must show just one item to checkout")
		public void order_summary_must_show_just_one_item_to_checkout() {
			String ordsum = homepage.getordersummary();
			Assert.assertEquals("Total items are not one","Subtotal (1 item):" , ordsum);
			    System.out.println(ordsum);
		}
		@Given("clicks on Your Addresses")
		public void clicks_on_your_addresses() throws InterruptedException {
			youracc.clickyouraddress();
			Thread.sleep(10000);
		}

		@Given("clicks on Add Address")
		public void clicks_on_add_address() {
			addaddress.clickaddaddress();
		}

		@Then("the user types valid fullname")
		public void the_user_types_valid_fullname() {
			addaddress.typefullname("abcd");
		}

		@Then("types valid Phone number")
		public void types_valid_phone_number() {
			addaddress.typephonenumber("11111");
		}

		@Then("types valid Address Line1")
		public void types_valid_address_Line1() {
			addaddress.typeaddress1("nmkjh");
		}
		
		@Then("types valid Address Line2")
		public void types_valid_address_Line2() {
			addaddress.typeaddress2("6789");
		}
		@Then("Types valid City")
		public void types_valid_city() {
			addaddress.typecity("Nova Scotia");
		}

		@Then("Select valid Province\\/Territory")
		public void select_valid_province_territory() {
			addaddress.typeprovince();
		}

		@Then("Types valid Postal code")
		public void types_valid_postal_code() {
			addaddress.typepostalcode("P6TG");
		}

		@Then("Click on Add address button")
		public void click_on_add_address_button()  {
			addaddress.clickaddaddressbtn();
		}

		@Then("the address must be added to the amazon account")
		public void the_address_must_be_added_to_the_amazon_account() {
		  System.out.println("The address is added");
		}
		
		@Then("the user leave fullname box blank")
		public void the_user_leave_fullname_box_blank() {
			addaddress.typefullname("     ");
		}

		@Then("the appropriate error message must be displayed")
		public void the_appropriate_error_message_must_be_displayed() {
			String error = addaddress.geterrormsg();
			Assert.assertEquals("no error is displayed","Review your address" , error);
		    System.out.println(error);
	    }
		
		@Given("clicks on Your orders")
		public void clicks_on_your_orders() {
			youracc.clickyourorders();
		}

		@Given("clicks on Buy again")
		public void clicks_on_buy_again() {
		    yourorders.clickbuyagain();
		}

		@When("The user clicks on Add to cart of Pokemon Cards")
		public void the_user_clicks_on_add_to_cart_of_pokemon_cards() {
		    yourorders.clickpokemonadd();
		}

		@Then("one Pokemon card set must get added to the cart")
		public void one_pokemon_card_set_must_get_added_to_the_cart() {
			String item = yourorders.getitemadded();
			Assert.assertEquals("Item in cart is not added","Pokemon TCG: Random Cards from Every Series, 100 Cards in Each Lot" , item);
		    System.out.println(item);
		}
		
		@Given("clicks on Your payments")
		public void clicks_on_your_payments() {
		    youracc.clickyourpayments();
		}

		@Given("clicks on add a payment method")
		public void clicks_on_add_a_payment_method() {
			yourpayments.clickaddpy();
		}

		@When("the user clicks on Add a credit or debit card")
		public void the_user_clicks_on_add_a_credit_or_debit_card() {
			yourpayments.clickaddcard();
		}

		@When("types card number")
		public void types_card_number() {
			yourpayments.typecardnumber("5425233430109903");
		}

		@When("types Name on card")
		public void types_name_on_card() {
		    yourpayments.typename("ABCD");
		}

		@When("selects expiration month")
		public void selects_expiration_month() {
		    yourpayments.selectmonth();
		}

		@When("selects expiration year")
		public void selects_expiration_year() {
			yourpayments.selectyear();
		}

		@When("clicks on Add your card")
		public void clicks_on_add_your_card() {
			yourpayments.clickaddcard();
		}

		@Then("the card must be added to the user account")
		public void the_card_must_be_added_to_the_user_account() {
		   System.out.println("Your card is added to your account");
		}



		  @After 
		  public void closeBrowser()  { 
		     driver1.quit(); 
		     }
		 

}
