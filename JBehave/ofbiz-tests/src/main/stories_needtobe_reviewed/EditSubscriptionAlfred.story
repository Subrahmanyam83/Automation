
Scenario 1: Create a customer from AlfRED and test in AlfRED

Given that I logged into alfred site as Customer Service Manager
When I click "Add" link
And I add "News" as Customer's First Name
And I add "Letter" as Customer's Last Name 
And I add "news77.letter@panthacorp.com.au" as Email Address
When I save customer 
Then I see Congratulations. You just added a new Customer!
And I get the CustomerID
 
Then I should see "News" as Customer's First Name
And I should see "Letter" as Customer's Last Name 
And I should see "news77.letter@panthacorp.com.au" as Email Address 

Then I add the Select the News Letter Subsription - Fun Newsletter
When I update customer
Then I see Your changes have been recorded successfully!
When I navigate to Customer View Page
Then I see Fun Newsletter

Then I click edit the NewsLetter link
And I add the Select the Special Offers Newsletter
When I update customer
Then I see Your changes have been recorded successfully!
When I navigate to Customer View Page
Then I see Fun Newsletter
Then I see Special Offers Newsletter