Scenario 1: Create a customer from AlfRED and test in Ting

Given that I logged into alfred site as Customer Service Manager
When I click "Add" link
And I add "Test" as Customer's First Name
And I add "Customer" as Customer's Last Name 
And I add "Marketing manager" as Job Title 
And I add "auatqa@testing.com" as Email Address
And I add "0421128028" as Customer's Phone
And I add "Pantha corporation" as Company
And I select Australia as Country
And I select New South Wales as State
And I add "2009" as Post Code
And I add "Manly" as Suburb
And I add "141, Manly street" as Street
And I add "10%" as Discount 
And I add "This customer created by James" as Note
When I save customer 
Then I should see Congratulations. You just added a new Customer!

Given that I logged into Ting site
When I navigate to the customer search page
And I add "Test" as Customer First Name
And I add "Customer" as Customer Surname
And I click "Search" button
And I click the Edit Customer Image

And I verify the value "Test" as "First Name"
And I verify the value "Customer" as "Surname"
And I verify the value "Marketing manager" as "Job Title"
And I verify the value "auatqa@testing.com" as "Email"
And I verify the value "Pantha corporation" as "Company"
And I click "Notes" field
And I see the note Adding Note to Verify on Ting.