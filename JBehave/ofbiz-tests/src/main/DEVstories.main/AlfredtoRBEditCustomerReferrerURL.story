Scenario: Edit a customer from AlfRED and test in AlfRED and RB
 
Given that I logged into alfred site as Customer Service Manager
When I click "Add" link
And I add "Customer1" as Customer's First Name
And I add "One" as Customer's Last Name 
And I add "Marketing manager" as Job Title 
And I add "testuserref@panthacorp.com.au" as Email Address
And I add "0421128028" as Customer's Phone
And I add "Pantha corporation" as Company
And I select "Australia" as "Country"
And I select "New South Wales" as "State"
And I add "2009" as Post Code
And I add "Manly" as Subburb
And I add "141, Manly street" as Street
And I add "10" as Discount 
And I select "ADMA" as Referrer in Alfred
And I add "This customer created by James for Ref" as Note
When I save customer 
Then I see Congratulations. You just added a new Customer!
And I get the CustomerID

And I select "Advertising" as Referrer in Alfred
When I save customer 
Then I see Your changes have been recorded successfully!
And I wait for "10" seconds

Then I logged into Ting site
When I navigate to the customer search page
And I add "testuserref@panthacorp.com.au" as Customer Email
And I click "Search" button
Then I see Customer2
And I click the Edit Customer Image
And I verify the value "Customer2" as "First name"
And I verify the value "Two" as "Surname"
And I verify the value "QA manager" as "Job Title"
And I verify the value "testauat@panthacorp.com.au" as "Email"
And I should see "Xebia" as Company 
And I verify the value "0421128029" as "Phone"
And I verify the value "Advertising" as "Referrer/Source"
And I click "Notes" field
And I see the note This customer created by James for Ref
