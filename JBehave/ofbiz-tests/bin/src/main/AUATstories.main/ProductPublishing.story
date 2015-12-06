
Scenario: Add Product, publish to supplier and publish to consumer in ofbiz

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "NiteshPublishProduct" as "Name"
And I enter the supplier as "Crazy April Fool Experiences"
And I select "Experience" as "Product Type"
And I type Rich text "TestDescription" as "Description"
And I type "TestSummary" as the "summary"
And I type Rich text "TestMarketDescription" as "Market Description"
And I type Rich text "TestPrintDescription" as "Print Description"
And I type text "2" as "How many people"
And I type text "1" as "Commissionable Selling Price"
And I type text "1" as "Levies"
And I type text "1" as "Commission"
And I click save button
And I see Congratulations. You just added a new product

And I verify the image of "Published" as "NoImage"
And I verify the "Honouring Button" field is not visible
And I click "More" field
And I verify the image of "Show on supplier site" as "NoImage"
And I verify the image of "Mark as new" as "NoImage"
And I verify the "Archive" field is visible

And I click "Show on supplier site" field
And I verify the image of "Show on supplier site" as "YesImage"

And I click "Published" field
And I click "Published Yes" field
And I verify the image of "Published" as "YesImage"
And I verify the "Honouring Button" field is not visible

Scenario: UnPublish Product and honour the Product in ofbiz

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "NiteshPublishProduct" as "Name"
And I enter the supplier as "Crazy April Fool Experiences"
And I select "Experience" as "Product Type"
And I type Rich text "TestDescription" as "Description"
And I type "TestSummary" as the "summary"
And I type Rich text "TestMarketDescription" as "Market Description"
And I type Rich text "TestPrintDescription" as "Print Description"
And I type text "2" as "How many people"
And I type text "1" as "Commissionable Selling Price"
And I type text "1" as "Levies"
And I type text "1" as "Commission"
And I click save button
And I see Congratulations. You just added a new product

And I verify the image of "Published" as "NoImage"
And I verify the "Honouring Button" field is not visible
And I click "More" field
And I verify the image of "Show on supplier site" as "NoImage"
And I verify the image of "Mark as new" as "NoImage"
And I verify the "Archive" field is visible

And I click "Show on supplier site" field
And I verify the image of "Show on supplier site" as "YesImage"

And I click "Published" field
And I click "Published Yes" field
And I verify the image of "Published" as "YesImage"
And I verify the "Honouring Button" field is not visible
And I click "More" field
And I verify the "Archive" field is not visible

And I click "Published" field
And I click "Honour Yes" field
And I verify the image of "Published" as "NoImage"
And I verify the image of "Honour" as "YesImage"
And I click "More" field
And I verify the "Archive" field is visible
And I click "Honour" field
And I verify the image of "Honour" as "NoImage"
And I click "Honour" field
And I verify the image of "Honour" as "YesImage"

Scenario: UnPublish Product and not honour the Product in ofbiz

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "NiteshPublishProduct" as "Name"
And I enter the supplier as "Crazy April Fool Experiences"
And I select "Experience" as "Product Type"
And I type Rich text "TestDescription" as "Description"
And I type "TestSummary" as the "summary"
And I type Rich text "TestMarketDescription" as "Market Description"
And I type Rich text "TestPrintDescription" as "Print Description"
And I type text "2" as "How many people"
And I type text "1" as "Commissionable Selling Price"
And I type text "1" as "Levies"
And I type text "1" as "Commission"
And I click save button
And I see Congratulations. You just added a new product

And I verify the image of "Published" as "NoImage"
And I verify the "Honouring Button" field is not visible
And I click "More" field
And I verify the image of "Show on supplier site" as "NoImage"
And I verify the image of "Mark as new" as "NoImage"
And I verify the "Archive" field is visible

And I click "Show on supplier site" field
And I verify the image of "Show on supplier site" as "YesImage"

And I click "Published" field
And I click "Published Yes" field
And I verify the image of "Published" as "YesImage"
And I verify the "Honouring Button" field is not visible
And I click "More" field
And I verify the "Archive" field is not visible

And I click "Published" field
And I click "Honour No" field
And I verify the image of "Published" as "NoImage"
And I verify the image of "Honour" as "NoImage"
And I click "More" field
And I verify the "Archive" field is visible

Scenario: UnPublish Product and Archive the Product in ofbiz

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "NiteshPublishProduct" as "Name"
And I enter the supplier as "Crazy April Fool Experiences"
And I select "Experience" as "Product Type"
And I type Rich text "TestDescription" as "Description"
And I type "TestSummary" as the "summary"
And I type Rich text "TestMarketDescription" as "Market Description"
And I type Rich text "TestPrintDescription" as "Print Description"
And I type text "2" as "How many people"
And I type text "1" as "Commissionable Selling Price"
And I type text "1" as "Levies"
And I type text "1" as "Commission"
And I click save button
And I see Congratulations. You just added a new product

And I click "More" field
And I verify the "Archive" field is visible
And I click "Archive" field
And I click "Archive Yes" field
And I see This product is archived.
And I click "ArchiveMessageLink" field

And I verify the image of "Published" as "NoImage"
And I verify the "Honouring Button" field is not visible
And I click "More" field
And I verify the image of "Show on supplier site" as "NoImage"
And I verify the image of "Mark as new" as "NoImage"
And I verify the "Archive" field is visible

And I click "Show on supplier site" field
And I verify the image of "Show on supplier site" as "YesImage"

And I click "Published" field
And I click "Published Yes" field
And I verify the image of "Published" as "YesImage"
And I verify the "Honouring Button" field is not visible
And I click "More" field
And I verify the "Archive" field is not visible

And I click "Published" field
And I click "Honour Yes" field
And I verify the image of "Published" as "NoImage"
And I verify the image of "Honour" as "YesImage"
And I click "More" field
And I verify the "Archive" field is visible
And I click "Archive" field
And I click "Archive Yes" field
And I see This product is archived.
And I click "ArchiveMessageLink" field
And I verify the "Honouring Button" field is not visible
And I click "More" field
And I verify the "Archive" field is visible
And I click "Archive" field
And I click "Archive Yes" field
And I see This product is archived.
And I click "ArchiveMessageLink" field

Scenario: Verify DB States in Redballoon DB on various product publish activities

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "NiteshPublishDBProduct" as "Name"
And I enter the supplier as "Crazy April Fool Experiences"
And I select "Experience" as "Product Type"
And I type Rich text "TestDescription" as "Description"
And I type "TestSummary" as the "summary"
And I type Rich text "TestMarketDescription" as "Market Description"
And I type Rich text "TestPrintDescription" as "Print Description"
And I type text "2" as "How many people"
And I type text "1" as "Commissionable Selling Price"
And I type text "1" as "Levies"
And I type text "1" as "Commission"
And I click save button
And I see Congratulations. You just added a new product
And I store the ProductID

And I verify the DB value of "Publish" as "0" in TabProducts table
And I verify the DB value of "isHonouring" as "0" in TabProducts table

And I click "More" field
And I verify the "Archive" field is visible
And I click "Archive" field
And I click "Archive Yes" field
And I see This product is archived.
And I verify the DB value of "Publish" as "0" in TabProducts table
And I verify the DB value of "isHonouring" as "0" in TabProducts table

And I click "ArchiveMessageLink" field
And I verify the image of "Published" as "NoImage"
And I verify the "Honouring Button" field is not visible
And I click "More" field
And I verify the image of "Show on supplier site" as "NoImage"
And I verify the image of "Mark as new" as "NoImage"
And I verify the "Archive" field is visible
And I click "Show on supplier site" field
And I verify the image of "Show on supplier site" as "YesImage"
And I verify the DB value of "Publish" as "0" in TabProducts table
And I verify the DB value of "isHonouring" as "0" in TabProducts table

And I click "Published" field
And I click "Published Yes" field
And I verify the image of "Published" as "YesImage"
And I verify the "Honouring Button" field is not visible
And I click "More" field
And I verify the "Archive" field is not visible
And I verify the DB value of "Publish" as "0" in TabProducts table
And I verify the DB value of "isHonouring" as "0" in TabProducts table

And I click "Published" field
And I click "Honour Yes" field
And I verify the image of "Published" as "NoImage"
And I verify the image of "Honour" as "YesImage"
And I verify the DB value of "Publish" as "0" in TabProducts table
And I verify the DB value of "isHonouring" as "0" in TabProducts table

And I click "Honour" field
And I verify the image of "Honour" as "NoImage"
And I verify the DB value of "Publish" as "0" in TabProducts table
And I verify the DB value of "isHonouring" as "0" in TabProducts table