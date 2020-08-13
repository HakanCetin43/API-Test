Feature: Login Page Tests
  Scenario: Successful Login
    Given Kullanici ana sayfadadir
    When Kullanici gecerli sifre ve kullanici adi ile giris yapar
    Then Kullanici ana hesap sayfasina ulasti