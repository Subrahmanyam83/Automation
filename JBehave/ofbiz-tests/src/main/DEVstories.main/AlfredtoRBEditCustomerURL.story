Scenario: Edit a customer from AlfRED and test in AlfRED and RB
 
Given that I logged into alfred site as Customer Service Manager
When I click "Add" link
And I add "Customer1" as Customer's First Name
And I add "One" as Customer's Last Name 
And I add "Marketing manager" as Job Title 
And I add "cust.a3@panthacorp.com.au" as Email Address
And I add "0421128028" as Customer's Phone
And I add "Pantha corporation" as Company
And I select "Australia" as "Country"
And I select "New South Wales" as "State"
And I add "2009" as Post Code
And I add "Manly" as Subburb
And I add "141, Manly street" as Street
And I add "10" as Discount 

And I add "This customer created by James" as Note
When I save customer 
Then I see Congratulations. You just added a new Customer!
And I get the CustomerID

Given that I logged into alfred site as Customer Service Manager
When I navigate to earlier customer page in Alfred
And I see Customer1
When I navigate to customer edit page in Alfred
And I add "Customer2" as Customer's First Name
And I add "Two" as Customer's Last Name 
And I add "QA manager" as Job Title 
And I add "cust.a4@panthacorp.com.au" as Email Address
And I add "0421128029" as Customer's Phone
And I add "Xebia" as Company
And I select "Australia" as "Country"
And I select "New South Wales" as "State"
And I add "2012" as Post Code
And I add "Manly" as Subburb
And I add "142, Manly street" as Street
And I add "20" as Discount 
And I add "This customer edited by Ben" as Note
When I save customer 
Then I see Your changes have been recorded successfully!

Then I should see "Customer2" as Customer's First Name
And I should see "Two" as Customer's Last Name 
And I should see "QA manager" as Job Title  
And I should see "cust.a4@panthacorp.com.au" as Email Address 
And I should see "0421128029" as Customer's Phone 
And I should see "Xebia" as Company 
And I should see "142, Manly street" as Street
And I should see "Manly" as Subburb
And I should see "2012" as Post Code
And I should see "20" as Discount 
And I see This customer edited by Ben

Then I logged into Ting site
When I navigate to the customer search page
And I add "cust.a4@panthacorp.com.au" as Customer Email
And I click "Search" button
Then I see Customer2
And I click the Edit Customer Image
And I verify the value "Customer2" as "First name"
And I verify the value "Two" as "Surname"
And I verify the value "QA manager" as "Job Title"
And I verify the value "cus.a2@panthacorp.com.au" as "Email"
And I should see "Xebia" as Company 
And I verify the value "0421128029" as "Phone"
And I click "Notes" field
And I see the note This customer edited by Ben
