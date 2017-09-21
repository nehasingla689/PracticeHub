Feature: Login functionality of facebook

  @facebook
  Scenario: user is login to facebook using valid credentials

  Given a user is on facebook login page
  When i enter valid details
  Then i should see the home page