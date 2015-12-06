Scenario 1: Create a customer from AlfRED and test in AlfRED 

Given that I logged into alfred site as Customer Service Manager
When I click "Add" link
And I add "News" as Customer's First Name
And I add "Letter" as Customer's Last Name 
And I add "Marketing manager" as Job Title 
And I add "news6.letter@panthacorp.com.au" as Email Address
And I add "0421128028" as Customer's Phone
And I add "Pantha corporation" as Company
And I select "Australia" as "Country"
And I select "New South Wales" as "State"
And I add "2009" as Post Code
And I add "Manly" as Subburb
And I add "141, Manly street" as Street
And I add "10%" as Discount 
Then I add the Select the News Letter Subsription - Fun Newsletter
When I save customer 
Then I see Congratulations. You just added a new Customer!
And I wait for "20" seconds

Then I logged into Ting site
When I navigate to the customer search page
And I add "news6.letter@panthacorp.com.au" as "Email Address"
And I click "Search" button
Then I see News
And I click the Edit Customer Image
And I verify the value "News" as "First name"
And I verify the value "Letter" as "Surname"
And I verify the value "Marketing manager" as "Job Title"
And I verify the value "news5.letter@panthacorp.com.au" as "Email"
And I verify the Subscription as Fun Newsletter
