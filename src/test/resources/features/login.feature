#Autor: diegosousa.adv@hotmail.com

@login
Feature: login
  como usuario do site sauce demo
  quero acessar o site
  para realizar o login
  
  Background: acesser site saucedemo
	  Given acesse o site do sauce demo

  @postivo
  Scenario: realizar login com sucesso
    
    When informo os dados validos
    And e clico no botao login
    Then realizo login com sucesso
    
    @negativo
  Scenario: logim com senha invalida
  
  When informo dados invalidos
  And clico no botao login
  Then valido mensagens de erro
  
  @negativo
  Scenario: login com dados em branco
  
  When nao informo os dados de acesso
  And clico no botao login
  Then valido mensagens de campos obrigatorios
  