


Scenario: RB to Alfred supplier - With Compulsory fields

Given that I logged into Ting site
When I search for the Supplier to Edit Information
Then I click "Edit" link
And I edit the Company Name as AuatSupplierEdited
And I edit the Phone as 44556677
And I edit the Mobile Phone as 4455667788
And I edit the Fax as 12345
And I add "3112" as "Post Code"
And I edit Contact Email as user1@pantha.com
And I edit emailDivertList as user2@pantha.com
And I edit Website as panthacorp.com
And I edit Address as Sydney
And I edit Suburb as Manly
And I click on Save Button to update supplier on RB
And I see Updated successfully
And I "Logout"
And I wait for "10" seconds

Given that I logged into alfred site as Product Analyst
When I go to the edited supplier page in Alfred
Then I check the value of "groupName" as the "AuatSupplierEdited"
Then I check the value of "address1" as the "Sydney"
Then I check the value of "city" as the "Manly"
Then I check the value of "phone" as the "44556677"
Then I check the value of "mobile" as the "4455667788"
Then I check the value of "fax" as the "12345"
Then I check the value of "email" as the "user1@pantha.com"
Then I check the value of "postalCode" as the "3112"
Then I check the value of "webaddress" as the "panthacorp.com"
