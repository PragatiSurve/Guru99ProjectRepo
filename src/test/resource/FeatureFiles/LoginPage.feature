Feature: Login Page Feature

Scenario: Login page Testing
       
Given Open a browser
And hit the "http://demo.guru99.com/V4/" URL
Then login page should be visible with "Guru99 Bank Home Page" title


Scenario: Login with Correct Credentials
Given user is on login page
When user enter username "mngr374408"
And user enters password "yqubutE"
And user clicks on login button
#Then user is on Homepage
#And user gets the message "Welcome To Manager's Page of Guru99 Bank"
