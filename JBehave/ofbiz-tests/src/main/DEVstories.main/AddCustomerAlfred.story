

Scenario 1: Create a customer from AlfRED and test in AlfRED

Given that I logged into alfred site as Customer Service Manager
When I click "Add" link under Customer
And I add "Simon" as First Name
And I add "Smith" as Last Name 
And I add "Marketing manager" as Job Title 
And I add "simon.smith@panthacorp.com.au" as Email Address
And I add "1980-12-12" as Birthday
And I add "0421128028" as Phone
And I add "Pantha corporation" as Company
And I select the "Australia" as "countryGeoId"
And I select the "New South Wales" as "stateProvinceGeoId"
And I add "2009" as Post Code
And I add "Manly" as Suburb
And I add "141, Manly street" as Street
And I add "10%" as Discount 
And I add "This customer created by James" as Note
When I save customer 
Then I should see Congratulations. You just added a new Customer!

 
When I click "Search" link 
And I add "simon.smith@panthacorp.com.au" as Search String
And I click on search
And I click "Simon Fuller" link
And I verify the value of "Personal Details" as "9621 8208 christy2@tpg.com.au"
And I click "Edit" link
Then I should see "Simon" as First Name
And I should see "Smith" as Last Name 
And I should see "Marketing manager" as Job Title  
And I should see "simon.smith@panthacorp.com.au" as Email Address 
And I should see "1980-12-12" as Birthday 
And I should see "0421128028" as Phone 
And I should see "Pantha corporation" as Company 
And I should see "10%" as Discount 
And I should see "This customer created by James" as Note
