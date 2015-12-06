package com.rb.ofbiz.test.steps;

import com.rb.ofbiz.test.pages.Home;
import com.rb.ofbiz.test.pages.PageFactory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by IntelliJ IDEA.
 * User: Mythily
 * Date: 17/01/12
 * Time: 2:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class OrderSteps {

    private Home home;
    private String c_url;
    private String hostname;
private String port;
private String ofbizusername;
private String ofbizpassword;
private String application;


public void setHostname(String hostname) {
    this.hostname = hostname;
}

public void setPort(String port) {
    this.port = port;
}

public void setOfbizusername(String ofbizusername)
{
    this.ofbizusername = ofbizusername;
}

public void setOfbizpassword(String ofbizpassword)
{
    this.ofbizpassword = ofbizpassword;
}

public void setApplication(String application)
{
    this.application = application;
}

     public void setC_url(String c_url) {
        this.c_url = c_url;
    }
     public OrderSteps(PageFactory pageFactory) {
        home = pageFactory.newHome();
     }

    @Given("I login to Ofbiz as a order manager or admin")
    public void givenILoginToOfbizAsAOrderManagerOrAdmin(){
        home.deleteCookie();
        String url = "https://"+hostname+":"+port+"/"+application+"/control/main";
        home.go(url);
        home.enterLogin("USERNAME",ofbizusername);
        home.enterLogin("PASSWORD",ofbizpassword);
        home.clickUpdateButton("Login");
    }


    @Given("that I log into consumer site")
    public void givenThatILogIntoConsumerSite(){
//        home.gotoconsumersite("https://"+c_url+"/adventure-sports/abseiling");


       home.gotoconsumersite("https://"+c_url+"/adventure-sports/abseiling");
        home.gotoconsumersite("https://"+c_url+"/my-account/index.cfm");
//        home.clickLinkText("My Account");
        home.waitForPage("100000");
//
        home.enterLogin("j_username","jimtest037.peterbb@jim.com");
        home.enterLogin("j_password","welcome2fun");
        home.clickUpdateButton("Login");

    }

    @When("I click on \"Abseiling\" under Adventure Sports category")
    public void whenIClickOnAbseilingUnderAdventureSportsCategory(){
         home.gotoconsumersite("http://"+c_url+"/flying-experiences/skydiving/14-000ft-tandem-skydive-midweek");
    }


    @Then("I click Edit for product code \"$DAD001\"")
    public void thenIClickEditForProductCodeDAD001(String text){
        home.clickEditImagebtn(text);
    }
    
    @When("I click on sky diving Sports category")
    public void whenIClickOnSkyDivingSportsCategory() {
        home.gotoconsumersite("http://"+c_url+"/flying-experiences/skydiving/14-000ft-tandem-skydive");

    }

    @Then("I open a gift product")
    public void thenIOpenAGiftProduct(){
//      home.clickGiftProducttoOrder();
    }

    @Then("I select \"$NSW\" as state")
    public void thenISelectNSWAsState(String text){
        home.selectdropdown("state", text);
    }

    @Then("I click place order \"$submit\"")
    public void thenIClickPlaceOrdersubmit(String text){
        home.ClickButton(text);

    }

    @Then("I get the Order reference")
    public void thenIGetTheOrderReference(){
        home.waitForPage("100000");
        home.hasContents("Order Confirmation");
        home.getOrderID();
    }

    @Then("I click \"$addToCart\" to buy")
    public void thenIClickaddToCartToBuy(String text){
        home.ClickButtonID(text);
        home.waitForPage("100000");
    }






    @Then("I enter Order ID")
    public void thenIEnterOrderID(){
//        home.enterText("orderId", "ORD_1691104");
        home.enterOrderID("orderId", "ORD_");
    }

    @Then("I verify the customer details")
    public void thenIVerifyTheCustomerDetails(){
        home.Verifycustomer();
    }

    @Then("add the \"$orderID\"")
    public void thenAddTheOrderID(String field){
//        home.enterText("orderID", "1691104");
        home.enterOrderID(field, "");
    }

    

    @Then("I select \"$StandardPost\" as Delivery option")
    public void thenISelectStandardPostAsDeliveryOption(String text){
        home.chooseDeliveryOption();
//        home.ClickButtonID("defaultDeliveryMethod_7");
        //        home.checkRadio(text);
    }

    @Then("I select \"$Bpay\" as payment option")
    public void thenISelectBpayAsPaymentOption(String text){
        home.checkRadio(text);
    }

    @Then("I input the \"$FirstName\" as \"$JimBTest037\"")
    public void thenIInputTheFirstNameAsJimBTest037(String field, String text){
         home.enterTextLabels(field, text);
    }


    @Then("I select \"$Iunderstandandacceptthe\" terms and conditions")
    public void thenISelectIUnderstandAndAcceptTheTermsAndConditions(String text){
        home.checkRadio(text);
    }

    @Then("I enter \"$testpanthacorpcom\" email address")
    public void thenIEntertesttestcomEmailAddress(String text){
        home.waitForPage("100000");
//        home.enterText("j_username", text);
    }





    @Then("I \"$Checkout\" to shopping cart")
    public void thenICheckoutToShoppingCart(String text){
        home.ClickButton("purchase");
        home.waitForPage("15000");
    }

    @Then("I enter supplier \"$CompanyName\" as \"$SkydiveAbelTasman\"")
    public void thenIEnterSupplierCompanyNameAsSkydiveAbelTasman(String field, String text){
        home.Randomname(field, text);
    }

    @Then("I edit the \"$Description\" to \"$NZsHighestTandemskydivingfrom16500ft\"")
    public void thenIEditTheDescriptionToNZsHighestTandemSkydivingFrom16500ft(String field, String text){
      home.Randomdescription(field,text);
    }

    @Then("I select \"$DescriptionChange\" as Update Reason")
    public void thenISelectDescriptionChangeAsUpdateReason(String text){
        home.selectdropdown("updateTypeID", text);
        home.enterText("updateReason", "Test");
    }

  

    @Then("I click supplier \"$DemosupplierTest02\" link")
    public void thenIClickSupplierDemoSupplierTest02Link(String link){

        home.waitForPage("100000");
        home.refresh();
        home.clicklinktext(link);
        home.waitForPage("100000");
    }
    //Order notes

    @Then("I go to products detail page of order Id")
    public void thenIGoToProductsDetailPageOfOrderId1(){
        home.clickEditImagebtnOrder();
        home.waitForPage("100000");
    }

    @Then("I type order note \"$Thisisanewsupplier\"")
    public void thenITypeOrderNoteThisIsANewSupplier(String text){
        home.waitForPage("100000");
        home.enterText("noteBody", text);
    }

    @Then("I login to Ofbiz as a order manager or admin")
    public void thenILoginToOfbizAsAOrderManagerOrAdmin(){
         home.deleteCookie();
         String url = "https://"+hostname+":"+port+"/"+application+"/control/main";
        home.go(url);
        home.enterLogin("USERNAME",ofbizusername);
        home.enterLogin("PASSWORD",ofbizpassword);
        home.clickUpdateButton("Login");
    }

    //Order Booking

    @Then("I select \"$Cash\" as payment type")
    public void thenISelectCashAsPaymentType(String text){
        home.selectdropdown("paymenttype", text);
    }

    @Then("I select \"$Dontsendconfirmation\" for sending email")
    public void thenISelectDontSendConfirmationForSendingEmail(String text){
         home.selectdropdown("sendConfirmEmail", text);
    }

    @When("I proceed booking for \"$14000ftTandemSkydiveOverTheGoldfields\"")
    public void whenIProceedBookingFor14000ftTandemSkydiveOverTheGoldfields(String text){
         home.clickSpanElement("Order History");
         home.waitForPage("100000");
         home.clickBookforOrder(text);
         home.waitForPage("100000");
    }

    @Then("I enter the preferred and alternate date")
    public void thenIEnterThePreferredAndAlternateDate(){
          home.enterpreferreddateforOrderBooking("date1");
          home.enteralternatedateforOrderBooking("date2");
//        home.enterText("date1", "15/04/2012");
//        home.enterText("date2", "17/04/2012");
    }

    @Then("I get the Booking Reference")
    public void thenIGetTheBookingReference(){

    }

    @Given("that I get the Order Item ID from RBD")
    public void givenThatIGetTheOrderItemIDFromRBD() {
        home.VerifyBooking();
    }

  
    @When("I enter Booking id")
    public void whenIEnterBookingId() {
        home.enterbookingid("bookingId");
    }

    @When("I enter OrderItem ID")
    public void whenIEnterOrderItemID() {
        home.enterorderitemid("orderItemId");
    }

    @When("I enter Participant ID")
    public void whenIEnterParticipantID() {
        home.enterparticipantid("participantId");
    }

    @Then("I open Voucher details page")
    public void thenIOpenVoucherDetailsPage() {
        home.gotoVoucherPage();
    }

    @Then("I open the Voucher details page")
    public void thenIOpenTheVoucherDetailsPage() {
        home.gotoVoucherPage();
        home.waitForPage("100000");
    }

    @Then("I click update Message")
    public void thenIClickUpdateMessage() {
        home.ClickButton("updateMessage");
    }





    //Order Item Notes

    @Then("I click the order item \"$14000ftTandemSkydiveMidweek\"")
    public void thenIClickTheOrderItem14000ftTandemSkydiveMidweek(String text) {
        home.clickOrderIteminRB(text);
    }

    @Then("I select the Order Item")
	public void thenISelectTheOrderItem() {
		home.ClickButton("ordersno");

	}
   

    @Then("I verify \"$note\" order item note in RBD")
    public void thenIVerifynoteOrderItemNoteInRBD(String text) {
        home.VerifyVoucherNoteRB(text);
    }

    //Order Recipients

    @Then("I click customer in order details page")
    public void thenIClickCustomerInOrderDetailsPage() {

        home.ClickcustomerinOrderPage(hostname,port);
    }


    @Then("I enter login details")
    public void thenIEnterLoginDetails() {
        home.waitForPage("100000");
        home.enterLogin("USERNAME",ofbizusername);
        home.enterLogin("PASSWORD",ofbizpassword);
        home.clickUpdateButton("Login");
    }

    @Then("I update the customer address \"$Supplierstreet\"")
    public void thenIUpdateTheCustomerAddressSupplierStreet(String text) {
          home.updateCustomerAddress(text);
    }


    //Credit Card

    @Then("I open product order details page")
    public void thenIOpenProductOrderDetailsPage() {
        // PENDING
    }


    @Then("I select \"$Mastercard\" as Card Type")
    public void thenISelectMastercardAsCardType(String text) {
         home.selectdropdownreview("Card Type", text);
    }

    @Then("I enter the card number \"$510510510510\"")
    public void thenIEnterTheCardNumber510510510510(String text) {
        home.enterText1("Card Number", text);
    }

    @Then("I enter Cardholder's Name \"\"")
    public void thenIEnterCardholdersName() {
        // PENDING
    }

    @Then("I enter the Expiry Date")
    public void thenIEnterTheExpiryDate() {
        home.enterText("ccExpiry_Month", "09");
        home.enterText("ccExpiry_Year", "20");
    }

    @Then("I enter Security Number \"$123\"")
    public void thenIEnterSecurityNumber123(String text) {
        home.enterText("ccSecCode", text);
    }

    @Then("I verify the credit card details")
    public void thenIVerifyTheCreditCardDetails() {
        // PENDING
    }

    //Order Refund
    @Then("I select the order item for refund")
    public void thenISelectTheOrderItemForRefund() {
           home.clickproductforRefund();
    }

    @Then("I select the refund reason")
    public void thenISelectTheRefundReason() {
       home.selectdropdown("refundReasonID", "Customer Exchange");
    }

    @Then("I enter the refund details")
    public void thenIEnterTheRefundDetails() {
        home.enterText("refundDescription", "Test Refund");
    }

    @Then("I enter Return from party name")
    public void thenIEnterReturnFromPartyName() {
         home.getRefundIDfromRBD();
    }

    @Then("I open the return details page to verify")
    public void thenIOpenTheReturnDetailsPageToVerify() {
        home.clickrefundIDinOfbiz();
    }




}
