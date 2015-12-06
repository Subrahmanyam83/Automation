
Scenario: Create Supplier Account with available payment terms.

Given that I logged into alfred site as Product Analyst
When I click "SupplierAdd" link under Supplier
Then I see Add Supplier





And I type "Test Supplier" in the "Company Name"
And I type "TE4" in the "Product Code Prefix"
And I type "Sydney" in the "Address"
And I type "Manly" in the "Suburb"
And I type "92" in the "Post Code"
And I select "Australia" as "Country"
And I select "New South Wales" as "State"
And I type "44556677" in the "Phone"
And I type "4455667788" in the "Mobile"
And I type "12345" in the "Fax"
And I type "user1@pantha.com" in the "Booking Email"
And I type "user2@pantha.com" in the "Redirect Email"
And I type "panthacorp.com" in the "Website"



And I click save button
And I see Supplier successfully created. You can continue to make further changes.
And I select "14 days before Experience" from "Payment Terms"
And I click on Insurance Required Yes
And I click save changes button
And I see Supplier successfully updated.


