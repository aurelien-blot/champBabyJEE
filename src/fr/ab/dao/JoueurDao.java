package fr.ab.dao;

import fr.ab.beans.Joueur;

public interface JoueurDao {

    void creer(Joueur joueur) throws DAOException;

    Joueur trouver(String prenom) throws DAOException;

    //PREVOIR SUPPRIMER ET MISE A JOUR
}
