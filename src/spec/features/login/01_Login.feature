#language: fr
@login @smoketest @tnr
Fonctionnalité: Login
  ETQ utilisateur je souhaite me connecter sur l'application automationexercise

  @login
  Scénario: Je souhaite me connecter avec des données valides
    Etant donné que Je suis sur la page de connexion de l'application automationexercise
    Quand Je saisis une adresse mail "marouen@gmail.com"
    Et Je saisis un mot de passe "123456"
    Et Je clique sur le bouton Log in
    Alors Je suis redirigé vers la page d'accueil avec existance de mot Logout

