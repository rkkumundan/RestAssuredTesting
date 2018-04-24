Feature: Testing the Restful Services for Learning

Scenario Outline:

Given user tries to send a api request
Then user should get response type with "<type>"
And user should get status code as "<status>"

Examples:
| type             | status |
| application/json | 200    |