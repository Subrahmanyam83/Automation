Scenario 1: Create a customer from AlfRED and test in AlfRED 

Given that I logged into alfred site as Customer Service Manager
When I click "Add" link
And I add "Simon" as Customer's First Name
And I add "Smith" as Customer's Last Name 
And I add "Marketing manager" as Job Title 
And I add "simon.smith4@panthacorp.com.au" as Email Address
And I add "0421128028" as Customer's Phone
And I add "Pantha corporation" as Company
And I select "Australia" as "Country"
And I select "New South Wales" as "State"
And I add "2009" as Post Code
And I add "Manly" as Subburb
And I add "141, Manly street" as Street
And I add "10%" as Discount 
And I add "This customer created by James" as Note
When I save customer 
Then I see Congratulations. You just added a new Customer!
And I get the CustomerID
 
Then I should see "Simon" as Customer's First Name
And I should see "Smith" as Customer's Last Name 
And I should see "Marketing manager" as Job Title  
And I should see "simon.smith4@panthacorp.com.au" as Email Address 
And I should see "0421128028" as Customer's Phone 
And I should see "Pantha corporation" as Company 
And I should see "141, Manly street" as Street
And I should see "Manly" as Subburb
And I should see "2009" as Post Code
And I should see "10" as Discount 
And I see This customer created by James
