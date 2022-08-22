Feature: Facebook Sign In Validation

Scenario Outline: Validation of Facebook Login Feature


Given User is on Facebook Main Page
When User enters valid "<email>" and valid "<password>".
Then User successfully logs into Facebook.

Examples:
| email | password |
| email@address.com | Password1029 |