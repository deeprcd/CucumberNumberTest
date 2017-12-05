@NumberToText
Feature: To validate the Numbers to Text feature with all possible data combinations

  @SingleDigit @regression @smoke
  Scenario Outline: To validate Text conversion of single digit numbers
    Given The numbers assignment application has been installed
    When I pass a <singleDigit> number
    Then The number should be converted to the following "<text>"

    Examples: 
      | singleDigit | text |
      |           5 | five |
      |           0 | zero |

  @DoubleDigit
  Scenario Outline: To validate Text conversion of double digit numbers
    Given The numbers assignment application has been installed
    When I pass a <doubleDigit> number
    Then The number should be converted to the following "<text>"

    Examples: 
      | doubleDigit | text        |
      |          59 | fifty nine  |
      |          34 | thirty four |

  @TripleDigit
  Scenario Outline: To validate Text conversion of triple digit numbers
    Given The numbers assignment application has been installed
    When I pass a <tripleDigit> number
    Then The number should be converted to the following "<text>"

    Examples: 
      | tripleDigit | text                     |
      |         123 | one hundred twenty three |
      |         567 | five hundred sixty seven |
