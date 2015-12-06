Scenario: Add Supplier in Ofbiz - With Compulsory fields

Given that I logged into alfred site as Product Analyst
When I click "SupplierAdd" link under Supplier
Then I see Add Supplier

And I type "Test Supplier" in the "Company Name"
And I type "TE2" in the "Product Code Prefix"
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

And I check the value of "groupName" as the "Test Supplier"
And I check the value of "groupNameLocal" as the "TE2"
And I check the value of "address1" as the "Sydney"
And I check the value of "city" as the "Manly"
And I check the value of "postalCode" as the "92"
And I check the value of "phone" as the "44556677"
And I check the value of "mobile" as the "4455667788"
And I check the value of "fax" as the "12345"
And I check the value of "email" as the "user1@pantha.com"
And I check the value of "divertemail" as the "user2@pantha.com"
And I check the value of "webaddress" as the "panthacorp.com"
