
@tag
Feature: Amazon functional testing
   @tag1
   Scenario: Checking create account functionality with valid data
    	Given User should be on "https://www.amazon.ca/"
      And mouse hover on Hello Sign in
      And Click on New Customer sign in
      And Create Account page open   
      When The user type valid firstname lastname in the Your name box
      And Type valid email id
      And the user types valid password
    	And Type valid password again  
    	And click on verify email button user receive OTP on email    	
    	Then the account is created
    	
    @tag2
    Scenario: Checking create account functionality with invalid data
     	Given User should be on "https://www.amazon.ca/"
      And mouse hover on Hello Sign in
      And Click on New Customer sign in
      And Create Account page open   
      When The user leaves Your name box blank
      And Type valid email id
      And the user types valid password
    	And Type valid password again  
    	And click on verify email button user receive OTP on email   	
    	Then the user must get an appropriate error message   
    
    
    @tag3
    Scenario: Checking search option
     	Given User should be on "https://www.amazon.ca/"
      And click on search bar
     	When The user enter jackets for girls 12-14 years old 
      And clicks on search icon
      Then Result page must open
      
     
    @tag4  
    Scenario: checking sorting option
    Given User should be on "https://www.amazon.ca/"
    And click on search bar
    And The user enter jackets for girls 12-14 years old 
    And clicks on search icon
    And Result page must open
    When The user clicks on Sort By button on the top right of the page
    Then The user is able to select one option from sort by button
    
   
    @tag5
    Scenario: checking filtering option
    Given User should be on "https://www.amazon.ca/"
    And click on search bar
    And The user enter jackets for girls 12-14 years old 
    And clicks on search icon
    And Result page must open
    When The user clicks on customer review on the left side of page
    Then The page must display result as per filtering option selected  
    
    @tag6  
     Scenario: checking shopping cart feature
     Given User should be on "https://www.amazon.ca/"
     And click on search bar
     And The user enter pokemon cards pack 
     And clicks on search icon
     And Result page must open
     When The user clicks on Pokemon Card Game: Sword & Shield Expansion Pack - Time Gazer Box
     And click on Add to cart from the searched item page
     Then The item should get added to the cart
     
     
     @tag7
       Scenario: checking shopping cart feature with multiple items
       Given User should be on "https://www.amazon.ca/"
       And click on search bar
       And The user enter pokemon cards pack 
       And clicks on search icon
       And Result page must open
       And The user clicks on Pokemon Cyclizar ex Box
       And click on Add to cart from the searched item page
       And the user type Amazon.ca Card in a Birthday Reveal in search box
       And clicks on search icon
       And Result page must open
       And The user clicks on Amazon.ca Card in a Birthday Reveal
       And click on Add to cart from the searched item page
       When the user click on proceed to checkout
       Then order summary must show two items to checkout
       
    
    @tag8   
      Scenario: checking shopping cart feature by deleting one item
       Given User should be on "https://www.amazon.ca/"
       And click on search bar
       And The user enter pokemon cards pack 
       And clicks on search icon
       And Result page must open
       And The user clicks on Pokemon Cyclizar ex Box
       And click on Add to cart from the searched item page
       And the user type Amazon.ca Card in a Birthday Reveal in search box
       And clicks on search icon
       And Result page must open
       And The user clicks on Amazon.ca Card in a Birthday Reveal
       And click on Add to cart from the searched item page
       And click on go to cart button
       And Subtotal must show two items to checkout
       When the user deletes one item from the cart
       Then order summary must show just one item to checkout
        
        
    @tag9
		Scenario: check amazon sign in with valid email  
	    Given User should be on "https://www.amazon.ca/"
      And clicks on Hello Sign in
	    When user enters valid Email id or mobile phone no
	    And clicks on Continue
	    And enter valid password on the password page 
	    And click on sign in button    
	    Then user navigates to homepage
	    
	 
	  @tag10
	  Scenario: To add new address in valid amazon account  
    Given User should be on "https://www.amazon.ca/"
    And clicks on Hello Sign in
    And user enters valid Email id or mobile phone no
    And clicks on Continue
	  And enter valid password on the password page 
	  And click on sign in button 
	  And user navigates to homepage 
	  And clicks on Hello Sign in  
    And clicks on Your Addresses
    And clicks on Add Address
    When the user types valid fullname
    And types valid Phone number
    And types valid Address Line1
    And types valid Address Line2
    And Types valid City
    And Select valid Province/Territory
    And Types valid Postal code
    And Click on Add address button
    Then the address must be added to the amazon account
    
     
    @tag11
		Scenario: To add new address with invalid fullname
		Given User should be on "https://www.amazon.ca/"
    And clicks on Hello Sign in
    And user enters valid Email id or mobile phone no
    And clicks on Continue
	  And enter valid password on the password page 
	  And click on sign in button 
	  And user navigates to homepage 
	  And clicks on Hello Sign in  
    And clicks on Your Addresses
    And clicks on Add Address
    When the user leave fullname box blank
    And types valid Phone number
    And types valid Address Line1
    And types valid Address Line2
    And Types valid City
    And Select valid Province/Territory
    And Types valid Postal code
    And Click on Add address button
    Then the appropriate error message must be displayed
    
   
    @tag12
    Scenario: To check buy again feature in your orders
    Given User should be on "https://www.amazon.ca/"
    And clicks on Hello Sign in
    And user enters valid Email id or mobile phone no
    And clicks on Continue
	  And enter valid password on the password page 
	  And click on sign in button 
	  And user navigates to homepage 
	  And clicks on Hello Sign in  
	  And clicks on Your orders
	  And clicks on Buy again
	  When The user clicks on Add to cart of Pokemon Cards
	  And click on go to cart button
	  Then one Pokemon card set must get added to the cart
	  
	 @under-test
	 @tag13
	 Scenario: To validate your payment feature
	 Given User should be on "https://www.amazon.ca/"
   And clicks on Hello Sign in
   And user enters valid Email id or mobile phone no
   And clicks on Continue
   And enter valid password on the password page 
	 And click on sign in button 
	 And user navigates to homepage 
	 And clicks on Hello Sign in
	 And clicks on Your payments
	 And clicks on add a payment method
	 When the user clicks on Add a credit or debit card
	 And types card number
	 And types Name on card
	 And selects expiration month
	 And selects expiration year
	 And clicks on Add your card
	 Then the card must be added to the user account
	 
	  