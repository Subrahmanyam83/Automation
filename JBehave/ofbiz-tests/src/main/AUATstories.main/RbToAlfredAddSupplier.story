
Scenario: RB to Alfred supplier - With Compulsory fields

Given that I logged into Ting site
Then I click "Products"
And I click "Suppliers"
And I click "Add New Supplier" button
And I see Edit Supplier
And I add "XebiaPantha" as "Company Name"
And I add "44556677" as "Phone"
And I add "4455667788" as "Mobile Phone"
And I add "12345" as "Fax"
And I add "user1@pantha.com" as "Contact Email"
And I type "user2@pantha.com" as the "emailDivertList"
And I add "panthacorp.com" as "Website"
And I add "Sydney" as "Address"
And I add "Manly" as "Suburb"
And I select "New South Wales" as the "state"
And I select "Australia" as the "country"
And I add "92" as "Post Code"
And I click "Update" button
And I see Supplier details have successfully been updated/inserted
And I click "View Supplier" link
And I get the SupplierID
And I "Logout"
And I wait for "5" seconds


Given that I logged into alfred site as Product Analyst
When I go to newly added supplier page in Alfred
Then I check the value of "groupName" as the "XebiaPantha"
Then I check the value of "address1" as the "Sydney"
Then I check the value of "city" as the "Manly"
Then I check the value of "phone" as the "44556677"
Then I check the value of "mobile" as the "4455667788"
Then I check the value of "fax" as the "12345"
Then I check the value of "email" as the "user1@pantha.com"
Then I check the value of "postalCode" as the "92"
Then I check the value of "webaddress" as the "panthacorp.com"







