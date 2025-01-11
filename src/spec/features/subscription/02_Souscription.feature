#language: fr
@subscription @smoketest @tnr
Fonctionnalité: Souscription
  ETQ utilisateur je souhaite réaliser une souscription

  Contexte:
    Etant donné que Je suis sur la page de l'application Gessousl
    Quand Je saisis une adresse mail groupama "zied.hannachi.ext@groupama.com"
    Et Je saisis un mot de passe groupama "Achanger123456!"
    Et Je clique sur le bouton Connexion
    Et Je continue sans accepter les cookies

  @subscription
  Scénario: Je souhaite réaliser une souscription
    Quand Je clique sur le menu burger
    Et Je clique sur Administration IGES
    Et Je clique sur Utilisateurs
    Et Je saisis un nom d'utilisateur "bertil"
    Et Je clique sur voir la vue
    Et Je clique sur Réaliser une souscription
    Et Je saisis un numero de SIRET Entreprise "35022996900026"
    Et Je clique sur le bouton Valider
    Et Je remplis le formulaire Entreprise Effectif global "2" Nombre de salariés "1" Forme Juridique "Société par actions simplifiée (SAS)" Mois de clôture "Mai" Civilité "Monsieur" Nom "TEST" Prénom "Test" Fonction "PDG" Statut "Salarié" Téléphone "0644602257" Email "zied.hannachi.ext@groupama.com"
    Et Je clique sur le bouton Continuer
    Et Je clique Oui sur Accompagnement à la réalisation d’un versement collectif
    Et Je clique sur le bouton Continuer
    Et Je saisis un IBAN "FR 00 00000 00000 00000000000 00" et un BIC "XXXX XX XX XXX"
    Et Je clique sur le bouton Continuer
    Et Je clique sur Valider et signer tout de suite
    Et Je clique sur le button Continuer de la page mode d'emploi
    Et Je j'accepte la convention de preuve
    Et Je valide la page
    Et Je valide la page
    Et Je valide la page
    Et Je valide la page
    Et Je valide la page
    Et Je valide la page
    Et Je valide la page
    Et Je valide la page
    Et Je valide la page
    Et J'accepte les documents contractuels
    Quand Je recupere mon code OTP
    Et Je signe mon contrat



