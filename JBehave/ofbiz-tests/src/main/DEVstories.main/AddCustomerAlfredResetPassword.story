Scenario 1: Create a customer from AlfRED and test in AlfRED 

Given that I logged into alfred site as Customer Service Manager
When I click "Add" link
And I add "Reset" as Customer's First Name
And I add "Password" as Customer's Last Name 
And I add "Marketing manager" as Job Title 
And I add "reset.password111@panthacorp.com.au" as Email Address
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
 
Given that I logged into alfred site as Customer Service Manager
When I navigate to earlier customer page in Alfred
And I see reset.password111@panthacorp.com.au
And I click the "Reset Password" link
And I see Are you sure you want to reset password and send email to user? 
And I click on OK
And I see Password has been successfully reset and the email has been sent.

Given that I logged into Ofbiz Catalog Manager Site as User
And I see Please Change Your Password

